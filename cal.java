package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {

	private JFrame frame;
	private JTextField textField;
	double firstnum,secondnum,answer;
	String operation,ops;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.setBounds(100, 100, 316, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 270, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn7.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 112, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn8.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(80, 112, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn9.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(150, 112, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn4.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 183, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn5.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(80, 183, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn6.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(150, 183, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn1.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 254, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn2.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(80, 254, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn3.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(150, 254, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ops == "EQUAL")
				{ ops = "";
				String EnterNumber = btn0.getText();
				textField.setText(EnterNumber);
				}
				else
				{
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(10, 323, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnpiont = new JButton(".");
		btnpiont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp;
				String EnterNumber = textField.getText();
				if(!EnterNumber.contains("."))
				EnterNumber = textField.getText() + ".";
				
				textField.setText(EnterNumber);
			}
		});
		btnpiont.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpiont.setBounds(80, 323, 60, 60);
		frame.getContentPane().add(btnpiont);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ops = "EQUAL"; 
				String res;
				double temp,t ;
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "PLUS")
				{
					answer = firstnum + secondnum;
					if(answer % (int)answer == 0)
					{res = String.format("%d", (int)answer);
					textField.setText(res);}
					else
					{
					res = String.format("%.2f",answer);
					textField.setText(res);
					}
						
				}
				if(operation == "MINUS")
				{
					answer = firstnum - secondnum;
					if(answer % (int)answer == 0)
					{res = String.format("%d", (int)answer);
					textField.setText(res);}
					else
					{
					res = String.format("%.2f",answer);
					textField.setText(res);
					}				
				}
				if(operation == "MULTIPLY")
				{
					answer = firstnum * secondnum;
					if(answer % (int)answer == 0)
					{res = String.format("%d", (int)answer);
					textField.setText(res);}
					else
					{
					res = String.format("%f",answer);
					textField.setText(res);
					}					
				}
				if(operation == "DIVISION")
				{
					answer = firstnum / secondnum;
					if(answer % (int)answer == 0)
					{res = String.format("%d", (int)answer);
					textField.setText(res);}
					else
					{
					res = String.format("%f",answer);
					textField.setText(res);
					}					
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnequal.setBounds(150, 325, 60, 60);
		frame.getContentPane().add(btnequal);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "DIVISION" ;
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.setBounds(220, 112, 60, 60);
		frame.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("X");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "MULTIPLY" ;
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmul.setBounds(220, 181, 60, 60);
		frame.getContentPane().add(btnmul);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "MINUS" ;
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(220, 252, 60, 60);
		frame.getContentPane().add(btnsub);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "PLUS" ;
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnadd.setBounds(220, 324, 60, 60);
		frame.getContentPane().add(btnadd);
		
		JButton btnclear = new JButton("CLR");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnclear.setBounds(10, 62, 60, 45);
		frame.getContentPane().add(btnclear);
	}
}
