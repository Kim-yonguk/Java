package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		double Fn=Double.parseDouble(GUI.FN.getText());
		double Sn=Double.parseDouble(GUI.SN.getText());
		
		JButton btn= (JButton) e.getSource();
		
		if(btn.getText().equals("Add")) {
			GUI.RS.setText(Double.toString(Fn+Sn));
			System.out.println("add");
		}
		if(btn.getText().equals("Subtract")) {
			GUI.RS.setText(Double.toString(Fn-Sn));
		}
		if(btn.getText().equals("Multiply")) {
			GUI.RS.setText(Double.toString(Fn*Sn));
		}
		if(btn.getText().equals("Divide")) {
			GUI.RS.setText(Double.toString(Fn/Sn));
		}
		if(btn.getText().equals("Power")) {
			GUI.RS.setText(Double.toString(Math.pow(Fn, Sn)));
		}
		if(btn.getText().equals("Remainder")) {
			GUI.RS.setText(Double.toString(Fn%Sn));
		}
		

		
	}

}
