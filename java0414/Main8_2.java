package java0414;

public class Main8_2 {

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

		int k33_iTotalCom; // k33_iTotalCom이라는 정수형 변수를 선언한다.

		if (k33_totalCom != (double) ((int) k33_totalCom)) {	// k33_totalCom(총 수수료)값이 정수로 떨어지지 않을 경우에는
			k33_iTotalCom = (int)k33_totalCom + 1;	// k33_totalCom(총 수수료)에 1을 더한 값을 k33_iTotalCom에 대입한다.
		} else {
			k33_iTotalCom = (int)k33_totalCom; // 아닌 경우에는 k33_totalCom을 k33_iTotalCom에 대입한다.
		}

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                              수수료 적용환전                                  *\n");
		System.out.printf("총 수수료 : %d원 => 미화 : %d달러, 달러당 수수료: %f원\n", k33_iTotalCom, k33_usd, k33_comPerOne);
		
		k33_remain = (int)(k33_myWon - k33_usd * k33_moneyEx - k33_iTotalCom);	// k33_myWon(환전할 금액)에서 k33_usd(환전될 달려)와 k33_moneyEx(달러환율)을 곱한 값을 빼고 
																				// k33_iTotalCom(총 수수료) 값을 빼서 k33_remain(잔돈)에 대입한다.

		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 수수료징구 : %d원 잔돈 : %d원\n", k33_myWon, k33_usd, k33_iTotalCom, k33_remain);
		System.out.printf("*********************************************************************************\n");
	}
}
