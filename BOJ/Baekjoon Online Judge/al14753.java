package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-- > 0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			
			ArrayList<Integer> rs=new ArrayList<>();
			
			rs.add(arr[n-1]*arr[n-2]*arr[n-3]);
			rs.add(arr[n-1]*arr[n-2]);
			rs.add(arr[0]*arr[1]);
			rs.add(arr[0]*arr[1]*arr[n-1]);
			
			
			int max=Integer.MIN_VALUE;
			for(int i=0; i<rs.size(); i++) {
				max=Math.max(max, rs.get(i));
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}
}
