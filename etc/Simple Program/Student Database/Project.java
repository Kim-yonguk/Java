package studentProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project {

	private static JFrame MyFrame=new JFrame("Student Information Program");
	private static JPanel MyPanel =new JPanel();
	
	private static JLabel IdLabel = new JLabel("ID");
	private static JLabel NameLabel=new JLabel("Name");
	private static JLabel MajorLabel=new JLabel("Major");
	private static JLabel SelectionLabel=new JLabel("Choose Selection");
	private static JTextField IdField = new JTextField();
	private static JTextField NameField = new JTextField();
	private static JTextField MajorField = new JTextField();
	private static JComboBox SelectionField = new JComboBox();
	
	private static JButton ProcessRequest = new JButton("Process Request");
	
	private static HashMap<String, Student> HashMap=new HashMap<>();
	
	public static void main(String[] args) {
		MyFrame.setBounds(300,200,300,200);
		MyFrame.setVisible(true);
		MyFrame.add(MyPanel);
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel.setLayout(null);
		
		MyPanel.add(IdLabel);
		IdLabel.setBounds(20, 10, 20, 20);
		MyPanel.add(NameLabel);
		NameLabel.setBounds(20, 40, 50, 20);
		MyPanel.add(MajorLabel);
		MajorLabel.setBounds(20, 70, 50, 20);
		MyPanel.add(SelectionLabel);
		SelectionLabel.setBounds(20, 100, 120, 20);
		
		MyPanel.add(IdField);
		IdField.setBounds(150, 10, 120, 20);
		MyPanel.add(NameField);
		NameField.setBounds(150, 40, 120, 20);
		MyPanel.add(MajorField);
		MajorField.setBounds(150, 70, 120, 20);
		MyPanel.add(SelectionField);
		SelectionField.setBounds(150, 100, 120, 20);
		
		SelectionField.addItem("Insert");
		SelectionField.addItem("Delete");
		SelectionField.addItem("Find");
		SelectionField.addItem("Update");
		
		MyPanel.add(ProcessRequest);
		ProcessRequest.setBounds(70, 130, 140, 30);
		
		ProcessRequest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				////insert Function
				if(SelectionField.getSelectedItem().equals("Insert")) {
					if(HashMap.containsKey(IdField.getText())) {
						JOptionPane.showMessageDialog(null, "The Id already exists","Error",JOptionPane.ERROR_MESSAGE);
					}else if(IdField.getText().equals("")||NameField.getText().equals("")||MajorField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Blank is not excepted","Error",JOptionPane.ERROR_MESSAGE);
					}else {
						HashMap.put(IdField.getText(), new Student(NameField.getText(),MajorField.getText()));
						JOptionPane.showMessageDialog(null, "Inserted Successfully","Insert",JOptionPane.INFORMATION_MESSAGE);
						
					}
				}
				
				////delete Function
				if(SelectionField.getSelectedItem().equals("Delete")) {
					 if(IdField.getText().equals("")||NameField.getText().equals("")||MajorField.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Blank is not excepted","Error",JOptionPane.ERROR_MESSAGE);
					 }else if (HashMap.containsKey(IdField.getText())
						    &&!((HashMap.get(IdField.getText())).Name.equals(NameField.getText())
						    	&&(HashMap.get(IdField.getText())).Major.equals(MajorField.getText()))) {
						    	JOptionPane.showMessageDialog(null,"ID and other information is not matched","ERROR", JOptionPane.ERROR_MESSAGE);
					 } else if (HashMap.containsKey(IdField.getText())) {
					      HashMap.remove(IdField.getText());
					      JOptionPane.showMessageDialog(null,"Deleted Successfully", "Delete",JOptionPane.INFORMATION_MESSAGE);
					 }else {
					      JOptionPane.showMessageDialog(null,"The student is not found", "Error",JOptionPane.ERROR_MESSAGE);
					 }
				}
				
				 // Find function
			    if (SelectionField.getSelectedItem().equals("Find")) {
			     if (IdField.getText().equals("") || NameField.getText().equals("") || MajorField.getText().equals("")) {
			      JOptionPane.showMessageDialog(null,"Blank is not excepted", "Error",JOptionPane.ERROR_MESSAGE);
			     } else if (HashMap.containsKey(IdField.getText()) 
			    		 && !((HashMap.get(IdField.getText())).Name.equals(NameField.getText()) 
			    		 && (HashMap.get(IdField.getText())).Major .equals(MajorField.getText()))) {
			    	 		JOptionPane.showMessageDialog(null,"ID and other information is not matched","ERROR", JOptionPane.ERROR_MESSAGE);
			     } else if (HashMap.containsKey(IdField.getText())) {
			      JOptionPane.showMessageDialog( null,"ID : " + IdField.getText() + "\n"
			    		  +HashMap.get(IdField.getText()),"Find", JOptionPane.INFORMATION_MESSAGE);
			     } else {
			      JOptionPane.showMessageDialog(null,"The student is not found", "Error",JOptionPane.ERROR_MESSAGE);
			     }
			    }
			    
			 // Update function
			    if (SelectionField.getSelectedItem().equals("Update")) {
			     if (IdField.getText().equals("")|| NameField.getText().equals("")|| MajorField.getText().equals("")) {
			      JOptionPane.showMessageDialog(null, "Blank is not excepted", "Error",JOptionPane.ERROR_MESSAGE);
			     } else if (HashMap.containsKey(IdField.getText())
			       && !((HashMap.get(IdField.getText())).Name.equals(NameField.getText()) 
			    	   && (HashMap.get(IdField.getText())).Major.equals(MajorField.getText()))) {
			    	 		JOptionPane.showMessageDialog(null,"ID and other information is not matched", "ERROR", JOptionPane.ERROR_MESSAGE);
			     } else if (HashMap.containsKey(IdField.getText())) {
			      String[] Grades = { "A(4)", "B(3)", "C(2)", "D(1)","F(0)" };
			      String Grade = (String) JOptionPane.showInputDialog(null, "Choose Grade", "Grade",
			        JOptionPane.QUESTION_MESSAGE, null, Grades,Grades[0]);
			      Integer[] Credits = { 1, 2, 3, 6 };
			      Integer Credit = (Integer) JOptionPane.showInputDialog(
			        null, "Choose Credit", "Credit",JOptionPane.QUESTION_MESSAGE, null, Credits, Credits[0]);
			      Integer IntegerGrade;
			      if (Grade == null || Credit == null){
			       JOptionPane.showMessageDialog(null,"Canceled Successfully", "Cancel",JOptionPane.INFORMATION_MESSAGE);
			      }
			      else {
			       if (Grade.equals("A(4)")) {
			        IntegerGrade = 4;
			       } else if (Grade.equals("B(3)")) {
			        IntegerGrade = 3;
			       } else if (Grade.equals("C(2)")) {
			        IntegerGrade = 2;
			       } else if (Grade.equals("D(1)")) {
			        IntegerGrade = 1;
			       } else
			        IntegerGrade = 0;
			       HashMap.get(IdField.getText()).courseCompleted(Credit, IntegerGrade);
			       JOptionPane.showMessageDialog(null, "Updated Successfully", "Update",JOptionPane.INFORMATION_MESSAGE);
			      }
			     } else {
			      JOptionPane.showMessageDialog(null,
			        "The student is not found", "Error",
			        JOptionPane.ERROR_MESSAGE);
			     }
			    }
			}
		});
		
		
	}
 	
	
	
}
