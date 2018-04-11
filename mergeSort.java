package sort;

import java.util.Scanner;

public class mergeSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		mergeSort(arr,0,arr.length-1);
			
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

	private static void mergeSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j) {
			int middle=(i+j)/2;
			mergeSort(arr,i,middle);
			mergeSort(arr,middle+1,j);
			merge(arr,i,middle,j);
			
		}
		
		
		
	}

	private static void merge(int[] arr, int i, int middle, int j) {
		// TODO Auto-generated method stub
		int a=i;
		int b=middle+1;
		int t=1;
		int tmp[]=new int[arr.length+1];
		
		while(a<=middle && b<=j) {
			if(arr[a]<=arr[b]) {
				tmp[t++]=arr[a++];
			}else {
				tmp[t++]=arr[b++];
			}
		}
		
		while(a<=middle) {
			tmp[t++]=arr[a++];
		}
		while(b<=j) {
			tmp[t++]=arr[b++];
		}
		a=i;
		t=1;
		while(a<=j) {
			arr[a++]=tmp[t++];
		}
		
	}
}
