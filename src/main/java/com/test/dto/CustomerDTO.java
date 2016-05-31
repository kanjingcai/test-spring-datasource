package com.test.dto;

/**
 * 客户信息实体类
 * 
 * @author kanjc
 * @version 1.0, 2016年5月13日
 */
public class CustomerDTO {

	private String id;

	private String userName;

	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", userName=" + userName
				+ ", password=" + password + "]";
	}

}
