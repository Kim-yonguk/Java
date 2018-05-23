package algorithm2490;

import java.util.Scanner;

public class al2490 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		////1 = 등       0 = 배 
		
		int[] arr=new int[12];
		
		// 도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개)
		// 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E
		
		for(int i=0; i<3; i++) {	
			
			int bCount=0;
			int dCount=0;
			for(int j=0; j<4; j++) {
				
				int n=sc.nextInt();
				if(n==1) {
					dCount++;
				}
				else {
					bCount++;
				}
				
				
			}
			if(dCount==4) {
				System.out.println("E");
			}
			else if(bCount==4) {
				System.out.println("D");
			}
			else if(bCount==3 && dCount==1) {
				System.out.println("C");
			}else if(bCount==2 && dCount==2) {
				System.out.println("B");
			}else {
				System.out.println("A");
			}
		}
		
		
	}
}
