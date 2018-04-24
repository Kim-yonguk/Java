package ProfitCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		double amount=Integer.parseInt(GUI.amount.getText());
		double rate=Double.parseDouble(GUI.rate.getText());
		double year=Integer.parseInt(GUI.years.getText());
		double total=amount*(1+rate);
		
		for(int i=0; i<year; i++) {
			for(int j=0; j<12; j++) {
				total*=(1+rate);
			}
		}
		
		GUI.total.setText(String.format("%.1f", total));
		
	}

}