package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Fibo(n));
	}
	
	public static int Fibo(int n) {
		int one=1;
		int two=2;
		int result=0;
		if(n==1) {
			return one;
		}else if(n==2) {
			return two;
		}else {
			for(int i=2; i<n; i++) {
				result=one+two;
				one=two;
				two=result;
			}
			return result;
		}
		
	}
}
