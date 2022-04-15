package java0415;

public class Main11 {

	// 2-6. case문 비교

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 1; k33_i < 13; k33_i++) {		// 1부터 12까지 순서대로 실행되는 for문을 생성한다.
			System.out.printf("%d월 =>", k33_i);		// "k33_i월 =>"을 출력한다. 
			LOOP: for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1부터 31까지 순서대로 실행되는 for문을 생성한다. 
				// 밑에서 소환하면 돌아올 수 있는 LOOP를 만든다.
				// 이런 표현은 거의 사용하지 않는다.
				System.out.printf("%d,", k33_j);		//	k33_j를 출력한다.

				switch (k33_i) {	// 조건식에 k33_i을 입력한다.
				case 4:		// k33_i 값이 4일 경우
				case 6:		// k33_i 값이 6일 경우
				case 9:		// k33_i 값이 9일 경우
				case 11:	// k33_i 값이 11일 경우
					if (k33_j == 30) {	// k33_j 값이 30과 일치하다면 
						break LOOP;		// 멈추고 LOOP로 이동한다. (12라인)
					}
					break;	// 멈춰!
				case 2:		// k33_i 값이 2일 경우
					if (k33_j == 28) {	//	k33_j값이 28과 일치한다면
						break LOOP;		// 멈추고 LOOP로 이동한다. (12라인)
					}
					break;	// 멈춰!
				}
			}
			System.out.println(""); // 줄바꿈을 위한 ""을 입력한다.
		}
	}
}
