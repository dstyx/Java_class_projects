// Assignment #: 6
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: T-Th 10:30-11:45
//  Description: it needs to be filled

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class SelectPanel extends JPanel
 {
   private Vector projectList, selectedList;


   //Constructor initialize each component and arrange them using
   //certain layouts
   public SelectPanel(Vector projectList)
     {
      this.projectList = projectList;


       // organize components for the select panel
  }

 //This method updates refresh the JList of projects with
 //updated vector information
 public void updateProjectList()
  {
    // call updateUI() for the JList
  }

 //ButtonListener class listens to see if any of
 //buttons is pushed, and perform their corresponding action.
 private class ButtonListener implements ActionListener
  {
       public void actionPerformed(ActionEvent event)
        {
          //TO BE COMPLETED
        }
  } //end of ButtonListener class

} //end of SelectPanel class
