package java0418_5;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 1; k33_i < 4; k33_i = k33_i + 1) { // k33_i가 1부터 3까지 k33_i + 1씩 증가되는 for문을 생성한다.
			System.out.printf("*************\t*************\t************* \n");
			System.out.printf(" 구구단 %d단 \t 구구단 %d단 \t 구구단 %d단 \n", k33_i, k33_i + 3, k33_i + 6); // 1단, 4단, 7단 처럼 출력하기 위해서  k33_i, k33_i + 3, k33_i + 6와 같이 값을 입력한다.
			System.out.printf("*************\t*************\t************* \n");

			for (int k33_j = 1; k33_j < 10; k33_j++) {	// k33_j가 1부터 9까지 순차적으로 실행되는 for문을 생성한다. 
				System.out.printf(" %d * %d = %d \t %d * %d = %d \t %d * %d = %d\n", k33_i, k33_j, k33_i * k33_j, k33_i + 3,
						k33_j, k33_i + 3 * k33_j, k33_i + 6, k33_j, k33_i + 6 * k33_j);
				// 구구단 내용이 출력될 수 있도록 값을 입력한다. k33_i와 k33_j 그리고 k33_i와 k33_j를 곱한 값을 입력한다.
			}
		}
	}
}