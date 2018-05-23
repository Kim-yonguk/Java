package Prim;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;

public class MST {

	static int N;
	static int E;
	static ArrayList<Node> nodeList[];
	static boolean []visit;
	static int result;
	static ArrayList<Node> array=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		result=0;
		
		N=Integer.valueOf(br.readLine());
		E=Integer.valueOf(br.readLine());
		
		visit=new boolean[N+1];
		nodeList=new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			nodeList[i]=new ArrayList<Node>();
		}
		
		String tmpStr[];
		int start;
		int end;
		int value;
		
		
		for(int i=0; i<E; i++) {
			
			tmpStr=br.readLine().split(" ");
			
			start=Integer.valueOf(tmpStr[0]);
			end=Integer.valueOf(tmpStr[1]);
			value=Integer.valueOf(tmpStr[2]);
			
			nodeList[start].add(new Node(start,end,value));
			nodeList[end].add(new Node(end,start,value));
			
			
		}
		MST();
		System.out.println();
		
 
	}

	private static void MST() {
		// TODO Auto-generated method stub
		Comp cp=new Comp();
		
		PriorityQueue<Node> pq=new PriorityQueue<>(cp);
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(1);
		
		ArrayList<Node> tmpList;
		Node tmpNode;
		
		while(!dq.isEmpty()){
			int currentNode=dq.poll();
			visit[currentNode]=true;
			tmpList=nodeList[currentNode];
			for(int i=0; i<tmpList.size(); i++) {
				if(!visit[tmpList.get(i).e]) {
					pq.add(tmpList.get(i));
				}
			}
			
			
			while(!pq.isEmpty()) {
				tmpNode=pq.poll();
				
				if(!visit[tmpNode.e]) {
					visit[tmpNode.e]=true;
					result+=tmpNode.v;
					dq.add(tmpNode.e);
					break;
				}
			}
		}
		System.out.println(result);
	}
	
	
	private static void MST2() {
		Comp cp=new Comp();
		PriorityQueue<Node> queue=new PriorityQueue<>(cp);
		Deque<Integer> tmpqueue=new ArrayDeque<>();
		tmpqueue.add(1);
		
		ArrayList<Node> tmpList;
		Node tmpNode;
		
		while(!tmpqueue.isEmpty()) {
			int current=tmpqueue.poll();
			visit[current]=true;
			tmpList=nodeList[current];
			for(int i=0; i<tmpList.size(); i++) {
				if(!visit[tmpList.get(i).e]) {
					queue.add(tmpList.get(i));
				}
			}
			
			while(!queue.isEmpty()) {
				tmpNode=queue.poll();
				if(!visit[tmpNode.e]) {
					visit[tmpNode.e]=true;
					result+=tmpNode.v;
					tmpqueue.add(tmpNode.e);
					break;
				}
			}
		}
	}
}
