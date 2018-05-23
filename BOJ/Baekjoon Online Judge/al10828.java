package algorithm10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class al10828 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		
		Stack<Integer> stack = new Stack<>();


		while(num>0) {

			String line=br.readLine();
			StringTokenizer st= new StringTokenizer(line, " ");

			while(st.hasMoreTokens()) {
				String command=st.nextToken();

				switch(command) {

				case "push" :
					stack.push(Integer.parseInt(st.nextToken()));
					break;

				case "top" :
					if(!stack.isEmpty()) {
						System.out.println(stack.peek());
					}
					else
						System.out.println("-1");

					break;

				case "pop" :    
					if(!stack.isEmpty()){
						System.out.println(stack.pop());
					}
					else
						System.out.println(-1);
					break;

				case "size" :    
					System.out.println(stack.size());
					break;

				case "empty" :
					if(stack.isEmpty()){
						System.out.println(1);
					}
					else
						System.out.println(0);
					break;
				}
				num--;
			}
		}

		br.close();
	}
}

