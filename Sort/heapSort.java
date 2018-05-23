package Sort;

public class heapSort {
	public static void main(String[] args) {
		int arr[]= {1234,3,12,3,5,6,78};
		int size=arr.length;
		heapSort h=new heapSort(arr,size);
		h.heap_sort();
	}
	private int arr[];
	private int heapSize;
	
	public heapSort(int arr[],int size) {
		this.arr=arr;
		this.heapSize=size;
	}
	
	public void heap_sort() {
		for(int i=heapSize/2; i>=0; i--) {
			max_heapify(i);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(DownHeap()+" ");
		}
	}

	private int DownHeap() {
		int max=arr[0];
		arr[0]=arr[--heapSize];
		max_heapify(0);
		return max;
	}

	private  void max_heapify(int i) {
		// TODO Auto-generated method stub
		int left=i*2+1;
		int right=i*2+2;
		int max;
		
		if(left<heapSize) {
			if(arr[left]>arr[i]) {
				max=left;
			}else {
				max=i;
			}
		}else {
			return;
		}
		
		if(right<heapSize) {
			if(arr[right]>arr[max]) {
				max=right;
			}
		}
		if(max!=i) {
			Swap(max,i);
			max_heapify(max);
		}
	}

	private  void Swap(int max, int i) {
		// TODO Auto-generated method stub
		int tmp=arr[max];
		arr[max]=arr[i];
		arr[i]=tmp;
	}

	
	
}
