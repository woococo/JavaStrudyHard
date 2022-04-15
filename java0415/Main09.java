package java0415;

public class Main09 {

	// 2-4. 비정형비교1(깜끔코딩)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프로그래밍은 직관적인 것이 좋다!
		
		for (int k33_i = 1; k33_i < 13; k33_i++) {	// 1부터 13까지 순차적으로 수행되는 for문을 생성한다.
			System.out.printf(" %d월 => ", k33_i);	// "k33_i월 => " 을 출력한다 ->  "1월 => "
			for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1부터 31까지 순차적으로 수행되는 for문을 생성한다.
				System.out.printf("%d,", k33_j);	// "K33_j," 를 출력한다 -> "25,"
				if (k33_i == 1 && k33_j == 31) {	// k33_i가 1이면서 k33_j가 31이라면~?
					break;							// 멈춰!
				}
				if (k33_i == 2 && k33_j == 28) {	// k33_i가 2이면서 k33_j가 28이라면~?
					break;							// 멈춰!
				}
				if (k33_i == 3 && k33_j == 31) {	// k33_i가 3이면서 k33_j가 31이라면~?
					break;							// 멈춰!
				}
				if (k33_i == 4 && k33_j == 30) {	// k33_i가 4이면서 k33_j가 30이라면~?
					break;							// 멈춰!
				}
				if (k33_i == 5 && k33_j == 31) {	// k33_i가 5이면서 k33_j가 31이라면~?
					break;							// 멈춰!
				}
				if (k33_i == 6 && k33_j == 30) {	// k33_i가 6이면서 k33_j가 30이라면~?
					break;							// 멈추시오
				}
				if (k33_i == 7 && k33_j == 31) {	// k33_i가 7이면서 k33_j가 31이라면~?
					break;							// 멈춰
				}
				if (k33_i == 8 && k33_j == 31) {	// k33_i가 8이면서 k33_j가 31이라면~?
					break;							// stop!
				}
				if (k33_i == 9 && k33_j == 30) {	// k33_i가 9이면서 k33_j가 30이라면~?
					break;							// 멈춰
				}
				if (k33_i == 10 && k33_j == 31) {	// k33_i가 10이면서 k33_j가 31이라면~?
					break;							// 멈춰
				}
				if (k33_i == 11 && k33_j == 30) {	// k33_i가 11이면서 k33_j가 30이라면~?
					break;							// 멈춰
				}
				if (k33_i == 12 && k33_j == 31) {	// k33_i가 12이면서 k33_j가 31이라면~?
					break;							// 멈춰~!~!
				}
			}
			System.out.printf("\n");	// 줄을 바꿔주는 \n을 출력한다.
		}
	}
}
