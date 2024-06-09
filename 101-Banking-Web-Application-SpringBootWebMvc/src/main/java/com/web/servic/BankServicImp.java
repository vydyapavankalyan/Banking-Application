package com.web.servic;


import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.AccountDetails;
import com.web.repo.AccountRepo;

@Service
public class BankServicImp implements BankServic {

	@Autowired
	private AccountRepo repo;


	@Override
	public AccountDetails saveAccountDetails(AccountDetails details) {
		AccountDetails s1 =repo.save(details);
		return s1;
	}

	@Override
	public AccountDetails getRecord(Long accountNumber) {
		AccountDetails a1=repo.findById(accountNumber).get();
		return a1;
	}

	@Override
	public AccountDetails depositAmount(Long accountNumber, String password,int accountBalance) {
		AccountDetails acc=repo.findById(accountNumber).get();
		Long accountNo=acc.getAccountNumber();
		String pass=acc.getPassword();
		String nameofaccholder=acc.getName();
		int amount1=acc.getAccountBalance();

		if(accountNo==accountNumber&&pass.equals(password)&&nameofaccholder.equals(nameofaccholder))
		{
			amount1=acc.getAccountBalance()+accountBalance;

		}
		acc.setAccountBalance(amount1);
		repo.save(acc);
		return acc;
	 }

	  @Override
	  public AccountDetails withdrawAmount(Long accountNumber, String password, int accountBalance) {
		AccountDetails acc=repo.findById(accountNumber).get();
		Long accountNo=acc.getAccountNumber();
		String pass=acc.getPassword();
		String nameofaccholder=acc.getName();
		int amount1=acc.getAccountBalance();
		if(accountNo==accountNumber&&pass.equals(password)&&nameofaccholder.equals(nameofaccholder))
		{
		   if(amount1<accountBalance)
			{
				return null;

			}
			else
			{
				amount1=amount1-accountBalance;	
			}

		  }
		   acc.setAccountBalance(amount1);
		   repo.save(acc);
		   
		    return acc;
	 }

	

	@Override
	public AccountDetails transferAmount(Long accountNumber, String name, String password, Long accountNumber1,int accountBalance)
	  {
		AccountDetails acc=repo.findById(accountNumber).get();
		AccountDetails acc1=repo.findById(accountNumber1).get();
		
		if(acc !=null && acc1 !=null)
		{
			if(acc.getPassword().equals(password) && acc.getName().equals(name))
			{
				int sourceAccountBalance =acc.getAccountBalance();
				
				//Check if the Source account has Sufficient Balance
				if(sourceAccountBalance >=accountBalance)
				{
					//Perform the Transfer
					int targetAccountBalance = acc1.getAccountBalance()+accountBalance;
					acc.setAccountBalance(sourceAccountBalance-accountBalance);
					acc1.setAccountBalance(targetAccountBalance);
					
					repo.save(acc);
					repo.save(acc1);
					
					return acc1;
				}
				else
				{
					return null;
				}
				
			}
		}

		return null;
	}

	@Override
	public String closeAccount(Long accountNumber, String name, String password) {
		AccountDetails acc=repo.findById(accountNumber).get();
		if(acc!=null)
		{
			if(acc.getAccountNumber()==accountNumber && acc.getName().equals(name) && acc.getPassword().equals(password))
			{
				acc.setAccountBalance(0);
				repo.save(acc);
				return "AccountCloseSuccessfully";
			}
		}
		return "FailedTocloseAccountPleaseCheckYourCredentials";
	}


}
