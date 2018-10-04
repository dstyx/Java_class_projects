// Assignment #: 7
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 1030-1145
//  Description: This class contains all aspects of the GUI itself from coloring in the boxes, what color to make the boxes and extending the boxes when clicking on the edges

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  // to use listener interfaces


public class WholePanel extends JPanel
{
   private Color currentColor;
   private int currentWidth, currentHeight;
   private CanvasPanel canvas;
   private JPanel menuPanel;
   private JCheckBox fillCheck;
   private int x1, y1;

   //begin my variables
   private JRadioButton[] radio;
   private Point pt;
   private Color [] colors;
   int f = 0;
   int dy, dx, x0, y0;

   public WholePanel()
   {
     //white is the default color
     currentColor = Color.WHITE;

     //default x-y cooridnate, width, and height of a rectangle
     currentWidth = currentHeight = 100;
     x1 = 100; y1 = 100;
     dy=0;
     dx=0;



     fillCheck = new JCheckBox("Filled");



     //start radio buttons initialization

     radio = new JRadioButton[5];
     radio[0] = new JRadioButton("white", true);
     radio[1] = new JRadioButton("red");
     radio[2] = new JRadioButton("blue");
     radio[3] = new JRadioButton("green");
     radio[4] = new JRadioButton("orange");
     //end radio button initialization



     menuPanel = new JPanel();
     menuPanel.add(fillCheck);
     menuPanel.add(radio[0]);
     menuPanel.add(radio[1]);
     menuPanel.add(radio[2]);
     menuPanel.add(radio[3]);
     menuPanel.add(radio[4]);



     canvas = new CanvasPanel();

     JSplitPane sPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, menuPanel, canvas);

     setLayout(new BorderLayout());
     add(sPane, BorderLayout.CENTER);

     //add listener for Fill

     FillListener fillListener = new FillListener();

     fillCheck.addItemListener(fillListener);


     //action listener for states

     //add color listener for radio
     ColorListener colorListener = new ColorListener();

     for (int i=0; i<radio.length; i++){
		 radio[i].addActionListener(colorListener);
	 }//end color listener for radio


     //to be completed

    }



 //insert ColorListener and FillListener classes
       private class FillListener implements ItemListener
 	  	{//begin fill listener
 	  		public void itemStateChanged(ItemEvent event){//begin item state change

 	  		if(event.getStateChange() == ItemEvent.SELECTED){//if checked will do

 	  		f=1;

 	  		repaint();







 	  	}//end if checked

 	  	else{//begin if box is not checked

 	  	f=0;

 	  	repaint();





 	  	}//end if box isnt checked

 	  	}//end item state change



 }//end fill listener


 //begin color listener class


 		private class ColorListener implements ActionListener
 		{
			public void actionPerformed(ActionEvent event)
			{
				if(event.getSource()== radio[0])
				{
					currentColor = Color.white;
					repaint();
				}

				if(event.getSource()== radio[1])
				{
					currentColor = Color.red;
					repaint();
				}
				if(event.getSource()== radio[2])
				{
					currentColor = Color.blue;
					repaint();
				}
				if(event.getSource()== radio[3])
				{
					currentColor = Color.green;
					repaint();
				}
				else if (event.getSource() == radio[4])
				{
					currentColor = Color.orange;
					repaint();
				}
			}
		}



 //CanvasPanel is the panel where pressed keys will be drawn
 private class CanvasPanel extends JPanel
  {
     //Constructor to initialize the canvas panel
     public CanvasPanel( )
      {
        // make this canvas panel listen to mouse
        addMouseListener(new PointListener());
        addMouseMotionListener(new PointListener());


        setBackground(Color.BLACK);
      }//end constructor for cavas panel





//this method draws all characters pressed by a user so far
		public void paintComponent(Graphics page)
			      {
			       super.paintComponent(page);

			       //set color, then draw a rectangle
			       page.setColor(currentColor);

					//f is 0 by default and deterined by the fill box listener
					if(f==0){
			       		page.drawRect(x1, y1, currentWidth, currentHeight);
			   		}
			   		else{
						page.fillRect(x1, y1, currentWidth, currentHeight);
					}

      	}//end paintCompenent












    // listener class that listens to the mouse
    public class PointListener implements MouseListener, MouseMotionListener
         {
         //in case that a user presses using a mouse,
         //record the point where it was pressed.
         public void mousePressed (MouseEvent event)
          {
			  //Point pt = event.getPoint();
			  //inital points of the click

			  x0 = event.getX();
			  y0 = event.getY();


			  //debug
			  //System.out.println("point" + event.getX()+ "  " + event.getY());
		}
         public void mouseClicked (MouseEvent event) {}
         public void mouseReleased (MouseEvent event) {
			 //Point pt = event.getPoint();


			 //System.out.println("point" + event.getX()+ "  " + event.getY());
			 }
         public void mouseEntered (MouseEvent event) {}
         public void mouseExited (MouseEvent event) {}
         public void mouseMoved(MouseEvent event) {}
         public void mouseDragged(MouseEvent event)
          {


           dx = x0- event.getX();
           dy = y0- event.getY() ;

           //debug
           //System.out.println("drag" +event.getX()+"   " + event.getY()+ "  dx"+ dx + "   dy" + dy);

           if(currentHeight>10 && currentWidth>10){//start of minimum size of rectangle




           		//start if left wall clicked
           		if(x0<=x1+5 && x0>=x1-5 && y0>=y1 && y0<=y1+currentHeight){

					x1 = x1-dx;
					currentWidth = currentWidth+dx;
					repaint();


		  		 }//end if left wall clicked

				if(x0<=x1+currentWidth+5 && x0>=x1+currentWidth-5 && y0>=y1 && y0<=(y1+currentHeight)){//start if right wall sicked

					currentWidth = currentWidth-dx;
					repaint();


		   		}//end if right wall clicked

				//if top wall is clicked
		   		if(y0<=y1+5 && y0>=y1-5 && x0>=x1 && x0<x1+currentWidth)
		   		{
					currentHeight = currentHeight + dy;
					y1 = y1-dy;
					repaint();



		   		}//end if top wall is clicked

		   		if(y0<y1+currentHeight+5 && y0>y1 + currentHeight-5 && x0>=x1 && x0 <x1 + currentWidth){

					currentHeight = currentHeight -dy;
					repaint();

				}//end if bottom wall is clicked

	   		}//end minimum size


         }


    } // end of PointListener

  } // end of Canvas Panel Class

} // end of Whole Panel Class
