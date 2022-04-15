package java0415;

public class Main03 {

	// 1-3. for문

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 9까지 합 구하기
		int k33_sum = 0;	// 정수형 변수인 k33_sum을 선언하고 0으로 초기화한다. 
		for (int k33_i = 0; k33_i < 10; k33_i++) { // 0부터 9까지 순차대로 실행되는 for문 생성한다.
			k33_sum = k33_sum + k33_i;	// k33_sum는 이전 k33_sum에 k33_i를 더한 값을 대입한다.
		}
		System.out.printf("sum %d\n", k33_sum);	// k33_sum값을 출력한다.
		System.out.println("");	// 줄바꿈을 위한 ""을 출력한다.

		
		// 구구단 출력하기 
		for (int k33_i = 1; k33_i < 10; k33_i++) {  // 1부터 9까지 순차대로 k33_i에 대입되는 for문 생성한다
			System.out.printf("*****************\n");
			System.out.printf("  구구단 %d  단  \n", k33_i); // 구구단 k33_i단을 출력한다.
			System.out.printf("*****************\n");
			for (int k33_j = 1; k33_j < 10; k33_j++) {	// 1부터 9까지 순차대로 k33_j에 대입되는 이중 for문 생성한다.
														// 이중 for문을 사용 
				System.out.printf(" %d * %d = %d \n", k33_i, k33_j, k33_i * k33_j);
				// k33_i * k33_j = k33_i * k33_j 값을 출력하면  4 * 6 = 24 와 같이 출력된다.
			}
		}
	}
}
