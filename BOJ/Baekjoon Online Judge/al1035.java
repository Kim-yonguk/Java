
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class al1035 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
	public static void main(String[] args) throws IOException {
		char[][] map = new char[5][5];
	    	int[] P = new int[5];
	    	int p = 0, i, j;
	    	for(i = 0; i < 5; i++){
	    		map[i] = getStr();
	    		for(j = 0; j < 5; j++) if(map[i][j] == '*') P[p++] = i*5+j;
	    	}
	    	
	    	int[] A = new int[p];
	    System.out.println(sol(p, 0, A, P)+"");
	    
			
		
	}
	
	static int sol(int p, int k, int[] A, int[] P){
    	int i, j, f, y, x, MIN = 9999;
    	if(p == k){
    		int[] chk = new int[25];
    		Queue<Integer> q = new LinkedList<Integer>();
    		q.offer(A[0]);
    		f = 0;
    		chk[A[0]] = 1;
    		while(!q.isEmpty()){
    			i = q.poll();
    			y = i/5;
    			x = i%5;
    			f++;
    			if(y+1 < 5 && chk[5*(y+1) + x] != 1){
    				for(j = 0; j < p; j++){
    					if(A[j] != 5*(y+1) + x) continue;
    					chk[5*(y+1) + x] = 1;
    					q.offer(5*(y+1) + x);
    				}
    			}
    			if(y-1 >= 0 && chk[5*(y-1) + x] != 1){
    				for(j = 0; j < p; j++){
    					if(A[j] != 5*(y-1) + x) continue;
    					chk[5*(y-1) + x] = 1;
    					q.offer(5*(y-1) + x);
    				}
    			}
    			if(x+1 < 5 && chk[5*y + (x+1)] != 1){
    				for(j = 0; j < p; j++){
    					if(A[j] != 5*y + (x+1)) continue;
    					chk[5*y + (x+1)] = 1;
    					q.offer(5*y + (x+1));
    				}
    			}
    			if(x-1 >= 0 && chk[5*y + (x-1)] != 1){
    				for(j = 0; j < p; j++){
    					if(A[j] != 5*y + (x-1)) continue;
    					chk[5*y + (x-1)] = 1;
    					q.offer(5*y + (x-1));
    				}
    			}
    		}
    		return (f == p) ? 0 : 9999;
    	}
    	for(i = 0; i < 25; i++){
    		f = 0;
    		for(j = 0; j < k; j++){
    			if(A[j] != i) continue;
    			f = 1;
    		}
    		if(f == 1) continue;
    		A[k] = i;
    		MIN = Math.min(Math.abs(P[k]/5 - i/5) + Math.abs(P[k]%5 - i%5)
    			+ sol(p, k+1, A, P), MIN);
    	}
    	return MIN;
    }
	
	static void getToken() throws IOException{
	    	if(st != null && st.hasMoreTokens()) return;
	    	st = new StringTokenizer(br.readLine(), " ");
    }
	
	 static char[] getStr() throws IOException{
	    	getToken();
	    	return st.nextToken().toCharArray();
	 }
	
}
