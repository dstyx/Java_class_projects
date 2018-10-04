// Assignment #: 12
//         Name: Dean Styx
//    StudentID: 1208950336
//      Lecture: Tues-Thurs 10:30-1145
//  Description: This class controls the panels that have the waves by first drawing dots in order then making a line through them


//begin imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.*;
// end imports
public class WavePanel extends JPanel {//begin main method
	
	//begin variable declaration
	private Color color;
	private Timer timer;
	private int time = 0;
	private int step = 1;
	private int delay;
	private int waveHeight;
	private int waveWidth;
	private ArrayList<Dot> List = new ArrayList<>();
	// end variable declaration
	
	
	//begin constructor
	public WavePanel(Color color1) {
		color = color1;
		ArrayList<Dot> ptList = new ArrayList<>();
		waveHeight = 72;
		waveWidth = 50;
		delay = 20;
		step = 1;
		
		timer.start();
	}//end constructor
	
	public void resume() {
		timer.start();
		time = 0;
	}
	
	public void clearPanel() {
		
	}
	
	public void changeColor(Color anotherColor) {
		color = anotherColor;
	}
	
	public void setWaveWidth(int newWidth) {
		waveWidth = newWidth;
		
	}

	public void setDelay(int delayNum) {
		delay = delayNum;
		
	}
	
	public void paintComponent(Graphics page) {
		
	}
	
	
	private class WaveListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			
			
			
		}
		
		
	}
	


}// end main method





