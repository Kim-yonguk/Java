

/*
 * 분수 a/b의 헨리식 표현법은 총합이 a/b와 같은 서로 다른 단위 분수의 나열
 * 1/x<=a/b ==> x>=b/a ==> #**# a*x 가 b를 넘지 않는 가장 작은 수 #**#
 * 만약 1씩 증가해서 찾는 방법은 시간초과가 뜸
 * ==> if(b%a==0) => x=b/a;
 * ==> else x=(b/a)+1; 
 * ++ a/b-x => (ax-b)/bx => a=ax-b , b=bx 로 나타내준다
 * 그리고 그 식이 배수관계에 있다면 최대공약수로 나눠준다.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		while(testCases-- > 0 ) {
			int x;
			int a=sc.nextInt();
			int b=sc.nextInt();
			while(a!=1) {
				x= (b%a==0) ? (b/a) : (b/a+1);
				a=a*x-b;
				b=b*x;
				int gcN=gcd(a,b);
				a/=gcN;
				b/=gcN;
			}
			System.out.println(b);
		}
		sc.close();
	}
	
	public static int gcd(int a,int b) {
		return b==0 ? a : gcd(b,a%b);
	}
}
