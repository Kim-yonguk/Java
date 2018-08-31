
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=Integer.parseInt(sc.nextLine());
		
		while(testCases-- > 0) {
			int n=Integer.parseInt(sc.nextLine());
			char arr[]=new char[n];
			String str=sc.nextLine();
			for(int i=0; i<n; i++) {
				arr[i]=str.charAt(i);
			}
			
			char arr2[]=new char[n];
			String str2=sc.nextLine();
			for(int i=0; i<n; i++) {
				arr2[i]=str2.charAt(i);
			}
			
			int w=0;
			int b=0;
			
			for(int i=0; i<n; i++) {
				if(arr[i]!=arr2[i]) {
					if(arr[i]=='W')
						b++;
					else
						w++;
				}
			}
			int sum=Math.min(b, w)+Math.abs(b-w);
			System.out.println(sum);
			
		}
		
		sc.close();
	}
}
