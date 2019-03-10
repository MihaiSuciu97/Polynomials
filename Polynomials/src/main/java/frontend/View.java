//Suciu Mihai 30422
package frontend;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View extends JFrame {
	// Frame
	public JFrame frame = new JFrame("Polynomials");

	// 4 labels ,2 for input 2 for output
	JLabel PolLabel1 = new JLabel(" First Polynomial: ");
	JLabel PolLabel2 = new JLabel(" Second Polynomial: ");
	JLabel Result = new JLabel(" Result :  ");
	public JLabel ResultLabel = new JLabel();
		
	// 2 textfields for polynomials
	public JTextField pol1 = new JTextField();
	public JTextField pol2 = new JTextField();

	// buttons to save your polynomials
	JButton save = new JButton("* Save *");

	// buttons for operations
	JButton Addition = new JButton("Addition   ( + ) ");
	JButton Subtraction = new JButton("Subtraction   ( - ) ");
	JButton Multiplication = new JButton("Multiplication   ( x )");
	JButton Division = new JButton("Division   ( : )");
	JButton Derivation = new JButton("Derivation  ");
	JButton Integration = new JButton("Integration");

	// Getters for Textfields
	public String getPol1() {
		return pol1.getText();
	}

	public String getPol2() {
		return pol2.getText();
	}

	public View() {
		//settings for frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		// include label and textfield for the first polynomial in JFrame
		frame.add(pol1);
		pol1.setBounds(30, 60, 200, 30);
		frame.add(PolLabel1);
		PolLabel1.setBounds(30, 30, 150, 20);
		// include label and textfield for the second polynomial in JFrame
		frame.add(pol2);
		pol2.setBounds(30, 150, 200, 30);
		frame.add(PolLabel2);
		PolLabel2.setBounds(30, 120, 150, 20);
		// include save button in JFrame
		frame.add(save);
		save.setBounds(350, 100, 100, 30);
		// include the buttons in JFrame
		frame.add(Addition);
		Addition.setBounds(100, 250, 150, 30);
		frame.add(Subtraction);
		Subtraction.setBounds(300, 250, 150, 30);
		frame.add(Multiplication);
		Multiplication.setBounds(100, 300, 150, 30);
		frame.add(Division);
		Division.setBounds(300, 300, 150, 30);
		frame.add(Derivation);
		Derivation.setBounds(100, 350, 150, 30);
		frame.add(Integration);
		Integration.setBounds(300, 350, 150, 30);
		// Inlcude label and Textfield for the result:
		frame.add(Result);
		Result.setBounds(30, 440, 200, 30);
		frame.add(ResultLabel);
		ResultLabel.setBounds(100, 440, 400, 30);
	}

	public void saveaction1(ActionListener action1) {
		save.addActionListener(action1);
	}
	
	public void add(ActionListener action3) {
		Addition.addActionListener(action3);
	}

	public void sub(ActionListener action4) {
		Subtraction.addActionListener(action4);
	}
	public void mul(ActionListener action5) {
		Multiplication.addActionListener(action5);
	}
	public void div(ActionListener action6) {
		Division.addActionListener(action6);
	}
	public void der(ActionListener action7) {
		Derivation.addActionListener(action7);
	}
	public void integr(ActionListener action8) {
		Integration.addActionListener(action8);
	}
}
