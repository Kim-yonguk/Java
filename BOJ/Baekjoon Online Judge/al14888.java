package BOJ;

import java.util.Scanner;
/*
 * N개의 수와 N-1개의 연산자가 주어졌을 때, 
 * 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오
 * ==> 모든 경우를 탐색해야됨 , 완전탐색이므로 간편하게 DFS로 풀면됨.
 * 재귀 함수를 통해 각각의 경우를 index를 증가시키며 모든 연산을 해보고
 * 각 연산단계의 마지막단계에서의 value를 max,min값과 비교하여 구하면 됨.
*/
public class al14888 {
	static int op[]=new int[4];
	static int arr[]=new int[12];
	static int maxValue=-1000000000;
	static int minValue=1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		//op[0]=+  op[1]=-  op[2]=*  op[3]=/
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<4; i++) {
			op[i]=sc.nextInt();
		}
		process(1, 0, 0, 0, 0, n, arr[0]);
		System.out.println(maxValue);
		System.out.println(minValue);
		
		
		
	}
	
	
	public static void process(int index,int add,int sub,int mul,int div,int n,int tmp) {
		if(index==n) {
			maxValue=Math.max(maxValue, tmp);
			minValue=Math.min(minValue, tmp);
			return;
		}
		if(add<op[0]) {
			process(index+1,add+1,sub,mul,div,n,tmp+arr[index]);
		}
		if(sub<op[1])
			process(index+1,add,sub+1,mul,div,n,tmp-arr[index]);
		if(mul<op[2])
			process(index+1,add,sub,mul+1,div,n,tmp*arr[index]);
		if(div<op[3])
			process(index+1,add,sub,mul,div+1,n,tmp/arr[index]);
	}
}
