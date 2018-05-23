package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class al10989 {

	static int arr[];
	static int count[];
	
	static int max=0;
	static int index=0;
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws IOException {
		new al10989().process2();
	}
	
	
	public static void process1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine().trim());
		
		arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			int num=Integer.parseInt(br.readLine().trim());
			arr[i]=num;
			if(max<num) {
				max=num;
			}
		}
	}
	
	public static void process2() throws IOException {
		process1();
		int maxSize=max;
		
		count=new int[maxSize+1];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i=0; i<count.length; i++) {
			for(int j=0; j<count[i]; j++) {
				bw.write(i+"\n");
			}
		}
		bw.close();
	}
}
