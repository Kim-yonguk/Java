
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int num=sc.nextInt();
			boolean isPalindrome=false;
			for(int j=2; j<=64; j++) {
				String str=converse(num,j);
				if(str.equals(new StringBuffer(str).reverse().toString())) {
					isPalindrome=true;	
					break;
				}
			}
			if(isPalindrome)
				System.out.println(1);
			else 
				System.out.println(0);
		}
		sc.close();
	}

	private static String converse(int num, int base) {
		// TODO Auto-generated method stub
		String str="";
		while(num!=0) {
			str+=(char)(num%base);
			num/=base;
		}
		return str;
	}
}
