package com.cg.ui;
import java.util.*;
import com.cg.bean.Bean;
import com.cg.dao.Dao;
import com.cg.service.Service;

public class BankRecord 
{
	Bean c;
	Service s;
	Dao d = new Dao();
	long accountNo = (long) (Math.random()*1234);
	Scanner sc = new Scanner(System.in);
	public void createAccount() 
	{
		
		System.out.println("Enter the UserName");
		String username = sc.next();
		System.out.println("Enter the MobileNumber");
		String mobilenumber = sc.next();
		System.out.println("Enter the IDno.");
		int Idno = sc.nextInt();
		System.out.println("Create a password.");
		String password = sc.next();
		System.out.println("Enter the Balance to be deposit.");
		int deposit = sc.nextInt();
		c = new Bean(username,mobilenumber,Idno,password,deposit); 
		c.setAccountNo(accountNo);
		accountNo++;
		c.setBalance(deposit);
		System.out.println(c);
		System.out.println("Your account is Created Successfully");
		System.out.println("Account number is :" + c.getAccountNo());
		
		//d.create(c);
		s = new Service();
		s.createAccount(c);
	}
	

	public void showDetails() 
	{
			System.out.println("Enter the Account no.");
			Long showaccount = sc.nextLong();
			s.showDetails(showaccount);
			
	}
	
	public void deposite() 
	{
		System.out.println("Enter the account number");
		long accountdeposit = sc.nextLong();
		s.deposite(accountdeposit);
	}
	
	public void withdraw()
	{
		System.out.println("Enter the account number");
		long accountwithdraw = sc.nextLong();
		s.withdraw(accountwithdraw);
	}
	
	public void fundTransfer() 
	{
		System.out.println("Enter your account number.");
		Long from = sc.nextLong();
		s.fundTransfer(from);
	}

}
