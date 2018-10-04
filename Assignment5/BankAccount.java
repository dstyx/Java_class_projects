// Assignment #: 5
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues Thurs 10:30-11:45
//  Description: Parent class to all different bank accounts to follow.

import java.text.DecimalFormat;

abstract public class BankAccount{
	//begin Bank Account class

	//begin variables
	protected int balanceInPennies;
	protected double interestRate;
	protected String accountNumber;
	DecimalFormat dollars = new DecimalFormat("0.00");

	//end variable declaration

	//start constructor
	public BankAccount(int balance, double interest, String accountNum){

		balanceInPennies = balance;

		interestRate = interest;

		accountNumber = accountNum;

	}
	//end constructor

	//begin accessor methods

	public String getAccountNumber(){
		return accountNumber;
	}

	public int getBalanceInPennies(){
		return balanceInPennies;
	}

	public double getInterestRate(){
		return interestRate;
	}

	//end accessor methods



	//begin mutator methods

	public void setAccountNumber(String accountNo){

		accountNumber = accountNo;
	}

	public void setInterestRate(double rate) {

		interestRate = rate;

	}

	//end mutator methods


	//begin abstract methods to
	public abstract boolean debit(int amountInPennies);

	public abstract void applyInterest();
	//end abstract methods


	//begin public methods

	public boolean credit(int amountInPennies){//begin credit

		if(amountInPennies>=0){//begin pennies>0

			balanceInPennies += amountInPennies;

			return true;
		}



		return false;


	}//end credit



	//begin to sring method
	public String toString(){

		double balanceDollars = (double)balanceInPennies/100.00;


		String s= "Account ID\t:\t"+accountNumber+"\n"+
				  "Balance\t\t:\t" + dollars.format(balanceDollars)+"\n"+
				  "Interest rate\t:\t"+ dollars.format(interestRate)+"\n";

		return s;

	}



}
//end bank accountclass
