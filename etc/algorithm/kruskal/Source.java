package kruskal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Source {

	static int N; // 정점의 개수
	static int E; // 간선의 개수
	static PriorityQueue<A> pq; // 간선 값을 Min Heap 으로 하는 우선순위 큐
	static int[] parent;   // disjoint-set(union find)에서 필요한 부모 노드를 저장하는 배열
	static boolean[] visit; //방문 여부 배열
	static int result; //결과 값 저장
	
	public static int find(int a) {
		if(a==parent[a]) return a;
		parent[a]=find(parent[a]);
		return parent[a];
	}
	
	public static void union(int a, int b){
        int aRoot = find(a);
        int bRoot = find(b);
        if(aRoot != bRoot){
            parent[aRoot] = b;
        } else {
            return;
        }
    }
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		E = Integer.valueOf(br.readLine());
		
		parent=new int[N+1];
		visit=new boolean[N+1];
		result=0;
		
		pq=new PriorityQueue<A>();
		
		String []tempStr;
		
		for(int i=0; i<E; i++) {
			tempStr=br.readLine().split(" ");
			pq.add(new A(Integer.valueOf(tempStr[0]),Integer.valueOf(tempStr[1]),Integer.valueOf(tempStr[2])));
		}
		
		for(int i=1; i<=N; i++) {
			parent[i]=i;
		}
		
		for(int i=0; i<E; i++) {
			A oneNode=pq.poll();
			int start=oneNode.s;
			int end=oneNode.e;
			
			int a=find(start);
			int b=find(end);
			
			if(a==b)
				continue;
			
			
			union(start,end);
			System.out.println(start+"<->"+end+" weight :  "+ oneNode.v);
			result+=oneNode.v;
			
		}
		System.out.println(result);
	}
}





