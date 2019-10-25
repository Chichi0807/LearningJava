import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class OnClicked implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JButton b = (JButton)e.getSource();
        String s = b.getText();

        JOptionPane.showMessageDialog(null, "You clicked me."+s);
	}
}

class OneButton
{
	public static void main (String[] args) 
  {
		//Create and set up the window.
    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Add the ubiquitous "Hello World" label.
    JButton button = new JButton("Test");
    OnClicked l = new OnClicked();
    button.addActionListener(l);
    frame.add(button);
    
    //Display the window.
    frame.setVisible(true);
	}
}
