
import java.util.Scanner;

public class insertSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		insertSort(arr);
		
	}


	public static void insertSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int tmp=arr[i];
			int aux=i-1;
			
			while(aux>=0 && tmp<arr[aux]) {
				arr[aux+1]=arr[aux];
				aux--;
			}
			arr[aux+1]=tmp;
		}
		
		for(int q:arr) {
			System.out.println(q);
		}
	}
}
