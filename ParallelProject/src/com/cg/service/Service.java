package com.cg.service;

import java.util.*;
import com.cg.bean.*;
import com.cg.dao.*;
public class Service 
{
	Scanner sc = new Scanner(System.in);
	public Bean c;
	Dao d = new Dao();
	public void createAccount(Bean c) 
	{
		d.create(c);
	}

	public void showDetails(Long showaccount) 
	{
			if(d.getHash().containsKey(showaccount)) {
				System.out.println(d.getHash().get(showaccount));
			}
			else
				System.out.println("No such Account Number");
			
	}

	public void deposite(long accountdeposit) 
	{
		if(d.getHash().containsKey(accountdeposit)){
			System.out.println("Enter the amount to be deposite");	
			int deposite = sc.nextInt();
			d.getHash().get(accountdeposit).setDeposite(deposite);
			int a = d.getHash().get(accountdeposit).getDeposite() + d.getHash().get(accountdeposit).getBalance();
			d.getHash().get(accountdeposit).setBalance(a);
			System.out.println("Successfully Deposited");
		}
		else
		{
		System.out.println("No such Account Number");
		}
	}

	public void withdraw(long accountwithdraw)
	{
		
		if(d.getHash().containsKey(accountwithdraw))
		{
		System.out.println("Enter the amount to be withdraw");	
		int withdraw = sc.nextInt();
		d.getHash().get(accountwithdraw).setWithdraw(withdraw);
		int a = d.getHash().get(accountwithdraw).getBalance() - d.getHash().get(accountwithdraw).getWithdraw();
		if(a>0) {d.getHash().get(accountwithdraw).setBalance(a);
		System.out.println("Successfully Withdraw");
		}else
			System.out.println("Insufficient Balance");
			}else
			System.out.println("No such Account Number");
		}

	public void fundTransfer(Long from) 
	{

		if(d.getHash().containsKey(from)) {
		System.out.println("Enter account number to transfer the money.");
		Long to = sc.nextLong();
		if(d.getHash().containsKey(to)) {
		System.out.println("Enter the money to be transfer");
		int money = sc.nextInt();
		
		Bean cFrom = (Bean) d.getHash().get(from);
		int fBalance = cFrom.getBalance();
		if(money<fBalance) {
			Bean cTo = (Bean) d.getHash().get(to);
			int totalMoney = cTo.getBalance() + money;
			 cTo.setBalance(totalMoney);
			int totalMony = fBalance - money;
			 cFrom.setBalance(totalMony);
			 System.out.println("Successfully Transfer");
			}
		else 
			System.out.println("Insufficient Money");
		}else 
			System.out.println("Invalid Account Number");
		}else 
			System.out.println("Invalid Account Number");
		}

}
