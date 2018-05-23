package algorithm9625;

import java.util.Scanner;

public class al9625 {
	
	static int a=1;
	static int b=0;
	static int temp;
	
	public al9625() {};
	
	public static void main(String[] args) {
		
	al9625 main=new al9625();
	
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	main.BABBA(input);
	System.out.println(a+" "+b);
	
	}
	
	
	public void BABBA(int n) {
		
		
		if(n==1) {
			temp=b;
			b=a+b;
			a=temp;
			
		}
		if(n>1) {
			BABBA(n-1);
			temp=b;
			b=a+b;
			a=temp;
			
		}
		
	}
	
}
