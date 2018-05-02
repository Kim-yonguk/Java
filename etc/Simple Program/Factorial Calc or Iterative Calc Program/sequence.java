package FactorialCalcGUI;

public class sequence {

	public int computeIterative(int n) {
		int result=1;
		for(int i=n; i>=1; i--) {
			result*=i;
		}
		return result;
	}
	
	public int computeRecursive(int n) {
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else {
			return n*computeRecursive(n-1);
		}
	}
}
