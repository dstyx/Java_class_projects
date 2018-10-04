// Assignment #: 8
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tu-Thurs 10:30-11:45
//  Description: The class Project represents a project

import java.io.*;

public class Project
 {
   private String projTitle;
   private int projNumber;
   private String projLocation;
   private Manager projManager;

   //Constructor to initialize all member variables
   public Project()
    {
      projTitle = "?";
      projNumber = 0;
      projLocation = "?";
      projManager = new Manager();
    }

   //Accessor methods
   public String getProjTitle()
    {
      return projTitle;
    }

   public int getProjNumber()
    {
      return projNumber;
    }

   public String getProjLocation()
    {
	   return projLocation;
	}

   public Manager getProjManager()
    {
      return projManager;
    }

   //Mutator methods
   public void setProjTitle(String aTitle)
    {
     projTitle = aTitle;
    }

   public void setProjNumber(int aNumber)
    {
     projNumber = aNumber;
    }

   public void setProjLocation(String aLocation)
    {
      projLocation = aLocation;
    }

   public void setProjManager(String first, String last, int deptNum)
    {
        projManager.setFirstName(first);
        projManager.setLastName(last);
        projManager.setDeptNum(deptNum);
    }
     

   //toString() method returns a string containg its title, number, location and manager
   public String toString()
    {
      String result = "\nProject Title:\t\t" + projTitle
                    + "\nProject Number:\t\t" + projNumber
                    + "\nProject Location:\t" + projLocation
                    + "\nProject Manager:\t"
                    + projManager.toString() + "\n\n";
      return result;
     }
   
   
 //begin my code

 //copy method copies the values from another project to this one

 public void copy(Project other) {//start copy
 	
 	this.projTitle = other.getProjTitle();
 	this.projNumber = other.getProjNumber();
 	this.projLocation = other.getProjLocation();
 	this.projManager = other.getProjManager();
 	
 }
  }


