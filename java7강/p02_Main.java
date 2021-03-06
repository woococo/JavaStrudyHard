package java7강;

// 합계 검증 프로그램

import java.text.DecimalFormat;

public class p02_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] k33_OneRec = { // 영수증3 실습 결과를 가지고 내용을 입력한다
				"01	 해피홈 SAFE365     75,000  2    150,000", 
				"02	 (G)LH원형유리화    69,000  6    414,000",
				"03	 상투과자E       5,980,200  8 47,841,600", 
				"04	 더블링 나일론      33,000  1     33,000",
				"05	 해피홈 SAFE 핸     55,000 20  1,100,000", 
				"06	 농심 신라면 120    33,800  1     33,800",
				"07* (대)국내산삼겹     66,100  5    330,500", 
				"08	 오뚜기 진비빔면    27,500  2     55,000",
				"09* GAP 죽장사과 4-   118,000 99  1,682,100", // 가격 오류나게 수정
				"10* 순 유기농 바나     49,800  1     49,800",
				"11	 피코크 탄두리      24,800  4     99,200", 
				"12	 (달콤)순살닭강     79,200  1     79,200",
				"13	 DZ주니어양말3족    49,800  3    149,400", 
				"14	 DZ주니어양말3족    49,080 50    451,050", // 가격 오류나게 수정
				"15	 프리미엄생연어     71,300  2    142,600", 
				"16	 피코크 들깨미역    39,800  1     39,800", 
				"17* 남양 맛있는우유    44,800  1     44,800",
				"18	 녹차원흑당시럽1    49,800  2     99,600",
				"19	 진라면소컵(매)6    32,100  1     12,100", // 가격 오류나게 수정
				"20	 케라시스 앰플      69,500  1     69,500",
				"21	 푸르밀 미숫가루    29,800  2     59,600", 
				"22	 자일로스갈색설     19,900  1     19,900",
				"23	 CJ 비비고칩 20G    19,800  1     19,800", 
				"24	 피코크 들깨미역    39,800  1     39,800",
				"25	 흑원당 말차 밀     44,800  1     44,800", 
				"26* 1+ 등급란 10개     34,800  2     69,600",
				"27	 동원양반볶음김    790,800  1    790,800" };

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###"); // 숫자 포맷을 설정해준다

		for (int k33_i = 0; k33_i < k33_OneRec.length; k33_i++) { // OneRec크기 만큼 실행되는 반복문 생성
			int k33_price = Integer.parseInt((new String(k33_OneRec[k33_i].getBytes(), 20, 9)).replaceAll(",", "").trim()); // 가격은 배열 OneRec의 i번째의 20부터 9개이고 ','과 공백을 제거한다
			int k33_amount = Integer.parseInt((new String(k33_OneRec[k33_i].getBytes(), 30, 2)).replaceAll(",", "").trim()); // 개수는 배열 OneRec의 i번째의 30부터 2개이고 ','과 공백을 제거한다
			int k33_sum = Integer.parseInt((new String(k33_OneRec[k33_i].getBytes(), 33, 10)).replaceAll(",", "").trim()); // 합계는 배열 OneRec의 i번째의 33부터 10개이고 ','과 공백을 제거한다
			if (k33_sum != k33_price * k33_amount) { // 현재의 합계가 가격과 개수의 곱과 값이 다르다면 오류를 수정하고 출력
				System.out.printf("%s\n", "*************************************************");
				System.out.printf("%s[%s]\n", "오류", k33_OneRec[k33_i]);
				System.out.printf("%s[%s%10s]\n", "수정", (new String(k33_OneRec[k33_i].getBytes(), 0, 33)), k33_df.format(k33_price * k33_amount));
				System.out.printf("%s\n", "*************************************************");
			}
		}
	}
}


