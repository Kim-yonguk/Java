package al1780;

import java.util.Scanner;

public class al1780 {
	static int count_a, count_b, count_c;


	public static void main(String[] args) {
		count_a = count_b = count_c = 0;
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int matrix[][] = new int[size][size];
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++)
				matrix[i][j] = sc.nextInt();
		
		min_paper(matrix, size, 0, 0);
		
		System.out.println(count_a);
		System.out.println(count_b);
		System.out.println(count_c);


		
		
		
	}
	
	static void min_paper(int[][] arr, int n, int x, int y) 
	{
		int i, j, tmp;
		boolean is_same = true;

		// n이 1일때 까지 작아지면, 그 값을 카운트해주고 함수를 종료한다.
		if (n == 1) 
		{
			add(arr[x][y]);
			return;
		}
		else 
		{
			// 행렬 전체가 같은 값을 가지는지 확인하는 부분
			tmp = arr[x][y];
			for (i = 0; i < n; i++)
				for (j = 0; j < n; j++)
					if (arr[x + i][y + j] != tmp)
						is_same = false;

			// 모두 같은 값을 가지면, 해당 변수 값을 증가시키고 종료
			if (is_same) 
			{
				add(tmp);
				return;
			}
			// 모두 같지 않으면, 9등분으로 나누어서 각각 재귀함수 호출
			else 
			{
				for (i = 0; i < n; i += n/3)
					for (j = 0; j < n; j += n/3)
						min_paper(arr, n/3, x + i, y + j);
			}
		}
	}
	static void add(int a) 
	{
		if (a == -1)
			++count_a;
		else if (a == 0)
			++count_b;
		else if (a == 1)
			++count_c;
	}

}
