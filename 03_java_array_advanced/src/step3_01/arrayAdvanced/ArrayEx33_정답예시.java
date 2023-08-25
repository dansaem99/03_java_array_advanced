package step3_01.arrayAdvanced;
/*
 
 	# 중복 안된 숫자 제거
 	
	int[] test1 = {1,2,3,2,1};		
	int[] test2 = {1,3,4,4,2};
	int[] test3 = {1,1,1,2,1};
	
	// 위 배열에서 중복안된숫자를 제거하시오.
	
	// 1) test1시험 result 확인 1 2 1 2
	// 2) test2시험 result 확인 4 4
	// 3) test3시험 result 확인 1 1 1 1
	 
 */

public class ArrayEx33_정답예시 {

	public static void main(String[] args) {
		
		int[] test1  = {1,2,3,2,1};		
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
		int[] result = new int[5];
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			
			result[count] = test1[i];							// test2[i] , test3[i]
			
			int check = 0;
			
			for (int j = 0; j < 5; j++) {				
				if ( i != j && result[count] == test1[j] ) {	// test2[j] , test3[j]
					check = 1;				
				}
			}
			
			if (check == 1)	count++;
		
		}
		
		for (int i = 0 ; i < count ; i++ ) {
			System.out.print(result[i] + " ");
		}

	}

}
