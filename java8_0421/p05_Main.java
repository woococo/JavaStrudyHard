package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 파일 훑어보고 감잡기

public class p05_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\day_data\\THTSKS010H00.dat");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// THTSKS010H00 파일을 버퍼로 읽어오자

		String k33_readtxt; // 한줄씩 읽어올 문자열 변수 선언

		int k33_n = -1;	//false를 숫자로 변환한 값을 대입

		StringBuffer k33_s = new StringBuffer();	
		// 파일 내용을 출력하기 위해서 StringBuffer 변수를 선언

		while (true) {	// 조건에 도달하면 멈추는 while문을 생성
			char[] k33_ch = new char[1000]; // 크기가 1000인 문자형 배열을 선언
			k33_n = k33_br.read(k33_ch);

			if (k33_n == -1) { // k33_n가 -1이 되면 while문을 탈출
				break;
			}

			for (char k33_c : k33_ch) {	// for문 안에 문자형 변수 k33_c을 선언
				if (k33_c == '\n') {	// k33_c가 '\n'와 일치하면
					System.out.printf("[%s]***\n", k33_s.toString()); // k33_s.toString를 출력
					k33_s.delete(0, k33_s.length()); // k33_s의 0부터 크기까지 삭제
					} else {	// k33_c가 '\n'와 일치하지 않다면
					k33_s.append(k33_c);	// k33_s에 k33_c값 추가
				}
			}
		}
		System.out.printf("[%s]***\n", k33_s.toString());	// k33_s를 출력
		k33_br.close();	// k33_br를 닫는다
	}
}
