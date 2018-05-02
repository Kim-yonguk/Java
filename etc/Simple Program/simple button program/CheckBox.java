package RadioButton;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class CheckBox {
	public static void main(String[] args) {
		JFrame MyFrame = new JFrame("GUI test");
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame.setBounds(200,100,320,240);
		MyFrame.setLayout(new FlowLayout());
		
		JLabel Label =new JLabel("          choose your only one favorite fruit       ");
		JCheckBox Apple = new JCheckBox("Apple");
		JCheckBox Pear = new JCheckBox("Pear");
		JCheckBox Banana = new JCheckBox("Banana");
		JCheckBox Grape = new JCheckBox("Grape");
		
		JButton Submit=new JButton("Submit");
		
		MyFrame.add(Label);
		MyFrame.add(Apple);
		MyFrame.add(Pear);
		MyFrame.add(Banana);
		MyFrame.add(Grape);
		MyFrame.add(Submit);
		MyFrame.setVisible(true);
	}

}
