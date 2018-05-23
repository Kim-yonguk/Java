package al10845;

import java.util.Scanner;

public class al10845 {

	public static void main(String[] args) {
		
		al10845 main=new al10845();
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		Queue q = new Queue();
		for(int i=0; i<n; i++) {
			String s= sc.next();
			
			switch (s) {
			case "push":
				int num=sc.nextInt();
				q.push(num);
				break;
				
			case "pop":
				q.pop();
				break;
				
			case "size":
				q.size();
				break;
				
			case "empty":
				q.empty();
				break;
				
			case "front":
				q.front();
				break;
				
			case "back":
				q.back();
			}
		}
	}
	
	public static class Queue{
		int count=0;
		Node back;
		Node front;
		
		public void push(int n) {
			Node newNode=new Node(n);
			if(front==null) {
				front=newNode;
				back=newNode;
			}else {
				back.next=newNode;
				back=newNode;
			}
			count++;
		}
		
		public void pop() {
			Node temp=front;
			if(temp==null) {
				System.out.println("-1");
				return;
			}
			if(front.next==null) {
				front=null;
				back=null;
			}else {
				front=front.next;	
			}
			count--;
			System.out.println(temp.data);
		}
		
		public void size() {
			System.out.println(count);
		}
		
		public void empty() {
			if(front==null) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
		public void front() {
			if(front==null) {
				System.out.println("-1");
			}else {
			System.out.println(front.data);
			}
		}
		public void back() {
			if(back==null) {
				System.out.println("-1");
			}else {
				System.out.println(back.data);
			}
		}
		
		
		
		class Node{
			int data;
			Node next;
			
			Node(int n){
				this.data=n;
			}
		}
	}
}
