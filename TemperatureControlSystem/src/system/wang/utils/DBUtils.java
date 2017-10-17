package system.wang.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import system.wang.dao.impl.UserDaoImpl;

public class DBUtils {
	private static Properties dbConfig = new Properties();
	private static String username = null;
	private static String password = null;
	private static String url = null;
	private static String baseStorePath = null;
	
	static{
		InputStream inStream = UserDaoImpl.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			dbConfig.load(inStream);
			String drive = dbConfig.getProperty("drive");
			username = dbConfig.getProperty("username");
			password = dbConfig.getProperty("password");
			url = dbConfig.getProperty("url");
			baseStorePath = dbConfig.getProperty("baseStorePath");
			
			Class.forName(drive);
		} catch (IOException | ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static String getBaseStorePath(){
		return baseStorePath;
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			throw new ExceptionInInitializerError(e);
		}
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection conn, PreparedStatement ps) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
