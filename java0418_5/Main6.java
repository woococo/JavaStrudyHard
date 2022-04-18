package java0418_5;

import java.lang.Character.UnicodeBlock;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k33_df = new DecimalFormat("#,###,###");
		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat k33_sdtB = new SimpleDateFormat("YYYYMMdd");

		String[] k33_itemNames = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병10개묶음", "상투과자E", "더블링 나일론 깡 롤 휴지", "해피홈 SAFE 핸드워시",
				"농심 신라면 120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면156g*5개", "GAP 죽장사과 4-6입", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500", "남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특란", "동원양반볶음김치기획" };
		int[] k33_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };
		int[] k33_amount = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };
		boolean[] k33_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false };
		double k33_taxRate = 0.1;	// 부가세율
		int k33_sum = 0; 		// k33_price(단가) * k33_amount(수량) 값
		int k33_totalTaxFreePrice = 0; // 면세 물품 합계
		int k33_totalNetPrice = 0; 		// 과세물품 합계 = 과세물품 + 부가세
		int k33_NetPrice = 0; 	// 과세물품
		int k33_tax = 0; 		// 부가세
		int k33_totalPrice = 0; // 결제 금액

		System.out.printf("%35s\n", "이마트 죽전점 (031)888-1234");
		System.out.printf("%9s%21s\n", "emart", "206-86-50913 강희석");
		System.out.printf("%29s\n", "용인 수지구 포은대로 552");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("%s%s%18s\n", "[구 매]", k33_sdtA.format(k33_calt.getTime()), "POS:0011-9861");	// 현재시간 출력
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("   %5s %14s %3s %4s\n", "상 품 명", "단 가", "수량", "금 액");
		System.out.printf("%s\n", "-----------------------------------------");

		for (int k33_i = 0; k33_i < k33_itemNames.length; k33_i++) { // k33_i이 0부터 배열 k33_itemNames의 길이까지 실행되는 for문을 선언한다.
			k33_sum = k33_price[k33_i] * k33_amount[k33_i]; // k33_sum은 k33_price(단가) * k33_amount(수량) 값으로 영수증 금액 부분에 출력되는 변수이다.

			if (k33_taxfree[k33_i] == true) { // k33_i의 상품이 면세 상품이라면 
				k33_totalTaxFreePrice = k33_totalTaxFreePrice + k33_sum;	// k33_totalTaxFreePrice에 값을 추가한다.
				System.out.print("* ");	// 상품명 앞에 "* " 표시를 해준다.
			} else {	// k33_i의 상품이 면세 상품이 아니고 과세상품이라면
				System.out.print("  ");	// 상품명 앞에 아무것도 출력하지 않고 
				k33_totalNetPrice = k33_totalNetPrice + k33_sum;	// k33_totalNetPrice에 값을 추가한다.
			}

			String k33_itemName = k33_itemNames[k33_i]; // 문자열 변수 k33_itemName을 선언해서 배열 k33_itemNames의 k33_i값을 넣어준다.
			String k33_blank = "";	// 문자열 변수 k33_blank을 선언한다. 20바이트가 되지 않는 문자열 k33_itemName들을 k33_blank와 함께 출력해서 20바이트로 맞춰준다.
			
			int k33_itemNameLength = k33_itemName.getBytes().length; // 정수형 변수 k33_itemNameLength을 선언한다. 문자열 k33_itemName의 바이트 크기를 대입한다.

			if (k33_itemNameLength > 20) { // k33_itemNameLength(k33_itemName의 바이트 크기)가 20보다 크면! (뒷글자를 짜르기 위해서..)
				byte[] k33_byte = k33_itemName.getBytes();	// 바이트 배열 k33_byte을 선언해서 문자열 k33_itemName의 바이트를 대입한다.
				char k33_char = k33_itemName.charAt(11);	// 20바이트 이상이 charAt(11)에 해당해서 문자열 변수 k33_char에 대입한다. 
				Character.UnicodeBlock k33_unicodeBlock = Character.UnicodeBlock.of(k33_char);	// k33_char가 한글인지 파악하기 위해서 Character.UnicodeBlock함수를 선언한다.
				if (UnicodeBlock.HANGUL_SYLLABLES.equals(k33_unicodeBlock)	// k33_char가 한글인지 판단하기 위해서 선언한 변수 k33_unicodeBlock가 한글이라고 판단되면 
						|| UnicodeBlock.HANGUL_COMPATIBILITY_JAMO.equals(k33_unicodeBlock)
						|| UnicodeBlock.HANGUL_JAMO.equals(k33_unicodeBlock)) {
					k33_itemName = new String(k33_byte, 0, 20); // 바이트 배열 k33_byte를 0부터 19까지 자른다.
				} else {	// k33_char이 한글에 해당하지 않는다면 
					k33_itemName = new String(k33_byte, 0, 19);	// 바이트 배열 k33_byte를 0부터 18까지 자른다.
				}
			}
			k33_itemNameLength = k33_itemName.getBytes().length;	// k33_itemName과 k33_blank의 합을 20 바이트로 만들기 위해서 
			for (int k33_j = 0; k33_j < 20 - k33_itemNameLength; k33_j++) {	// k33_j 가 0부터 (20 - k33_itemNameLength)까지 순차적으로 실행되는 for문을 생성한다.
				k33_blank = k33_blank + " "; // 필요한 만큼 k33_blank에 빈칸을 채워준다.
			}

			System.out.printf("%s%s%8s%3d%8s\n", k33_itemName, k33_blank, k33_df.format(k33_price[k33_i]), k33_amount[k33_i], k33_df.format(k33_sum));
			// 상품명과 빈칸, 단가, 수량, 금액을 순서대로 출력한다.
			if ((k33_i + 1) % 5 == 0) {	// 상품 5개를 출력하고 나서는 구분선을 출력한다.
				System.out.printf("%s\n", "-----------------------------------------");
			}
		}

		k33_totalPrice = k33_totalNetPrice + k33_totalTaxFreePrice; // k33_totalPrice는 k33_totalNetPrice(부가세가 포함된 상품총액)와 k33_totalTaxFreePrice(면세상품총액)를 더한 값으로 최종 결제금액이 된다
		k33_NetPrice = (int) (k33_totalNetPrice / (1 + k33_taxRate)); // k33_NetPrice는 부가세가 포함되지 않은 가격으로, k33_totalNetPrice을 1 + k33_taxRate(부가세율)로 나누어준다.
		k33_tax = k33_totalNetPrice - k33_NetPrice; // k33_tax는 부가세로 k33_totalNetPrice(부가세가 포함된 상품총액)에서  k33_NetPrice(부가세가 제외된 상품총액)을 빼주면 나온다.

		System.out.printf("\n%22s %13d\n", "총 품목 수량", k33_itemNames.length);	// 총 품목 수량을 출력하는데 배열 k33_itemNames의 길이 값으로 해준다.
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k33_df.format(k33_totalTaxFreePrice));	// 면세 상품 가격총액을 포맷에 맞게(###,###,###) 출력해준다.
		System.out.printf("%23s%14s\n", "과 세  물 품", k33_df.format(k33_NetPrice));	// 과세 상품 가격총액을 포맷에 맞게(###,###,###) 출력해준다.
		System.out.printf("%24s%14s\n", "부   가   세", k33_df.format(k33_tax));	// 부가세를 포맷에 맞춰 출력해준다.
		System.out.printf("%25s%14s\n", "합        계", k33_df.format(k33_totalPrice));	// 합계금액을 포맷에 맞춰 출력해준다.
		System.out.printf("%s %23s\n", "결 제 대 상 금 액", k33_df.format(k33_totalPrice)); // 최종 결제 금액을 포맷에 맞춰 출력해준다.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s%19s%s\n", "카드결제(IC)", "일시불/ ", k33_df.format(k33_totalPrice));	// 결제금액을 출력해준다.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%22s\n", "[신세계포인트 적립]");
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%s%20s%7s\n", "금회발생포인트", "9350**9995", "164");
		System.out.printf("%s%25s\n", "누계(가용)포인트", "5,637(  5,473)");
		System.out.printf("%s\n", "*신세계 포인트 유효기간은 2년입니다.");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%21s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s%29s\n", "차량번호 : ", "34저 ****");
		System.out.printf("%s%30s\n", "입차시간 : ", "2022-04-18 12:20:04");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%15s%s\n", k33_sdtB.format(k33_calt.getTime()), "/00119861/00164980/31");	// 현재시각이 포함된 바코드 번호를 출력해준다.
	}
}
