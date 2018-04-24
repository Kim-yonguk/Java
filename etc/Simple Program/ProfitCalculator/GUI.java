package ProfitCalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	
	public static JFrame MyFrame=new JFrame("Profit Calculator");
	public static JPanel MyPanel=new JPanel();
	
	public static JLabel ProfitLabel=new JLabel("Original Amount");
	public static JLabel YearsLabel=new JLabel("Years        ");
	public static JLabel AnnualRate=new JLabel("Annual Interest Rate");
	public static JLabel TotalValue=new JLabel("Total        ");

	public static JTextField amount=new JTextField("",8);
	public static JTextField years=new JTextField("",8);
	public static JTextField rate=new JTextField("",8);
	public static JTextField total=new JTextField("",8);
	
	public static JButton op=new JButton("Calc");
	
	public static void main(String[] args) {
		MyFrame.setBounds(300,200,250,180);
		MyFrame.setVisible(true);
		MyFrame.add(MyPanel);
		
		MyPanel.add(ProfitLabel);
		MyPanel.add(amount);
		
		MyPanel.add(YearsLabel);
		MyPanel.add(years);
		
		MyPanel.add(AnnualRate);
		MyPanel.add(rate);
		
		MyPanel.add(TotalValue);
		MyPanel.add(total);
		
		

		
		MyPanel.add(op);
		
		
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		total.setEnabled(false);
		op.addActionListener(new OperatorHandler());
		
	}

}