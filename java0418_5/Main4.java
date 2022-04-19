package java0418_5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main4 {

	// 영수증 출력 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat k33_df = new DecimalFormat("#,###,###"); // 백만단위의 숫자 포맷을 설정한다.
		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 현재 시간을 어떻게 출력할지 포맷을 k33_sdtA 이름으로
																					// 정해준다.
		SimpleDateFormat k33_sdtB = new SimpleDateFormat("YYYYMMdd "); // 현재 시간을 어떻게 출력할지 포맷을 k33_sdtB 이름으로 정해준다.

		int k33_totalPrice = 33000; // 상품 가격과 부가세가 합쳐진 금액을 정수형 변수 k33_totalPrice에 대입해준다.
		double k33_taxRate = 1.1; // 부가세율을 0.1에 1을 더한 1.1로 설정한다.
		int k33_price = (int) (k33_totalPrice / k33_taxRate) + 1;
		// 부가세를 제외한 상품가격을 알기 위해서 k33_totalPrice를 부가세(k33_taxRate)로 나눈 값을 정수형으로 변환해서
		// k33_price에 대입한다.
		int k33_tax = k33_totalPrice - k33_price; // k33_tax는 부가세로 k33_totalPrice에서 k33_price을 뺀 값이다.

		System.out.printf("%s\n", "신용승인");
		System.out.printf("%s %17s\n", "단말기 : 2N68665898", "전표번호 : 041218");
		System.out.printf("%s\n", "가맹점 : 한양김치찌개");
		System.out.printf("%s\n", "주  소 : 경기 성남시 분당구 황새울로251번\n길 10 , 1층");
		System.out.printf("%s\n", "대표자 : 유창신");
		System.out.printf("%s %19s\n", "사업자 : 752-53-00558", "TEL : 7055695");
		System.out.printf("%s\n", "- - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("%s%32s 원\n", "금  액", k33_df.format(k33_price)); // k33_price(금액)을 숫자포맷에 맞춰 출력한다.
		System.out.printf("%s%32s 원\n", "부가세", k33_df.format(k33_tax)); // k33_tax(부가세)를 숫자포맷에 맞춰 출력한다.
		System.out.printf("%s%32s 원\n", "합  계", k33_df.format(k33_totalPrice)); // k33_totalPrice(합계금액)을 숫자 포맷에 맞춰 출력한다.
		System.out.printf("%s\n", "- - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("%s\n", "우리카드");
		System.out.printf("%s%5s\n", "카드번호 : 5387-20**-****-4613(S)", "일시불");
		System.out.printf("%s%s\n", "거래일시 : ", k33_sdtA.format(k33_calt.getTime())); // 거래일시에 현재시간을 불러와서 포맷에 맞춰 출력한다.
		System.out.printf("%s\n", "승인번호 : 70404427");
		System.out.printf("%s\n", "거래번호 : 357734873739");
		System.out.printf("%s%22s\n", "매입 : 비씨카드사", "가맹 : 720068568");
		System.out.printf("%s\n", "알림 : EDC매출표");
		System.out.printf("%s\n", "문의 : TEL)1544-4700");
		System.out.printf("%s\n", "- - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("%23s\n", "* 감사합니다 *");
		System.out.printf("%31s%s\n", "표준V2.08_", k33_sdtB.format(k33_calt.getTime())); // 영수증 마지막에 오늘날짜가 포함된 문장을 출력해준다.

	}
}
