package algorithm13216;

import java.util.Scanner;

public class al13216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t=sc.next();
		
		char[] t1=t.toCharArray();
		
		int count1=0;
		int count2=0;
		
		int a1=0;
		int b1=0;
		
		for(int i=0; i<t1.length; i++) {
			if(t1[i]=='A') {
				count1++;
			}else {
				count2++;
			}
			
			if(count1==21) {
				a1++;
				System.out.println(count1+"-"+count2);
				count1=0;
				count2=0;
				if(a1==2) {
					System.out.println("A");
				}
			}else if(count2==21) {
				b1++;
				System.out.println(count1+"-"+count2);
				count1=0;
				count2=0;
				if(b1==2) {
					System.out.println("B");
				}
			}
		
		}
	}
}