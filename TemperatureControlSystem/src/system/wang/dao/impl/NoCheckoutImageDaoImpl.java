package system.wang.dao.impl;

import java.util.Map;

import system.wang.common.InfoMessage;
import system.wang.dao.NoCheckoutImageDao;
import system.wang.domain.NoCheckoutImage;
import system.wang.utils.DaoUtils;

public class NoCheckoutImageDaoImpl implements NoCheckoutImageDao {
	
	
	public boolean insertImage(NoCheckoutImage image){
		Map<String, Object> propertyMap = null;
		try {
			propertyMap = DaoUtils.convertBean(image);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DaoUtils.insertTableByMap(InfoMessage.NO_CHECKOUT_IMAGE_TABLE_NAME, propertyMap);
		
	}
		
}
