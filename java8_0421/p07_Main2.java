package java8_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 20150112(아무특정날자)의 모든 종목을 추출하여 파일을 만드시오

public class p07_Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\StockDailyPrice.csv");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// StockDailyPrice.csv 파일을 버퍼로 읽는다
		
		File k33_file1 = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\20150112.csv");
		BufferedWriter k33_bw1 = new BufferedWriter(new FileWriter(k33_file1));
		// 버퍼로 20150112.csv파일을 생성하고 내용을 입력하자
		
		long k33_startTime = System.currentTimeMillis();
		// 시작시간을 출력하기 위해서 현재시간을 받아온다
		
		String k33_readtxt; // 한줄씩 읽어올 문자열 변수 선언
		String k33_code = "20150112";	// code 변수를 선언해서 지정 날짜를 담아준다

		int k33_cnt = 0;	// 몇개의 데이터를 읽었는지 확인하기 위해서 정수형 변수를 선언
		int k33_wcnt = 0;	// 몇개의 데이터를 담았는지 확인하기 위해서 정수형 변수를 선언
		
		System.out.println("*** 2015년 1월 12일 주가 정보 ***");
		System.out.printf("시작 시간 : %s\n", k33_formatTime(k33_startTime)); 	// 시작시간을 출력
		
		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt에 k33_br.readLine() 값을 대입하고 그 값이 null이 아닐 경우에
			StringBuffer k33_s = new StringBuffer();
			// 파일에 내용을 입력하기 위해 필요한 StringBuffer변수를 선언
			String[] k33_field = k33_readtxt.split(",");
			// 문자열 배열 k33_field를 선언하고 k33_readtxt를 ,를 기준으로 값을 나눠 저장한다

			if (k33_field[1].equals(k33_code)) {
				// 거래일이 담겨있는 k33_field[1]에서 지정 날짜와 일치하는 것을 찾는다
				for (int k33_i = 1; k33_i < k33_field.length; k33_i++) {
					// 1부터 k33_field크기만큼 실행되는 for문 생성
					k33_s.append(k33_field[k33_i] + ",");
					// k33_field의 k33_i값과 ,를 k33_s에 저장한다
				}
				k33_bw1.write(k33_s.toString());
				// k33_s 값을 k33_bw1 파일에 입력한다
				k33_bw1.newLine(); // 줄 넘기기
				k33_wcnt++;	// 데이터를 추출했으므로 k33_wcnt을 증가시킨다
			}
			k33_cnt++; // 한줄의 데이터를 읽었으므로 k33_cnt를 증가시킨다
		}
		k33_br.close();	// 열어두었던 k33_br을 닫는다
		k33_bw1.close();	// 내용을 다 입력했으므로 k33_bw1을 닫는다
		
		System.out.printf("Program End [%d] [%d] records\n", k33_cnt, k33_wcnt);
		// 읽은 데이터의 수와 추출된 데이터의 수를 출력한다
		
		long k33_endTime = System.currentTimeMillis();	// 종료시간을 입력받는다
		System.out.printf("종료 시간 : %s\n", k33_formatTime(k33_endTime));	// 종료시간을 출력
		System.out.printf("소요 시간(초) : %s", (k33_endTime - k33_startTime) / 1000.0f + "초");	// 소요시간을 출력
	}
	
	public static String k33_formatTime(long k33_time) {
		// 시작시간과 종료시간을 출력하기 위한 메서드
		Calendar k33_c = Calendar.getInstance();	// 현재시간을 입력받는다
		k33_c.setTimeInMillis(k33_time);	// 소요시간을 계산하기 위해서 초단위를 받는다
		return (k33_c.get(Calendar.YEAR) + "년 " + (k33_c.get(Calendar.MONTH) + 1) + "월 " + k33_c.get(Calendar.DATE) + "일 "
				+ k33_c.get(Calendar.HOUR_OF_DAY) + "시 " + k33_c.get(Calendar.MINUTE) + "분 " + k33_c.get(Calendar.SECOND) + "."
				+ k33_c.get(Calendar.MILLISECOND) + "초");	// 시간을 출력한다~
	}
}

