package java0414;

public class Main6 {

	// 단순 세금 계산

	public static int k33_taxcal(int k33_val, int k33_rate) { // main에서 입력받은 k33_val, k33_rate을 함수 k33_taxcal에 대입한다.
		
		int k33_ret; // k33_ret라는 정수형 변수를 선언한다. k33_ret는 세금이다.

		if (((double) k33_val * (double) k33_rate / 100.0) == k33_val * k33_rate / 100) {	
			// 실수로 변환한 k33_val와 k33_rate를 곱하고 100.0으로 나눈 값이 k33_val와 k33_rate를 곱하고 100으로 나눈 값과 같다면
			k33_ret = k33_val * k33_rate / 100; //k33_ret에 k33_val와 k33_rate를 곱하고 100으로 나눈 값을 대입한다.
		} else {	// 아니라면?!
			k33_ret = k33_val * k33_rate / 100 + 1;	// k33_ret에 k33_val와 k33_rate를 곱하고 100으로 나누고 1을 더한값을 대입한다.
		}
		return k33_ret; // k33_ret을 반환하면 메인 함수의 25라인의 값이 된다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k33_val = 271; // 271을 대입한 정수형 변수 k33_val를 선언한다. k33_val는 세전가격이다.
		int k33_rate = 3;	// 3을 대입한 정수형 변수 k33_rate를 선언한다. k33_rate는 세금 3퍼센트이다.
		int k33_tax = k33_taxcal(k33_val, k33_rate);	// 함수 k33_taxcal에 k33_val, k33_rate을 대입해서 나온 값을 정수형 변수 k33_tax로 선언한다.

		System.out.printf("*******************************************\n");
		System.out.printf("*               단순 세금 계산            *\n");
		System.out.printf("실제 세금 계산 : %f\n", k33_val * k33_rate / 100.0);	// 실제세금은 k33_val와 k33_rate을 곱하고 100.0으로 나눈 값이 출력된다.
		System.out.printf("세전 가격 : %d 세금 : %d 세금포함가격 : %d\n", k33_val, k33_tax, k33_val + k33_tax); 
		// 세금 포함 가격은 k33_val와 k33_tax을 더한 값이 출력된다.
		System.out.printf("*******************************************\n");
	}
}
