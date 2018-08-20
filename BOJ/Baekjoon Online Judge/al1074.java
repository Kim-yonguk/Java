
/*
 * 분할정복 알고리즘
 * 규칙 => 4등분한다 Z모양으로 방문한다.
 * 주어지는 좌표가 4등분한 면에서 어느 사분면에 속하는지를 확인해서 그 전에 방문한 i,i+1...n분면을 더해주면 된다.
 * 그후 그 해당하는 분면도 4등분 하여 또 분할하여 반복적으로 계산하면 된다.
 * 계산은 n번
 * 
 */
import java.util.Scanner;

public class al1074 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt(); 	///y좌표
		int c=sc.nextInt();	///x좌표
		
		int result=0;
		int x=(int) (Math.pow(2, n)/2);
		int y=x;
		
		
		while(n-- > 0) {
			int tmp = (int) Math.pow(2, n) / 2;
			int pre = (int) Math.pow(4, n);
			
			///1사분면
			if(r < y && c <x) {
				x-=tmp;
				y-=tmp;	
				
			}
			///2사분면
			else if(r<y && c>=x) {
				x+=tmp;
				y-=tmp;
				result+=pre;
			}
			///3사분면
			else if(r>=y && c<x) {
				x-=tmp;
				y+=tmp;
				result+=pre*2;
			}
			///4사분면
			else {
				x+=tmp;
				y+=tmp;
				result+=pre*3;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
