package java0414;

public class Main2 {

	// #2. 누적하기, 합구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_sum; // k33_sum 이라는 정수형 변수를 선언한다.

		k33_sum = 0;  // k33_sum 값을 초기화한다. (누적, 루프는 꼭 초기화하도록 한다.)

		for (int i = 1; i < 101; i++) {	// 1부터 101미만(100)까지 순차대로 실행되는 for문을 생성한다.
			k33_sum = k33_sum + i;	 // k33_sum는 이전 k33_sum에 i를 더한 값을 대입한다.
		}

		System.out.printf("#2-1 : %d\n", k33_sum);	// #2-1 : k33_sum1값 을 입력하면 1부터 100까지 더한 값이 출력된다.
		System.out.printf("#2-2 : %d\n", k33_sum / 100); // 1부터 100까지 더한 값의 평균을 출력하기 위해 k33_sum을 100으로 나눈다.

		int[] k33_v = { 1, 2, 3, 4, 5 }; // k33_v라는 정수형 배열을 선언하고 1,2,3,4,5을 배열에 넣는다.
		int k33_vSum; // k33_vSum이라는 정수형 변수를 선언한다.

		k33_vSum = 0; // k33_vSum 값을 초기화한다.

		for (int i = 0; i < 5; i++) { // 1부터 5미만(4)까지 순차대로 실행되는 for문을 생성한다.
			k33_vSum = k33_vSum + k33_v[i]; // k33_vSum는 이전 k33_vSum에 배열 k33_v[i]를 더한 값을 대입한다.
											// for문이 다 실행되고 나면 k33_vSum은 배열 k33_v의 값들을 다 더한 값이 된다.
		}

		System.out.printf("#2-3 : %d\n", k33_vSum); // 배열 k33_v의 값을 다 더한 값이 출력된다.
	}
}
