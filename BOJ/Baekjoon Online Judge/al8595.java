package algorithm8595;

import java.util.Scanner;

public class al8595 {
	
	public al8595() {}
	
	static char[] test=new char[5000001];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double temp=0;
		long sum=0;
		int num;
		int j=1;
		int len = sc.nextInt();
		String s=sc.next();
		
		
		
		for(int i=0; i<len; i++) {
			test[i]=s.charAt(i);
		}
		
		for(int i=len-1; i>=0; i--) {
			if(test[i]>='0' && test[i] <='9') {
				num=test[i]-'0';
				temp+=j*num;
				j*=10;
			}
			if(i==0 || test[i] <'0' || test[i]>'9') {
				if(temp<=999999) {
					sum+=temp;
					temp=0;
					j=1;
				}
			}
		}
		
		System.out.println(sum);
		
		
		
	}

}
