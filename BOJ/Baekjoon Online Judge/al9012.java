package algorithm9012;

import java.util.Scanner;
import java.util.Stack;

public class al9012 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			String test=sc.next();
			
			if(algo(test)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}


		}
		
		
		
	}
	
	static boolean algo(String st) {
		Stack stack=new Stack();
		char[] arr=st.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			char a = arr[i];
			
			switch(a) {
			
			case '(':
				stack.push(a);
				break;
				
			case ')':
				if(stack.isEmpty()) {
					return false;
				}else {
					while(true) {
						if(!stack.isEmpty() && (char)stack.peek()=='(') {
							stack.pop();
							break;
						}else if(!stack.isEmpty() && (char)stack.peek()==')'){
							return false;
							
						}
					}
					
					
				}
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		
		return true;
	}
}
