package StackFairTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		Stack stack=new Stack(input.length());
		
		int loopCount=0;
		for(loopCount=0; loopCount<input.length(); loopCount++) {
			char ch=input.charAt(loopCount);
			boolean isIncorrect = false;
			
			switch(ch) {
				case '(': case'{' : case '[':
					stack.push(ch);
					break;
					
				case ')' :
					if(stack.isEmpty()|| (ch=stack.pop())!='(') {
						isIncorrect=true;
					}
					break;
				
				case '}' :
					if(stack.isEmpty() || (ch=stack.pop()) != '(') {
						isIncorrect=true;
					}
					break;
				case ']' :
					if(stack.isEmpty() || (ch=stack.pop()) != '(') {
						isIncorrect=true;
					}
					break;
			}
			if(isIncorrect) {
				break;
			}
		}
		
		if(stack.isEmpty() && loopCount==input.length()) {
			System.out.println("Correct");
		}else {
			System.out.println("InCorrect");
		}
		
		
	}
}
