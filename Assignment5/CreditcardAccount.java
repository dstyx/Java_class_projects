// Assignment #: 5
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues Thurs 10:30-11:45
//  Description: This class is a child of BankAccount,this method s the credit card account

import java.text.DecimalFormat;

//begin class credit card
public class CreditcardAccount extends BankAccount{

	int creditLimitPennies;
	DecimalFormat dollars = new DecimalFormat("#.00");


	//begin constructor
	CreditcardAccount(int balance, double interestRate, String accountNum, int creditcardLimit){

		super(balance, interestRate,accountNum);

		creditLimitPennies = creditcardLimit;

	}
	//end constructor



	//begin debit

	public boolean debit(int amountInPennies){

		if(amountInPennies-balanceInPennies<=creditLimitPennies){

			balanceInPennies-= amountInPennies;

			return true;
		}
		return false;


	}







	//begin apply interest
			public void applyInterest(){

				if(balanceInPennies<0){

					double amount;

					amount = (balanceInPennies*interestRate);

					balanceInPennies = (int)amount+ balanceInPennies;
				}

		}//end apply interest






		//begin to string method

		public String toString(){

			double limitDollars = (double)(creditLimitPennies)/100.00;

			String t = "\nAccount type\t:\tCreditcard\n"+
					   super.toString()+
					   "Credit limit\t:\t"+dollars.format(limitDollars)+"\n";


			return t;

	}//end to String






}//end class credit card