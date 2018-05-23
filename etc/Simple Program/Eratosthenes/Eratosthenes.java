package primeCheck;

public class Eratosthenes {

	public static void main(String[] args) {
		int arr[]=new int[10001];
		
		for(int i=2; i<10001; i++) {
			arr[i]=i;
		}
		
		for(int i=2; i<10001; i++) {
			if(arr[i]==0) {
				continue;
			}
			for(int j=i+i; j<10001; j+=i) {
				arr[j]=0;
			}
		}
		
		for(int i=2; i<10001; i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
