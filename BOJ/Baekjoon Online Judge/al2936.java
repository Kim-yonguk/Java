package algorithm2936;

import java.util.Scanner;

public class al2936 {
	int size=250;
	double c;
	double d;
	double n;	//나머지
	double x;	//
	public al2936() {}
	public static void main(String[] args) {
		al2936 main=new al2936();
		
		Scanner sc= new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		main.test(a, b);
	}
	
	
	public void test(double a,double b) {
		if((a==0) && (b==0)) {
			double cross=Math.sqrt(250*250+250*250)/2;

			c=125.00;
			d=125.00;
		}
		else if((a==250.00)&&(b==0)) {
			c=0;
			d=125.00;
		}
		else if((a==0)&&(b==250.00)) {
			c=125.00;
			d=0;
		}
		else if((a==125.00) && (b==0)) {
			c=0;
			d=250.00;
		}
		else if((a==0) && (b==125.00)) {
			c=250.00;
			d=0;
		}else if((a==125.00) && (b==125.00)) {
			c=0;
			d=0;
		}
		else if((a>0) && (b==0)) {
			
		}
		else if((a==0) && (b>0)) {
			n=250-b;
			x=250*250/n;
				
		}
		
		
		System.out.println(c+" "+d);
	}
}
