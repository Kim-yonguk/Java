
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 백준 11067 
 * 모노톤길 => i 번째 카페와 i+1 번째 카페는 x좌표 또는 y좌표가 반드시 같다.
 * 1) x의 값에 따라 1차적으로 sort
 * 2) current x의 값이 같다면 |prevY - currentY| 가 작은 순서로 sort
 * Scanner 를 써서 했는데 시간초과 떠서 buffer사용하였음
 */
public class Main {

	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int cases,n,m,k,prevY;
	static int x,y,p;
	static Point point[];
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		cases=Integer.parseInt(br.readLine());
		while(cases-- > 0) {
			n=Integer.parseInt(br.readLine());
			point=new Point[n];
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine()," ");
				x=Integer.parseInt(st.nextToken());
				y=Integer.parseInt(st.nextToken());
				point[i]=new Point(x,y);
			}
			Arrays.sort(point);
			prevY=0;
			
			
			for(int i=0; i<n; i++) {
				for(p=i; p<n; p++) {
					if(point[i].x<point[p].x)	{	///x의 값이 변경될때 변경되기 전 인덱스 확인
						break;
					}
					point[p].prevY=prevY;
				}
				Arrays.sort(point,i,p);			///x의 값이 동일할때는 가장 가까운 순으로 sort =>Math.abs사용
				prevY=point[p-1].y;				///prevY에는 바뀌는 직전 y값을 저장
				i=p-1;							///i++ 되니까 -1을 해줌
			}
			st=new StringTokenizer(br.readLine()	, " ");
			m=Integer.parseInt(st.nextToken());
			for(int i=0; i<m; i++) {
				k=Integer.parseInt(st.nextToken())-1;
				bw.write(point[k].x+" "+point[k].y+"\n");
			}
		}
		bw.close();
	}



	static class Point implements Comparable<Point>{
		int x;
		int y;
		int prevY;
		
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
			prevY=y;
		}
	
		@Override
		public int compareTo(Point o) {		///x값 기준으로 오름차순 정렬
			if(x<o.x)
				return -1;
			
			else if(x==o.x) {
				int tmp1=Math.abs(y-prevY);
				int tmp2=Math.abs(o.y-o.prevY);
				
				if(tmp1<tmp2)
					return -1;
				else if(tmp1==tmp2) 
					return 0;
				else
					return 1;
			}
			else
				return 1;
		}
	}
}
