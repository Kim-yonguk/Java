package algorithm2455;

import java.util.Scanner;

public class al2455 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int s1,e1;
		int s2,e2;
		int s3,e3;
		int s4,e4;
		
		int max=0;
		int sum=0;
		
		s1=sc.nextInt();
		e1=sc.nextInt();
		
		s2=sc.nextInt();
		e2=sc.nextInt();
		
		s3=sc.nextInt();
		e3=sc.nextInt();
		
		s4=sc.nextInt();
		e4=sc.nextInt();
		
		sum+=e1;
		
		if(max<sum) {
			max=sum;
		}
		
		sum=sum-s2+e2;
		
		if(max<sum) {
			max=sum;
		}
		
		sum=sum-s3+e3;
		
		if(max<sum) {
			max=sum;
		}
		
		sum=sum-s4+e4;
		
		if(max<sum) {
			max=sum;
		}
		
		
		System.out.println(max);
	}
}
