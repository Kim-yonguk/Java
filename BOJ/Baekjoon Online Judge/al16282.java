package week6;

import java.util.Scanner;

public class blackChain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		while(testCases-->0) {
			long num=sc.nextLong();
			int n=1;
			while(num>process(n)) {
				n++;
			}
			System.out.println(n);
		}
		
		sc.close();
	}
	
	public static long process(int n) {
		long sum=n;
		long tmp=n+1;
		
		for(int i=0; i<n+1; ++i) {
			sum+=tmp;
			tmp*=2;
		}
		
		return sum;
	}
}
