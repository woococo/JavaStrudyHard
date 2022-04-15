package java0415;

public class Main15 {

	// 3-1. 띄어쓰기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 0; k33_i < 10; k33_i++) {	// 0부터 10까지 k33_i에 순서대로 대입하는 for문을 생성한다.
			for (int k33_j = 0; k33_j < k33_i; k33_j++) {	// 0부터 k33_i보다 1작은 숫자까지 순서대로 대입하는 이중for문을 생성한다.
				System.out.print(" ");	// 공백이 출력되도록 " "을 입력한다.
			}
			System.out.printf("%d\n", k33_i);	// k33_i를 출력한다.
		}
	}
}
