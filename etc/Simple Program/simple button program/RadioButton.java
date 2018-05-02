package RadioButton;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton {

	public static void main(String[] args) {
		JFrame MyFrame = new JFrame("GUI test");
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame.setBounds(200,100,320,240);
		MyFrame.setLayout(new FlowLayout());
		
		JLabel Label =new JLabel("          choose your only one favorite fruit       ");
		JRadioButton Apple = new JRadioButton("Apple");
		JRadioButton Pear = new JRadioButton("Pear");
		JRadioButton Banana = new JRadioButton("Banana");
		JRadioButton Grape = new JRadioButton("Grape");
		
		JButton Submit=new JButton("Submit");
		ButtonGroup group = new ButtonGroup();
		
		group.add(Apple);
		group.add(Pear);
		group.add(Banana);
		group.add(Grape);
		MyFrame.add(Label);
		MyFrame.add(Apple);
		MyFrame.add(Pear);
		MyFrame.add(Banana);
		MyFrame.add(Grape);
		MyFrame.add(Submit);
		MyFrame.setVisible(true);
		
	}
}
