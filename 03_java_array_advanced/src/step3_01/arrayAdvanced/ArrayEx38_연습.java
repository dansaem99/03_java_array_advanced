package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("인덱스1 입력 : ");
			int idx1 = scan.nextInt();
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("인덱스2 입력 : ");
				int idx2 = scan.nextInt();
				System.out.println(arr[idx1][idx2]);
				break;
			}
			break;
		}
		System.out.println();
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int value = scan.nextInt();
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (value == arr[i][j]) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 출력 : " + idx1 + "\n인덱스2 출력 : " + idx2);
		System.out.println();
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		idx1 = 0;
		idx2 = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 출력 : " + idx1 + "\n인덱스2 출력 : " + idx2);
		System.out.println();
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("값1 : ");
		int value1 = scan.nextInt();
		System.out.print("값2 : ");
		int value2 = scan.nextInt();
		
		int i1 = 0;
		int i2 = 0;
		int j1 = 0;
		int j2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (value1 == arr[i][j]) {
					i1 = i;
					j1 = j;
				}
				
				if (value2 == arr[i][j]) {
					i2 = i;
					j2 = j;
				}
			}
		}
		
		int temp = arr[i1][j1];
		arr[i1][j1] = arr[i2][j2];
		arr[i2][j2] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();



	}

}
