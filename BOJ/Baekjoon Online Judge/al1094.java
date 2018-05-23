package algorithm1094;

import java.util.Scanner;

public class al1094 {
	public static void main(String[] args) {
		 int s1=64;
		 int s2=32;
		 int s3=16;
		 int s4=8;
		 int s5=4;
		 int s6=2;
		 int s7=1;
		 int count=0;
		 
		 Scanner sc = new Scanner(System.in);
		 int len=sc.nextInt();
		 
		 while(len>0) {
			 if(len==s1) {
				 count++;
				 len-=s1;
			 }
			 if(len>=s2) {
				count++;
				len-=s2;
			 }
			 if(len>=s3) {
				 count++;
				 len-=s3;
			 }
			 if(len>=s4) {
				 count++;
				 len-=s4;
			 }
			 if(len>=s5) {
				 count++;
				 len-=s5;
			 }
			 if(len>=s6) {
				 count++;
				 len-=s6;
			 }
			 if(len>=s7) {
				 count++;
				 len-=s7;
			 }
		 }
		 
		 System.out.println(count);
		 
	}
}
