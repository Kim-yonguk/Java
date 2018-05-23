package BOJ;

import java.util.Scanner;

public class al11726 {

	static int arr[]=new int[1001];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(test(n));
	}
	
	public static int test(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(arr[n]!=0) {
			return arr[n];
		}
		
		return arr[n]=(test(n-1)+test(n-2))%10007;
	
		
	}
}
