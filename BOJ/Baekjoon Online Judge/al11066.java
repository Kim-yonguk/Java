
import java.util.Scanner;

public class Main {
	static int max=Integer.MAX_VALUE;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();	///몇번을 실행할지
		int num;
		int arr[];
		int sum[];
		int dp[][];
		for(int q=0; q<n; q++) {
			num=sc.nextInt(); ///숫자 개
			///1) 각 데이터가 저장될 배열
			arr=new int[num+1];
			///2) 각 데이터합이 저장될 배열 
			sum=new int[num+1];
			///3) i번째 수 부터 j번째 수 까지 수를 합치는 데 필요한 최소 비용이 저장 될 배열
			dp=new int[num+1][num+1];
			for(int i=1; i<num+1; i++) {
				arr[i]=sc.nextInt(); //입력완료
			}
			for(int i=1; i<num+1; i++) {
				sum[i]=arr[i]+sum[i-1]; 	///각 데이터합 저장
			}
			sum[0]=0;
			for(int i=1; i<num+1; i++) {
				for(int j=1; j<num+1; j++) {
					dp[i][j]=max;
				}
			}
			System.out.println(process(dp, arr, sum, 1, num));
		}
		
		
	}
	
	public static int process(int dp[][],int arr[],int sum[],int start,int end) {
		//1)start>=end일 경우에는 0 리턴해준다.
		if(start>=end) {
			return 0;
		}
		//2)연속된 경우일 경우 더해서 리턴
		if(start+1==end) {
			return arr[start]+arr[end];
		}
		//3)dp[start][end] 값이 max값 보다 작으면 리턴=>이미 계산되있는것은 리턴.
		if(dp[start][end]<max) {
			return dp[start][end];
		}
		for(int i=start; i<end; i++) {
			int tmp=process(dp,arr,sum,start,i)+process(dp,arr,sum,i+1,end)+sum[end]-sum[start-1];
			dp[start][end]=Math.min(dp[start][end], tmp);
		}
		
		return dp[start][end];
	}

}
