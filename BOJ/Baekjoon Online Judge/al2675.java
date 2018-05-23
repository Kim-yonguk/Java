package algorithm2675;

import java.util.Scanner;

public class al2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		String[] s =new String[num];
		StringBuffer bu= new StringBuffer("");
		
		int[] n= new int[num];
		for(int i=0; i<num; i++) {
			n[i]=sc.nextInt();
			s[i]=sc.next();
		}
		
		
		for(int i=0; i<num; i++) {
			for(int k=0; k<s[i].length(); k++) {
			for(int j=0; j<n[i]; j++) {
				bu.append(s[i].charAt(k));
			}
			}
			System.out.println(bu);
			bu.delete(0,bu.length());
		}
	}

}
