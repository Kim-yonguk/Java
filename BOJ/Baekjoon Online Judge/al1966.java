package BOJ;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 첫 줄에 test case의 수가 주어진다. 각 test case에 대해서 문서의 수 N(100이하)와 몇 번째로 
 * 인쇄되었는지 궁금한 문서가 현재 Queue의 어떤 위치에 있는지를 알려주는 M(0이상 N미만)이 주어진다. 
 * 다음줄에 N개 문서의 중요도가 주어지는데, 중요도는 적절한 범위의 int형으로 주어진다. 
 * 중요도가 같은 문서가 여러 개 있을 수도 있다. 
 * 
 * LinkedList에는 우선순위 저장, 큐에는 입력값과 인덱스를 함께 저장
 * 큐를 돌면서 가장 높은 우선순위를 구하고 그 값과 리스트에 있는 우선순위 값과 같으면 pop, 다르면 push 해준다
 * 반복문을 계속 돌다가 우선순위 값이 같고 인덱스가 현재 큐의 인덱스와 같으면 cnt 출력
 */
public class Main {
	
	static LinkedList<Integer> list=new LinkedList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		Queue<docu> q=new LinkedList<>();
		
		while(testCases-- > 0) {
			
			q.clear();
			list.clear();
			
			int size=sc.nextInt();
			int target=sc.nextInt();
			
			for(int i=0; i<size; i++) {
				int priority =sc.nextInt();
				q.offer(new docu(i,priority));
				list.add(priority);
			}
			Collections.sort(list);
			Collections.reverse(list);
			
			int cnt=0;
			
			while(!q.isEmpty()) {
				int max=getMax();
				//System.out.println("Max : "+max);
				docu d=q.poll();
				//System.out.println(d.index);
				
				if(d.priority==max) {
					if(d.index==target) {
						System.out.println(++cnt);
						break;
					}
					cnt++;
					list.remove(list.indexOf(max));
					continue;
				}
				q.offer(d);
					
			}
			
			
		}
		
		sc.close();
	}
	
	public static int getMax() {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<list.size(); i++) {
			if(max<list.get(i))
				max=list.get(i);
		}
		return max;
	}
}

class docu{
	int index;
	int priority;
	
	docu(int i,int p){
		this.index=i;
		this.priority=p;
	}
}
