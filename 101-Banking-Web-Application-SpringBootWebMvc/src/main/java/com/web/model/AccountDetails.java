package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Accountdtls")
public class AccountDetails {
	
	@Id
	private long accountNumber;
	private String name;
	private String password;
	private int accountBalance;
	private String address;
	private int mobileNo;
	
	//PDC+ PPC+ PSM+ PGM+ tostring
	
	public AccountDetails() {
		super();
	}

	public AccountDetails(long accountNumber, String name, String password, int accountBalance, String address,
			int mobileNo) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.accountBalance = accountBalance;
		this.address = address;
		this.mobileNo = mobileNo;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password
				+ ", accountBalance=" + accountBalance + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
	
	

}
