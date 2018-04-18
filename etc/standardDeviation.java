package standardDeviation;

import java.util.Scanner;

public class standardDeviation {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		double arr[]=new double[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextDouble();
		}
		
		standardDeviation(arr);
	}
	
	public static void standardDeviation(double arr[]) {
		double sum=0;
		double avg;
		double result=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=Math.pow(arr[i]-avg, 2);
		}
		
		result=Math.sqrt(sum/arr.length);
		System.out.println(result);
	}
}
