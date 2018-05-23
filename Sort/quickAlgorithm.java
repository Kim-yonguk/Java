package Sort;

import java.util.Scanner;

public class quickAlgorithm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		qSort(arr,0,arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void qSort(int arr[],int start,int end) {
		
		if(start>=end) {
			return;
		}
		int key=start;
		int i=start+1,j=end,tmp;
		
		
		while(i<=j) {
			while(i<=end && arr[i]<=arr[key]) {
				i++;
			}
			while(arr[j]>=arr[key] && j>start) {
				j--;
			}
			
			if(i>j) {
				tmp=arr[j];
				arr[j]=arr[key];
				arr[key]=tmp;
			}else {
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		
		qSort(arr,start,j-1);
		qSort(arr,j+1,end);
	}
}
