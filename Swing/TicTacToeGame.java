import javax.swing.*;
import java.awt.*;

class TicTacToeGame
{
	public static void main (String[] args) 
  {
		//Create and set up the window.
    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Create grid layout
    int rows = 3;
    int cols = 3;
    GridLayout layout = new GridLayout(rows, cols);
    frame.setLayout(layout);
    
    for (int i = 1; i <= 9; i += 1)
    {
      JButton b = new JButton();
      frame.add(b);
    }
    
    
    //Display the window.
    frame.setVisible(true);
	}
}