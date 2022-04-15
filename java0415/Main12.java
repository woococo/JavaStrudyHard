package java0415;

public class Main12 {

	// 2-7. Array이용 비교

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k33_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	
		// 정수형 배열 k33_iLMD을 선언하고  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 을 저장한다.
		// 배열은 0부터 시작하는 것을 명심한다 --> k33_iLMD[0] ~ k33_iLMD[11]

		for (int k33_i = 1; k33_i < 13; k33_i++) {		// 1부터 12까지 순서대로 실행되는 for문을 생성한다.
			System.out.printf(" %d월 =>", k33_i);		// "k33_i월 => " 을 출력한다 ->  "1월 => "
			for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1부터 31까지 순서대로 실행되는 for문을 생성한다.
				System.out.printf("%d", k33_j);			// "K33_j," 를 출력한다 -> "25,"
				if (k33_iLMD[k33_i - 1] == k33_j) {		// 배열 k33_iLMD에서 [k33_i - 1] 값이 k33_j 값과 일치하다면
					break;								// 멈춰
				}
				System.out.print(",");	// 일단위에 구분을 해주기 위해서 ,을 출력한다. 마지막 날에는 ,가 찍히지 않음.
				
			}
			System.out.println("");	// 줄을 바꾸기 위해서 "" 을 입력한다.
		}
	}

}
