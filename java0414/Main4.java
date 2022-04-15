package java0414;

public class Main4 {

	// #4 반올림 버림 처리

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_ii; // k33_ii라는 정수형 변수를 선언한다.

		k33_ii = 12345;	// k33_ii에 12345 정수를 대입한다.
		int k33_j = (k33_ii / 10) * 10; 	// k33_j 이라는 정수형 변수를 선언한다.
											// kk3_j에 k33_ii를 10으로 나누고 10을 곱한 값을 대입한다.

		System.out.printf("#4-1 : %d\n", k33_j);	// k33_j를 출력하면 12345가 버림처리된 12340이 출력된다.

		k33_ii = 12345;	// k33_ii에 12345 정수를 대입한다.
		k33_j = ((k33_ii + 5) / 10) * 10;	// k33_j에 k33_ii에 5를 더한 값을 10으로 나누고 10을 곱한 값을 대입한다.
		System.out.printf("#4-2 : %d\n", k33_j);	// k33_j를 출력하면 12345가 반올림 처리 된 12350이 출력된다.

		k33_ii = 12344;	// k33_ii에 12344 정수를 대입한다.
		k33_j = ((k33_ii + 5) / 10) * 10;	// k33_j에 k33_ii에 5를 더한 값을 10으로 나누고 10을 곱한 값을 대입한다.
		System.out.printf("#4-3 : %d\n", k33_j);	// k33_j를 출력하면 12345가 반올림 처리 된 12350이 출력된다.
	}
}
