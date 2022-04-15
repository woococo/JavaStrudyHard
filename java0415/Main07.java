package java0415;

public class Main07 {

	// 2-2. 숫자형, 문자형 비교

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_il;		// 정수형 변수 k33_il을 선언한다.
		double k33_iD;	// 실수형 변수 k33_iD을 선언한다.

		k33_il = 10 / 3;	// k33_il에 10을 3으로 나눈 값을 대입한다.
		k33_iD = 10 / 3.0;	// k33_iD에 10을 3.0으로 나눈 값을 대입한다.

		// int와 double은 정수형연산과 실수형 연산이다. 
		if (k33_il == k33_iD) {	// k33_il 값과 k33_iD의 값이 같다면
			System.out.printf("equal\n");	// equal을 출력한다.
		} else {	// 아니라면?!
			System.out.printf("Not equal [%f][%f] \n", (double) k33_il, k33_iD); 
			// Not equal과 함께 k33_il을 실수로 변환한 값과 k33_iD를 순서대로 출력한다.
		}
		
		// 단지 유효숫자까지 표시된 것 뿐이지 다르다.
		if (k33_iD == 3.333333) {	// k33_iD값이 3.333333이라면
			System.out.printf("equal\n");	// equal을 출력한다.
		} else {	// 아니라면 ?!
			System.out.printf("Not equal [3.333333][%f] \n", k33_iD);
			// Not equal, 3.333333과 함께 k33_iD를 순서대로 출력한다.
		}
		
		k33_iD = (int) k33_iD;	// k33_iD에 k33_iD를 정수형으로 변환한 값을 대입한다.
		if (k33_il == k33_iD) {	// k33_il의 값과 k33_iD 값이 같다면
			System.out.println("equal\n");	// equal을 출력한다.
		} else {	// 아니라면 ?!
			System.out.printf("Not equal [%f][%f] \n", (double) k33_il, k33_iD);
			// Not equal과 함께 k33_il을 실수로 변환한 값과 k33_iD을 순서대로 출력한다.
		}

		System.out.printf("int로 인쇄 [%d][%f]\n", k33_il, k33_iD);
		// int로 인쇄 --> [3][3.000000]
		System.out.printf("double로 인쇄 [%f][%f]\n", (double) k33_il, k33_iD);
		// double로 인쇄 --> [3.000000][3.000000]

		char k33_a = 'c'; // 문자형 변수인 k33_a을 선언하고 'c'를 대입한다.
		// char(문자)형에서는 ''를 사용한다.

		if (k33_a == 'b') {	// k33_a 이 'b'와 같다면
			System.out.println("k33_a는 b이다");	// "k33_a는 b이다"를 출력한다.
		}
		if (k33_a == 'c') {	// k33_a가 'c'와 같다면
			System.out.println("k33_a는 c이다");	// "k33_a는 c이다"를 출력한다.
		}
		if (k33_a == 'd') {	// k33_a가 'd'와 같다면
			System.out.println("k33_a는 d이다");	//"k33_a는 d이다"를 출력한다.
		}

		String k33_aa = "abcd"; // 문자열 변수인 k33_aa를 선언하고 "abcd"를 대입한다.
		// String(문자열)형에서는 ""를 사용한다.
		
		if (k33_aa.equals("abcd")) {	//	문자열 k33_aa이 "abcd"와 일치하다면
			System.out.println("k33_aa는 abcd이다");	// "k33_aa는 abcd이다"를 출력한다.
		} else {	//  아니라면?!
			System.out.println("k33_aa는 abcd이 아니다");	// "k33_aa는 abcd이 아니다"를 출력한다.
		}

		boolean k33_bb = true;	// 논리형 변수인 k33_bb을 선언하고 true로 설정한다.

		if (!!k33_bb) {	// k33_bb가 true가 아니라면 ?
			System.out.println("k33_bb가 아니고 아니면 참이다");	// "k33_bb가 아니고 아니면 참이다"를 출력한다.
		} else { // k33_bb가 true가 아닌것이 아니라면 ?? ==> k33_bb가 true임
			System.out.println("k33_bb가 아니고 아니면 거짓이다");	// "k33_bb가 아니고 아니면 거짓이다"를 출력한다.
		}
	}
}