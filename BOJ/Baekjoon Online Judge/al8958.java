package algorithm8958;

import java.util.Scanner;

public class al8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size=sc.nextInt();
		int cnt=0;
		int sum=0;
		
		String[] arr=new String[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<arr[i].length(); j++) {
			
				if(arr[i].charAt(j)=='O') {
					cnt++;
					sum+=cnt;
				}else if(arr[i].charAt(j)=='X') {
					cnt=0;
				}
				
			}
			cnt=0;
			System.out.println(sum);
			sum=0;
		}
		
		
		
	}
	
}
