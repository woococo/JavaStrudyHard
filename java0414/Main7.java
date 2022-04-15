package java0414;

public class Main7 {

	// 소비자가 세금 계산

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] k33_item = { "오뜨", "꼬북칩", "뽀또", "베베" };	// 문자열 배열인 k33_item를 선언하고 순서대로 과자이름을 입력한다.
		
		int[] k33_price = { 1000, 1100, 900, 1200 }; // 정수형 배열인 k33_price을 선언하고, 순서대로 가격을 입력한다.
		int[] k33_amount = { 3, 2, 3, 6 }; // 정수형 배열인 k33_price을 선언하고, 순서대로 개수를 입력한다.
		double k33_taxRate = 0.1;	// 실수형 변수로 0.1값을 가진 k33_taxRate을 선언한다. k33_taxRate는 세율이다.
		int k33_totalSum = 0;	// 정수형 변수 k33_totalSum을 선언하면서 값을 0으로 초기화해준다.

		System.out.printf("*********************************************\n");
		System.out.printf("                     영수증                  \n");
		System.out.printf(" 항 목             단 가      수 량     합 계 \n");

		for (int i = 0; i < k33_item.length; i++) { // 0부터 배열 k33_item의 길이만큼 실행되는 for문을 입력한다.
			int k33_sum = k33_price[i] * k33_amount[i];	// 정수형 변수 k33_sum을 선언하고 k33_price[i]와 k33_amount[i]를 곱합값을 대입한다.
			k33_totalSum = k33_totalSum + k33_sum;	// k33_totalSum에 k33_totalSum와 k33_sum을 더한 값을 대입한다.
			System.out.printf(" %-8s\t%8d\t%-3d\t%5d\n", k33_item[i], k33_price[i], k33_amount[i], k33_sum);
			// 순서대로 k33_item[i], k33_price[i], k33_amount[i], k33_sum값을 출력한다.
		}

		System.out.printf("*********************************************\n");
		System.out.printf(" 지불 금액 : %32d\n", k33_totalSum); // k33_totalSum(지불금액)을 출력한다.

		int k33_totalNetPrice = (int) (k33_totalSum / (1 + k33_taxRate)); 
		// 정수형 변수 k33_totalNetPrice을 선언한다. k33_totalNetPrice는 k33_totalSum를 k33_taxRate에 1을 더한 값으로 나누고 정수형으로 변환한 값이다.
		System.out.printf(" 과세 금액 : %32d\n", k33_totalNetPrice); // k33_totalNetPrice(과세금액)을 출력한다.

		int k33_tax = k33_totalSum - k33_totalNetPrice; // 정수형 변수인  k33_tax을 선언하고  k33_tax는 k33_totalSum에서 k33_totalNetPrice를 뺀 값이다.
		System.out.printf(" 세     금 : %32d\n", k33_tax); // k33_tax(세금)을 출력한다.
	}
}
