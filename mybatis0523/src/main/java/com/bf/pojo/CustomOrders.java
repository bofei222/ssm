package com.bf.pojo;

import java.util.Date;

//
public class CustomOrders extends Orders{
	private int uid;
	private String username;
	private String sex;
	private Date birthday;
	private String address;
	
	public Integer getId() {
		return uid;
	}
	public void setId(int id) {
		this.uid = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
