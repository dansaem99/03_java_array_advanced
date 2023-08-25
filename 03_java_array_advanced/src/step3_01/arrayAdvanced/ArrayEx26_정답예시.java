package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 oneToNine 배열에 저장하고,
 *    숫자 10~18은 tenToEightTeen 배열에 저장한다.
 */

public class ArrayEx26_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] oneToNine = new int[SIZE];
		int[] tenToEightTeen  = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			oneToNine[i] = i + 1;
			tenToEightTeen[i] = SIZE + (i+1);
		}
		
		for (int i = 0; i < 1000; i++) {
			int rIdx = ran. nextInt(SIZE);
			int temp = oneToNine[0];
			oneToNine[0] = oneToNine[rIdx];
			oneToNine[rIdx] = temp;
			
			rIdx = ran.nextInt(SIZE);
			temp = tenToEightTeen[0];
			tenToEightTeen[0] = tenToEightTeen[rIdx];
			tenToEightTeen[rIdx] = temp;
		}
		
		int question = 1;
		while (true) {
			
			if (question == 19) {
				System.out.println("\n- 모두 맞히셨습니다. 프로그램을 종료합니다. - ");
				break;
			}
			
			System.out.println("\n\n");
			for (int i = 0; i < SIZE; i++) {
				
				if (oneToNine[i] == -1) System.out.print("\t");
				else 					System.out.print(oneToNine[i] + "\t");
				
				if (i % 3 == 2) 	System.out.println("\n");
				
			}
			
			System.out.print("[" + question + "]의 인덱스 입력 : ");
			int tryAnswer = scan.nextInt();
			
			if (oneToNine[tryAnswer] == question) {
				
				if (1 <= question && question <= SIZE) oneToNine[tryAnswer] = tenToEightTeen[tryAnswer];
				else 								   oneToNine[tryAnswer] = -1;
				
				question++;
			}
			
			
		}
		scan.close();
	}
	
}
