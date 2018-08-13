
import java.util.Scanner;

public class problemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0; i<testCases; i++) {
			int h=sc.nextInt();	///높이
			int w=sc.nextInt();	///층당 객실수 
			int num=sc.nextInt();	///몇번째 손님인지
			
			process(h,w,num);
		}
		sc.close();
	}
	
	public static void process(int h,int w,int num) {
		
		String floor=String.valueOf(num%h);
		String roomNumber=String.valueOf(num/h+1);
		
		if(floor.equals("0")) {	// 	꼭대기층 일 경우
			floor=String.valueOf(h);
			roomNumber=String.valueOf(num/h);
		}
		
		if(roomNumber.length()==1) {			////호수가 한자리일경우 앞에 0 붙여줌
			roomNumber="0"+roomNumber;
		}
		
		String result=floor+roomNumber;
		
		System.out.println(result);
	}
}
