
public class selectionSort {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=4;
		arr[2]=3;
		arr[3]=9;
		
		selection(arr);
		

		for(int i:arr) {
			System.out.print(i);
		}
	}
	
	public static void selection(int arr[]) {
		
		int i,j;
		int index = 0;
		for(i=0; i<arr.length; i++) {
			int min=9999;
			for(j=i; j<arr.length; j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			int tmp=arr[i];
			arr[i]=arr[index];
			arr[index]=tmp;
		}
		
	}
}
