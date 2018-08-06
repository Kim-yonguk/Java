
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		int n=sc.nextInt();	//첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고
		///둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
		int arr[][]=new int[n+1][n+1];
		int dp[][]=new int[n+1][n+1];
		int i=1;
		while(i<n+1) {
			for(int j=1; j<=i; j++) {
				arr[i][j]=sc.nextInt();
			}
			i++;
		}
		/*
		 *  7 0 0 0 0
			3 8 0 0 0
			8 1 0 0 0
			2 7 4 4 0 
			4 5 2 6 5  으로 입력받음
		 */
		dp[1][1]=arr[1][1]; ///dp[1][1]은 arr[1][1]이니까 그대로 넣어줌
		i=2; ///계산은 dp[2][1]부터 시작하면 됨
		while(i<n+1) {
			/*
			 * 경우의 수는 3가지
			 * 1) dp[n][1]인 경우 => dp[n-1][1]+arr[n][1]
			 * 2) dp[n][n]인 경우 => dp[n-1][n-1]+arr[n][1]
			 * 3) 첫번째와 마지막이 아닌 경우 두가지씩 계산하여 더 큰 값을 dp에 저장
			 */
			for(int j=1; j<=i; j++) {
				if(j==1) {
					dp[i][j]=Math.max(dp[i][j],dp[i-1][1]+arr[i][j]);
				}else if(j==i) {
					dp[i][j]=Math.max(dp[i][j],dp[i-1][i-1]+arr[i][j]);
				}else {
					dp[i][j]=Math.max(dp[i][j], dp[i-1][j-1]+arr[i][j]);
					dp[i][j]=Math.max(dp[i][j], dp[i-1][j]+arr[i][j]);
				}
				max=Math.max(max, dp[i][j]);
			}
			i++;
		}
		System.out.println(max);
		
	}
}
