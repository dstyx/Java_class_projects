// Assignment #: 2
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 10:30-11:45
//Time took me to complete the Assignment
//  Description: This class will read input given from a keyboard
//				 and determine the Smallest number, how many are
//				 how many and largest integer are divisible by 2
//  			 and sum of positive integers


//imports
import java.util.*;


//start class
public class Assignment2
{


	public static void main (String[] args)//start method
	{
		//initialize variables: number, minimum, largest, even, sum and remainder
		int num = 1, min=0, lrg=0, eve = 0, sum =0, rem;

		Scanner scan= new Scanner(System.in);

		//begin while loop
		while(num!=0){

			num= scan.nextInt();


			//begin minimum integer loop
			if(num<min && num!=0){

				min = num;

			}//end minimum integer loop



			//begin number of even and largest integer divisible by 2
			rem = num %2;

			//begin loop#1 this one itereates on eve and determines largest even.
			if(rem==0){

				eve++;

				//begin loop#2 this one determines largest even
				if(num>lrg){

					lrg=num;

				}//end loop#2

			}//end loop #1

			//end of even and largest integer divisible by 2



			//begin sum of positive integers

			if(num>0){

				sum= sum+ num;

			}
			// end sum of positive integers


		}//end of while loop


		//begin system print
		System.out.println("The minimum integer is "+min);
		System.out.println("The largest integer that is divisible by 2 is "+lrg);
		System.out.println("The count of even integers in the sequence is " + eve);
		System.out.print("The sum of positive integers is "+sum);






		//DEBUG
		//System.out.println("Num, min, lrg, eve, sum in that order");
		//System.out.println(num);
		//System.out.println(min);
		//System.out.println(lrg);
		//System.out.println(eve);
		//System.out.println(sum);

	}//end method


}//end class