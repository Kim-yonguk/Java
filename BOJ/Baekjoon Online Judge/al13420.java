package BOJ;
/*
 * int 형으로 선언하면 int범위를 벗어나는 값이 나오면 런타임에러 남 
 */
import java.util.Scanner;

public class al13420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCases=sc.nextInt();
		
		while(testCases-->0) {
			long n1=Long.parseLong(sc.next());
			char op=sc.next().charAt(0);
			long n2=Long.parseLong(sc.next());
			
			char tmp=sc.next().charAt(0);
			long rs=Long.parseLong(sc.next());
			
			long result=process(n1,n2,op);
			
			if(result==rs) {
				System.out.println("correct");
			}else {
				System.out.println("wrong answer");
			}
		}
		sc.close();
	}
	
	public static long process(long n1,long n2,char op) {
		//+, -, *, / 
		
		if(op=='+') {
			return n1+n2;
		}else if(op=='-') {
			return n1-n2;
		}else if(op=='*') {
			return n1*n2;
		}else{
			return n1/n2;
		}
	}
}
