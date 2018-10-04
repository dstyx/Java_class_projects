// Assignment #: 8
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 10:30
//  Description: The Manager class describes a manager.
//               It also provides their accessor, mutator methods,
//               and toString method.

import java.io.*;

public class Manager
{

 private String firstName;
 private String lastName;
 private int deptNum;

 /************************************************************************
 Constructor method to initialize intance variables.
 ************************************************************************/
 public Manager()
  {
      firstName = new String("?");
      lastName= new String("?");
      deptNum = 0;
  }

 /************************************************************************
 Accessor methods
 ************************************************************************/
 public String getFirstName()
  {
   return firstName;
  }

 public String getLastName()
  {
   return lastName;
  }

 public int getDeptNum()
  {
   return deptNum;
  }

 /************************************************************************
  Modifier methods
 ************************************************************************/
 public void setFirstName(String someFirstName)
  {
   firstName = someFirstName;
  }

 public void setLastName(String someLastName)
  {
   lastName = someLastName;
  }

 public void setDeptNum(int someDeptNum)
  {
   deptNum = someDeptNum;
  }

 /*****************************************************************************
 This method return a string containing the attribute information of a manager
 *****************************************************************************/
 public String toString()
  {
   String result;

      result = firstName + " " + lastName + ", Dept Num:" + deptNum;

   return result;
  }
 
 
 
 //beginning of my code
 
 //copy method that puts all values of other into this instance of manager
 
 public void copy(Manager other) { //start of copy
	 this.firstName = other.getFirstName();
	 this.lastName = other.getLastName();
	 this.deptNum = other.getDeptNum();
	 
 } //end copy, this should copy all values from other

} 