package java7강;

import java.text.DecimalFormat;

public class p04_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] OneRec = { "순위,지역,정류장명,승차,하차,총 이용인원", 
				"1,부산광역시,부산역(2600055),8819,5788,14607",
				"2,부산광역시,롯데호텔백화점서면역(2613488),7187,2662,9848", "3,부산광역시,롯데호텔백화점서면역(2613487),4927,4111,9038n",
				"4,부산광역시,롯데호텔백화점서면역(2616302),5749,2469,8219", "5,부산광역시,구포시장(2600925),4329,3514,7842",
				"6,부산광역시,서면역.서면지하상가(2621684),5182,1465,6647", "7,부산광역시,서면한전(2621685),4227,2013,6241",
				"8,부산광역시,롯데호텔백화점서면역(2616303),3066,3114,6181", "9,부산광역시,서구청(2600498),4031,1984,6015",
				"10,부산광역시,덕천역(2601444),3543,2404,5946" };

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");
		System.out.println("<<부산광역시 최다 이용 정류장>>");
		String[] fieldName = OneRec[0].split(",");
		for (int i = 1; i < OneRec.length; i++) {
			String[] field = OneRec[i].split(",");
			System.out.printf("****************************************************\n");
			System.out.printf(" %s : %s\n", fieldName[0], field[0]);
			System.out.printf(" %s : %s\n", fieldName[1], field[1]);
			System.out.printf(" %s : %s\n", fieldName[2], field[2]);
			
			for (int j = 3; j < fieldName.length-1; j++) {
				System.out.printf(" %s : %s[%s]\n", fieldName[j], k33_df.format(Integer.parseInt(field[j])), k33_print(field[j]));
			}
			System.out.printf("****************************************************\n");
		}
	}

	public static String k33_print(String k33_sNumVal) {
		int k33_i = 0; // k33_i의 값을 0으로 초기화시켜준다.
		int k33_j = k33_sNumVal.length() -1; // k33_j에 문자열 k33_sNumVal의 길이에 1을 뺀 값을 대입한다.
		// 배열의 값을 불러올 때 써야하기 때문에 -1
		String k33_sNumVoice = "";
		String[] k33_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] k33_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 문자열 배열인 k33_units와 k33_unitX을 선언하고 각 값을 넣어 저장한다.
		// k33_units에는 숫자를 한글로 읽은 값을 입력
		// k33_unitX에는 숫자 단위를 입력

		while (true) { // 조건에 맞춰 멈출때까지 무한으로 돌아가는 while문을 생성한다.
			if (k33_i >= k33_sNumVal.length()) { // k33_i가 문자열 k33_sNumVal의 길이보다 작거나 같다면
				break; // 멈춘다!
			}

			if (k33_sNumVal.substring(k33_i, k33_i + 1).equals("0")) { // 문자열 k33_sNumVal의 k33_i 값이 "0"과 일치한다면
				if (k33_sNumVal.length() <= 8) {
					k33_sNumVoice = k33_sNumVoice
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