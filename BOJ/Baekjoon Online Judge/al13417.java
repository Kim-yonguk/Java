
import java.util.Scanner;

public class al13417 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		while(testCases-- > 0) {
			int n=sc.nextInt();
			
			String tmp="";
			char arr[]=new char[n];
			String str[];
			String tmpStr=sc.nextLine();
			str=tmpStr.split(" ");
			
			for(int i=0; i<n; i++) {
				arr[i]=sc.next().charAt(0);
			}
			
			tmp+=arr[0];
			
			for(int i=1; i<n; i++) {
				if(arr[i]>tmp.charAt(0))
					tmp+=arr[i];
				else
					tmp=arr[i]+tmp;
			}
			System.out.println(tmp);
		}
		
		sc.close();
	}
}
