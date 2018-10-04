// Assignment #: 4
// Name: Dean Styx
// StudentID: 1208950336
// Lecture: Tues- Thursday 10:30-11:45
// Time took to complete: 2 Hours
// Description: The manager class describes the name and department number of a
// 			given project. This class is used directly by Project.java


//import
import java.util.*;



//start of class Manager
public class Manager{

	//start initialize variables

	private String firstName, lastName;

	private int deptNum;

	private String ini = "?";

	//end initialize variables



	//start constructor
	public Manager(){

		firstName = "?";

		lastName = "?";

		deptNum = 0;

	}// end constructor



	//begin accessor methods

	//first name
	public String getFirstName(){

		return firstName;

	}

	//last name
	public String getLastName(){

		return lastName;

	}

	//deptartment number
	public int getDeptNum(){

		return deptNum;

	}

	//end of accessors



	//start of setting methods (mutators)

	//start first name setting
	public void setFirstName(String someFirstName){

		firstName = someFirstName;

	}
	//end first name


	//start Last Name
	public void setLastName(String someLastName){

		lastName = someLastName;

	}
	//end Last Name


	//start dept num
	public void setDeptNum(int someDeptNum){

		deptNum = someDeptNum;

	}
	//end dept num


	//begin to string method

	public String toString(){

		String r = getFirstName() + " " + getLastName() + ", Dept Num:" + getDeptNum() + "\n";

		return r;

	}
	//end string method




}
//end of class Manager