package algorithm11659;

import java.util.Scanner;

public class al11659 {
	
	public static void main(String[] args) {
		int a[]=new int[100001];
		int b[]=new int[100001];
		int n;
		int m;
		int x,y;
		
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			a[i]=sc.nextInt();
			b[i]=b[i-1]+a[i];
		}
		while(m>=1) {
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println(b[y]-b[x-1]);
		}
	}

}
