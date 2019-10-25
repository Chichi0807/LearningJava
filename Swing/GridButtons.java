import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class OnClicked2 implements ActionListener
{
  @Override
  public void actionPerformed(ActionEvent e)
  {
    JButton b = (JButton)e.getSource();
    String s = b.getText();
    JOptionPane.showMessageDialog(null, "You clicked me. :D"+s);
  }
}

class GridButtons
{
	public static void main (String[] args) 
  {
		//Create and set up the window.
    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Create grid layout
    int rows = 5;
    int cols = 5;
    GridLayout layout = new GridLayout(rows, cols);
    frame.setLayout(layout);
    
    for (int i = 1; i <= 25; i += 1)
    {
      JButton b = new JButton(String.format("%d", i));
      OnClicked2 l = new OnClicked2();
      b.addActionListener(l);
      frame.add(b);
    }
    
    
    //Display the window.
    frame.setVisible(true);
	}
}