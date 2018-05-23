package Sort;

public class quickSort {
	static int arr[]={10,1,5,8,7,6,4,3,2,9};
	public static void main(String[] args) {
		
		
		sort(arr,0,arr.length-1);
		show();
	}
	public static void show() {
		   int i;
		   for(i = 0; i <arr.length; i++) {
		     System.out.print(arr[i]+" ");
		   }
		}
	private static void sort(int[] arr, int begin, int end) {
		
		if(begin>=end) {
			return;
		}
		
		int key=begin;
		int i=begin+1; int j=end; int tmp;
		
		while(i<=j) {
			while(i<=end && arr[i]<=arr[key]) {
				i++;
			}
			while(j>begin && arr[j]>=arr[key]) {
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
		
		sort(arr,begin,j-1);
		sort(arr,j+1,end);
	}
	
}
