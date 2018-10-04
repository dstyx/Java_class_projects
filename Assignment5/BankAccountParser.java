// Assignment #: 5
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues Thurs 10:30-11:45
//  Description: This class will split up the input of the use and change it into useable data


//begin class
public class BankAccountParser {

//begin parsing method
	public static BankAccount parseStringToBankAccount(String lineToParse){

		String[] p = lineToParse.split("/");


		//when Credit card

		if(p[0].equals("CR")){

			return new CreditcardAccount(Integer.parseInt(p[3]), Double.parseDouble(p[2]), p[1], Integer.parseInt(p[4]));
		}

		//when checking
		if(p[0].equals("CH")){

						return new CheckingAccount(Integer.parseInt(p[3]), Double.parseDouble(p[2]), p[1], Integer.parseInt(p[4]));
		}

		//wehn savings
		if(p[0].equals("SA")){

			return new SavingsAccount(Integer.parseInt(p[3]), Double.parseDouble(p[2]), p[1]);
		}

		return null;




	}






}