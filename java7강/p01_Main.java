package java7강;

public class p01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("k33_HanBlankForeword[%s]\n", k33_HanBlankForeword("한글abcd", 15)); // "한글abcd" 앞에 빈칸으로 채우기
		System.out.printf("k33_HanBlankForeword[%s]\n", k33_HanBlankForeword("한글한글aa", 15)); // "한글한글aa" 앞에 빈칸으로 채우기
		System.out.printf("k33_HanBlankBackword[%s]\n", k33_HanBlankBackword("한글aa", 15)); // "한글aa" 뒤에 빈칸으로 채우기
		System.out.printf("k33_HanBlankBackword[%s]\n", k33_HanBlankBackword("한글한글aa", 15)); // "한글한글aa" 뒤에 빈칸으로 채우기
		System.out.printf("한글은 [%d]개\n", k33_HanCount("한글한글aa")); // 한글은 몇개인지 출력
	}

	public static String k33_HanBlankForeword(String k33_input, int k33_length) {	// 문자열 앞을 빈칸으로 채우고 총 문자열 길이를 k33_length로 설정
		String k33_output = ""; // 빈칸을 채우는 변수
		byte [] k33_byte = k33_input.getBytes(); // 입력받은 문자열을 하나씩 배열에 넣는다
		for (int i = 0; i < k33_length - k33_byte.length; i++) { 
			k33_output = k33_output + " "; // 빈칸을 추가한다
		}
		return k33_output + k33_input; // 누적된 빈칸과 입력받은 문자열을 리턴한다
	}

	public static String k33_HanBlankBackword(String k33_input, int k33_length) { // 문자열 뒤를 빈칸으로 채우고 총 문자열 길이를 k33_length로 설정
		String k33_output = ""; // 빈칸을 채우는 변수
		byte [] k33_byte = k33_input.getBytes(); // 입력받은 문자열을 하나씩 배열에 넣는다
		for (int i = 0; i < k33_length - k33_byte.length; i++) {
			k33_output = k33_output + " "; // 빈칸을 추가한다
		}
		return k33_input + k33_output; // 입력받은 문자열과 누적된 빈칸을 출력한다
	}

	public static int k33_HanCount(String k33_input) { // 한글 개수를 세는 함수
		int k33_cnt = 0;	// k33_cnt 변수를 선언하고 0으로 초기화해준다
		byte [] k33_byte = k33_input.getBytes(); // 입력받은 문자열을 byte로 나눠서 배열에 넣어준다
		k33_cnt = k33_byte.length - k33_input.length(); // k33_cnt는 k33_byte 길이에서 k33_input길이를 빼주면 된다
		return k33_cnt; // 한글개수를 리턴한다
	}
}
