package java0415;

import java.text.DecimalFormat;

public class Main18 {

	// 3-5. 칸 맞춰 인쇄

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k33_item = "사과"; 	// 문자열 변수인 k33_item을 선언하고 "사과"를 저장한다.
									// 한글은 하나에 2byte이고, 영어는 1byte이다. 
		int k33_unit_price = 5000;	// 정수형 변수인 k33_unit_price을 선언하고 5000을 저장한다. (단가)
		int k33_num = 500;			// 정수형 변수인 k33_num을 선언하고 500을 저장한다. (수량)
		int k33_total = 0;			// 정수형 변수인 k33_total을 선언하고 0으로 초기화 해준다.

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###,###"); 	// 세 자리마다 ,(콤마)를 찍는 포맷을 생성한다.

		System.out.println("==========================================================");
		System.out.printf("%10.20s%8.8s%8.8s%18.16s\n", "품목", "단가", "수량", "합계");		
		// %20.20s처럼 문자열에 칸을 지정하고 "품목", "단가", "수량", "합계"이 순서대로 출력되도록 한다.
		System.out.println("==========================================================");
		System.out.printf("%10.20s%10.10s%10.10s%20.20s\n", k33_item, k33_df.format(k33_unit_price),
				k33_df.format(k33_num), k33_df.format(k33_unit_price * k33_num));
		// %20.20s처럼 문자열과 정수형에 칸을 지정하고 k33_item, k33_df포맷을 적용한 k33_unit_price),
		// k33_df포맷을 적용한k33_num, k33_df 포맷을 적용한 k33_unit_price 곱하기 k33_num값이 순서대로 출력되도록 한다.
		System.out.println("==========================================================");
	}
}
