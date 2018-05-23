package al1978;

import java.util.Scanner;

public class al1978 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int count=0;
		int j=2;
		
		for(int i=0; i<n; i++) {
			int num=sc.nextInt();
			if(num==1) {
				
			}
			else if(num==2) {
				count++;
			}
			else {
				while(num>j) {
						if(num%j==0) {
							break;
						}
						else{
							j++;
						}
				}
				if(num==j) {
					count++;
					j=2;
				}
				j=2;
			}
		}
		
		System.out.println(count);
	}
}
