
/*
 * 주어진 n이 10이상이면 n%10으로 tmp값에 저장하여 제곱하여 sum에 더해주면서 n/=10 반복하면서
 * sum을 맵에 저장해준다. 반복문을 돌면서 n이 1이 되면 HAPPY출력
 * 이미 맵에 저장되어있는 숫자가 되면 루프이므로 UNHAPPY 출력 
 */
import java.util.HashMap;
import java.util.Scanner;

public class problemD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum;
		HashMap<Integer, Integer> map=new HashMap<>();
		
		while(true) {
			
			if(!map.containsKey(n))
				map.put(n, 0);
			
			map.put(n, map.get(n)+1);
			sum=0;
			
			while(n>=10) {
				int t=n%10;
				n/=10;
				sum+=t*t;
			}
			sum+=n*n;
			n=sum;
			if(n==1) {
				System.out.println("HAPPY");
				break;
			}else if(map.size() > 1 && map.containsKey(n)) {
				System.out.println("UNHAPPY");
				break;
			}
		}
		sc.close();
	}
}
