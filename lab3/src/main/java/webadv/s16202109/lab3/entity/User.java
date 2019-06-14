package webadv.s16202109.lab3.entity;

import javax.validation.constraints.Pattern;

public class User {
	@Pattern(regexp="[a-z]{3}",message="������3����ĸ")
	private String account;
	
	@Pattern(regexp="[0-9|]{6}",message="������6λ����")
	private String password;	
	private int user_id;
	private String user_name;
	
	
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getAccount() {
		return account;
	}	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	


}
