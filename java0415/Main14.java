package java0415;

public class Main14 {

	// 2-9. 숫자읽기 고급

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_iNumVal = 1001034567;	
		// 정수형 변수인 k33_iNumVal를 선언하고 1001034567를 대입한다.
		String k33_sNumVal = String.valueOf(k33_iNumVal);	
		// 문자열 변수인 k33_sNumVal를 선언하고 k33_iNumVal를 String으로 변환한 값을 대입한다.
		String k33_sNumVoice = "";	
		// 문자열 변수인 k33_sNumVoice를 선언하고 초기화해준다.
		System.out.printf("==> %s [%d자리]\n", k33_sNumVal, k33_sNumVal.length());
		// k33_sNumVal와 문자열 k33_sNumVal의 길이를 출력한다.
		int k33_i, k33_j; // 정수형 변수인 k33_i와 k33_j를 선언한다.
		
		String[] k33_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] k33_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 문자열 배열인 k33_units와 k33_unitX을 선언하고 각 값을 넣어 저장한다.
		
		k33_i = 0;	// k33_i의 값을 0으로 초기화시켜준다.
		k33_j = k33_sNumVal.length() - 1;	// k33_j에 문자열 k33_sNumVal의 길이에 1을 뺀 값을 대입한다.

		while (true) {	// 조건에 맞춰 멈출때까지 무한으로 돌아가는 while문을 생성한다.
			if (k33_i >= k33_sNumVal.length()) {	// k33_i가 문자열 k33_sNumVal의 길이보다 작거나 같다면
				break;	// 멈춘다!
			}

			System.out.printf("%s[%s]", k33_sNumVal.substring(k33_i, k33_i + 1),
					k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i + 1))]);
			// 문자열 k33_sNumVal의 k33_i 부터 k33_i + 1까지의 값과 
			// 베열 k33_units의 문자열 k33_sNumVal의 k33_i 부터 k33_i + 1까지의 값을 정수로 변환한 값을 출력한다.
			if (k33_sNumVal.substring(k33_i, k33_i + 1).equals("0")) { // 문자열 k33_sNumVal의 k33_i부터 k33_i + 1까지의 값이 "0"과 일치한다면
				if (k33_unitX[k33_j].equals("만") || k33_unitX[k33_j].equals("억")) { 
					// 배열 k33_unitX[k33_j]의 값이 "만"과 일치하거나  k33_unitX[k33_j]의 값이 "억"과 일치한다면
					k33_sNumVoice = k33_sNumVoice + "" + k33_unitX[k33_j];
					// k33_sNumVoice에 k33_sNumVoice + "" + k33_unitX[k33_j]을 대입한다.
				} else {	// 아니라면 ?
					// 아무짓도 하지 않는다.
				}
			} else { // 아니라면?
				k33_sNumVoice = k33_sNumVoice + k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i + 1))] + k33_unitX[k33_j];
				// k33_sNumVoice에 k33_sNumVoice을 더하고 배열 k33_units에  k33_sNumVal을 substring로 나눈 값을 정수로 변환한 
			}
			k33_i++;	// k33_i이 1씩 증가되도록 한다.
			k33_j--;	// k33_j이 1씩 감소되도록 한다.
		}
		System.out.printf("\n %s[%s]\n", k33_sNumVal, k33_sNumVoice); // k33_sNumVa와 k33_sNumVoice을 출력한다.
	}
}
