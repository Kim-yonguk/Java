package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class al1431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		String arr[]=new String[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		/// 길이가 다르면 짧은것이 먼저 온다.
		Arrays.sort(arr,(s1,s2)->Integer.compare(s1.length(), s2.length()));
		
		/// 만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
		sort2(arr);
		
		/// 만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
		sort3(arr);
		
		
		for(String s: arr) {
			System.out.println(s);
		}
		
	}
	
	public static int compareNumber(String str) {
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
				if(str.charAt(i) >= 48 && str.charAt(i)<=57) {
					count+=Character.getNumericValue(str.charAt(i));
				}
			
		}
		return count;
	}
	
	public static void sort2(String arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j].length()==arr[j+1].length()) {
					if(compareNumber(arr[j]) > compareNumber(arr[j+1])) {
						String tmp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=tmp;
					}
				}
			}
		}
	}
	public static void sort3(String arr[]) {
		for(int j=0; j<arr.length-1; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i].length()==arr[i+1].length() && compareNumber(arr[i]) == compareNumber(arr[i+1])) {
					Arrays.sort(arr, i, i+2);
				}
			}
		}
	}
}
