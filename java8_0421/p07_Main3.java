package java8_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

// 삼성전자의 주가에 대하여 2015년 최대값과 최소값을 구하시오(종가기준)

public class p07_Main3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\StockDailyPrice.csv");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// StockDailyPrice.csv 파일을 버퍼로 읽는다
		
		File k33_file1 = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\A005930_2015.csv");
		BufferedWriter k33_bw1 = new BufferedWriter(new FileWriter(k33_file1));
		// 버퍼로 A005930_2015.csv파일을 생성하고 내용을 입력하자
		
		long k33_startTime = System.currentTimeMillis();
		// 시작시간을 출력하기 위해서 현재시간을 받아온다
		
		String k33_readtxt; // 한줄씩 읽어올 문자열 변수 선언
		String k33_code1 = "2015";  	// code1 변수를 선언해서 지정 년도를 담아준다
		String k33_code2 = "A005930";	// code2 변수를 선언해서 삼성전자 코드를 담아준다
		ArrayList<String> k33_stckPrp = new ArrayList<>();	
		// 최고값 최대값을 구하기 위해서 주식 종가를 담을 문자열형 ArrayList을 선언한다
		ArrayList<String> k33_date = new ArrayList<>();
		// 최고값 최대값을 가진 날짜를 구하기 위해서 날짜를 담을 문자열형 ArrayList을 선언한다
		int k33_cnt = 0;	// 몇개의 데이터를 읽었는지 확인하기 위해서 정수형 변수를 선언
		int k33_wcnt = 0;	// 몇개의 데이터를 담았는지 확인하기 위해서 정수형 변수를 선언

		System.out.println("*** 삼성전자(A005930)의 2015년 주가 정보 ***");
		System.out.printf("시작 시간 : %s\n", k33_formatTime(k33_startTime)); 	// 시작시간을 출력

		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt에 k33_br.readLine() 값을 대입하고 그 값이 null이 아닐 경우에
			StringBuffer k33_s = new StringBuffer();
			// 파일에 내용을 입력하기 위해 필요한 StringBuffer변수를 선언
			String[] k33_field = k33_readtxt.split(",");
			// 문자열 배열 k33_field를 선언하고 k33_readtxt를 ,를 기준으로 값을 나눠 저장한다

			if (k33_field[1].contains(k33_code1) && k33_field[2].equals(k33_code2)) {
				// 거래일이 저장된 k33_field[1]에서 지정 날짜와 일치하면서
				// 종목별 코드가 저장되어 있는 k33_field[2]에서 삼성전자 코드와 일치하는 것을 찾는다
				for (int k33_i = 1; k33_i < k33_field.length; k33_i++) {
					// 1부터 k33_field크기만큼 실행되는 for문 생성
					k33_s.append(k33_field[k33_i] + ",");
					// k33_field의 k33_i값과 ,를 k33_s에 저장한다
					k33_stckPrp.add(k33_field[3]);
					// 최고값 최저값을 구하기 위해서 종가가격을 k33_stckPrp에 저장한다
					k33_date.add(k33_field[1]); 
					// 최고값 최저값에 해당하는 날짜를 구하기 위해서 날짜를 k33_date에 저장한다
				}
				k33_bw1.write(k33_s.toString()); // k33_s 값을 k33_bw1 파일에 입력한다
				k33_bw1.newLine(); // 줄 넘기기
				k33_wcnt++;	// 데이터를 추출했으므로 k33_wcnt을 증가시킨다
			}
			k33_cnt++; // 한줄의 데이터를 읽었으므로 k33_cnt를 증가시킨다
		}
		
		k33_br.close();	// 열어두었던 k33_br을 닫는다
		k33_bw1.close();	// 내용을 다 입력했으므로 k33_bw1을 닫는다
		
		System.out.printf("Program End [%d] [%d] records\n", k33_cnt, k33_wcnt);
		// 읽은 데이터의 수와 추출된 데이터의 수를 출력한다
		
		k33_resultPrint(k33_stckPrp, k33_date);	// 종가 기준 최고값과 최저값을 출력하기 위한 메서드로 이동
		
		long k33_endTime = System.currentTimeMillis();	// 종료시간을 입력받는다
		System.out.printf("종료 시간 : %s\n", k33_formatTime(k33_endTime));	// 종료시간을 출력
		System.out.printf("소요 시간(초) : %s", (k33_endTime - k33_startTime) / 1000.0f + "초");	// 소요시간을 출력
	}
			
	public static void k33_resultPrint(ArrayList<String> k33_stckPrp, ArrayList<String> k33_date) {
		// 최고값과 최저값을 출력하기 위한 메서드이다
		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");	// 가격 출력할때 맞출 포맷을 정한다
		int k33_Max = 0; // 최대값 k33_Max을 선언, 초기값을 0으로 설정한다
		int k33_Min = 999999999; // 최저값 k33_Min을 선언, 초기값을 999999999로 설정한다
		String k33_maxDate = ""; // 최고값의 날짜를 담을 문자열 변수 k33_maxAdr를 선언
		String k33_minDate = ""; // 최저값의 날짜를 담을 문자열 변수 k33_minAdr를 선언

		for (int k33_i = 0; k33_i < k33_stckPrp.size(); k33_i++) { // 0부터 k33_stckPrp의 크기만큼 실행되는 for문 생성
			if (Integer.parseInt(k33_stckPrp.get(k33_i)) > k33_Max) { // k33_stckPrp의 k33_i 값이 k33_Max값 보다 크다면
				k33_Max = Integer.parseInt(k33_stckPrp.get(k33_i)); // 최고값을 k33_stckPrp의 k33_i 값으로 설정
				k33_maxDate = k33_date.get(k33_i);	// 최고값을 가진 날짜를 출력하기 위해서 k33_date의 k33_i값을 받아온다
			}

			if (Integer.parseInt(k33_stckPrp.get(k33_i)) < k33_Min) { // k33_stckPrp의 k33_i 값이 k33_Max값 보다 작다면
				k33_Min = Integer.parseInt(k33_stckPrp.get(k33_i)); // 최저값을 k33_stckPrp의 k33_i 값으로 설정
				k33_minDate = k33_date.get(k33_i);	// 최저값을 가진 날짜를 출력하기 위해서 k33_date의 k33_i값을 받아온다
			}
		}
		System.out.printf("삼성전자(2015년)의 주가 최고값(종가 기준) : %s (%s)\n", k33_df.format(k33_Max), k33_maxDate);	// 최고값과 초고값의 날짜를 출력
		System.out.printf("삼성전자(2015년)의 주가 최저값(종가 기준) : %s (%s)\n", k33_df.format(k33_Min), k33_minDate);	// 최저값과 최저값의 날짜를 출력
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
