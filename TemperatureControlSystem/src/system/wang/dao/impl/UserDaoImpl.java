package system.wang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.SqlDateConverter;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;

import system.wang.common.InfoMessage;
import system.wang.dao.UserDao;
import system.wang.domain.User;
import system.wang.utils.DBUtils;
import system.wang.utils.DaoUtils;


public class UserDaoImpl implements UserDao{
	static{
		//注册sql.date的转换器，即允许BeanUtils.copyProperties时的源目标的sql类型的值允许为空  
        ConvertUtils.register(new SqlDateConverter(null), java.util.Date.class);  
        ConvertUtils.register(new SqlTimestampConverter(null), java.sql.Timestamp.class);  
	}

	public boolean addUser(User user){
		Map<String, Object> propertyMap = null;
		try {
			propertyMap = DaoUtils.convertBean(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DaoUtils.insertTableByMap(InfoMessage.USER_TABEL_NAME, propertyMap);
	}
 	
	public boolean findUser(String userName) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConnection();
			String sql = "select ID from usertable where username = '"+userName+"'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
				return true;
			return false;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			DBUtils.close(conn, ps, rs);
		}
	}
	
	public User findUser(String userName,String password) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = DBUtils.getConnection();
			String sql = "select * from usertable where username = '"+userName+"' and password = '"+password+"'" ;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
				user = DaoUtils.autoBean(User.class, rs);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally{
			DBUtils.close(conn, ps, rs);
		}
		return user;
	}

	public void updateLastLoginTime(User user){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			
			String sql = "update usertable set last_login_time = '"+user.getLast_login_time()+"' where ID = '"+user.getID()+"'";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally{
			DBUtils.close(conn, ps);
		}
	}

}
