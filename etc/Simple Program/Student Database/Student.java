package studentProject;

public class Student {

	public String Name;
	public String Major;
	public double GPA=0.0;
	private int TotalCredits=0;
	private double TotalGrades=0.0;
	
	public Student(String Name,String Major) {
		this.Name=Name;
		this.Major=Major;
	}
	
	public void courseCompleted(int credit,double grade) {
		this.TotalCredits+=credit;
		this.TotalGrades+=grade;
		this.GPA=TotalGrades/TotalCredits;
	}
	
	public String toString() {
		if(GPA==0.0) {
			return "Name : "+Name+"\nMajor : "+Major+"\nGPA : "+4.0;
		}else {
			return "Name : "+Name+"\nMajor : "+Major+"\nGPA : "+GPA;
		}
	}
}
