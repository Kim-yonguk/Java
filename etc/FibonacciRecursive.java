package Fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(Fibo(n));
	}

	private static int Fibo(int n) {

		int n1=1;
		int n2=1;
		
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 1;
		}else {
			return Fibo(n-1)+Fibo(n-2);
		}
		
	}
}
