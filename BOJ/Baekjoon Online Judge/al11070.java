

/*
 * 다음의 m개의 줄에는 각 경기에 대한 정보가 주어진다.
 * 하나의 경기는 네 개의 정수 a, b, p, q로 주어지는데, 팀 a와 팀 b가 경기를 했고, 팀 a는 p득점을 팀 b는 q득점을 했다는 의미이다. 
 * 여기서, 1 ≤ a ≠ b ≤ n이며, p와 q는 모두 음이 아닌 20 이하의 정수이다. 
 * 하나의 테스트 데이터에서 팀 당 경기수가 반드시 같을 필요는 없다. 
 *  만약, 어떤 팀의 총 득점과 총 실점이 모두 0이라면, 그 팀의 기대값은 0으로 정의한다.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
	
		while(testCases-- > 0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int p[]=new int[n+1];
			int q[]=new int[n+1];
			
			
			
			for(int i=1; i<=m; i++) {
				int f=sc.nextInt();
				int s=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				p[f]+=a;
				q[f]+=b;
				
				p[s]+=b;
				q[s]+=a;
			}
			double max=0;
			double min=Integer.MAX_VALUE;
			for(int i=1; i<=n; i++) {
				double result;
				if(p[i]==0 && q[i] ==0) {
					result=0;
					min=Math.min(min, result);
					max=Math.max(max, result);
				}else {
					result=1000*(Math.pow(p[i], 2)/(Math.pow(p[i], 2)+ (Math.pow(q[i], 2))));
					min=Math.min(min, result);
					max=Math.max(max, result);
				}
			}
			int maxValue=(int)max;
			int minValue=(int)min;
			
			System.out.println(maxValue);
			System.out.println(minValue);
		}
		sc.close();
	}
}
