package BOJ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class al1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		Set<String> set=new HashSet<>();
		for(int i=0; i<n; i++) {
			set.add(sc.next());
		}
		
		String arr[]=new String[set.size()];
		
		set.toArray(arr);
		Arrays.sort(arr);
		
		Arrays.sort(arr, (s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		for(String i:arr) {
			System.out.println(i);
		}
		
	}
}
	
