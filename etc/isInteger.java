package checkingProgram;

import java.util.Scanner;

public class isInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean result=isInteger(str);
		System.out.println(result);
	}
	
	public static boolean isInteger(String str) {
		byte Byte[]=str.getBytes();
		for(int i=0; i<str.length(); i++) {
			if(!(Byte[i]>47 && Byte[i]<58)) {
				return false;
			}
		}
		return true;
	}
	
}
