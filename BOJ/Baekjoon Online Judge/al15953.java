
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		
		int arr1[]= {0,5000000,3000000,3000000,2000000,2000000,2000000,500000,500000,500000,500000,
				300000,300000,300000,300000,300000,100000,100000,100000,100000,100000,100000};
		int arr2[]= {0,5120000,2560000,2560000,1280000,1280000,1280000,1280000,640000,640000,640000,
				640000,640000,640000,640000,640000,320000,320000,320000,320000,320000,320000,
				320000,320000,320000,320000,320000,320000,320000,320000,320000,320000};
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			process(n1,n2,arr1,arr2);
		}
		
		
	}

	private static void process(int n1, int n2,int arr1[],int arr2[]) {
		// TODO Auto-generated method stub
	
		int rs1=0;
		int rs2=0;
		if(n1>=1 && n1<=21) {
			rs1=arr1[n1];
		}
		if(n2>=1 && n2<=31) {
			rs2=arr2[n2];
		}
		
		
		int result=rs1+rs2;
		System.out.println(result);
		
	}
}
