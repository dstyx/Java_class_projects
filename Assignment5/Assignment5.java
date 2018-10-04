// Assignment #: 5
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues Thurs 10:30-11:45
//  Description: The Assignment 5 class displa ys a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
 {
  public static void main (String[] args)
     {
     // ArrayList object is used to store account objects
     ArrayList accountList = new ArrayList();

     try
      {
       printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

          String line, inputInfo;
       boolean operation = false;
       char input1;
       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add BankAccount
                    System.out.print("Please enter some account information to add:\n");
                    inputInfo = stdin.readLine().trim();
                    accountList.add(BankAccountParser.parseStringToBankAccount(inputInfo));
                    break;
             case 'C':   //Make Credit
                    System.out.print("Account number to make credit:\n");
                    String accountNumber = stdin.readLine().trim();
                    System.out.print("Amount (in pennies) to make credit:\n");
                    int amount = Integer.parseInt(stdin.readLine().trim());

                    /***********************************************************************************
                     ***  ADD your code here to credit the specified account with the amount
                     ***********************************************************************************/

                     for(int i =0; accountList.size()>i;i++)//to search through all accounts for correct account
                     {




						BankAccount find = (BankAccount)accountList.get(i);

						 if(find.getAccountNumber().equals(accountNumber))

						 {

							operation = find.credit(amount);

							break;
						 }

						 else{
							operation = false;
						}



					 }


                if (operation)
                    System.out.print("credit performed\n");
                else
                    System.out.print("credit not performed\n");
               break;
              case 'D':   //Make Debit
                    System.out.print("Account number to make debit:\n");
                    String accountNumber2 = stdin.readLine().trim();
                    System.out.print("Amount (in pennies) to make debit:\n");
                    int amount2 = Integer.parseInt(stdin.readLine().trim());

                    /***********************************************************************************
                     ***  ADD your code here to debit the specified account with the amount
                     ***********************************************************************************/

                     for(int i =0; accountList.size()>i;i++)//to search through all accounts for correct account
                     {
						 BankAccount find = (BankAccount)accountList.get(i);

						 if(find.getAccountNumber().equals(accountNumber2))

						 {

							 operation = find.debit(amount2);

							 break;

						 }

						 operation = false;



					 }

                    if (operation)
                        System.out.print("debit performed\n");
                    else
                        System.out.print("debit not performed\n");
                    break;
             case 'I':    //Apply Monthly Interest



                     for(int i =0; accountList.size()>i;i++)//to apply the intreset to every account in the system.
                     {
						 BankAccount find = (BankAccount)accountList.get(i);


						 find.applyInterest();



					 }

                    System.out.print("monthly interest applied\n");
                    break;
             case 'L':   //List BankAccounts



                     //begin if statement for if >0 accounts
                     if(accountList.size()>0){

						 //begin for loop to print every account
						 for(int i = 0; accountList.size()>i;i++){

							 BankAccount find= (BankAccount)accountList.get(i);

							 System.out.println(find.toString());

						 }

					 }

					 else{
						 System.out.println("no account\n");
					 }


                    break;
             case 'Q':   //Quit
                    break;
             case 'T':   //Transfer Fund
                    System.out.print("Account number to transfer funds FROM - \n");
                    String fromAccountNumber = stdin.readLine().trim();
                    System.out.print("Account number to transfer funds TO - \n");
                    String toAccountNumber = stdin.readLine().trim();
                    System.out.print("Amount (in pennies) to transfer:\n");
                    int amount3 = Integer.parseInt(stdin.readLine().trim());

                    BankAccount fromAccount = null, toAccount = null;

                    /***********************************************************************************
                     ***  ADD your code here to debit the specified account with the amount
                     ***********************************************************************************/

                    //begin forloop to determine from and to accounts
                    for(int i = 0; i<accountList.size();i++){

						BankAccount find = (BankAccount)accountList.get(i);


						if(find.getAccountNumber().equals(toAccountNumber)){

							toAccount = find;
							//int t = i;

						}

						if(find.getAccountNumber().equals(fromAccountNumber)){

							fromAccount = find;

							//int f = i;

						}



					}


                    if (toAccount != null && fromAccount != null && fromAccount.getBalanceInPennies() >= amount3) {
                        fromAccount.debit(amount3);
                        toAccount.credit(amount3);
                        System.out.print("transfer performed\n");
                        }
                    else
                        System.out.println("*** transfer failed - Invalid account number or insufficient funds!");
                    break;
             case '?':   //Display Menu
                    printMenu();
                    break;
             default:
                    System.out.print("Unknown action\n");
                    break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  /** The method printMenu displays the menu to a use **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd BankAccount\n" +
                      "C\t\tMake Credit\n" +
                      "D\t\tMake Debit\n" +
                      "I\t\tApply Monthly Interest\n" +
                      "L\t\tList BankAccounts\n" +
                      "Q\t\tQuit\n" +
                      "T\t\tTransfer Fund\n" +
                      "?\t\tDisplay Help\n\n");
  }
}


