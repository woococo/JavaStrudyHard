package java0414;

public class Main5 {

	// #5 소수점 자리의 반올림 버림 처리

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_myVal = 14 / 5; // k33_myVal 이라는 정수형 변수를 선언한다. k33_myVal는 14를 5로 나눈 값이다.
		System.out.printf("5-1 : %d\n", k33_myVal);	// k33_myVal를 출력하면 14를 5로 나눈 값인 2.8이 아니라 2가 출력된다.
													// k33_myVal를 정수로 선언했기 때문에 소수점 이하는 버려진다. 

		double k33_myValF = 14 / 5;	// k33_myValF라는 실수형 변수를 선언한다. k33_myValF는 14를 5로 나눈 값이다.
		System.out.printf("5-2 : %f\n", k33_myValF);	// k33_myValF를 출력하면 14를 5로 나눈 값인 2.8이 아니라 2.000000가 출력된다.
														// 14와 5 둘다 실수가 아니라 정수이기 때문에... 정수 / 정수는 => 정수 
														//한개라도 실수형태의 표시를 해야 결과가 실수가 나온다.

		k33_myValF = 14.0 / 5; // k33_myValF에 14.0을 5로 나눈 값을 대입한다. 
		System.out.printf("5-3 : %f\n", k33_myValF);	// k33_myValF를 출력하면 14를 5로 나눈 값인 2.8000000값이 출력된다!

		k33_myValF = (14.0) / 5 + 0.5;	// k33_myValF에 14.0을 5로 나누고 0.5를 더한 값을 대입한다. (실수형 계산에서 0.5를 더해보는 것이다.)
		System.out.printf("5-4 : %f\n", k33_myValF);	//  k33_myValF를 출력하면 14를 5로 나누고 0.5를 더한 값인 3.300000가 출력된다.

		k33_myVal = (int) ((14.0) / 5 + 0.5);	// k33_myValF에 14.0을 5로 나누고 0.5를 더한 값을 정수형으로 변환해서 대입한다.
		System.out.printf("5-5 : %d\n", k33_myVal);	// k33_myValF를 출력하면 14를 5로 나누고 0.5를 더한 값인 3.3이 아니라 소수점 이하 자리가 버려진 3이 출력된다.
	}
}
