package java0418_5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main5 {

	// 영수증 출력 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###,###");	// 백만단위의 숫자 포맷을 설정한다.
		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // SimpleDateFormat클래스로 날짜 포맷 형식을 설정한다.
		
		String k33_itemName1 = "퓨어에어 비말차단용마스크(최고급형)";	// 문자열 k33_itemName1에 첫번째 상품명을 입력한다.
		String k33_itemCode1 = "1031615";	// 문자열 k33_itemCode1에 첫번째 상품의 식별번호를 입력한다.
		int k33_price1 = 3000;	// 정수형 변수 k33_price1에 첫번째 상품의 가격을 입력한다.
		int k33_amount1 = 1;	// 정수형 변수 k33_amount1에 첫번째 상품의 갯수를 입력한다.

		String k33_itemName2 = "슬라이드식명찰 (가로형) (100호)";	// 문자열 k33_itemName2에 두번째 상품명을 입력한다.
		String k33_itemCode2 = "1008152";	// 문자열 k33_itemCode2에 두 번째 상품의 식별번호를 입력한다.
		int k33_price2 = 1000;	// 정수형 변수 k33_price2에 두번째 상품의 가격을 입력한다.
		int k33_amount2 = 1;	// 정수형 변수 k33_amount2에 두번째 상품의 갯수를 입력한다.

		String k33_itemName3 = "매직흡착 입테리어후크(알루미늄타입)";	// // 문자열 k33_itemName3에 세번째 상품명을 입력한다.
		String k33_itemCode3 = "1020800";	// 문자열 k33_itemCode3에 세 번째 상품의 식별번호를 입력한다.
		int k33_price3 = 1000;	// 정수형 변수 k33_price3에 세번째 상품의 가격을 입력한다.
		int k33_amount3 = 1;	// 정수형 변수 k33_amount3에 세번째 상품의 갯수를 입력한다.
		
		double k33_taxRate = 0.1;	// 부가세율은 0.1로 설정한다.
		int k33_totalPrice = (k33_price1 * k33_amount1) + (k33_price2 * k33_amount2) + (k33_price3 * k33_amount3); 
		// k33_totalPrice는 첫번째 두번째 세번째 상품의 가격과 각 갯수들을 곱한 값을 더한 값이다.
		int k33_price = (int) (k33_totalPrice / (1 + k33_taxRate));	// 부가세를 제외한 가격을 알기 위해서 k33_totalPrice에 k33_taxRate에 1을 더한 값을 정수형으로 변환해준다.
		int k33_tax = k33_totalPrice - k33_price;	// 부가세인 k33_tax는 k33_totalPrice에서 k33_price를 뺀 값이다. (부가세 포함가격 - 부가세 제외한 가격)
		
		System.out.printf("\n%25s\n", "\"국민가게, 다이소\"");
		System.out.printf("%s\n", "(주)아성다이소_분당서현점");
		System.out.printf("%s\n", "전화:031-702-6016");
		System.out.printf("%s\n", "본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("%s\n", "대표:박정부, 신호섭 213-81-52063");
		System.out.printf("%s\n", "매장:경기도 성남시 분당구 분당로53번길 11 \n(서현동)");
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%23s\n", "소비자중심경영(CCM) 인증기업");
		System.out.printf("%26s\n", "ISO 9001 품질경영시스템 인증기업");
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%27s\n", "교환/환불 14일(03월12일)이내,");
		System.out.printf("%24s\n", "(전자)영수증, 결제카드 지참 후");
		System.out.printf("%20s\n", "구입매장에서 가능");
		System.out.printf("%25s\n", "포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%24s\n", "체크카드 취소 시 최대 7일 소요");
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%s %27s\n", "[POS 1058231]", k33_sdt.format(k33_calt.getTime()));	// 현재시각을 포맷에 맞춰 출력해준다.
		System.out.printf("%s\n", "=========================================");
		k33_printItemName(k33_itemName1);	// 첫번째 상품의 상품명을 출력하기 위해서 함수 k33_printItemName에 k33_itemName1을 넣어준다.
		System.out.printf("%7s %d %s \n[%s]\n", k33_df.format(k33_price1), k33_amount1,	// 상품가격과 갯수, 상품가격과 갯수를 곱한 금액을 출력해준다.
				k33_df.format(k33_price1 * k33_amount1), k33_itemCode1);
		k33_printItemName(k33_itemName2);	// 두번째 상품의 상품명을 출력하기 위해서 함수 k33_printItemName에 k33_itemName2를 넣어준다.
		System.out.printf("%7s %d %s \n[%s]\n", k33_df.format(k33_price2), k33_amount2,	// 상품가격과 갯수, 상품가격과 갯수를 곱한 금액을 출력해준다.
				k33_df.format(k33_price2 * k33_amount2), k33_itemCode2);
		k33_printItemName(k33_itemName3);	// 세번째 상품의 상품명을 출력하기 위해서 함수 k33_printItemName에 k33_itemName3을 넣어준다.
		System.out.printf("%7s %d %s \n[%s]\n", k33_df.format(k33_price3), k33_amount3,	// 상품가격과 갯수, 상품가격과 갯수를 곱한 금액을 출력해준다.
				k33_df.format(k33_price3 * k33_amount3), k33_itemCode3);
		System.out.printf("%18s%19s\n", "과세합계", k33_df.format(k33_price));	// 과세가 포함된 값인 k33_price을 숫자 포맷에 맞춰 출력해준다.
		System.out.printf("%19s%19s\n", "부가세", k33_df.format(k33_tax));	// 부가세인 k33_tax를 숫자 포맷에 맞춰 출력한다.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%33s\n", "판매합계", k33_df.format(k33_totalPrice));	// 판매합계를 숫자 포맷에 맞춰 출력한다.
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%s %32s\n", "신용카드", k33_df.format(k33_totalPrice));	// 결제금액을 숫자 포맷에 맞춰 출력한다.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%33s\n", "우리카드", "538720**********");
		System.out.printf("%s%12s%s\n", "승인번호 77982843(0)", "승인금액", k33_df.format(k33_totalPrice));	// 승인금액을 숫자 포맷에 맞춰 출력한다.
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%25s%s\n", k33_sdt.format(k33_calt.getTime()), "분당서현점");	// 현재시간을 포맷에 맞춰출력해준다.
		System.out.printf("%s\n", "상품 및 기타 문의 : 1522-4400");
		System.out.printf("%s\n", "멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.printf("%34s\n", "||||||||||||||||||||||||");
		System.out.printf("%30s\n", "2112820610158231");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s\n", "◈다이소멤버십 앱 또는 홈페이지에 접속하셔");
		System.out.printf("%s\n", "서 회원가입 후 다양한 혜택을 누려보세요!◈");

	}
	
	public static void k33_printItemName(String k33_itemname) {	// 상품명을 출력하기 위한 함수이다
		if (k33_itemname.getBytes().length > 26) {	// 상품명의 길이가 26보다 길다면 
			byte[] k33_byte = k33_itemname.getBytes();	//	바이트 배열 k33_byte을 선언하고 k33_itemname의 바이트 값을 대입한다.
			System.out.printf("%s", new String(k33_byte, 0, 26));	// k33_byte 배열의 0부터 25까지 출력한다.
		} else {
			System.out.printf("%s",  k33_itemname);	// 상품명의 길이가 26보다 길지 않다면 그냥 상품명을 출력한다.
		}
	}

}
