package algorithm1010;

import java.util.Scanner;

public class al1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			cross(a,b);
		}
	}
	
	public static void cross(int x,int y) { 
		long result =1;
		for(int j=1; j<=x; j++) {
			result = result*(y-j+1)/j;
		}
		System.out.println(result);
	}
	
}
