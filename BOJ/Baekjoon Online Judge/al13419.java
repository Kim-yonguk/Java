
import java.util.Scanner;

public class Main {

	/// 홀수 일 경우
	
	//ABCDE ABCDE ABCDE ABCDE
	// ACEBD
	
	///짝수
	///abcd abcd abcd
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCases=Integer.parseInt(sc.nextLine());
		
		while(testCases-- > 0) {
			String str=sc.nextLine();
			String tmp1="";
			String tmp2="";
			
			if(str.length()%2==0) {
				for(int i=0; i<str.length(); i++) {
					if(i%2==0 || i==0) {
						tmp1+=str.charAt(i);
					}else {
						tmp2+=str.charAt(i);
					}
				}
			}else {
				for(int i=0; i<str.length(); i++) {
					if(i%2==0 || i==0) {
						tmp1+=str.charAt(i);
					}else {
						tmp2+=str.charAt(i);
					}
				}
				for(int i=0; i<str.length(); i++) {
					if(i%2==0 || i==0) {
						tmp2+=str.charAt(i);
					}else {
						tmp1+=str.charAt(i);
					}
				}
			}
			
			
			
			System.out.println(tmp1);
			System.out.println(tmp2);
		}
		
		sc.close();
	}
}
