// Assignment #: 4
// Name: Dean Styx
// StudentID: 1208950336
// Lecture: Tues- Thursday 10:30-11:45
// Time took to complete: 2 Hours
// Description: This class is to be used to set up projects with the project name,
//			it's location, it's number and it's manager by first and last name
//			by calling the manager class.

//import
import java.util.*;


//start of Project
public class Project {

	//start initilize variables

	private String projTitle, projLocation;

	private int projNumber;

	Manager projManager = new Manager();

	//end declaring variables

	//begin constructor method

	public Project(){

		projTitle = "?";

		projLocation = "?";

		projNumber= 0;

	}
	//end constructor method



	//begin accessor methods.

	//proj title
	public String getProjTitle(){

		return projTitle;

	}

	//proj number
	public int getProjNumber(){

		return projNumber;

	}

	//proj location
	public String getProjLocation(){

		return projLocation;

	}

	//proj manager
	public Manager getProjManager(){

		return projManager;

	}

	//end of accessor metods



	//start set methods

	//set proj title
	public void setProjTitle(String aTitle){

		projTitle = aTitle;

	}


	//set proj number
	public void setProjNumber(int number){

		projNumber = number;

	}


	//set proj location
	public void setProjLocation(String aLocation){

		projLocation = aLocation;

	}


	//set proj manager
	public void setProjManager(String someFirstName, String someLastName, int someDeptNum){

		projManager.setFirstName(someFirstName);
		projManager.setLastName(someLastName);
		projManager.setDeptNum(someDeptNum);

	}


	//end set methods


	//start to string method


	public String toString(){

		String r = "\nProject Title:\t\t"+getProjTitle()+
				   "\nProject Number:\t\t"+getProjNumber()+
				   "\nProject Location:\t"+getProjLocation()+
				   "\nProject Manager:\t"+projManager.toString() +"\n";



		return r;

	}//end of to String









}//end of project