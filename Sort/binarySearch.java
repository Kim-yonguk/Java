package sort;

import java.util.Scanner;

public class binarySearch {

	
	public static void main(String[] args) {
		
		String arr[]=new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			arr[i]=sc.next();
		}
		sc.close();
		
		String str=sc.next();
		
		System.out.println(binary(arr,str));
		
	}
	
	public static int binary(String arr[],String str) {

		int begin=0; 
		int end=arr.length;
		
		while(begin<=end) {
			int middle=(begin+end)/2;
			int result=arr[middle].compareTo(str);
			if(result==0) {
				return middle;
			}else if(result<0) {
				begin=middle+1;
			}else {
				end=middle-1;
			}
		}
		return -1;
	}
}
