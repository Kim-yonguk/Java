

/*
 * 첫 줄에 테스트 케이스의 수 T가 주어진다.
 * 각 테스트 케이스는 네 개의 정수 M, N, L, G로 이루어져 있으며 M은 그리드의 행 수, N은 그리드의 열 수이다. 
 * L은 문제에서 설명한 한 격자를 직선 주행하는 데 걸리는 시간이며 G는 연료량이다.
 * (2 ≤ M, N ≤ 100), (1 ≤ L ≤ 10), (1 ≤ G ≤ 1,000,000). 이어서 M줄에 걸쳐 N-1개의 정수가 주어진다.
 * 각 정수는 그리드에서 대응되는 가로 경로를 주행할 때 드는 연료량이다. 
 * 그 이후 M-1줄에 걸쳐 N개의 정수가 주어진다. 각 정수는 그리드에서 대응되는 세로 경로를 주행할 때 드는 연료량이다.
 * 
 * 
 * 항상 오른쪽과 아래로만 이동할 수 있다. (i,j)로 k번 회전해서 도착했다면 걸린 시간은 (i+j-2)*L+k
 * dp[i][j][k] => 현재 (i,j)에 k번 회전해서 도착으로 표시하면 (i,j)에 어떤 방향으로 왔는 표시할수 없어서
 * dp[i][j][k][dir] 로 방향을 추가해준다=> 현재 (i,j)에 k번 회전하여 도착했을때 필요한 연료의 양 
 * dir 이 1이면 진행방향 오른쪽 , dir 이 0 이면 진행방향 아래쪽
 * 최대 N+M 번 회전 가능한데 count를 N+M으로 주면 타임아웃이 떠서 m==n일때는 2n-3,아닐때는 작은값에 2를 곱하여 -2해줌
 * (i,j)까지 올수있는 방법=> 왼쪽에서 오는 경우 , 위에서 온 경우 그리고 왼쪽,위에서 올때 회전의 유무
 * dp[i][j][k][1]=> 왼쪽에서온것 => Math.min(dfs(i,j-1,k,1) => 왼쪽에서 오는데 회전없이
 * 										 dfs(i,j-1,k-1,0) => 진행방향이 아래쪽인데 회전으로 올때
 * dp[i][j][k][0]=> 위에서 온것 => Math.min*(dfs(i-1,j,k,0) => 위에서 오는데 회전없이
 * 										 dfs(i-1,j,k-1,1) => 진행방향이 오른쪽인데 회전해서 올때
 */
import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main{
	
    public static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static int testCases, m, n, L, G, count, v, max = 999999999;
    public static int dp[][][][];
    public static int[][] hor, ver;
    
    public static void main(String args[]) throws Exception{
	    	StringTokenizer st;
	    	testCases = Integer.parseInt(br.readLine());
	    	count = 0;
	    	while(testCases-- > 0){
	    		st = new StringTokenizer(br.readLine(), " ");
	    		m = Integer.parseInt(st.nextToken());
	    		n = Integer.parseInt(st.nextToken());
	    		L = Integer.parseInt(st.nextToken());
	    		G = Integer.parseInt(st.nextToken());
	    		
	    		if(m == n) 
	    			count = 2*m-3;
	    		else 
	    			count = Math.min(m, n)*2-2;
	    		
	    		dp = new int[m][n][count+1][2];
	    		hor = new int[m][n];
	    		ver = new int[m][n];
	    		for(int i = 0; i < m; i++){
	    			st = new StringTokenizer(br.readLine(), " ");
	    			for(int j = 1; j < n; j++) 
	    				hor[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    		for(int i = 1; i < m; i++){
	    			st = new StringTokenizer(br.readLine(), " ");
	    			for(int j = 0; j < n; j++) 
	    				ver[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    		for(int i = 0; i < m; i++){
	    			for(int j = 0; j < n; j++){
	    				for(int k = 0; k <= count; k++){
		    	    			dp[i][j][k][0] = -1;
		    	    			dp[i][j][k][1] = -1;
	    	    			}
	        		}
	    		}
	    		boolean find = false;
	    		for(int i = 1; i <= count; i++){
	    			v = Math.min(dfs(m-1, n-1, i, 1), dfs(m-1, n-1, i, 0));
	    			if(v <= G){
	    				bw.write((i+(m+n-2)*L)+"\n");
	    				find = true;
	    				break;
	    			}
	    		}
	    		if(!find) 
	    			bw.write("-1\n");
	    		
	    	}
	    bw.close();
    }
   
    public static int dfs(int currentY, int currentX, int K, int dir){
     	if(currentY == 0 && currentX == 0 && K == 0) 
     		return 0;
	    	if((K < 0 || currentY < 0 || currentX < 0) || ( currentY == 0 && currentX == 0 && K > 0)) 
	    		return max;
	    
	   
	    	if(dp[currentY][currentX][K][dir] == -1){
	    		if(dir == 1){		
	    			dp[currentY][currentX][K][1] = Math.min(dfs(currentY, currentX-1, K, 1),dfs(currentY, currentX-1, K-1, 0))+hor[currentY][currentX];
	    		}else{				
	    			dp[currentY][currentX][K][0] = Math.min(dfs(currentY-1, currentX, K, 0),dfs(currentY-1, currentX, K-1, 1))+ver[currentY][currentX];
	    		}
	    	}
	    	return dp[currentY][currentX][K][dir];
    }
}
