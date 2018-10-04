// Assignment #: 8
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 10:30-11:45
//  Description: This class compares the manager's department number and if they are the same will instead compare the first names

import java.util.*;

public class ManagerComparator implements Comparator{
	
	
	//begin the compare method
	public int compare(Object first, Object second) {
		//declaring variables for use
		Manager obj1 = (Manager)first;
		Manager obj2 = (Manager)second;
		
		
		String name1 = obj1.getFirstName();
		String name2 = obj2.getFirstName();
		
		if(obj1.getDeptNum()< obj2.getDeptNum()) {
			return -1;
		}
		
		if(obj1.getDeptNum() > obj2.getDeptNum()) {
			return 1;
		}
		
		else{
			if(name1.compareTo(name2) <0) {
				return -1;
			}
			if(name1.compareTo(name2) >0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		
		
		
		
	}//end compare method
}