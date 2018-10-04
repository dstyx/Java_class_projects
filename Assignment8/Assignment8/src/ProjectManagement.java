// Assignment #: 8
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 10:30-11:45
//  Description:

import java.io.*;
import java.util.*;


public class ProjectManagement implements Serializable{
	//begin declaring variables for project management
	private Project[] projectList;
	private int currentProjectsCount;
	private int maxSize;
	
	
	public ProjectManagement(int maximumsize){//start constructor
		
		this.maxSize = maximumsize;
		this.currentProjectsCount = 0;
		projectList = new Project[maxSize];
		
		for (int i = 0; i <maxSize; i++) {
			projectList[i] = null;
			//this to set every index to a value of null upon intialization
		}
	}//end constructor
	
	public int projectNumberExists(int projectNumber) {//begn project number exists
		
		//seach through the list to find if the object exists
		
		for(int i = 0; i<currentProjectsCount; i++) {//start for loop
			
			if(projectList[i].getProjNumber() == projectNumber) {
				return i;
			}//start if project number exists if statement
			

			
			
		}//end for loop
		
		//if for loop terminates then project number does not exists in array
		return -1;
		

	}//end project number exists
	
	
	public int managerExists(String firstName,String lastName,int deptNum) {
		//begin for loop to search the list
		for(int i = 0; i<currentProjectsCount; i ++) {
			//if the first and last name and number match return the value of i
			if(projectList[i].getProjManager().getFirstName().equals(firstName)&&
				projectList[i].getProjManager().getLastName().equals(lastName)&&
				projectList[i].getProjManager().getDeptNum() == deptNum) {//start if statment man this is long
				
				return i ;
			}//end if statement
		}
		//if for loop breaks return -1
		return -1;
	}
	
	public boolean addProject(String projTitle, int projNumber,String projLocation, String firstName,String lastName, int deptNum) {//start add project method
		

		return true;
	}
	
	public boolean removeProjectNumber(int projectNumber) {
		
		return true;
	}
	
	public void sortByProjectNumber() {
		
	}
	
	public void sortByManager() {
		
	}
	
	
	
	public String listProjects() {
		
		if(currentProjectsCount == 0) {
			return "\nno project\n\n";
		}
		return "\nno project\n\n";
	}
	
	public void closeProjectManagement() {
		
	}
}