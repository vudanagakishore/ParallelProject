package com.cg.ui;

import java.util.*;

import com.cg.service.Service;

public class Main 
{
public static void main(String args[]) 

	{
       	Service s = new Service ();
       	BankRecord b = new BankRecord();
		
		Scanner keyboard = new Scanner(System.in);
		while (true)
		{
			System.out.println("              Welcome To YOUR Bank                   ");
			System.out.println("Choose options. \n 1. Create Account \n 2. Show Balance \n 3. Deposite "
					+ "\n 4. Withdraw \n 5. Fund Transfer \n 6. Print Transcaction \n 7.Exit ");
		int n = keyboard.nextInt();
		
		switch(n) {
		
		case 1 : 
			b.createAccount();
			break;
		case 2:
			b.showDetails();
			break;
		case 3: 
			b.deposite();
			break;
		case 4: 
			b.withdraw();
			break;
		case 5: 
			b.fundTransfer();
			break;
		case 6: System.out.println("You Will Be Exited");
		         System.exit(0);
		    break;
		default :
			System.out.println("Enter the valid choice");
		
		}
		
       }
  }
}
