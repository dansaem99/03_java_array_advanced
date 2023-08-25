package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx40_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[][] apt = { { 101, 102, 103 }, { 201, 202, 203 }, { 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, { 4100, 2000, 1000 }, { 3000, 1600, 800 } };

		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		for (int i = 0; i < pay.length; i++) {
			int tot = 0;
			for (int j = 0; j < pay[i].length; j++) {
				tot += pay[i][j];
			}
			System.out.println((i + 1) + ".층의 관리비 = " + tot + "원");
		}

		
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예 2) 입력 : 202 관리비 출력 : 2000
		
		System.out.print("호 입력 : ");
		int ho = scan.nextInt();

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == ho) {
					System.out.println(ho + "의 관리비 = " + pay[i][j] + "원");
				}
			}
		}

		
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int maxNum = pay[0][0];
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (maxNum < pay[i][j]) {
					maxNum = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("가장 많이 나온 집(" + apt[idx1][idx2] + ")");

		int minNum = pay[0][0];
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (minNum > pay[i][j]) {
					minNum = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("가장 적게 나온 집(" + apt[idx1][idx2] + ")");

		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.print("호1 입력 : ");
		int ho1 = scan.nextInt();
		System.out.print("호2 입력 : ");
		int ho2 = scan.nextInt();

		int i1 = 0; 
		int j1 = 0;
		int i2 = 0; 
		int j2 = 0;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == ho1) {
					i1 = i;
					j1 = j;
				}
				if (apt[i][j] == ho2) {
					i2 = i;
					j2 = j;
				}
			}
		}

		int temp = pay[i1][j1];
		pay[i1][j1] = pay[i2][j2];
		pay[i2][j2] = temp;
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}


	}

}
