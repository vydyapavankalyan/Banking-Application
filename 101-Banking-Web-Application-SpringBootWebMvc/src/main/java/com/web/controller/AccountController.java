package com.web.controller;

import java.net.PasswordAuthentication;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.AccountDetails;
import com.web.servic.BankServicImp;


@Controller
public class AccountController {

	@Autowired
	private BankServicImp servic;

	@RequestMapping("/")
	public String homepage()
	{
		return "home";
	}


	@RequestMapping("/h")
	public String homeinside()
	{
		return "Homep1";
	}


	@RequestMapping("/Newaccount")
	public String registerpage()
	{
		return "openAccountForm";
	}

	@RequestMapping("Newaccount2p")
	private String saveDetails(AccountDetails accountDetails)
	{
		servic.saveAccountDetails(accountDetails);
		return "succes";
	}

	@RequestMapping("/Balance")
	public String balanceForm()
	{
		return "balanceForm";
	}


	@RequestMapping("/Getbalance")
	private String getDetails( long accountNumber,ModelMap model)
	{
		model.put("account",servic.getRecord(accountNumber));
		return "getdetailsForm";
	}


	@RequestMapping("/Deposit")
	public String getDeposit()
	{
		return "depositeForm";

	}

	@RequestMapping("/depositamount")
	public String depositMoney(@RequestParam long accountNumber,@RequestParam String name, @RequestParam String password, @RequestParam int accountBalance,ModelMap model)
	{
		model.put("acc",servic.depositAmount(accountNumber, password, accountBalance));
		model.put("amount", accountBalance);

		return "depositResult";

	}

	@RequestMapping("/withdraw")
	public String getwithdraw()
	{
		return "withdrawForm";
	}


	@RequestMapping("/withdrawamount")
	public String withdrawAmount(@RequestParam long accountNumber,@RequestParam String name, @RequestParam String password, @RequestParam int accountBalance,ModelMap model)
	{
		AccountDetails acc=servic.withdrawAmount(accountNumber, password, accountBalance);
		if(acc !=null)
		{
			model.put("acc", acc);
			model.put("amount", accountBalance);

			return "withdrawresult";
		}
		else
		{
			return "insufficientblance";
		}
	}

	@RequestMapping("/Transfer")
	public String transfer()
	{
		return "transferForm";
	}

	@RequestMapping("/transferamount")
	public String  getTransferResult(@RequestParam Long accountNumber,@RequestParam String name, @RequestParam String password,  @RequestParam Long accountNumber1,@RequestParam int accountBalance,ModelMap model)
	{
		AccountDetails acc=servic.transferAmount(accountNumber, name, password, accountNumber1, accountBalance);

		if(acc !=null)
		{
			model.put("acc", servic.getRecord(accountNumber));
			model.put("acc1", servic.getRecord(accountNumber1));
			model.put("amount",accountBalance);
		

			return "transferResult";   
		}
		else
		{

			return "invalidDetails";
		}

	}


      @RequestMapping("/CloseA/c")
	  public String getCloseaccount()
	  {
		return "closeAccountForm";
	  }

       @RequestMapping("/closeAccount")
     	public String closeaccount(@RequestParam Long accountNumber,@RequestParam String name, @RequestParam String password,ModelMap model)
     	{
     		String result=servic.closeAccount(accountNumber, name, password);
     		model.put("result", result);
     		
     		return "closeAccountResult";
     	}


}
