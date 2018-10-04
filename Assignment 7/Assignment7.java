// Assignment #: 7
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 1030-1145
//  Description: Initialization of theapplet

import javax.swing.*;

public class Assignment7 extends JApplet
{

 public void init()
  {
    // create a WholePanel object and add it to the applet
    WholePanel wholePanel = new WholePanel();
    getContentPane().add(wholePanel);

    //set applet size to 400 X 400
    setSize (400, 400);
  }

}





