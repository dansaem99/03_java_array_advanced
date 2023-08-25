package step3_01.arrayAdvanced;


/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx39_연습 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int width0 = 0;
		int width1 = 0;
		int width2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) width0 += arr[0][j];
				if (i == 1) width1 += arr[1][j];
				if (i == 2) width2 += arr[2][j]; 					
			}
		}
		System.out.print(width0 + ", " + width1 + ", " + width2);
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612



	}

}
