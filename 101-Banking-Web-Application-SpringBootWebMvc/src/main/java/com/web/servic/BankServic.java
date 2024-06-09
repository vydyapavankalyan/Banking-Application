package com.web.servic;


import com.web.model.AccountDetails;

public interface BankServic {
	
	public AccountDetails saveAccountDetails(AccountDetails details);
	public AccountDetails getRecord(Long accountNumber);
	public AccountDetails depositAmount(Long accountNumber,String password,int accountBalance);
	public AccountDetails withdrawAmount(Long accountNumber,String password,int accountBalance);
	public AccountDetails transferAmount(Long accountNumber, String name,String password,Long accountNumber1,int accountBalance);
	public String closeAccount(Long accountNumber, String name,String password);

}
