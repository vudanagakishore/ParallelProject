package com.cg.bean;

public class Bean 
{
	String name;
	String number;
	int idno;
	String password;
	long accountNo ;
	int deposite;
	int balance;
	int withdraw;
	
	
	public int getDeposite() {
		return deposite;
	}

	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean(String name, String number, int idno, String password,int deposit) {
		
		this.name = name;
		this.number = number;
		this.idno = idno;
		this.password = password;
		this.deposite = deposit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getIdno() {
		return idno;
	}

	public void setIdno(int idno) {
		this.idno = idno;
	}

/*	public long getAccountNo() {
		return accountNo;
	}
*/
	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
		accountNo++;
	}

	public Bean(String name, String number, int idno) {
	this.name = name;
	this.idno = idno;
	this.number = number;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + ", idno=" + idno + ", password=" + password
				+ ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}

	

	

}
