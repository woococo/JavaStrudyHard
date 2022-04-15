package java0415;

public class Main13 {

	// 2-8. 숫자읽기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] k33_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 문자열 배열인 k33_units을 선언하고 "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"를 배열에 저장한다.
		for (int k33_i = 0; k33_i < 101; k33_i++) {		// 0부터 100까지 순서대로 수행되는 for문을 생성한다.
			if (k33_i >= 0 && k33_i < 10) {				// k33_i이 0 이상이면서 10미만일 경우에는 
				System.out.printf("일의자리 : %s\n", k33_units[k33_i]);	//	"일의자리 : k33_units[k33_i]"를 출력하게 한다.
			} else if (k33_i >= 10 && k33_i < 100) {	// k33_i이 10 이상이면서 100미만일 경우에는 
				int k33_i10, k33_i0;	// 정수형 변수 k33_i10와 k33_i0를 선언한다.
				k33_i10 = k33_i / 10;	// k33_i10에는 k33_i를 10으로 나눈 값을 대입한다. 십의자리임
				k33_i0 = k33_i % 10;	// k33_i0에는 k33_i를 10으로 나눈 나머지 값을 대입한다.	일의 자리임
				if (k33_i0 == 0) {		// k33_i0가 0일 경우에는 
					System.out.printf("십의 자리 : %s십\n", k33_units[k33_i10]); 
					// "십의 자리 : k33_units[k33_i10]십"을 출력하게  한다.
				} else {	// 아니라면?
					System.out.printf("십의 자리 : %s십%s\n", k33_units[k33_i10], k33_units[k33_i0]);
					//"십의 자리 : k33_units[k33_i10]십k33_units[k33_i0]"이 출력되게 한다. 
				}
			} else { // 앞의 조건식에 모두 false에 해당한다면  
				System.out.printf("==> %d\n", k33_i);	// k33_i를 출력한다.
			}
		}
	}
}
