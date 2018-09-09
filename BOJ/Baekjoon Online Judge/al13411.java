
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 첫째 줄에 N이 주어진다. N은 100,000보다 작거나 같은 수이다.
 * 둘째 줄부터 총 N개의 줄에는 Xi , Yi , Vi 가 주어진다.
 * 이는 i번째 로봇의 x, y 좌표와 미사일이 이 로봇을 향해 날아가는 속도를 의미한다. (|Xi , Yi|≤10,000, 0＜Vi ≤1,000)
 * 입력값이 주어지는 대로 로봇이 나타난 순서를 의미하며, 맨 처음 나타난 로봇부터 1,2,3,...,N번째 로봇으로 지정한다. 
 * x좌표와 y좌표가 같은 곳에 로봇이 2개 이상 존재하는 경우는 없다.
 */
public class al13411 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Robot> arr=new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int v=sc.nextInt();
			Robot tmp=new Robot(i,x,y,v);
			arr.add(tmp);
		}
		
		arr.sort(new Comparator<Robot>() {
			@Override
			public int compare(Robot o1, Robot o2) {
				// TODO Auto-generated method stub
				if(o1.result<o2.result)
					return -1;
				else if(o1.result==o2.result)
					return 0;
				else
					return 1;
			}
		});
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).index+1);
		}
		
		sc.close();
	}
}

class Robot{
	int index;
	double result;
	
	public Robot(int n,int x,int y,int v) {
		this.index=n;
		this.result=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)))/v;
	}
}

