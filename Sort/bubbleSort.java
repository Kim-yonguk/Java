package sort;

public class bubbleSort {

	public static void main(String[] args) {
			
			int arr[]=new int[4];
			arr[0]=254;
			arr[1]=3;
			arr[2]=213;
			arr[3]=64;
			
			bubble(arr);
	
	}

	private static void bubble2(int[] arr) {
	// TODO Auto-generated method stub
		
		for(int i=arr.length; i>0; i--) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
				for(int q:arr) {
					System.out.print(q+" ");
				}
				System.out.println();
			}
		}
	
}

	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int tmp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=tmp;
	}

	private static void bubble(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					
					for(int q:arr) {
						System.out.print(q+" ");
					}
					System.out.println();
				}
			}
		}
	}
	
	
}
