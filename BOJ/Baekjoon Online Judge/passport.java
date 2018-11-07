package week6;

import java.util.Scanner;

public class passPort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			
			boolean check=true;
			
			int pass[]=new int[K];
			int outPut[]=new int[N];
			
			for(int i=0; i<N; i++) {
				outPut[i]=sc.nextInt();
			}
			
			for(int i=0; i<N; i++) {
				int tmp=outPut[i];
				int value=process(pass,K,tmp);
				if(value!=-1) {
					pass[value]=tmp;
				}else {
					check=false;
				}
			}
			
			if(check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static int process(int[] pass, int K, int tmp) {
		
		for(int i=0; i<K; ++i) {
			if(pass[i]<tmp) {
				return i;
			}

		}
		return -1;
	}
}
