package al1427;

import java.util.Scanner;

public class al1427 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		int max=1000000;
		int arr[]=new int[max];
		int i=0;
		int size=0;
		while(n>10) {
			arr[i]=n%10;
			i++;
			n=n/10;
			size++;
		}
		arr[i]=n;
		size++;
		
		
		a(arr,size);
		
		
		for(int j=0; j<size; j++) {
			System.out.print(arr[j]);
		}
		
		
	}
	
	public static int[] a(int arr[],int size) {
		
		for(int q=0; q<size; q++) {
			for(int w=q+1; w<size; w++) {
				if(arr[q]<arr[w]) {
					int temp=arr[q];
					arr[q]=arr[w];
					arr[w]=temp;
				}
			}
		}
		return arr;
	}
}
