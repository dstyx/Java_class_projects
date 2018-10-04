// Assignment #: 5
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues Thurs 10:30-11:45
//  Description: This class is a child of BankAccount,specific account called checking


import java.text.DecimalFormat;

//begin checking account class
public class CheckingAccount extends BankAccount{

	int overdraftFeePennies;
	DecimalFormat dollars = new DecimalFormat("#.00");


	//begin constructor
	public CheckingAccount(int balance, double interestRate,String accountNum, int overdraftFeeInPennies){

		super(balance, interestRate, accountNum);

		overdraftFeePennies = overdraftFeeInPennies;

	}//end constructor



	//begin debit method
	public boolean debit(int amountInPennies){

		if(balanceInPennies>=amountInPennies){

			balanceInPennies -= amountInPennies;

			return true;

		}

		else{
			balanceInPennies -= (amountInPennies+overdraftFeePennies);

			return false;
		}

	}//end debit method



	//begin apply interest
		public void applyInterest(){

			if(balanceInPennies>0){

				double amount;

				amount = (balanceInPennies*interestRate);

				balanceInPennies = (int)amount+ balanceInPennies;
			}

		}//end apply interest



		//begin to string method

		public String toString(){

			double overdraftDollars = (double)(overdraftFeePennies)/100.00;

			String t = "\nAccount type\t:\tChecking\n"+
					   super.toString()+
					   "Overdraft fee\t:\t"+dollars.format(overdraftDollars)+"\n";


			return t;

	}//end to String





}//end checking account class