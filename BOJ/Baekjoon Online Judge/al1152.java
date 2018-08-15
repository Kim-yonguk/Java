
/*
 * 맨 처음에는 ' ' 공백수를 포함한 count 수 + 1 을 출력했는데 틀림
 * 문자열의 맨 앞과 맨 끝에 공백이 있을수도 있어서 그거까지 if문으로 cnt--해주면 
 * 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		//ArrayList<String> arr=new ArrayList<>();
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ')
				cnt++;
		}
		
		if(str.charAt(0)==' ')
			cnt--;
		if(str.charAt(str.length()-1)==' ')
			cnt--;
		System.out.println(cnt+1);
	}
}
