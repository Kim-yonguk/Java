package FactorialCalcGUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI {

	static JFrame MyFrame = new JFrame("Calc");
	static JRadioButton iterativeButton=new JRadioButton("Iterative");
	static JRadioButton recursiveButton=new JRadioButton("Recursive");
	
	static JLabel NLabel = new JLabel("Enter n");
	static JTextField nText=new JTextField("",8);
	static JButton Compute=new JButton("Compute");
	
	static JLabel resultLabel=new JLabel("Result");
	static JTextField resultText=new JTextField("",8);
	
	public static void main(String[] args) {
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame.setBounds(200,100,400,350);
		MyFrame.setLayout(null);
		MyFrame.setVisible(true);
		iterativeButton.setBounds(200,10,150,30);
		recursiveButton.setBounds(200,50,150,30);
		
		NLabel.setBounds(10,100,150,30);
		nText.setBounds(200,100,150,30);
		Compute.setBounds(200, 150, 150, 30);
		resultLabel.setBounds(10,200,150,30);
		resultText.setBounds(200,200,150,30);
		iterativeButton.setSelected(true);
		
		ButtonGroup group =new ButtonGroup();
		group.add(iterativeButton);
		group.add(recursiveButton);
		
		MyFrame.add(iterativeButton);	
		MyFrame.add(recursiveButton);	
		MyFrame.add(NLabel);	
		MyFrame.add(nText);	
		MyFrame.add(Compute);	
		MyFrame.add(resultLabel);
		MyFrame.add(resultText);	
		
		sequence op=new sequence();
		
		Compute.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(iterativeButton.isSelected()) {
					resultText.setText(Integer.toString(op.computeIterative(Integer.parseInt(nText.getText()))));
				}else if(recursiveButton.isSelected()) {
					resultText.setText(Integer.toString(op.computeRecursive(Integer.parseInt(nText.getText()))));
				}
			}
		});
	}
	
}
