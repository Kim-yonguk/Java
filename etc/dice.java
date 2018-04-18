package RandomDice;

import java.util.Scanner;

public class dice {

	static int toss[]= {0,1,2,3,4,5,6,7,8,9,10,11,12};
	static int count[]=new int[13];
	static double probability[]=new double[13];
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Number");
			int n=sc.nextInt();
			
			Roll(n);
			Pro(n);
			
			display();
		}
		
	}
	
	public static void Roll(int n) {
		for(int i=0; i<n; i++) {
			int rs1=(int) (Math.random()*6+1);
			int rs2=(int) (Math.random()*6+1);
			
			
			count[rs1+rs2]++;
			
		}
	}
	
	public static void Pro(int n) {
		for(int i=0; i<13; i++) {
			probability[i]=count[i]*100/n;
		}
	}
	
	public static void display() {
		System.out.println("\tToss\tCount\tProbability");
		for(int i=2; i<13; i++) {
			System.out.println("\t"+toss[i]+"\t"+count[i]+"\t"+probability[i]);
		}
	}
}
