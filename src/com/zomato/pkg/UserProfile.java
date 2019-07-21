package com.zomato.pkg;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Detail")

public class UserProfile {
	
	private String userName;
	@Id
	private int userId;
	private int contactNo;
	private String favFood;
	private Address homeAddress;
//	private Address workAddress;
	
	public UserProfile(String userName,int userId,int contactNo,String favFood,Address homeAddress){
		this.userName=userName;
		this.userId=userId;
		this.contactNo=contactNo;
		this.favFood=favFood;
		this.homeAddress=homeAddress;
//		this.workAddress=workAddress;
	}
		
	public String getUserName() {
		return userName;
	}

	public int getUserId() {
		return userId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public String getFavFood() {
		return favFood;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
//	public Address getWorkAddress() {
//		return workAddress;
//	}
//	public void setWorkAddress(Address workAddress) {
//		this.workAddress = workAddress;
//	}
	@Override
	public String toString() {
		return "UserProfile [UserName= " + getUserName() + ", UserId= " + getUserId() + ", ContactNo= "
				+ getContactNo() + ", FavFood= " + getFavFood() + ", HomeAddress= " + getHomeAddress() + "]";
	}
	
	public void Display(){
		System.out.println(toString()+"\n"+
							getHomeAddress()+"\n");
	}

}	