package al2581;

import java.util.Scanner;

public class al2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int min=10000;
		int j=2;
		int count=0;
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			if(i==1) {
				
			}
			else if(i==2) {
				sum+=2;
				count++;
				min=i;				
			}else {
				while(i>j) {
					if(i%j==0) {
						break;
					}
					else{
						j++;
					}
				}
				if(i==j) {
					if(min>i) {
						min=i;
					}
					sum+=i;
					count++;
					j=2;
				}
				j=2;
			}
			
		}
		if(count==0) {
			System.out.println("-1");
		}else {
		System.out.println(sum);
		System.out.println(min);
		}
		
	}
}
