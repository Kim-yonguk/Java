package algorithm14724;

import java.util.Scanner;

public class al14724 {
	public al14724() {}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int count=sc.nextInt();

		int co[]=new int[count*9];
		
		for(int i=0; i<count*9; i++) {
			co[i]=sc.nextInt();
		}
		
		int max=0;
		int index = 0;
		
		for(int i=0; i<count*9; i++) {
			if(max<co[i]) {
				max=co[i];
				index=i;
			}
		}
		//System.out.println(co[index] + " " +index);
		
		if(index>=0 && index<=count-1) {
			System.out.println("PROBRAIN");
		}else if(index>=count && index<=2*count-1) {
			System.out.println("GROW");
		}else if(index>=2*count && index<=3*count-1) {
			System.out.println("ARGOS");
		}
		else if(index>=3*count && index<=4*count-1) {
			System.out.println("ADMIN");
		}
		else if(index>=4*count && index<=5*count-1) {
			System.out.println("ANT");
		}
		else if(index>=5*count && index<=6*count-1) {
			System.out.println("MOTION");
		}else if(index>=6*count && index<=7*count-1) {
			System.out.println("SPG");
		}else if(index>=7*count && index<=8*count-1) {
			System.out.println("COMON");
		}else if(index>=8*count && index<=9*count-1) {
			System.out.println("ALMIGHTY");
		}
		
		
	}
}
