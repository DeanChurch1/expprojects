package firstGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TwoButtons implements ActionListener
{
	 JButton redButton;
	   JButton greenButton;
	   JFrame myFrame;
	   
   public static void main ( String[] args )
   {
      // create instance of TwoButtons to do all the work! 
      new TwoButtons(); 
   }

   // constructor
   public TwoButtons()
   { 
      // create new JFrame
      myFrame = new JFrame();

      // set the frame title, size, location
      myFrame.setTitle("Choose Your Color");
      myFrame.setSize(550, 150);
      myFrame.setLocation(200, 300);

      // make sure program terminates when window is closed
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // assign a layout
      FlowLayout myLayout = new FlowLayout();
      myFrame.setLayout(myLayout);

      // create and add buttons to the frame
      redButton = new JButton("Red");
      greenButton = new JButton("Green");
      
      myFrame.add(redButton);
      myFrame.add(greenButton); 

      redButton.addActionListener(this);
      greenButton.addActionListener(this);

      // make the frame visible
      myFrame.setVisible(true);
      
      
   }

@Override
public void actionPerformed(ActionEvent e)
{
   Object control = e.getSource();

   // if redButton was clicked
   if (control == redButton)
   {
      myFrame.getContentPane().setBackground(Color.red);
   }
   // else if greenButton was clicked
   else if (control == greenButton)
   {
      myFrame.getContentPane().setBackground(Color.green);
   }
}
}