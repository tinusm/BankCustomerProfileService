package com.bank.profile;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "customerprofile")
public class Profile   {
    /**
	 * 
	 */
	@Id
	@Column(name="accountid")
    Long accountid;
	String emailid;
	String address;
	Long phonenumber;
	public Long getAccountid() {
		return accountid;
	}
	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}

