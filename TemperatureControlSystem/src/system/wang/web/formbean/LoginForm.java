package system.wang.web.formbean;

import java.util.HashMap;
import java.util.Map;

import system.wang.common.InfoMessage;

public class LoginForm {
	
	private String username;
	private String password;
	
	private Map<String, String> errorsMap = new HashMap<String, String>();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValid(){
		boolean isOk = true;
		if(this.username == null || this.username.trim().equals("")){
			isOk = false;
			errorsMap.put("username", InfoMessage.USERNAME_ERROR);
		}		
		return isOk;
	}
	
}
