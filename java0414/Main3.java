package java0414;

public class Main3 {

	// #3 정수형 연산(버림)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_ii; // k33_ii라는 정수형 변수를 선언한다.

		k33_ii = 1000 / 3;	// k33_ii에 1000을 3으로 나눈 몫의 값을 대입한다.
		System.out.printf("#3-1 : %d\n", k33_ii);	// #3-1 : k33_ii(1000을 3으로 나눈 몫)을 출력한다.
													// 333.33333.. 값이 아니라 333이 나오는 이유는 정수형이기 때문에 소수자리들은 버려진다.

		k33_ii = 1000 % 3;	// k33_ii에 1000을 3으로 나눈 나머지 값을 대입한다.
		System.out.printf("#3-2 : %d\n", k33_ii); // "#3-2 : k33_ii(1000을 3으로 나눈 나머지)를 출력한다.

		// 나머지 연산자의 응용
		for (int i = 0; i < 20; i++) {	// 0부터 19까지 실행되는 for문을 입력한다.
			System.out.printf("#3-3 : %d ", i); // i가 0부터 20까지 다다를때까지 i를 출력한다.

			if (((i + 1) % 5) == 0) {	// 만약 i에 1을 더한값을 5로 나누었을때 나머지가 0이 된다면
				System.out.printf("\n");	// \n으로 줄내림이 되도록 입력한다.
			}
		}
	}
}
