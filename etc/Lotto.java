package Lotto;

import java.util.Scanner;

public class Lotto {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번을 구입하시겠습니까? :");
		int n=sc.nextInt();
		
		makeLotto(n);
		
	}
	
	public static void makeLotto(int n) {
		int Lotto[]=new int[6];
		int i;
		System.out.println("Lotto 자동 추첨 숫자는 ");
		for(int j=0; j<n; j++) {
			for(i=0; i<Lotto.length; i++) {
				Lotto[i]=(int) (Math.random()*45)+1;
				for(int f=0; f<i; f++) {
					if(Lotto[i]==Lotto[f]) {
						i--;
						break;
					}
				}
			}
			for(int q=0; q<Lotto.length; q++) {
				System.out.print(Lotto[q]+" ");
			}
			System.out.println();
		}
		
		
	}
}
