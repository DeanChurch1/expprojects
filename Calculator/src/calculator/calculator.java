package calculator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.*;



public class calculator implements ActionListener {
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button0;
	JButton clr;
	JButton decimal;
	
	JLabel screen;
	
	JFrame frame;
	JPanel mainPanel;
	JPanel buttonpanel;
	JPanel screenpanel;
	
	String opperator;
	String display = "";
	
	int num1;
	int num2;
	
	
	public calculator() {
		frame = new JFrame();
		frame.setTitle("My Frame");
		frame.setSize(500, 500);
		frame.setLocation(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = (JPanel)frame.getContentPane();
		
		buttonpanel = new JPanel();
		screenpanel = new JPanel();
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		GridLayout gridlayout = new GridLayout(5,3,2,2);
		FlowLayout screenLayout = new FlowLayout(FlowLayout.CENTER); 
		BoxLayout mainLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS); 
		
		mainPanel.setLayout(mainLayout);
		buttonpanel.setLayout(gridlayout);
		screenpanel.setLayout(screenLayout);
		screenpanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
		buttonpanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
		screenpanel.setSize(500,25);

		
		screen = new JLabel(" ");
		button = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		button10 = new JButton("+");
		button11 = new JButton("-");
		button12 = new JButton("*");
		button13 = new JButton("/");
		button14 = new JButton("=");
		clr = new JButton("C");
		button0 = new JButton("0");
		decimal = new JButton(".");
		
		
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
		clr.addActionListener(this);
		button0.addActionListener(this);
		decimal.addActionListener(this);
		
		screenpanel.add(screen);
		buttonpanel.add(button);
		buttonpanel.add(button2);
		buttonpanel.add(button3);
		buttonpanel.add(button10);
		
		buttonpanel.add(button4);
		buttonpanel.add(button5);
		buttonpanel.add(button6);
		buttonpanel.add(button11);
		
		buttonpanel.add(button7);
		buttonpanel.add(button8);
		buttonpanel.add(button9);
		buttonpanel.add(button12);
		
		buttonpanel.add(button0);
		buttonpanel.add(button14);
		buttonpanel.add(clr);
		buttonpanel.add(button13);

		
		
		buttonpanel.add(decimal);
		
		mainPanel.add(screenpanel);
		mainPanel.add(buttonpanel);
		
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		new calculator();

	}
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		
		if (control == button) {
			if (display == "0") {
				display = "1";
			}
			else {
				display += "1";
			}
			screen.setText(display);
			
		}
		
		if (control == button2) {
			if (display == "0") {
				display = "2";
			}
			else {
				display += "2";

			}
			screen.setText(display);
		}
		if (control == button3) {
			if (display == "0") {
				display = "3";
			}
			else {
				display += "3";

			}
			screen.setText(display);
		}
		if (control == button4) {
			if (display == "0") {
				display = "4";
			}
			else {
				display += "4";

			}
			screen.setText(display);
		}
		if (control == button5) {
			if (display == "0") {
				display = "5";
			}
			else {
				display += "5";

			}
			screen.setText(display);
		}
		if (control == button6) {
			if (display == "0") {
				display = "6";
			}
			else {
				display += "6";

			}
			screen.setText(display);
		}
		if (control == button7) {
			if (display == "0") {
				display = "7";
			}
			else {
				display += "7";

			}
			screen.setText(display);
		}
		if (control == button8) {
			if (display == "0") {
				display = "8";
			}
			else {
				display += "8";

			}
			screen.setText(display);
		}
		if (control == button9) {
			if (display == "0") {
				display = "9";
			}
			else {
				display += "9";

			}
			screen.setText(display);
		}
		if (control == button0) {
			if (display == "0") {
				display = "0";
			}
			else {
				display += "0";

			}
			screen.setText(display);
		}
		
		if (control == button10) {
			opperator = "+";
			num1 = Integer.parseInt(display);
			display = "0";
			screen.setText(display);
		}
		if (control == button11) {
			opperator = "-";
			num1 = Integer.parseInt(display);
			display = "0";
			screen.setText(display);
		}
		if (control == button12) {
			opperator = "*";
			num1 = Integer.parseInt(display);
			display = "0";
			screen.setText(display);
		}
		if (control == button13) {
			opperator = "/";
			num1 = Integer.parseInt(display);
			display = "0";
			screen.setText(display);
		}
		
		if (control == decimal) {
			
		}
		
		
		if (control == clr) {
			display = "0";
			num1 = 0;
			num2 = 0;
			opperator = "";
		}
		
		
		if (control == button14) {
			num2 = Integer.parseInt(display);
			double total;
			if (opperator == "+") {
				total = num1 + num2;
				display = Double.toString(total);
				
			}
			if (opperator == "-") {
				total = num1 - num2;
				display = Double.toString(total);
				
			}
			if (opperator == "*") {
				total = num1 * num2;
				display = Double.toString(total);
				
			}
			if (opperator == "/") {
				if (num2 == 0){
					display = "can't divide by 0";
				}
				else {
					total = num1 / num2;
					display = Double.toString(total);
				}
			screen.setText(display);
		
		}
		
		

		}
	}
}


