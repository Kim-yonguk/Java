package algorithm2577;

import java.util.Scanner;

public class al2577 {

	
	
	public al2577() {}
	public static void main(String[] args) {
		al2577 main=new al2577();
		Scanner sc = new Scanner(System.in);
		int mul;
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		mul=a*b*c;
		
		int count[]=new int[10];
		while(true) {
			if(mul==0) {
				break;
			}
			count[mul%10]++;
			mul/=10;
		}
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
	}
}
