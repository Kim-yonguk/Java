package algorithm1193;

import java.util.Scanner;

public class al1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int min;
		int n;
		int num=sc.nextInt();
		
		for(n=1; ;n++) {
			max=(n*(n+1))/2;
			min=(n*(n+1))/2-n;
			
			if((max>=num)&&(min<=num)) {
				break;
			}
		}
		
		if(n%2==1) {
			int a=1;	//분자
			int b=n; //분모
			
			while(true) {
				if(max==num) {
					System.out.println(a+"/"+b);
					break;
				}else {
					max--;
					a++;
					b--;
				}
			}
		}
		else {
			int a=n;	//분자
			int b=1;//분모
			
			while(true) {
				if(max==num) {
					System.out.println(a+"/"+b);
					break;
				}
				else {
					max--;
					a--;
					b++;
				}
			}
		}
	}
}
