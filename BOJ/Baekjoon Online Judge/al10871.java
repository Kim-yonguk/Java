package algorithm10871;

import java.util.Arrays;
import java.util.Scanner;

public class al10871 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int size;
		int limit;
		
		size=sc.nextInt();
		limit=sc.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
//		Arrays.sort(arr);
		
		for(int i=0; i<size; i++) {
			if(arr[i]<limit) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
