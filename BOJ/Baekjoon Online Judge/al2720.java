package algorithm2720;

import java.util.Scanner;

public class al2720 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)
		double Q=25;
		int Qcount=0;
		
		double D=10;
		int Dcount=0;
		
		double N=5;
		int Ncount=0;
		
		double P=1;
		int Pcount=0;
		for(int i=0; i<num; i++) {
			int etc=sc.nextInt();
		
			while(true) {
				if(etc>=25) {
					etc-=25;
					Qcount++;
				}else if(etc>=10) {
					etc-=10;
					Dcount++;
				}else if(etc>=5) {
					etc-=5;
					Ncount++;
				}else if(etc>=1) {
					etc-=1;
					Pcount++;
				}
				
				if(etc==0) {
					break;
				}
					
				
			}
		
		System.out.println(Qcount+" "+Dcount+" "+Ncount+" "+Pcount);

		Qcount=0;
		Dcount=0;
		Ncount=0;
		Pcount=0;
		}
	}

}
