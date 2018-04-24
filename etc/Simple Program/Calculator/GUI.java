package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	public static JFrame MyFrame = new JFrame("Simple Calc");
	public static JPanel MyPanel = new JPanel();
	
	public static JLabel FirstN=new JLabel("First Number");
	public static JLabel SecondN=new JLabel("Second Number");
	public static JLabel result=new JLabel("Result");
	
	public static JTextField FN= new JTextField("",8);
	public static JTextField SN= new JTextField("",8);
	public static JTextField RS= new JTextField("",8);
	
	public static JButton Add = new JButton("Add");
	public static JButton Sub = new JButton("Subtract");
	public static JButton Mul = new JButton("Multiply");
	public static JButton Div = new JButton("Divide");
	public static JButton Pow = new JButton("Power");
	public static JButton Remainder = new JButton("Remainder");
	
	public static void main(String[] args) {
		MyFrame.setBounds(300,200,550,100);
		MyFrame.setVisible(true);
		MyFrame.add(MyPanel);
		
		
		MyPanel.add(FirstN);
		MyPanel.add(FN);
		
		MyPanel.add(SecondN);
		MyPanel.add(SN);
		
		MyPanel.add(result);
		MyPanel.add(RS);
		
		MyPanel.add(Add);
		MyPanel.add(Sub);
		MyPanel.add(Mul);
		MyPanel.add(Div);
		MyPanel.add(Pow);
		MyPanel.add(Remainder);
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RS.setEnabled(false);
		
		Add.addActionListener(new MyActionListener());
		Sub.addActionListener(new MyActionListener());
		Mul.addActionListener(new MyActionListener());
		Div.addActionListener(new MyActionListener());
		Pow.addActionListener(new MyActionListener());
		Remainder.addActionListener(new MyActionListener());
		
		
	}
	
}
