package java0415;

public class Main01 {

	// 1-1. if문

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_score = 65;			// 정수형 변수 k33_score를 선언하고 65를 대입한다.
		int k33_num = 12;			// 정수형 변수 k33_num를 선언하고 12를 대입한다.

		if (k33_score > 60) { 						// k33_score가 60보다 크다면?!
			System.out.println("합격입니다."); 		// "합격입니다."를 출력한다.
		} else {									// 아니라면?
			System.out.println("불합격입니다.");	// "불합격입니다."를 출력한다.
		}

		if (k33_num > 0) { 							// k33_num이 0보다 크다면?!
			System.out.println("양수입니다.");		// "양수입니다."를 출력한다.
		} else if (k33_num < 0) {					// k33_num가 0보다 작다면?!
			System.out.println("음수입니다.");		// "음수입니다."를 출력한다.
		} else { 									// 모든 조건식의 결과가 false라면?
			System.out.println("영입니다.");		// "영입니다."를 출력한다.
		}

		if (k33_score >= 90) { 							// k33_score 가 90이상이라면 
			System.out.println("A등급");				// "A등급"을 출력한다.
		} else if (k33_score >= 80 && k33_score < 90) { //k33_score 가 80이상이면서 90 미만이라면
			System.out.println("B등급");				// "B등급"을 출력한다.
		} else if (k33_score >= 70 && k33_score < 80) { //k33_score 가 70이상이면서 80 미만이라면
			System.out.println("C등급");				// "C등급"을 출력한다.
		} else { 										// 모든 조건식의 결과가 false라면
			System.out.println("F등급"); 				// "F등급"을 출력한다.
		}
	}
}
