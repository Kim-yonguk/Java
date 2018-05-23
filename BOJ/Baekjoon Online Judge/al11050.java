package al11050;

import java.util.Scanner;

public class al11050 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int result = test(a)/(test(a-b)*test(b));
		
		System.out.println(result);
	}
	
    public static int test(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return test(n - 1) * n;
    }
}
