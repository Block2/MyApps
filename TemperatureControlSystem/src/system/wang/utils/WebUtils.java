package system.wang.utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUtils {
	
	public static <T> T request2Bean(HttpServletRequest request,Class<T> beanClass){
		try {
			T bean = beanClass.newInstance();
			Enumeration e = request.getParameterNames();
			while (e.hasMoreElements()){
				String name = (String)e.nextElement();
				String value = request.getParameter(name);
				BeanUtils.setProperty(bean, name, value);
			}
			return bean;
		} catch (Exception e){
			throw new RuntimeException();
		}
	}
	
	public static void copyBean(Object src, Object dest){
//		ConvertUtils.register(new Converter(){
//
//			@Override
//			public <T> T convert(Class<T> type, Object value) {
//				if(null == value)
//					return null;
//				if(value instanceof String){
//					String date = (String)value;
//					if(date.trim().equals(""))
//						return null;
//					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
//					try {
//						return (T) format.parse(date);
//					} catch (ParseException e) {
//						throw new RuntimeException(e);
//					}
//				}
//				return null;
//			}
//		}, Timestamp.class);
		
		try {
			BeanUtils.copyProperties(dest, src);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
