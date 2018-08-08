
import java.util.Scanner;

public class Main {
	
	static int dp[][];
	static int arr[];
	
  ///근우와 명우가 최선의 전략으로 임할 때=>모든 경우의 수 다 따져야함
  /// A의 최적의 수를 알기 위해선 다음 턴에 상대가 고를 수를 예측-> 상대가 고를 수를 알려면 마찬가지로 그 다음 턴에 A가 고를 수를 알아야한다 -> 반복
  /// -재귀함수로
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int size=sc.nextInt();
			arr=new int[size];
			for(int j=0; j<size; j++) {
				arr[j]=sc.nextInt();
			}
			dp=new int[size][size]; ///남은 카드에 대한 최적의 점수 저장할 배열
			System.out.println(process(0,size-1));
			for(int a=0; a<size; a++) {
				for(int j=0; j<size; j++) {
					System.out.print(dp[a][j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
		
	}


	private static int process(int left, int right) {         /// 카드가 left~right까지 있을때 얻을수 있는 최고 점수
		int sum=0;
		if(dp[left][right]!=0)
			return dp[left][right];
		if(left==right){
			return arr[left];
		}else {
			for(int i=left; i<=right; i++) 
				sum+=arr[i];
			dp[left][right]=Math.max(sum-process(left+1,right), sum-process(left,right-1));
			return dp[left][right];
		}
	}
}
