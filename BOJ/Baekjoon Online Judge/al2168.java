package algorithm2168;

import java.util.Scanner;

public class al2168 {
	
	public al2168() {}
	
	int gcdvalue=0;
	
	public static void main(String[] args) {
		int n1,n2;
		al2168 main=new al2168();
		
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		main.cross(n1, n2);
	}
	
	public void gcd(int x,int y) {
		
		int max=0;
		if(x>=y) {
			max=x;
		}
		else {
			max=y;
		}
		for(int i=1; i<=max; i++) {
			if((x%i==0) && (y%i==0)) {
				gcdvalue=i;
			}
		}
		//System.out.println(gcdvalue);
	}
	
	
	public void cross(int x,int y) {		//x는가로 y는 세
		gcd(x,y);
		int count=0;
		if(x>y) {
			count=x+y;
			int x1=x/gcdvalue;
			int y1=y/gcdvalue;
			count-=gcdvalue;
		}
		else if(x==y) {
			count =x;
		}
		else {
			count=x+y;
			int x1=x/gcdvalue;
			int y1=y/gcdvalue;
			count-=gcdvalue;
		}
		System.out.println(count);
	}
}
