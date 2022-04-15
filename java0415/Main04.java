package java0415;

public class Main04 {

	// 1-4. while문

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_i = 2;				// 정수형 변수인 k33_i를 선언하고 2를 대입한다.
		while (k33_i <= 9) { 		// k33_i가 9일때 정지하는 while문을 생성한다.
			int k33_j = 1; 			// 정수형 변수인 k33_j를 선언하고 1을 대입한다.
			while (k33_j <= 9) {	// k33_j가 9일때 정지하는 while문을 생성한다.
				System.out.println(k33_i + " * " + k33_j + " = " + k33_i * k33_j);
				k33_j++; // 한번 돌때마다 k33_j는 1씩 증가한다.
			}
			k33_i++;	// 한번 돌때마다 k33_i는 1씩 증가한다.
		}
	}
}
