package step3_01.arrayAdvanced;

import java.util.Scanner;

public class ArrayEx35연습 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = null;
		int elementCnt = 0;
		
		while (true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[어레이리스트 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(데이터)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) { // 추가를 선택할 때 
				if (elementCnt == 0) { // idx가 없을 때
					arr = new int[elementCnt + 1]; // 배열을 1개 만들어준다.
				} else if (elementCnt > 0) { // idx가 1개이상일때
					int[] temp = arr; // arr에 기존 있는 배열을 temp에 넣어준다.
					arr = new int[elementCnt + 1]; // arr에 추가할 idx를 자리를 만들어준다.
					
					for (int i = 0; i < elementCnt; i++) { 
						arr[i] = temp[i]; //arr에 temp배열을 맞춘다.
					}
					
					temp = null; //temp를 없애준다.
				}
				System.out.print("[추가]데이터 입력 : ");
				int data = scan.nextInt(); // 추가할 데이터를 입력한다.
				
				arr[elementCnt] = data; // arr에 추가할 데이터를 추가한다.
				elementCnt++; // 1개씩 추가한다.
			}
			else if (sel == 2) { //삭제할때
				System.out.println("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt(); // 삭제할 인덱스를 입력한다.
				
				if (elementCnt - 1 < delIdx || delIdx < 0) { // idx가 0이하이든 arr에 있는 배열보다 많은 idx를 입력하면 찾을 수 없다.
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if (elementCnt == 1) {
					arr = null; // 삭제할 idx가 하나밖에 없으면 그냥 없애버린다.
				}
				else if (elementCnt > 1) {
					int[] temp = arr; // temp배열에 arr를 넣은다.
					arr = new int[elementCnt - 1]; // arr에 자리 하나를 빼준다.
					
					for (int i = 0; i < delIdx; i++) {
						arr[i] = temp[i]; // arr에 temp의 배열을 넣은다.
					}
					for (int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = temp[i + 1]; // 삭제할거 삭제하고 남은 배열을 temp에 넣었으니 arr배열에 넣어준다.
					}
					temp = null; //temp는 없애준다.
				}
				elementCnt--; // 배열 자리 하나를 없애준다.
			}
			else if (sel == 3) { //삭제할 데이터를 선택했을때
				System.out.print("[삭제]데이터 입력 : ");
				int delData = scan.nextInt(); // 삭제할 데이터를 입력한다.
				
				int delIdx = -1; 
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == delData) { // 삭제한 데이터가 arr에 있다면
						delIdx = i; // 삭제할 인덱스를 받는다.
					}
				}
				
				if (delIdx == -1) {
					System.out.println("[메세지]입력하시 데이터는 존재하지 않습니다.");
					continue;
				} // 삭제할 데이터가 arr데이터에 없다면 점프한다.
				
				if (elementCnt == 1) {
					arr = null;
				} // 삭제할 데이터가 하나밖에 없다면 그냥 null처리 해준다.
				else if (elementCnt > 1) {
					int[] temp = arr; // temp배열에 arr배열을 넣어준다.
					arr = new int[elementCnt - 1]; // arr은 배열 자리 하나를 없애준다.
					
					int j = 0;
					for (int i = 0; i < elementCnt; i++) {
						if (i != delIdx) { 
							arr[j++] = temp[i]; // 삭제하고 남은 배열을 arr에 넣어준거다. 
						}
					}
					temp = null; //temp는 없애준다.
				}
				elementCnt--; // idx를 하나 없애준다.
			}
			else if (sel == 4) { // 삽입할 인덱스를 선택할때
				System.out.println("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt(); //삽입할 인덱스를 입력한다.
				
				if (elementCnt < insertIdx || insertIdx < 0) {
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;
				} // 삽입할 인덱스가 만약 0보다 작든지 기존에 있는 인덱스보다 큰 값을 적어주면 점프한다.
				
				System.out.println("[삽입]데이터 입력 : ");
				int insertData = scan.nextInt(); // 산입할 데이터를 입력해준다.
				
				if (elementCnt == 0) {
					arr = new int[elementCnt + 1];
				} // 삽입할 idx가 0일때 idx 자리를 늘려준다.
				else if (elementCnt > 0) { // idx가 0보다 클때
					int[] temp = arr; // temp의 배열을 만들어 arr의 배열을 넣어준다.
					arr = new int[elementCnt + 1]; // arr배열 자리를 하나 만들어준다.
					
					int j = 0;
					
					for(int i = 0; i < elementCnt + 1; i++) {
						if (i != insertIdx) {
							arr[i] = temp[j++]; // temp의 배열을 arr에 넣어준다.
						}
					}
					temp = null; // temp의 배열을 없애준다.
				}
				
				arr[insertIdx] = insertData; // arr에 입력한 idx자리에 내가 입력한 데이터를 넣어준다.
				elementCnt++; // 자리를 하나늘려준다.
			}
			else if (sel == 0) {
				break; // 0은 종료이기 때문에 멈춰준다.
			}
		}
		scan.close();
		
	}
	
}
