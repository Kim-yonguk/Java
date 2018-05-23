package algorithm10809;

import java.util.Scanner;

public class al10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		String[] alphabet= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
				"q","r","s","t","u","v","w","x","y","z"};
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(st.indexOf(alphabet[i])+" ");
		
		}
		
	}
}
