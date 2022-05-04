package java7강;

import java.text.DecimalFormat;

public class p04_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] k33_OneRec = { "순위,지역,정류장명,승차,하차,총 이용인원", 
				"1,부산광역시,부산역(2600055),8819,5788,14607",
				"2,부산광역시,롯데호텔백화점서면역(2613488),7187,2662,9848", "3,부산광역시,롯데호텔백화점서면역(2613487),4927,4111,9038n",
				"4,부산광역시,롯데호텔백화점서면역(2616302),5749,2469,8219", "5,부산광역시,구포시장(2600925),4329,3514,7842",
				"6,부산광역시,서면역.서면지하상가(2621684),5182,1465,6647", "7,부산광역시,서면한전(2621685),4227,2113,6341",
				"8,부산광역시,롯데호텔백화점서면역(2616303),3166,3114,6281", "9,부산광역시,서구청(2600498),4131,1984,6115",
				"10,부산광역시,덕천역(2601444),3543,2414,5956" };

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###"); // 숫자 포맷을 설정해준다
		System.out.println("<<부산광역시 최다 이용 정류장>>"); 
		String[] k33_fieldName = k33_OneRec[0].split(","); // fieldName에 배열OneRec의 0번인 이름들을 ','로 나눠서 넣어준다.
		for (int k33_i = 1; k33_i < k33_OneRec.length; k33_i++) {
			String[] k33_field = k33_OneRec[k33_i].split(","); // OneRec의 i번 문자열을 ','를 기준으로 나눠서 저장
			System.out.printf("****************************************************\n");
			for (int k33_j = 0; k33_j < 3; k33_j++) { // 0부터 3전까지 실행되는 반복문
				System.out.printf(" %s : %s\n", k33_fieldName[k33_j], k33_field[k33_j]); // 필드명과 필드값을 출력
			}
	
			for (int k33_j = 3; k33_j < k33_fieldName.length - 1; k33_j++) { // 3부터 배열 fieldName 크기의 -1까지 실행되는 반복문
				System.out.printf(" %s : %s[%s]\n", k33_fieldName[k33_j], k33_df.format(Integer.parseInt(k33_field[k33_j])), k33_print(k33_field[k33_j])); 
				// 필드명과 필드값을 출력 
			}
			System.out.printf("****************************************************\n");
		}
	}

	public static String k33_print(String k33_sNumVal) {
		int k33_i = 0; // k33_i의 값을 초기화시킨다.
		int k33_j = k33_sNumVal.length() -1; // k33_j에 문자열 k33_sNumVal의 길이에 1을 뺀 값을 대입
		String k33_sNumVoice = "";
		String[] k33_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열로 숫자를 한글로 읽은 값을 저장
		String[] k33_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 문자열 배열로 숫자 단위를 저장

		while (true) { // 조건에 맞춰 멈출때까지 무한으로 돌아가는 while문을 생성한다.
			if (k33_i >= k33_sNumVal.length()) { // k33_i가 문자열 k33_sNumVal의 길이보다 작거나 같다면
				break; // 멈춘다!
			}

			if (k33_sNumVal.substring(k33_i, k33_i + 1).equals("0")) { // 문자열 k33_sNumVal의 k33_i 값이 "0"과 일치한다면
				if (k33_sNumVal.length() <= 8) {  // k33_sNumVal의 크기가 8보다 작거나 같으면
					k33_sNumVoice = k33_sNumVoice // k33_sNumVoice는 k33_sNumVoice에  k33_units과 k33_unitX의 해당값을 저장한다
							+ k33_units[Integer.parseInt(k33_sNumVoice.substring(k33_i, k33_i + 1))] 
							+ k33_unitX[k33_j];

				} else {
					if (k33_sNumVal.substring(k33_sNumVal.length() - 8, k33_sNumVal.length() - 4).equals("0000")) {
						k33_sNumVal = k33_sNumVal.replace("만", "");
						// 천만자리부터 만자리까지 모두 0으로 0000이면 문자열에서 "만"을 제거한다.
						// 2000000000 을 입력했을때 이십억으로 출력되어야 하는데 이십억만으로 출력되는 현상을 막기위해서.
					} else if (k33_unitX[k33_j].equals("만") || k33_unitX[k33_j].equals("억")) {
						// 또 배열 k33_unitX[k33_j]의 값이 "만"이나 "억"과 일치한다면
						k33_sNumVoice = k33_sNumVoice + "" + k33_unitX[k33_j];
						// k33_sNumVoice에 k33_sNumVoice + "" + k33_unitX[k33_j]을 대입한다.
					} else { // 배열 k33_unitX[k33_j]의 값이 "만"이나 "억"과 일치하지 않는다면
						// 아무짓도 하지 않는다.
					}
				}
			} else { // 문자열 k33_sNumVal의 k33_i 값이 "0"과 일치하지 않는다면?
				k33_sNumVoice = k33_sNumVoice + k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i + 1))]
						+ k33_unitX[k33_j];
				// k33_sNumVoice에 기존 k33_sNumVoice에 배열 k33_units에 k33_sNumVal의 k33_i을 정수로 변환한 값을
				// 대입한 것(숫자가 한글로 출력)과
				// 배열 k33_unitX의 k33_j(단위가 한글로 출력)를 추가한다.
				// while이 돌면서 숫자가 추가됨
			}
			k33_i++; // k33_i이 1씩 증가해서 다음 숫자로 이동하게 한다.
			k33_j--; // k33_j이 1씩 감소해서 단위가 다음으로 이동하게 한다.
		}
		return k33_sNumVoice;
	}
}