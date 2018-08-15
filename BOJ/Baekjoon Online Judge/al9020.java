
import java.util.Scanner;

/*
 * 골드바흐의 추측 = 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다.
 * 10000보다 작은 모든 짝수 n에 대한 골드바흐 파티션은 존재
 * 만약 가능한 n의 골드바흐 파티션이 여러가지 두 소수의 차이가 가장 작은 것을 출력한다.
 * 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)
 * 2에서 10000까지 에라토스네스의 체로 소수판별해서 그 배열을 이용하여 골드바흐 파티션을 만든다
 *  ex) 18 => X X 2 3 X 5 X 7 X X X 11 X 13 14 X X 17
 *  두 소수 차이가 가장 작은것을 출력 => 짝수 소수 2개의 조합은 짝수를 2로 나눈 절반값을 기준
 *  짝수 n에 대하여 2로 나누어주고 인덱스를 - + 양방향으로 구해준다. 가운데에서 가까울수록 차이가 작다
 */
public class Main {
	static boolean isNotPrime[]=new boolean[10001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=2; i<Math.sqrt(10000); i++) {
			if(!isNotPrime[i]) {
				for(int j=2; j*i<=10000; j++) {
					isNotPrime[i*j]=true;
				}
			}
		}
		
		int testCases=sc.nextInt();
		
		while(testCases-- > 0) {
			int n=sc.nextInt();
			n=n>>1;
			int index=0;
			while(true) {
				if(!isNotPrime[n-index] && !isNotPrime[n+index]) {
					System.out.println((n-index)+" "+(n+index));
					break;
				}
			
				index++;
			}
		}
		sc.close();
	}
}
