import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class WholePanel extends JPanel
{ //instance variables
   private Color currentColor;
   private CanvasPanel canvas;
   private JPanel primary, buttonPanel, leftPanel;
   private JButton erase, undo;
   private ArrayList rectList, tempList;
   private JRadioButton[] colorRButtons;
   private Color[] colors;
   private int x1, y1, x2, y2, x3, y3;
   private boolean mouseDragged = false;

   //Constructor to instantiate components
   public WholePanel()
   {
      //default color to draw rectangles is black
          currentColor = Color.black;
      rectList = new ArrayList();

             //create buttons
      erase = new JButton("Erase");
      undo = new JButton("Undo");
      ButtonListener listener2 = new ButtonListener();
      erase.addActionListener(listener2);
      undo.addActionListener(listener2);


      //create radio buttons for 5 colors
      //black will be chosen by default
      colorRButtons = new JRadioButton[5];
      colorRButtons[0] = new JRadioButton("black", true);
      colorRButtons[1] = new JRadioButton("red");
      colorRButtons[2] = new JRadioButton("blue");
      colorRButtons[3] = new JRadioButton("green");
      colorRButtons[4] = new JRadioButton("orange");
      // store 5 colors in an array
      colors = new Color[5];
      colors[0] = Color.black;
      colors[1] = Color.red;
      colors[2] = Color.blue;
      colors[3] = Color.green;
      colors[4] = Color.orange;
      //group radio buttons so that when one is selected,
      //others will be unselected.
      ButtonGroup group = new ButtonGroup();
      for (int i=0; i<colorRButtons.length; i++)
        group.add(colorRButtons[i]);

      //add ColorListener to radio buttons
      ColorListener listener = new ColorListener();
      for (int i=0; i<colorRButtons.length; i++)
           colorRButtons[i].addActionListener(listener);

      //primary panel contains all radio buttons
      primary = new JPanel(new GridLayout(5,1));
      for (int i=0; i<colorRButtons.length; i++)
           primary.add(colorRButtons[i]);
      buttonPanel = new JPanel(new GridLayout(2,1));
      buttonPanel.add(undo);
      buttonPanel.add(erase);

      leftPanel = new JPanel(new GridLayout(2,1));
      leftPanel.add(primary);
      leftPanel.add(buttonPanel);

      //canvas panel is where rectangles will be drawn, thus
      //it will be listening to a mouse.
      canvas = new CanvasPanel();
      canvas.setBackground(Color.white);
      canvas.addMouseListener(new PointListener());
      canvas.addMouseMotionListener(new PointListener());

      JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, canvas);

      setLayout(new BorderLayout());
      add(sp);
    }

   //ButtonListener class that takes action depending on what button is
   //pushed
   public class Rect
   {
      private int x;
      private int y;
      private Color color;
      private int width;
      private int height;

      public Rect(int x1, int y1, int width, int height, Color color)
      {
          x = x1;
          y = y1;
          this.width = width;
          this.height = height;
          this.color = color;
      }
      public void draw(Graphics page)
      {
          page.setColor(color);
          page.fillRect(x, y, width, height);
      }


}

   private class ButtonListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
          if (event.getSource() == undo)
          {
              if (rectList.size() > 0)
              {
              rectList.remove(rectList.size()-1);
              mouseDragged = false;
              canvas.repaint();
              }
          }
          if (event.getSource() == erase)
          {
              if (rectList.size() > 0)
              {
              rectList.clear();
              mouseDragged = false;
              canvas.repaint();
              }
          }
      }
   } // end of ButtonListener

   // listener class to set the color chosen by a user using
   // the radio buttons.
   private class ColorListener implements ActionListener
    {
       public void actionPerformed(ActionEvent event)
       {
            if (event.getSource() == colorRButtons[0])
             currentColor = colors[0];
            else if (event.getSource() == colorRButtons[1])
             currentColor = colors[1];
            else if (event.getSource() == colorRButtons[2])
             currentColor = colors[2];
            else if (event.getSource() == colorRButtons[3])
             currentColor = colors[3];
            else if (event.getSource() == colorRButtons[4])
             currentColor = colors[4];
         }
    }


//CanvasPanel is the panel where rectangles will be drawn
private class CanvasPanel extends JPanel
{
     //this method draws all rectangles specified by a user
   public void paintComponent(Graphics page)
      {
        super.paintComponent(page);

          //draw all rectangles
          for (int i=0; i < rectList.size(); i++)
               {
              ((Rect) rectList.get(i)).draw(page);
            }

          //draw an outline of the rectangle that is currently being drawn.
          if (mouseDragged == true)
           {
           page.setColor(currentColor);
           //Assume that a user will move a mouse only to left and down from
           //the first point that was pushed.
           page.drawRect(x1, y1, x3-x1, y3-y1);
           }
      }
    } //end of CanvasPanel class

   // listener class that listens to the mouse
   public class PointListener implements MouseListener, MouseMotionListener
    {
   //in case that a user presses using a mouse,
   //record the point where it was pressed.
     public void mousePressed (MouseEvent event)
      {
       x1 = event.getX();
         y1 = event.getY();
       //after "create" button is pushed.
      }

     //mouseReleased method takes the point where a mouse is released,
     //using the point and the pressed point to create a rectangle,
     //add it to the ArrayList "rectList", and call paintComponent method.
     public void mouseReleased (MouseEvent event)
      {
       x2 = event.getX();
       y2= event.getY();
       Rect rectangle = new Rect(x1, y1, (x2-x1), (y2-y1), currentColor);
       rectList.add(rectangle);
       canvas.repaint();
      }

     //mouseDragged method takes the point where a mouse is dragged
     //and call paintComponent method
   public void mouseDragged(MouseEvent event)
      {
       x3 = event.getX();
       y3= event.getY();
       mouseDragged = true;
         canvas.repaint();
      }

     public void mouseClicked (MouseEvent event) {}
     public void mouseEntered (MouseEvent event) {}
     public void mouseExited (MouseEvent event) {}
     public void mouseMoved(MouseEvent event) {}

    } // end of PointListener

} // end of Whole Panel Class