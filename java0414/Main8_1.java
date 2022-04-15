package java0414;

public class Main8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k33_myWon = 1000000; // k33_myWon이라는 정수형 변수를 선언, 환전할 금액을 입력한다.
		double k33_moneyEx = 1238.21; // k33_moneyEx라는 실수형 변수를 선언, 달러환율을 입력한다.
		double k33_commission = 0.003; // k33_commission라는 실수형 변수를 선언, 환전수수료를 입력한다.

		int k33_usd = (int) (k33_myWon / k33_moneyEx);	// k33_usd라는 정수형 변수를 선언, k33_myWon(환전할 금액)을 k33_moneyEx(환율)로 나눈값으로 한전될 달러이다.
														// 나눈 값을 정수형으로 만들면 소숫점 자리는 버림처리가 된다.
														
		int k33_remain = (int) (k33_myWon - k33_usd * k33_moneyEx); // k33_remain라는 정수형 변수를 선언, 잔돈 값이다.
																	// k33_myWon(환전할 금액)에서 k33_usd(환전된 달러)와 k33_moneyEx(환율)을 곱한 값을 뺀다.

		double k33_comPerOne = k33_moneyEx * k33_commission; // k33_comPerOne라는 실수형 변수를 선언, 달러당 수수료값이다.
															 // k33_moneyEx(환율)과 k33_commission(환전수수료)를 곱한다.
		
		double k33_totalCom = k33_usd * k33_comPerOne;	// k33_totalCom이라는 실수형 변수를 선언, 총 수수료 값이다.
														// k33_usd(환전될 달러)와 k33_comPerOne(달러당 수수료 값)을 곱한다.
		
		System.out.printf("**********************************************************************\n");
		System.out.printf("*                          수수료 계산                               *\n");
		System.out.printf("총 수수료 : %f원 => 미화 : %d달러, 달러당 수수료: %f원\n", k33_totalCom, k33_usd, k33_comPerOne);
		System.out.printf("**********************************************************************\n");
	}
}
