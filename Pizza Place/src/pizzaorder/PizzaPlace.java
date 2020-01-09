package pizzaorder;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class PizzaPlace implements ActionListener{
	
	JFrame frame;
	JPanel main;
	JPanel custName;
	JTextField name_field;
	JButton order;
	JButton reset;
	JTextArea comments;
	JSpinner totalPizzas;
	JList toppingslist;
	JComboBox crustType;
	JRadioButton small;
	JRadioButton medium;
	JRadioButton large;
	JRadioButton xl;
	ButtonGroup sizegroup;
	JCheckBox bread;
	JCheckBox drink;
	JCheckBox popcorn;
	JCheckBox salad;
	
	String name;
	
	
	public PizzaPlace() {
		frame = new JFrame(" Pizza Place ");
		frame.setLocation(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		main = (JPanel)frame.getContentPane();
		
		BoxLayout boxLayout = new BoxLayout(main, BoxLayout.Y_AXIS);
		FlowLayout flow = new FlowLayout();
		main.setLayout(boxLayout);
		
		custName = new JPanel();
		custName.setLayout(flow);
		
		JPanel numpizzapanel = new JPanel();
		numpizzapanel.setLayout(flow);
		
		JPanel sizepanel = new JPanel();
		sizepanel.setLayout(flow);
		
		JPanel crustpanel = new JPanel();
		crustpanel.setLayout(flow);
		
		JPanel toppingspanel = new JPanel();
		toppingspanel.setLayout(flow);
		
		JPanel extraspanel = new JPanel();
		toppingspanel.setLayout(flow);
		
		JPanel commentsPanel = new JPanel();
		commentsPanel.setLayout(flow);
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(flow);
		

		
		//Name Panel
		JLabel namelbl = new JLabel("Customer Name");
		name_field = new JTextField(40);
		name_field.setFocusable(true);
		custName.add(namelbl);
		custName.add(name_field);
		
		//number of Pizza's
		numpizzapanel.add(new JLabel("How many pizzas would you like: "));
		totalPizzas = new JSpinner(new SpinnerNumberModel(1,1,50,1));
		numpizzapanel.add(totalPizzas);
		
		//pizza size setup
		Border sizeborder = BorderFactory.createTitledBorder("Select your size: ");
		sizegroup = new ButtonGroup();
		small = new JRadioButton("12\"");
		medium = new JRadioButton("16\"");
		large = new JRadioButton("24\"");
		xl = new JRadioButton("32\"");
		
		
		xl.setSelected(true);
		
		
		sizegroup.add(small);
		sizegroup.add(medium);
		sizegroup.add(large);
		sizegroup.add(xl);
		sizepanel.add(small);
		sizepanel.add(medium);
		sizepanel.add(large);
		sizepanel.add(xl);
		sizepanel.setBorder(sizeborder);
		small.addActionListener(this);
		
		//setup crust selection
		crustpanel.add(new JLabel("Pick your crust type: "));
		String[] crusts = {"Pan","Original","Stuffed","thin","double stuffed", "Deep Dish"};
		
		//create JComboBox
		crustType = new JComboBox(crusts);
		crustType.addItem("Burnt Crust");
		crustType.setSelectedItem("Burnt Crust");
		
		//crustType.setEditable(true);
		crustpanel.add(crustType);
	
		
		// topping's setup	
		toppingspanel.add(new JLabel("Toppings:   "));
		String[] toppings = {"Pepperoni", "Olives", "Pineapple","Ham","Sausage","Anchovies","Bacon"
				,"Mini Pizzas","Peppers","Chicken"};
		
		
		
		toppingslist = new JList(toppings);
		toppingslist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JScrollPane scroll1 = new JScrollPane(toppingslist, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		toppingspanel.add(scroll1);
		
		//extras setup
		Border extrasborder = BorderFactory.createTitledBorder("Select your Extras");
		bread = new JCheckBox("Bread Sticks");
		drink = new JCheckBox("Drinks");
		popcorn = new JCheckBox("Pop-corn");
		salad = new JCheckBox("Salad");
		extraspanel.setBorder(extrasborder);
		extraspanel.add(bread);		
		extraspanel.add(drink);
		extraspanel.add(popcorn);
		extraspanel.add(salad);
		salad.addActionListener(this);
		//Comments section
		commentsPanel.add(new JLabel("Order Comments:   "));
		comments = new JTextArea(5,50);
		JScrollPane scroll = new JScrollPane(comments, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		comments.setLineWrap(true);
		commentsPanel.add(scroll);
		
		
		
		
		//button panel section
		order = new JButton("Place Order");
		reset = new JButton("Reset Values");
		
		order.addActionListener(this);
		reset.addActionListener(this);
		
		buttonpanel.add(order);
		buttonpanel.add(reset);
		
		
		main.add(custName);
		main.add(numpizzapanel);
		main.add(sizepanel);
		main.add(crustpanel);
		main.add(toppingspanel);
		main.add(extraspanel);
		main.add(commentsPanel);
		main.add(buttonpanel);
		
		frame.pack();
		
		frame.setVisible(true);
		
		
		}

	
	
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		if (control == order) {
			String name = name_field.getText();
			String toppings_needed = "";
			String size = "48\"";
			if(small.isSelected()) {
				size = "12\"";
			}
			else if (medium.isSelected()) {
				size = "16\"";
			}
			else if (large.isSelected()) {
				size = "24\"";
			}
			else if (xl.isSelected()) {
				size = "32\"";
			}
			String extras = "";
			if (bread.isSelected()) {
				extras += bread.getText()+", ";
			}
			if (drink.isSelected()) {
				extras += drink.getText()+", ";
			}
			if (popcorn.isSelected()) {
				extras += popcorn.getText() + ", ";
			}
			
			//String x = toppingslist.getSelectedValue();
			List toppingsvalues = toppingslist.getSelectedValuesList();
			for (int i = 0; i<toppingsvalues.size();i++) {
				 toppings_needed = toppings_needed + (String)toppingsvalues.get(i) + ", ";
			}
			String comment_txt = comments.getText();
			int pizzas = (int) totalPizzas.getValue();
			String crust = (String)crustType.getSelectedItem();
			JOptionPane.showMessageDialog(null,"Customer name: "+name+"\n"
					+ "Comments:  " + comment_txt + "\n"
					+ "Total pizzas ordered: "+pizzas+"\n"
					+ "Pizza Size: " +size+"\n"
					+ "Crust Type: " +crust + "\n"
					+ "Toppings: "+toppings_needed + "\n"
					+ "Extras: " + extras);
					
		}
		if(control == reset) {
			name_field.setText("");
			comments.setText("");
			totalPizzas.setValue(1);
			crustType.setSelectedIndex(6);
			toppingslist.clearSelection();
			xl.setSelected(true);
			
		}
		if(control == small) {
			JOptionPane.showMessageDialog(null,"Sorry you can't have that");
			xl.setSelected(true);
		}
		if(control == salad) {
			JOptionPane.showMessageDialog(null, "Sorry you can't eat salad here");
			frame.dispose();
		}
	}
	
	
	public static void main(String[] args) {
		new PizzaPlace();
		

	}







}
