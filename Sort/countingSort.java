package Sort;

public class countingSort {

	public static void main(String[] args) {
		
		int count[]=new int[6];
		int arr[]= {1,5,4,3,2
				,5,4,3,2,4
				,1,2,3,5,3
				,2,2,1,1,3};
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		
		for(int i=1; i<count.length; i++) {
			for(int j=0; j<count[i]; j++) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}
