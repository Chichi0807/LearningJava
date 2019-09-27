// package whatever; // don't place package name!

import java.io.*;
import javax.swing.*;

class FirstWindow
{
	public static void main (String[] args) 
  {
		//Create and set up the window.
    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Add the ubiquitous "Hello World" label.
    JLabel label = new JLabel("Hello World");
    frame.add(label);
    
    //Display the window.
    frame.setVisible(true);
	}
}
