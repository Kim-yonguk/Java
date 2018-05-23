package algorithm2839;

import java.util.Scanner;

public class al2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int n5=num/5;
		num%=5;
		int n3=0;
		
		while(n5>=0) {
			if(num%3==0) {
				n3=num/3;
				num%=3;
				break;
			}
			n5--;
			num+=5;
		}
		
		if(num==0) {
			System.out.println(n3+n5);
		}else {
			System.out.println("-1");
		}
		
		
	
		
		
	}
	
}
