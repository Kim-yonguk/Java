
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int a[],b[],c[];
		while(testCases-- > 0) {
			int day=sc.nextInt();
			a=new int[day];
			b=new int[day];
			c=new int[day];
			int sum=0;
			for(int i=0; i<day; i++) {
				int max=0;
				a[i]=sc.nextInt();
				max=Math.max(max, a[i]);
				b[i]=sc.nextInt();
				max=Math.max(max, b[i]);
				c[i]=sc.nextInt();
				max=Math.max(max, c[i]);
				
				sum+=max;
			}
			
			System.out.println(sum);
			
		}
		sc.close();
	}
}
