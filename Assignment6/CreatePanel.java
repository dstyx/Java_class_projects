// Assignment #: 6
//         title: Dean Styx
//    StudentID: 1208950336
//      Lecture: T-Th 10:30-11:45
//  Description: it needs to be filled

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CreatePanel extends JPanel
 {
   private Vector projectList;
   private JButton button1;
   private SelectPanel sPanel;

 //Constructor initializes components and organize them using certain layouts
 public CreatePanel(Vector projectList, SelectPanel sPanel)
  {
    this.projectList = projectList;
    this.sPanel = sPanel;

      // orgranize components here
      // here is an example

      button1 = new JButton("Create a project");

      setLayout(new GridLayout(1,1));
      add(button1);
  }


  //ButtonListener is a listener class that listens to
  //see if the buttont "Create a project" is pushed.
  //When the event occurs, it add the project information
  //in the text fields to the text area
  //and the list of project information,
  //and it also does error checking.
  private class ButtonListener implements ActionListener
   {
    public void actionPerformed(ActionEvent event)
     {
         // if there is no error, add a project to project list
         // otherwise, show an error message

     } //end of actionPerformed method
  } //end of ButtonListener class

} //end of CreatePanel class
