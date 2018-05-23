package algorithm7770;

import java.util.Scanner;

public class al7770 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=0;
		int a=5*n+1;
		
		if(num==1) {
			System.out.println(1);
		}else if((num%5)==1){
			System.out.println((num/5)+1);
		}else if((num%10)==0){
			System.out.println((num/5));
		}else {
			System.out.println((num/5)+1);
		}
	}
}
