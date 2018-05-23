package algorithm7516;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class al7516 {
	
	public al7516() {}

	static ArrayList<Integer>  xList = new ArrayList<Integer>();
	static ArrayList<Integer>  yList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int x,y;
		
		al7516 main=new al7516();
		
		Scanner sc = new Scanner(System.in);
		
		int caseNum;
		
		caseNum=sc.nextInt();
		int[] Count=new int[caseNum];
		
		for(int i=0; i<caseNum; i++) {
			Count[i]=sc.nextInt();
			
		}
		for(int i=0; i<caseNum; i++) {
			System.out.println("Scenario #"+caseNum+":");
			main.test(Count[i]);
			xList.clear();
			yList.clear();
			
		}
	}
	
	public static void test(int testNum) {
		for(int x=1; x<=10000; x++) {
			for(int y=1; y<=10000; y++) {
				
				if(((x*y)/(x+y))==testNum && (x*y)%(x+y)==0 && x<=y) {
					//System.out.println(testNum+"aaaa"+(x*y)/(x+y)+"aaaaa"+x+"aaaa"+y);
					xList.add(x);
					yList.add(y);
					
					
				}
				
			}
		}
		// HashSet 데이터 형태로 생성되면서 중복 제거됨
		HashSet hs = new HashSet(xList);

		// ArrayList 형태로 다시 생성
		ArrayList<Integer> newxList = new ArrayList<Integer>(hs);

		System.out.println(newxList.size());
	}

}
