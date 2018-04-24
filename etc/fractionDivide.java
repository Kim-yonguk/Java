package fractionDivide;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fractionDivide {

	static int numerator;
	static int denominator;
	
	public static void main(String[] args) {
		
		while(true) {
			
			try {
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter a numerator : ");
				numerator=sc.nextInt();
				
				System.out.print("Enter a denominator : ");
				denominator=sc.nextInt();
				Reducing();
				
				System.out.println("The Fraction reduced is "+numerator +" / "+ denominator+"\n");
			}catch(InputMismatchException e) {
				System.out.println("You must enter an integer. Try again \n");
			}catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} 
			System.out.println("Enter 'Y' to go again, anything else to exit");
			Scanner Exit=new Scanner(System.in);
			String str=Exit.nextLine();
			if(str.charAt(0)=='Y' || str.charAt(0)=='y') {
				
			}else {
				System.out.println("\nProcess Completed");
				System.exit(1);
			}
		}
	}

	private static void Reducing() throws Exception {
		// TODO Auto-generated method stub
		if(denominator!=0) {
			int common= GCD(Math.abs(numerator),denominator);
			numerator=numerator/common;
			denominator=denominator/common;
		}else {
			throw new Exception("Denominator should not be set to zero\n");
		}
		
	}

	private static int GCD(int numerator, int denominator) {
		// TODO Auto-generated method stub
		while(numerator!=denominator) {
			if(numerator>denominator) {
				numerator=numerator-denominator;
			}else {
				denominator=denominator-numerator;
			}
		}
		return numerator;
	}
}
