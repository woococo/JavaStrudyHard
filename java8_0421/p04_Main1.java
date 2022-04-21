package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 거리계산
public class p04_Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 무료와이파이정보_경기도 파일을 버퍼로 읽어오자
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\무료와이파이정보_경기도.txt");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));

		String k33_readtxt; // 한줄씩 읽어올 문자열 변수 선언

		if ((k33_readtxt = k33_br.readLine()) == null) {
			// k33_readtxt에 br.readLine()값을 대입하는데 그 값이 null일 경우에
			System.out.printf("빈 파일입니다\n"); // 빈 파일이라고 출력
			return;
		}

		String[] k33_fieldName = k33_readtxt.split("\t");
		// 배열 k33_fieldName에 k33_readtxt를 \t를 기준으로 나눈 값을 저장한다
		// k33_readtxt는 첫번째 줄로 필드 값이다.
		
		double k33_lat = 37.3860521;	// 기준이 될 위도 값을 설정
		double k33_lng = 127.1214038;	// 기준이 될 경도 값을 설정

		int k33_LineCnt = 0;	// 항목순서를 출력할 변수를 선언한다
		
		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt에 k33_br.readLine() 값을 대입하고 그 값이 null이 아닐 경우에
			String[] k33_field = k33_readtxt.split("\t");
			// 문자열 배열 k33_field를 선언하고 k33_readtxt를 \t를 기준으로 값을 나눠 저장한다
			System.out.printf("**[%d번째 항목]*****************************************\n", k33_LineCnt); // 항목번호 출력한다
			System.out.printf(" %s : %s\n", k33_fieldName[9], k33_field[9]);	//	9번째 필드이름과 필드 값을 출력한다 (도로명주소)
			System.out.printf(" %s : %s\n", k33_fieldName[13], k33_field[13]);	// 13번째 필드이름과 필드 값을 출력한다 (위도 주소)
			System.out.printf(" %s : %s\n", k33_fieldName[14], k33_field[14]);	// 14번째 필드이름과 필드 값을 출력한다 (경도 주소)
			double k33_dist = Math.sqrt(Math.pow(Double.parseDouble(k33_field[13]) - k33_lat, 2)	
					+ Math.pow(Double.parseDouble(k33_field[14]) - k33_lng, 2));
			// 기준 장소와의 거리를 계산 --> 점(a,b) 점(c,d)간의 거리를 피타고라스 정리를 이용
			System.out.printf(" 현재지점과 거리 : %f\n", k33_dist); // 현재 지점과의 거리를 출력
			System.out.println("**********************************************************\n");

			k33_LineCnt++;	// 항목번호를 증가
		}
		k33_br.close();	// 파일을 닫는다!
	}
}

