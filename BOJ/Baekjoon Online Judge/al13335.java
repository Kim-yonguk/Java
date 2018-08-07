
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  /*
  before -> bridge[] -> after 로 보내면서 해결
  
  */

	static int n;			//트럭수
	static int weight;		//최대중량
	static int len;			//다리 길이
	
	static ArrayList<Integer> before;	///맨처음 트럭 리스트
	static ArrayList<Integer> after;		///다리 건넌 트럭 리스트
	
	static int bridge[];		///다리 각 칸에 대한 중량 표시
	
	
	public static int getSum() {      ///현재 다리위에 있는 트럭의 중량 합계
		int sum=0; 
		for(int i=0; i<bridge.length; i++) {
			sum+=bridge[i];
		}
		return sum;
	}
	
	public static boolean checkRemain(int w) {    /// 다리위에 트럭을 더 올릴수 있는지 체크하는 함수
		return weight-getSum()-w>0;
	}
	
	public static void moveArray() {      ///bridge배열을 한칸씩 미룸 
		if(bridge[len-1]!=0) {  ///배열의 맨마지막값이 0 이 아니면 after로 보내고 그 배열을 0으로 초기화
			after.add(bridge[len-1]);
			bridge[len-1]=0;
		}
		for(int i=len-1; i>0; i--) {  ///그 배열을 0으로 초기화하고나서 한칸씩 미룸
			bridge[i]=bridge[i-1];
			bridge[i-1]=0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		len=sc.nextInt();
		weight=sc.nextInt();
		
		bridge=new int[len];
		
		before=new ArrayList<Integer>();
		after=new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp=sc.nextInt();
			before.add(tmp);
		}
		
		int cnt=0;
		while(after.size()!=n) {      ///트럭 전체가 after로 갈때까지 반복
			moveArray();
			if(before.size()!=0 && checkRemain(before.get(0)){    ///before 배열에 값이 남아있고 다리위에 트럭이 더 올라갈수 있을때 실행
				if(bridge[0]==0) {
					bridge[0]=before.get(0);
					before.remove(0);
				}
			}
			cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
