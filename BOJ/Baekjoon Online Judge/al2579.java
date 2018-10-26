package BOJ;
import java.util.Scanner;

/*
 * 계단 오르는 데는 다음과 같은 규칙이 있다.
 * 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
 * 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
 * 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
 * 마지막 도착 계단은 반드시 밟아야 한다.
 * 
 * 마지막 도착 계단은 반드시 밟아야 하므로 경우의 수를 아래와 같이 나눈다.
 * 1)마지막 계단 전 계단을 밟은 경우	=> dp[n]=dp[n-2]+arr[n-1]+arr[n]
 * 2)마지막 계단 전 계단을 밟지 않은 경우 => dp[n]=dp[n-2]+arr[n]
 * dp[0],dp[1],dp[2]는 반복문에서 돌리면 인덱스 에러가 나서
 * 해당하는 값을 미리 넣어줘야 계산에서 에러가 뜨지않는다.
 * dp[0]=arr[0]
 * dp[1]=Max(arr[0]+arr[1],arr[1])
 * dp[2]=Max(arr[0]+arr[2],arr[1]+arr[2])
 */
public class al2579 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int dp[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0]+arr[1], arr[1]);
		dp[2]=Math.max(arr[0]+arr[2], arr[1]+arr[2]);
		for(int i=3; i<n; i++) {
			dp[i]=Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]);
		}
		
		System.out.println(dp[arr.length-1]);
		sc.close();
	}
}
