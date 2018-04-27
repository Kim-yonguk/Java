package TrafficLight;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class trafficLight {

	static JFrame MyFrame=new JFrame("Traffic Light");
	static JPanel MyPanel1=new BackGround();
	static JPanel MyPanel2=new JPanel();
	static JPanel MyPanel3=new RED();
	static JPanel MyPanel4=new YELLOW();
	static JPanel MyPanel5=new GREEN();
	
	public static void SelectRed() {
		MyFrame.add(MyPanel3);
		MyPanel1.setVisible(false);
		MyPanel3.setVisible(true);
		MyPanel4.setVisible(false);
		MyPanel5.setVisible(false);
	}
	public static void SelectYellow() {
		MyFrame.add(MyPanel4);
		MyPanel1.setVisible(false);
		MyPanel3.setVisible(false);
		MyPanel4.setVisible(true);
		MyPanel5.setVisible(false);
	}
	public static void SelectGreen() {
		MyFrame.add(MyPanel5);
		MyPanel1.setVisible(false);
		MyPanel3.setVisible(false);
		MyPanel4.setVisible(false);
		MyPanel5.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame.setBounds(200,100,320,240);
		MyFrame.setLayout(null);
		MyFrame.setVisible(true);
		MyPanel3.setBounds(0,0,320,150);
		MyPanel4.setBounds(0,0,320,150);
		MyPanel1.setBounds(0,0,320,150);
		MyPanel5.setBounds(0,0,320,150);
		MyPanel2.setBounds(0,150,320,90);
		
		
		
		JRadioButton Red=new JRadioButton("RED");
		JRadioButton Yellow=new JRadioButton("YELLOW");
		JRadioButton Green=new JRadioButton("GREEN");
		
		Red.setBounds(50,150,50,30);
		Yellow.setBounds(50,150,80,30);
		Green.setBounds(50,150,110,30);
		
		ButtonGroup Group=new ButtonGroup();
		Group.add(Red);
		Group.add(Yellow);
		Group.add(Green);
		
		MyPanel2.add(Red);
		MyPanel2.add(Yellow);
		MyPanel2.add(Green);
		MyFrame.add(MyPanel1);
		MyFrame.add(MyPanel2);
		Red.addActionListener(new RedAction());
		Yellow.addActionListener(new YellowAction());
		Green.addActionListener(new GreenAction());
		
		
		
	}
}
