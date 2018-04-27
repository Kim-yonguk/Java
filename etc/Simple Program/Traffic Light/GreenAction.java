package TrafficLight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreenAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		trafficLight.SelectGreen();
		
	}

}
