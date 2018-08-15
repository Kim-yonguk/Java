
/*
 * 두찌수열
 * (a1, a2, ..., an) -> (|a1-a2|, |a2-a3|, ..., |an-a1|)
 * +) 루프를 만드는데 필요한 최대 단계수는 1,000을 넘지 않는다.
 * 반복문을 돌려서 전부 다 계산한뒤 배열의 모든 값이 0 이면 ZERO 출력
 * 1000까지 반복문 돌리는 동안 ZERO를 출력 못하면 LOOP 출력
 * 
 * 반복문을 돌리며 값 계산할때 배열의 첫번째 값을 따로 저장해놓지 않으면 계산이 꼬임
 * 
 */

import java.util.Scanner;

public class problemA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		while(testCases-- > 0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			boolean isZero=false;
			for(int cnt=0; cnt<1001; cnt++) {
				int count=0;
				int tmp=arr[0];
				for(int i=0; i<n; i++) {
					if(i==n-1) {
						arr[i]=Math.abs(arr[i]-tmp);
					}else {
						arr[i]=Math.abs(arr[i]-arr[i+1]);
					}
				}

				for(int i=0; i<n; i++) {
					if(arr[i]!=0) {
						break;
					}else {
						count++;
					}
				}
				if(count==n) {
					System.out.println("ZERO");
					isZero=true;
					break;
				}
			}
			if(!isZero) {
				System.out.println("LOOP");
			}
		}
		
		sc.close();
	}
}
