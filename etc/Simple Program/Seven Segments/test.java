package Sevensegments;

public class test {
	static int [][] segInt={
			{1,1,1,1,1,1,0},{0,1,1,0,0,0,0},{1,1,0,1,1,0,1},
			{1,1,1,1,0,0,1},{0,1,1,0,0,1,1},{1,0,1,1,0,1,1},
			{1,0,1,1,1,1,1},{1,1,1,0,0,0,0},{1,1,1,1,1,1,1},
			{1,1,1,1,0,1,1}
	};
    public static void main(String[] args) {
        String input="20180514";
        int len=input.length();
        char arr[]=new char[len];
        for(int i=0; i<len; i++) {
        		arr[i]=input.charAt(i);
        }
        
        int arr2[]=new int[len];
        for(int i=0; i<len; i++) {
			arr2[i]=arr[i]-'0';
        }
        for(int i=0; i<len; i++) {
        		row1(arr2[i]);
        }
        System.out.println();
        for(int i=0; i<len; i++) {
    		row2(arr2[i]);
        }
        System.out.println();
        for(int i=0; i<len; i++) {
    		row3(arr2[i]);
        }
        System.out.println();
        for(int i=0; i<len; i++) {
    		row4(arr2[i]);
        }
        System.out.println();
        for(int i=0; i<len; i++) {
    		row5(arr2[i]);
        }
        System.out.println();
    }
    public static void row1(int i) {
    	
    		if(segInt[i][0]==1) {
			System.out.print(" _   ");
		}else {
			System.out.print("     ");
		}
    }
    
    public static void row2(int i) {
    	
	    	if(segInt[i][5]==1) {
				System.out.print("|");
			}else {
				System.out.print(" ");
			}
			
			if(segInt[i][1]==1) {
				System.out.print(" |  ");
			}else {
				System.out.print("    ");
			}
    }
    
    public static void row3(int i) {
	    	if(segInt[i][6]==1) {
				System.out.print(" _   ");
		}else {
				System.out.print("     ");
		}	
    }
    
    public static void row4(int i) {
	    	if(segInt[i][4]==1) {
				System.out.print("|");
		}else {
				System.out.print(" ");
		}
			
		if(segInt[i][2]==1) {
			System.out.print(" |  ");
		}else {
			System.out.print("    ");
		}
    }
    
    public static void row5(int i) {
	    	if(segInt[i][3]==1) {
			System.out.print(" _   ");
		}else {
			System.out.print("     ");
		}
    }
}
