
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCases=Integer.parseInt(br.readLine());
		
		while(testCases-- > 0) {
			int n=Integer.parseInt(br.readLine());
			ArrayList<Integer> arrList=new ArrayList<>();
			int arr[];
			int cnt=0;
			int count=0; 
//			for(int i=1; i<=Math.sqrt(n); i++) {
//				if(n%i==0) {
//					cnt+=2;
//				}
//			}
//			arr=new int[cnt];
//			int index=0;
//			
			for(int i=1; i<=Math.sqrt(n); i++) {
				if(n%i==0) {
					arrList.add(i);
					arrList.add(n/i);
				}
			}
		
			
			int begin=0;
			int end=1;
			
			while(begin<arrList.size() || end<arrList.size()) {
				int rs=process(arrList.get(begin),arrList.get(end));
				
				if(rs==n) {
					count+=2;
				}
					
				begin+=2;
				end+=2;
			}

			System.out.println(count/2);
		}
		br.close();
	}
	
	 public static int gcd(int a, int b) {
		  if (b == 0)
		   return a;
		  else
		   return gcd(b, a % b);
	 }
		
	
	public static int process(int a,int b) {
		int gc=gcd(a,b);
		int result=(a*b)/gc;
		
		return result;
	}
}
