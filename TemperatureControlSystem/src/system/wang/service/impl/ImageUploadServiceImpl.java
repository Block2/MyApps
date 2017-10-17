package system.wang.service.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import system.wang.dao.NoCheckoutImageDao;
import system.wang.dao.impl.NoCheckoutImageDaoImpl;
import system.wang.domain.NoCheckoutImage;
import system.wang.service.ImageUploadService;
import system.wang.utils.DBUtils;
import system.wang.utils.WebUtils;

public class ImageUploadServiceImpl implements ImageUploadService {
	
	private NoCheckoutImageDao dao = new NoCheckoutImageDaoImpl();
	
	public boolean uploadImage(HttpServletRequest request){
		boolean isOk = true;
		String baseStorePath = DBUtils.getBaseStorePath();
		InputStream in = null;
		FileOutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			in = request.getInputStream();
			
			NoCheckoutImage image = WebUtils.request2Bean(request, NoCheckoutImage.class);
			image.setImage_name(generateImage_num()+"_"+image.getImage_name());
			String filePath = baseStorePath + image.getImage_name();
			out = new FileOutputStream(filePath);
			bos = new BufferedOutputStream(out); 
			byte[] bytes = new byte[1024];
			int len = 0;
			while((len = in.read(bytes))>0){
				bos.write(bytes, 0, len);
			}
			
			
			if(image.getImage_num() == null || image.getImage_num().isEmpty())
				image.setImage_num(generateImage_num());
			image.setOriginal_image_path(filePath);
			syncDatabase(image);
		} catch (IOException e) {
			isOk = false;
			e.printStackTrace();
		}finally{
			if(null != in){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null != out){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null != bos){
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isOk;
	}
	
	private boolean syncDatabase(NoCheckoutImage image){
		return dao.insertImage(image);
	}
	
	private String generateImage_num(){
		//采用8位日期+'--'+10随机数生成图片编号
		String date = new Date(System.currentTimeMillis()).toString().substring(0, 10).replace("-","");
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		return date+"--"+hashCodeV;
	}
}
