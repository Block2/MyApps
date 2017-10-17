package system.wang.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtils;


public class DaoUtils {
	
	 /**
     * 
     * @param clazz ����һ����Ҫ��װ����
     * @param rs    ��Ҫ���з�װ��rs
     * @return һ����װ�õ�VO��object��
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static <T> T autoBean(Class<T> clazz,ResultSet rs) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
        
		T bean = clazz.newInstance(); // ʵ��������
		try{
            ResultSetMetaData rsmd = rs.getMetaData();
            int columCount = rsmd.getColumnCount();    //��ȡ������еĸ���
            for(int i = 1;i<=columCount;i++){
                String columName = rsmd.getColumnName(i);//��ȡ����
                Object value= rs.getObject(i);
                BeanUtils.setProperty(bean, columName, value);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bean;//���ض���
    }
    
    public static Map<String,Object> convertBean(Object bean) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException { 
        Class type = bean.getClass(); 
        Map<String,Object> returnMap = new HashMap<String,Object>(); 
        BeanInfo beanInfo = Introspector.getBeanInfo(type); 

        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors(); 
        for (int i = 0; i< propertyDescriptors.length; i++) { 
            PropertyDescriptor descriptor = propertyDescriptors[i]; 
            String propertyName = descriptor.getName(); 
            if (!propertyName.equals("class")) { 
                Method readMethod = descriptor.getReadMethod(); 
                Object result = readMethod.invoke(bean, new Object[0]); 
                if (result != null) { 
                    returnMap.put(propertyName, result); 
                } else { 
                    returnMap.put(propertyName, ""); 
                } 
            } 
        } 
        return returnMap; 
    } 
    
    /**
     * �������ݵ����ݿ�
     * @param tableName
     */
	public  static boolean insertTableByMap(String tableName, Map<String,Object> params) {
        StringBuffer key = new StringBuffer();
        StringBuffer value = new StringBuffer();
        Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
        while(iter.hasNext()) {
            Entry<String, Object> element = iter.next();
            key.append(element.getKey() + ",");
            if(element.getValue() instanceof String){
            	String keyValue = ((String)element.getValue()).trim();
            	if( "".equals(keyValue)){
            		keyValue = null;
            	}
            	element.setValue(keyValue);
            }
            if(element.getValue() != null){
            	if(element.getValue() instanceof java.sql.Date)
                	value.append("to_date('" + element.getValue()+ "','yyyy-mm-dd'),");
                else
                	value.append("'" + element.getValue() + "',");
            }else {//���key��Ӧ��ֵΪnull����Ӧ����null���˼ӵ����ţ�����sql����Ǵ����
            	value.append(element.getValue() + ",");
            }
        }
        key.replace(key.length() - 1, key.length(), "");
        value.replace(value.length() - 1, value.length(), "");

        StringBuffer sql = new StringBuffer("insert into ");
        sql.append(tableName);
        sql.append("(").append(key).append(")");
        sql.append(" values (").append(value).append(")");
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
        	conn = DBUtils.getConnection();
        	ps = conn.prepareStatement(sql.toString());
        	 int count = ps.executeUpdate();
        	 if(count<0){
        		return false;
        	 }
        } catch (SQLException e) {
        	e.printStackTrace();
		}finally{
        	DBUtils.close(conn, ps);
        }
        return true;
    }
	
	

}
