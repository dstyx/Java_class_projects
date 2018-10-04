// Assignment #: 5
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues Thurs 10:30-11:45
//  Description: This class is a child of BankAccount, specific bank account using Savings


//begin class Savings Account

public class SavingsAccount extends BankAccount{

	//begin constructor

	public SavingsAccount(int balance, double interest, String accountNum){

		super(balance, interest, accountNum);


	}
	//end constructor


	//begin un-abstracting methods

	//begin debit
	public boolean debit(int amountInPennies){

		if(amountInPennies<=balanceInPennies){

			balanceInPennies -= amountInPennies;

			return true;

		}

		else{

			return false;

		}

	}
	//end debit



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

		String t = "\nAccount type\t:\tSavings\n"+
				   super.toString();


		return t;

	}//end to String








}//end Savings account