
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0) {
			int cnt=0;
			int n=sc.nextInt();
			for(int i=5; i<=n; i*=5) {
				cnt+=n/i;
			}
			System.out.println(cnt);
		}
	}
}
