package al7568;

import java.util.Scanner;

public class al7568 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt(); 
		al[] person=new al[n];
		
		for(int i=0; i<n; i++) {
			int w=sc.nextInt();
			int h=sc.nextInt();
			person[i]=new al(w,h);
		}
	
//		for(int i=0; i<n; i++) {
//			System.out.println(person[i].weight+" / " + person[i].height);
//		}
		
		for (al p1 : person) {
			for (al p2 : person) {
				if (p1.weight < p2.weight && p1.height < p2.height) {
					p1.rank++;
				}
			}
		}
		
		for(al p : person) {
			System.out.print(p.rank+" ");
		}
	}
	
	public static class al{
		
		int height;
		int weight;
		int rank;
		
		public al(int weight,int height) {
			this.height=height;
			this.weight=weight;
			this.rank=1;
		}
		
		
		
	}
}
