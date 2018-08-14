
/**
 * ++)백준에 채점준비중이라 맞는지 안맞는지 정확히 모르지만 테스트케이스들은 전부 다 일치
 * 각 테스트 케이스의 출력되는 첫 줄에 입력으로 주어진 n 개의 정수들 중에서 
 * 서로 다른 두 정수의 합이 주어진 또 다른 정수 K 에 가장 가까운 두 정수의 조합의 수를 출력한다.
 * 배열에 값들을 입력받아 오름차순으로 정렬한다.
 * left 를 배열의 처음 인덱스, right를 배열의 마지막 인덱스값을 주고
 * 양쪽 끝에서부터 distance값을 비교하면서 더 작은 distance를 구하면 그 값을 distance로.
 * 값이 같으면 count를  1 증가시켜준다. 배열의 좌우값 비교후 left,right값을 +또는-한다.
 */
import java.util.Arrays;
import java.util.Scanner;

public class problemI {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		while(testCases-- > 0) {
			int n=sc.nextInt();
			int value=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			int left=0;
			int right=n-1;
			int ans=0;
			int distance=Math.abs(value-(arr[left]+arr[right]));
			while(left!=right) {
				int tmp=Math.abs(value-(arr[left]+arr[right]));
				
				if(distance==tmp) {
					ans++;
				}
				else if(distance>tmp) {
					distance=tmp;
					ans=1;
				}
				
				if(arr[left]+arr[right]>value) {
					right--;
				}else {
					left++;
				}
			}
			System.out.println(ans);
		}
		sc.close();
		
	}
}
