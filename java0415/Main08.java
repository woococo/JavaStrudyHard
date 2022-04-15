package java0415;

public class Main08 {

	// 2-3. 범위를 주어 비교(찾기)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_iVal;	// 정수형 변수인 k33_iVal을 선언한다.

		for (int k33_i = 0; k33_i < 300; k33_i++) {	// 0부터 300까지 순차적으로 수행되는 for문을 생성한다.
			k33_iVal = 5 * k33_i;					//	k33_iVal에 5 * k33_i 를 대입한다.
			if (k33_iVal >= 0 && k33_iVal < 10) {			//	k33_iVal값이 0보다 크면서 10보다 작다면
				System.out.printf("일 %d\n", k33_iVal);		// "일 k33_iVal"를 출력한다. 
			} else if (k33_iVal >= 10 && k33_iVal < 100) {	// k33_iVal 값이 10보다 크면서 100보다 작다면
				System.out.printf("십 %d\n", k33_iVal);		// "십 k33_iVal"를 출력한다. 
			} else if (k33_iVal >= 100 && k33_iVal < 1000) {	// k33_iVal 값이 100보다 크면서 1000보다 작다면
				System.out.printf("백 %d\n", k33_iVal);			// "백 k33_iVal"를 출력한다.
			} else { 									// 위의 조건식에 모두 해당하지 않는다면
				System.out.printf("천 %d\n", k33_iVal);	//  "천 k33_iVal"를 출력한다.
			}
		}
	}
}
