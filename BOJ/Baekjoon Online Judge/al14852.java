package BOJ;

import java.util.Scanner;

public class al14852 {
	
	static long arr[][]=new long[1000001][2];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		System.out.println(test(n));
	}
	
	public static long test(long n) {
		arr[0][0]=0;
		arr[1][0]=2;
		arr[2][0]=7;
		arr[2][1]=1;
		
		for(int i=3; i<=n; i++) {
			arr[i][1]=(arr[i-1][1]+arr[i-3][0])%1000000007;
			arr[i][0]=(3*arr[i-2][0]+2*arr[i-1][0]+2*arr[i][1])%1000000007;
		}
		
		return arr[(int) n][0];
	}
}

