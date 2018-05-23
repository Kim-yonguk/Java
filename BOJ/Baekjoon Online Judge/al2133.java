package BOJ;

import java.util.Scanner;

public class al2133 {
	static int arr[]=new int[1001];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(test(n));
		
	}

	public static int test(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 0;
		}if(n==2) {
			return 3;
		}
		if(arr[n]!=0) {
			return arr[n];
		}
		
		int result=3*test(n-2);
		
		if(n%2==0) {
			for(int i=3; i<=n; i++) {
				result+=2*test(n-i);
			}
		}
		
		return arr[n]=result;
	}
}
