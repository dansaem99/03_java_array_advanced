package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */
//2023-08-21 19:43
public class ArrayEx27_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		int playIdx = 0;
		
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) playIdx = i;
		}
		
		while (true) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) System.out.println("옷");
				else System.out.print(game[i] + " ");				
			}
			System.out.println();
			
			System.out.print("왼쪽(1) 오른쪽(2) 종료(3) : ");
			int move = scan.nextInt();
			
			if (move == 1) {
				if (playIdx - 1 >= 0) {
					if (playIdx - 1 == 1) {
						System.out.print("격파 (3) : ");
						int punch = scan.nextInt();
						if (punch != 3) continue;
					}
					
					game[playIdx - 1] = 2;
					game[playIdx] = 0;
					playIdx--;
				}
			}
		}
	}
	
}
