package algorithm1871;

import java.util.ArrayList;
import java.util.Scanner;

public class al1871 {
	
	int numSum=0;
	int stringSum=0;
	int value;
	ArrayList<String> st=new ArrayList<String>();
	public al1871() {}
	
	public static void main(String[] args) {
		al1871 main=new al1871();
		
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		String str[]=new String[num];
		
		for(int i=0; i<num; i++) {
			
			str[i]=sc.next();
		}
		for(int i=0; i<str.length; i++) {
			int test1=main.test1(str[i]);
			int test2=main.test2(str[i]);
			
			double v=Math.abs(test1-test2);
			if(v<=100) {
				System.out.println("nice");
			}
			else {
				System.out.println("not nice");
			}
		}
		
//	
//			String stringCase=sc.next();
//
//			//System.out.println(stringCase);
//			
//			int test1=main.test1(stringCase);
//			
//			int test2=main.test2(stringCase);
//			
//			double v=Math.abs(test1-test2);
//			
//			if(v<=100) {
//				System.out.println("nice");
//			}
//			else {
//				System.out.println("not nice");
//			}
//		}
		
		
	}
	public int test1(String stringCase) {
		
			char n1=stringCase.charAt(0);
			int cn1=change(n1);
			stringSum+=cn1*Math.pow(26, 2);
			
			char n2=stringCase.charAt(1);
			int cn2=change(n2);
			stringSum+=cn2*Math.pow(26, 1);
			
			char n3=stringCase.charAt(2);
			int cn3=change(n3);
			stringSum+=cn3*Math.pow(26, 0);
			
			return stringSum;
			
	}
	
	public int test2(String stringCase) {
		String clean1 = stringCase.replaceAll("[^0-9]", "");
		
		int n=Integer.parseInt(clean1);
		numSum+=n;
		
		
		return numSum;
	}
	
	public int change(char a) {
		
		switch(a) {
		case 'A':
			value=0;
			break;
		case 'B':
			value=1;
			break;
		case 'C':
			value=2;
			break;
		case 'D':
			value=3;
			break;
		case 'E':
			value=4;
			break;
		case 'F':
			value=5;
			break;
		case 'G':
			value=6;
			break;
		case 'H':
			value=7;
			break;
		case 'I':
			value=8;
			break;
		case 'J':
			value=9;
			break;
		case 'K':
			value=10;
			break;
		case 'L':
			value=11;
			break;
		case 'M':
			value=12;
			break;
		case 'N':
			value=13;
			break;
		case 'O':
			value=14;
			break;
		case 'P':
			value=15;
			break;
		case 'Q':
			value=16;
			break;
		case 'R':
			value=17;
			break;
		case 'S':
			value=18;
			break;
		case 'T':
			value=19;
			break;
		case 'U':
			value=20;
			break;
		case 'V':
			value=21;
			break;
		case 'W':
			value=22;
			break;
		case 'X':
			value=23;
			break;
		case 'Y':
			value=24;
			break;
		case 'Z':
			value=25;
			break;
			
			
		}
		
		return value;
	}
}
