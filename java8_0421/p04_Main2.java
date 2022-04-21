package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// 분당 융기원과 가장 가까운 곳과, 먼 곳을 찾아서 출력

public class p04_Main2 {

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

		double k33_lat = 37.3860521; // 기준이 될 위도 값을 설정
		double k33_lng = 127.1214038; // 기준이 될 경도 값을 설정

		ArrayList<String> k33_adressArr = new ArrayList<>();	// 주소를 저장해둘 문자열 ArratList 선언
		ArrayList<Double> k33_distArr = new ArrayList<>();	// 거리 값을 저장해 둘 더블 ArrayList 선언
		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt에 k33_br.readLine() 값을 대입하고 그 값이 null이 아닐 경우에
			String[] k33_field = k33_readtxt.split("\t");
			// 문자열 배열 k33_field를 선언하고 k33_readtxt를 \t를 기준으로 값을 나눠 저장한다
			double k33_dist = Math.sqrt(Math.pow(Double.parseDouble(k33_field[13]) - k33_lat, 2)
					+ Math.pow(Double.parseDouble(k33_field[14]) - k33_lng, 2));
			// 기준 장소와의 거리를 계산 --> 점(a,b) 점(c,d)간의 거리를 피타고라스 정리를 이용
			k33_distArr.add(k33_dist);	// k33_distArr에 거리 값 (k33_dist)을 추가한다.
			k33_adressArr.add(k33_field[9]);	// k33_adressArr에 주소를 추가한다.
		}
		k33_br.close();	// 파일을 닫는다
		k33_resultPrint(k33_adressArr, k33_distArr);	// 가장 가까운 곳과 가장 먼 곳을 출력하기 위한 메소드로 이동
	}

	public static void k33_resultPrint(ArrayList<String> k33_adressArr, ArrayList<Double> k33_distArr) {
		// 가장 가까운 곳과 가장 먼 곳을 출력하기 위한 메소드이다.
		double k33_Max = -1.0;	// 최대값 k33_Max을 선언, 초기값을 -1로 설정한다
		double k33_Min = 1.0;		// 최저값 k33_Min을 선언, 초기값을 1로 설정한다
		String k33_maxAdr = "";	// 가장 먼 곳의 장소를 담을 문자열 변수 k33_maxAdr를 선언
		String k33_minAdr = "";	// 가장 가까운 곳의 장소를 담을 문자열 변수 k33_minAdr를 선언

		for (int k33_i = 0; k33_i < k33_distArr.size(); k33_i++) { // 0부터 k33_distArr의 크기만큼 실행되는 for문 생성
			if (k33_distArr.get(k33_i) > k33_Max) {	// k33_distArr의 k33_i 값이 k33_Max값 보다 크다면
				k33_Max = k33_distArr.get(k33_i);	// 최대값을 k33_distArr의 k33_i 값으로 설정
				k33_maxAdr = k33_adressArr.get(k33_i);	// 최대값을 가진 장소 또한 k33_adressArr의 k33_i값으로 설정
			}

			if (k33_distArr.get(k33_i) < k33_Min) {	// k33_distArr의 k33_i 값이 k33_Max값 보다 작다면
				k33_Min = k33_distArr.get(k33_i);	// 최저값을 k33_distArr의 k33_i 값으로 설정
				k33_minAdr = k33_adressArr.get(k33_i);	// 최대값을 가진 장소 또한 k33_adressArr의 k33_i값으로 설정
			}
		}

		System.out.printf("분당융기원과 가장 가까운 곳 : %s, %fkm\n", k33_minAdr, k33_Min * 100);	// 가장 가까운 곳의 장소와 거리를 출력
		System.out.printf("분당융기원과 가장 먼 곳 : %s, %fkm\n", k33_maxAdr, k33_Max * 100);	// 가장 먼 곳의 장소와 거리를 출력
	}
}
