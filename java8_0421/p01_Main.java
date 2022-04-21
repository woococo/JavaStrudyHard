 package java8_0421;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// 읽고 쓰기

public class p01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	// 예외처리를 하기 위한 try/catch문을 생성!
			File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\test1.txt"); 
			// 새로 만들 파일의 위치와 파일명(test1.txt)을 지정해준다
			FileWriter k33_fw = new FileWriter(k33_file);	//  파일에 내용을 입력하는 변수
			k33_fw.write("안녕 파일\n");	// 파일에 내용을 입력한다
			k33_fw.write("hello 헬로\n");	// 파일에 내용을 입력한다

			k33_fw.close();	// 파일을 닫아준다.

			FileReader k33_fr = new FileReader(k33_file);	// 파일의 내용을 읽는 변수

			int k33_n = -1;	// 정수형 변수 k33_n 선언
			char[] k33_ch;	// 문자형 배열 k33_ch 선언

			while (true) {	// 탈출조건에 맞을때까지 돌아가는 while문 생성
				k33_ch = new char[100];	// k33_ch배열에 크기를 지정
				k33_n = k33_fr.read(k33_ch);	
				if (k33_n == -1) {	// 더 이상 읽을 것이 없는 상태가 되면
					break;	// while문에서 탈출한다
				}
				for (int k33_i = 0; k33_i < k33_n; k33_i++) {	// 0부터 k33_n까지 실행되는 for문을 생성
					System.out.printf("%c", k33_ch[k33_i]);	// 배열 k33_ch의 k33_i값을 출력한다.
				}
			}
			k33_fr.close();	// k33_fr을 닫는다. 꼭 닫아주어야 함
			System.out.println("\nFILE READ END");	// 파일 읽는 것이 끝났음을 출력
		} catch (Exception k33_e) {	// 예외가 발생했을 경우
			System.out.printf("나 에러 [%s]\n", k33_e);	// 에러라고 표시한다~
		}
	}
}
