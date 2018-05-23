package algorithm2792;

import java.util.Scanner;

public class al2792 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;	//학생
		int m;	//색상수
		int max=0;
		n=sc.nextInt();
		m=sc.nextInt();
		////다음 M개 줄에는 구간 [1, 10^9]에 포함되는 양의 정수가 하나씩 주어진다.
		
		int arr[]=new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]);
		}
		
		int left=1;
		int right=max;
		int res=max;
		
		while(left<=right) {
			int mid=(left+right)/2;
			int sum=0;
			
			for(int i=0; i<m; i++) {
				sum+=arr[i]/mid;
				if(arr[i]%mid!=0) {
					sum++;
				}
			}
			
			if (sum <= n) {
				if (res > mid) {
					res = mid;
				}
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			
		}
		
		System.out.println(res);
		sc.close();
		
	}
	

}
