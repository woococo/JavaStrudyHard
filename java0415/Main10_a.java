package java0415;

public class Main10_a {

	// 2-5. 비정형비교3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 1; k33_i < 13; k33_i++) {		// 1부터 12까지 순차적으로 수행되는 for문을 생성한다.
			System.out.printf(" %d월 =>", k33_i);		// "k33_i월 =>"을 출력한다. 
			for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1부터 31까지 순서대로 실행되는 for문을 생성한다.
				System.out.printf("%d,", k33_j);		//	k33_j를 출력한다.
				if ((k33_i == 4 || k33_i == 6 || k33_i == 9 || k33_i == 11) && k33_j == 30) {	
							// k33_i 값이 4이거나 6이거나 9거나 11일 경우이면서 k33_j이가 30이면 
					break;	// 멈춰!
				}
				if ((k33_i == 2) && (k33_j == 28)) {	// k33_i의 값이 2일 경우에	k33_j가 28과 일치하면
					break;								// 멈춰
				}
			}
			System.out.println("");	// 줄을 바꾸기 위해서 println("")을 입력한다.
		}
	}
}
