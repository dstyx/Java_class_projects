// Assignment #: 8
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 10:30-11:45
//  Description: this class will compare project numbers and return a value based on the comparison.
	
	
import java.util.*;
	
	
public class ProjectNumberComparator implements Comparator{
	
	public int compare(Object first, Object second) {
		Project obj1 = (Project)first;
		Project obj2 = (Project)second;
		
		if(obj1.getProjNumber() == obj2.getProjNumber()) {
			return 0;
		}
		
		if(obj1.getProjNumber()< obj2.getProjNumber()) {
			return -1;
		}
		
		else{//this is for the final case when obj1 is greater than obj2
			return 1;
		}
		
	}
	

}