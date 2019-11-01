import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class OnClicked3 implements ActionListener
{
    private int counter = 1;
    private boolean[][] crosstable = new boolean[3][3];
    private boolean[][] circletable = new boolean[3][3];

    public OnClicked3()
    {
       for (int i = 0; i < 3; i += 1)
       {
        for (int j = 0; j < 3; j += 1)
        {
            crosstable[i][j] = false;
            circletable[i][j] = false;
        }
       }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton b = (JButton)e.getSource();
        String id = b.getActionCommand();
        int id2 = Integer.parseInt(id);
        int i = (id2 - 1) / 3;
        int j = (id2 - 1) % 3;

        if(b.getText().length() >= 1)
        {
            return;
        }

        if(counter % 2 == 1)
        {
            b.setText("Ｘ");
            crosstable[i][j] = true;
            if ((crosstable[0][0] && crosstable[0][1] && crosstable[0][2]) ||
                (crosstable[1][0] && crosstable[1][1] && crosstable[1][2]) ||
                (crosstable[2][0] && crosstable[2][1] && crosstable[2][2]) ||
                (crosstable[0][0] && crosstable[1][0] && crosstable[2][0]) ||
                (crosstable[0][1] && crosstable[1][1] && crosstable[2][1]) ||
                (crosstable[0][2] && crosstable[1][2] && crosstable[2][2]) || 
                (crosstable[0][0] && crosstable[1][1] && crosstable[2][2]) ||
                (crosstable[2][0] && crosstable[1][1] && crosstable[0][2])
            )
            {
                JOptionPane.showMessageDialog(null, "Cross wins!");
                
            }
        }
        else
        {
            b.setText("Ｏ");
            circletable[i][j] = true;
            if ((circletable[0][0] && circletable[0][1] && circletable[0][2]) ||
                (circletable[1][0] && circletable[1][1] && circletable[1][2]) ||
                (circletable[2][0] && circletable[2][1] && circletable[2][2]) ||
                (circletable[0][0] && circletable[1][0] && circletable[2][0]) ||
                (circletable[0][1] && circletable[1][1] && circletable[2][1]) ||
                (circletable[0][2] && circletable[1][2] && circletable[2][2]) || 
                (circletable[0][0] && circletable[1][1] && circletable[2][2]) ||
                (circletable[2][0] && circletable[1][1] && circletable[0][2])
            )
            {
                JOptionPane.showMessageDialog(null, "Circle wins!");
            }
        }

        counter += 1;
        if (counter == 9)
        {
            JOptionPane.showMessageDialog(null, "Game over. It's a tie!");
        }
    }
}
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
    OnClicked3 l = new OnClicked3();

    for (int i = 1; i <= 9; i += 1)
    {
      JButton b = new JButton();
      b.setActionCommand(String.format("%d", i));
      b.addActionListener(l);
      frame.add(b);
    }
    
    
    //Display the window.
    frame.setVisible(true);
	}
}