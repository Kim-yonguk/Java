package week4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			long sum=0;
			long max=0;
			long tmp=0;
			Set<Long> set=new LinkedHashSet<>();
			
			long arr[][]=new long[a][b];
			for(int i=0; i<a; i++) {
				max=0;
				for(int j=0; j<b; j++) {
					arr[i][j]=sc.nextInt();
					max=Math.max(max, arr[i][j]);
					sum+=arr[i][j];
				}
				set.add(max);
			}
				
			for(int i=0; i<b; i++) {
				max=0;
				for(int j=0; j<a; j++) {
					max=Math.max(max, arr[j][i]);
				}
				set.add(max);
			}
			for(Long c :set) {
				tmp+=c;
			}
			long rs=sum-tmp;
			System.out.println(rs);
			set.clear();
		}
	}
}
