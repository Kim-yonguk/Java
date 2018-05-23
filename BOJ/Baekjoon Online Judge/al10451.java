package al10451;

import java.util.Scanner;

public class al10451 {
	public static boolean visit[];
	public static int map[][];
	static int count;
	static int start;
	static int num;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int n=sc.nextInt();
		
		while(n-->0) {
			num=sc.nextInt();
			map=new int[num][num];
			visit=new boolean[num];
			count=0;
			int line[]=new int[num];
			
			for(int i=0; i<num; i++) {
				line[i]=sc.nextInt();
			}
			
			for(int i=0; i<num; i++) {
				map[i][(line[i])-1]=1;
			}
			for(int i=0; i<num; i++) {
				start=i;
				for(int j=0; j<num; j++) {
					if(!visit[j]&&map[i][j]==1) {
						dfs(j);
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public static void dfs(int a) {
		visit[a]=true;
		
		if(a==start) {
			count++;
			return;
		}else {
			for(int i=0; i<num; i++) {
				if(!visit[i]&&map[a][i]==1) {
					visit[i]=true;
					dfs(i);
				}
			}
		}
	}
}
