package algorithm6986;

import java.util.Arrays;
import java.util.Scanner;

public class al6986 {
	public al6986() {}
	

	public static void main(String[] args) {
		al6986 main=new al6986();
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		float[] test=new float[num];
		
		int etcNum=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			test[i]=sc.nextFloat();
		}
		Arrays.sort(test);
		
		main.Trimmed(test, num, etcNum);
		main.Adjusted(test, num, etcNum);
		
	}
	
	public void Trimmed(float[] arr,int num,int etcNum) {

		float result;
		float sum=0;
		int etc=num-(etcNum*2);
		for(int i=etcNum; i<num-etcNum; i++) {
			sum+=arr[i];
		}
		result=sum/etc;
		float result2=(float) (Math.round(result*100)/100f);

		System.out.printf("%.2f",result2);
		System.out.println();
	}
	
	public void Adjusted(float[] arr,int num,int etcNum) {
		
		float result;
		float sum=0;
		for(int i=etcNum; i<num-etcNum; i++) {
			sum+=arr[i];
		}
		sum+=arr[etcNum]*etcNum;
		sum+=arr[num-etcNum-1]*etcNum;
		
		result=sum/num;
		float result2=(float) (Math.round(result*100)/100f);
		System.out.printf("%.2f",result2);
		System.out.println();
		
	}
}
