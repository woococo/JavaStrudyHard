package java7강;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class p03_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] k33_OneRec = { 
				"순번,상호명,소재지(도로명),연락처",
				"1,샤랄랄라,부산광역시 북구 금곡대로 469_ 농협하나로클럽 2층 (금곡동), 051-363-9087",
				"2,꼬마다락방,부산광역시 북구 구포시장길 48_ 3층 (구포동),051-338-5559",
				"3,파리봉봉(화명점),부산광역시 북구 금곡대로303번길 2_ 시티타워 1201호 (화명동),051-363-0060",
				"4,더놀다 부산화명점,부산광역시 북구 화명대로 32_ 다운타운프라자 5층 502호 (화명동),051-363-3631",
				"5,키즈파크(뉴코아 덕천점 실내놀이터),부산광역시 북구 만덕대로 23_ 폴라렉스 5층 (덕천동),051-363-3631",
				"6,아이점프 만덕점,부산광역시 북구 만덕3로16번길 11_ 4층(만덕동,벽산라인훼미리타운),070-8252-3921",
				"7,주니어킹덤(일반음식점 겸업),부산광역시 북구 화명대로 17_ 목양프라자 4층,051-363-2288" };

		String[] k33_fieldName = k33_OneRec[0].split(","); // fieldName에 배열OneRec의 0번인 이름들을 ','로 나눠서 넣어준다.
		for (int k33_i = 1;  k33_i < k33_OneRec.length; k33_i++) { // 1부터 OneRec 길이까지 수행되는 for문 생성
			String[] k33_field = k33_OneRec[k33_i].split(","); // OneRec의 i번 문자열을 ','를 기준으로 나눠서 저장
			System.out.printf("****************************************************\n");
			for (int k33_j = 0; k33_j < k33_fieldName.length; k33_j++) {
				System.out.printf(" %s : %s\n", k33_fieldName[k33_j], k33_field[k33_j]);
			} // 필드명과 필드 값을 출력한다
			System.out.printf("****************************************************\n");
		}
	}
}
