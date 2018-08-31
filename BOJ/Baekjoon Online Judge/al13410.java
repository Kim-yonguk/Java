
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int arr[]=new int[K+1];
		String tmp[]=new String[K+1];
		
		for(int i=1; i<=K; i++) {
			arr[i]=N*i;
		}
		
		for(int i=1; i<=K; i++) {
			tmp[i]=Integer.toString(arr[i]);
		}
		for(int i=1; i<=K; i++) {
			tmp[i]=new StringBuilder(tmp[i]).reverse().toString();
		}
		for(int i=1; i<=K; i++) {
			arr[i]=Integer.parseInt(tmp[i]);
		}
		int max=-1;
		
		for(int i=1; i<=K; i++) {
			max=Math.max(max, arr[i]);
		}
		
		System.out.println(max);
	}
}
