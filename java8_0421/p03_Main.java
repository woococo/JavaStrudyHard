package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 실제파일에 응용

public class p03_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 무료와이파이정보_경기도 파일을 버퍼로 읽어오자
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\무료와이파이정보_경기도.csv");
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_file));
		
		String k33_readtxt;	// 한줄씩 읽어올 문자열 변수 선언
		
		if((k33_readtxt = k33_br.readLine()) == null) {	
			// k33_readtxt에 br.readLine()값을 대입하는데 그 값이 null일 경우에
			System.out.printf("빈 파일입니다\n");	// 빈 파일이라고 출력
			return;
		}
		
		String[] k33_fieldName = k33_readtxt.split(",");	
		// 배열 k33_fieldName에 k33_readtxt를 ,를 기준으로 나눈 값을 저장한다
		// k33_readtxt는 첫번째 줄로 필드 값이다.
		
		int k33_LineCnt = 1;	// 항목순서를 출력할 변수를 선언한다
		
		while((k33_readtxt = k33_br.readLine())!= null) {	
			// k33_readtxt에 k33_br.readLine() 값을 대입하고 그 값이 null이 아닐 경우에
			String[] k33_field = k33_readtxt.split(",");
			// 문자열 배열 k33_field를 선언하고 k33_readtxt를 ,를 기준으로 값을 나눠 저장한다
			System.out.printf("**[%02d번째 항목]***************\n", k33_LineCnt);	// 항목번호 출력한다
			for (int k33_i = 0; k33_i < k33_fieldName.length; k33_i++) {	
				// 0부터 배열 k33_fieldName의 크기만큼 실행되는 for문을 생성
				System.out.printf(" %s : %s\n", k33_fieldName[k33_i], k33_field[k33_i]);
				// 필드명과 필드 값을 출력한다.
			}
			
			System.out.println("******************************\n");
			if(k33_LineCnt == 7909) {	// 항목변호가 100이 되면 while문을 탈출한다~
				break;
			}
			
			k33_LineCnt++; // 그다음 항목을 맞이하기위해서 1을 증가
		}
		
		k33_br.close();	// 수행 끝! 파일을 닫는다
	}
}

