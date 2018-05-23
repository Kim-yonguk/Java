package al10866;

import java.util.Scanner;

public class al10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		al10866 main=new al10866();
		int n=sc.nextInt();
		
		Deque q= new Deque();
		for(int i=0; i<n; i++) {
			String s= sc.next();
			
			switch (s) {
			case "push_front":
				int num=sc.nextInt();
				q.push_front(num);
				break;
				
			case "push_back":
				int a=sc.nextInt();
				q.push_back(a);
				break;
				
			case "pop_front":
				q.pop_front();
				break;
				
			case "pop_back":
				q.pop_back();
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
				break;
			}
		}
		
	}
	
	public static class Deque{
		int count=0; //size,empty 체크
		Node front;
		Node back;
		
		public void push_front(int n) {
			Node newNode = new Node(n);
			if(front==null) {
				front=newNode;
				back=newNode;
			}else {
				Node temp;
				temp=front;
				newNode.next=front;
				front.prev=newNode;
				front=newNode;
			}
			count++;
		}
		public void push_back(int n) {
			Node newNode = new Node(n);
			if(front==null) {
				front=newNode;
				back=newNode;
			}else {
				back.next=newNode;
				newNode.prev=back;
				back=newNode;
			}
			count++;
		}
		public void pop_front() {
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
				front.prev=null;
			}
			count--;
			System.out.println(temp.data);
		}
		public void pop_back() {
			Node temp=back;
			
			if(back==null) {
				System.out.println("-1");
				return;
			}
			
			if(back.prev==null) {
				front=null;
				back=null;
			}
			else {
				back=back.prev;
				
			}
			count--;
			System.out.println(temp.data);
		}
		
		public void size() {
			System.out.println(count);
		}
		
		public void empty() {
			if(count==0) {
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
			Node next=null;
			Node prev=null;
			
			Node(int n){
				this.data=n;
			}
		}
	}
}
