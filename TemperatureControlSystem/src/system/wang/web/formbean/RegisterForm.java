package system.wang.web.formbean;


public class RegisterForm {
	

	private String token;
	private String username;
	private String password;
	private String confirmPassword;
	private String email;
	private String city;
	private String address;
	private String telephone;
	private String flag;
	private String userdesc;

//	private Map<String, String> errorsMap = new HashMap<String, String>();

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUserdesc() {
		return userdesc;
	}

	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc;
	}

	public boolean isValid(){
		boolean isOk = true;
		return isOk;
		/*
		if(this.username == null || this.username.trim().equals("")){
			isOk = false;
			errorsMap.put("username", InfoMessage.USERNAME_ERROR1);
		}else if(!this.username.matches("[0-9A-Za-z]{3,8}")){
			isOk = false;
			errorsMap.put("username", InfoMessage.USERNAME_ERROR2);
		}
		
		if(this.password == null || this.password.trim().equals("")){
			isOk = false;
			errorsMap.put("password", InfoMessage.PASSWORD_ERROR1);
		}else if(this.password.length()<6 || this.password.length()>15){
			isOk = false;
			errorsMap.put("password",InfoMessage.PASSWORD_ERROR2);
		}else if(!this.password.matches("/^[a-zA-Z0-9_]*$/")){
			isOk = false;
			errorsMap.put("password", InfoMessage.PASSWORD_ERROR3);
		}
		if(this.confirmPassword == null || this.confirmPassword.trim().equals("")){
			isOk = false;
			errorsMap.put("confirmPassword", InfoMessage.CONFIRM_PASSWORD_ERROR1);
		}else if(!confirmPassword.equals(this.password)){
			isOk = false;
			errorsMap.put(confirmPassword, InfoMessage.CONFIRM_PASSWORD_ERROR2);
		}
		//TODO 其他的校验
		
		return isOk;
		*/
	}
}
