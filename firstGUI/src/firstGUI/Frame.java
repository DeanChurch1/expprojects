package firstGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.border.*;

public class Frame implements ActionListener{
	JButton button;
	
	public Frame() {
		
		JFrame frame = new JFrame();
		frame.setTitle("My Frame");
		frame.setSize(500, 500);
		frame.setLocation(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel mainPane = new JPanel();
		//frame.setContentPane(mainPane);
		JPanel mainPane = (JPanel)frame.getContentPane();
		
		FlowLayout flow = new FlowLayout();
		GridLayout grid = new GridLayout(6,3);
		BorderLayout borderLayout = new BorderLayout(5,10);
		BoxLayout h_box = new BoxLayout(mainPane, BoxLayout.X_AXIS);
		BoxLayout v_box = new BoxLayout(mainPane, BoxLayout.Y_AXIS);
		
		
		
		//grid.getHgap();
		//grid.setHgap(40);
		frame.setLayout(v_box);
		
		Border myBorder = BorderFactory.createLineBorder(Color.BLUE,10);
		mainPane.setBorder(myBorder);
		
		JLabel label = new JLabel();
		label.setText("My Calculator");
		label.setSize(300, 50);
		label.setBackground(Color.red);
		label.setForeground(Color.red);
		label.setFont(label.getFont().deriveFont(24f));
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		mainPane.add(label);
		
		button = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		
		JButton button10 = new JButton("+");
		JButton button11 = new JButton("-");
		JButton button12 = new JButton("*");
		JButton button13 = new JButton("/");
		JButton button14 = new JButton("=");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);		
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		
		button.setEnabled(true);
		
		mainPane.add(button);
		mainPane.add(button2);
		mainPane.add(button3);
		mainPane.add(button4);
		mainPane.add(button5);
		mainPane.add(button6);
		mainPane.add(button7);
		mainPane.add(button8);
		mainPane.add(button9);
		mainPane.add(button10);
		mainPane.add(button11);
		mainPane.add(button12);
		mainPane.add(button13);
		mainPane.add(button14);
		
		
		frame.setVisible(true);
		//frame.pack();
	}

	public static void main(String[] args) {
		Frame gui = new Frame();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		if (control == button) {
			JOptionPane.showMessageDialog(null,"you found the right button");		
		}
		else {
			JOptionPane.showMessageDialog(null, "not the right one");
		}
		
		
	}
	
	

}
