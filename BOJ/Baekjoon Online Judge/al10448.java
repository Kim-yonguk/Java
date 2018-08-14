
import java.util.Scanner;

/*
 * 삼각수의 3개의 합을 인덱스로 boolean형 배열을 만들어서
 * 입력받은 숫자에 해당하는 인덱스가 배열에 true면 1을 리턴
 */
public class Main {
	
	static int arr[]=new int[46];	//Tn=(n*(n+1))/2 인데 1000을 넘는 지점은 45*46 구간
	static boolean check[]=new boolean[1001];	//입력값은 3~1000
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		
		arrCal();
		
		while(testCases-->0) {
			int n=sc.nextInt();
			process(n);
		}
		sc.close();
	}

	private static void process(int n) {		///입력받은 숫자에 해당하는 배열이 true면 1 출력 false면 0 출력
		// TODO Auto-generated method stub
		if(check[n]) {
			System.out.println(1);           
		}else {
			System.out.println(0);
		}
	}
	
	private static void arrCal() {
		for(int i=0; i<46; i++) {			///삼각수 계산
			arr[i]=(i*(i+1))/2;
		}
		for(int i=1; i<46; i++){				///삼각수의 합 
			for(int j=1; j<46; j++) {
				for(int k=1; k<46; k++) {
					int sum=arr[i]+arr[j]+arr[k];
					if(sum<1001)
						check[sum]=true;
				}
			}
		}
	}
}
