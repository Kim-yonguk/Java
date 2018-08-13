
import java.util.LinkedList;
import java.util.Scanner;

public class al1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int QueueSize=sc.nextInt();
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		
		CircleQueue cq = new CircleQueue(QueueSize, arr);
		
		System.out.println(cq.getCount());
	}
	
	static class CircleQueue{
		LinkedList<Integer> list = new LinkedList<Integer>();
		int count=0;
		int arr[];
		
		CircleQueue(int size,int arr[]){
			for(int i=1; i<=size; i++) {
				list.add(i);
			}
			this.arr=arr;
			start();
		}
		
		
		public void start() {
			for(int i=0; i<arr.length; i++) {
				operate(arr[i]);
			}
		}
		
		public void operate(int n) {
			while(true) {
				int a=list.indexOf(n);
				int size=list.size();
				int left=a;
				int right=size-a-1;
				
				if(left==0) {
					list.remove(a);
					break;
				}else if(left<=right){
					list.addLast(list.removeFirst());
					count++;
				}else {
					list.addFirst(list.removeLast());
					count++;
					
				}
			}
		}
		
		public int getCount() {
			return count;
		}
		
	}
}
