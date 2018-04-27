package TrafficLight;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RED extends JPanel{

	public void paintComponent(Graphics g) {
		g.drawRect(130, 20, 50, 120);
		g.setColor(Color.gray);
		g.fillOval(140,65, 30, 30);
		g.fillOval(140,100, 30, 30);
		g.setColor(Color.red);
		g.fillOval(140,30, 30, 30);
	}
}
