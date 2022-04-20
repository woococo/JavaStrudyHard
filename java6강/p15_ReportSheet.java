package java6강;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p15_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 30; // 이 값을 주는만큼 저장소 생성

		p15_InputData k33_inData = new p15_InputData(k33_iPerson); // 클래스를 받아 객체를 만들고 인스턴스를 생성하여 객체에 연결한다

		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	// 날짜 포맷을 k33_sdtA로 정한다.
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {	// k33_iPerson크기만큼 실행되는 for문
			String k33_name = String.format("홍길%02d", k33_i); // 이름 만들기
			int k33_kor = (int) (Math.random() * 100); // 국어 점수 만들기
			int k33_eng = (int) (Math.random() * 100); // 영어 점수 만들기
			int k33_mat = (int) (Math.random() * 100); // 수학 점수 만들기
			k33_inData.p15_InputData(k33_i, k33_name, k33_kor, k33_eng, k33_mat); // 클래스내 값 입력
		}

		System.out.printf("%25s\n", "성적집계표");
		System.out.printf("%26s%s\n", "출력일자 : ", k33_sdtA.format(k33_calt.getTime()));	// 현재시간을 출력한다.
		System.out.println("==================================================");
		System.out.printf("%s%6s%6s%5s%5s%5s%5s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==================================================");

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {	// k33_iPerson 크기만큼 실행되는 for문
			System.out.printf("%03d%8s%7d%7d%7d%7d%7d\n", 
					k33_i + 1, k33_inData.k33_nameArr[k33_i], k33_inData.k33_korArr[k33_i], k33_inData.k33_engArr[k33_i],
					k33_inData.k33_matArr[k33_i], k33_inData.k33_sumArr[k33_i], (int) (k33_inData.k33_aveArr[k33_i]));
			// 번호, 이름, 국어, 영어, 수학, 총점, 평균 순서대로 출력한다
		}
		System.out.println("==================================================");
		// 합계와 평균을 구하기 위한 변수들을 선언한다.
		int k33_korTotal = 0, k33_engTotal = 0, k33_matTotal = 0, k33_sumTotal = 0, k33_aveTotal = 0, 
				k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;

		for (int k33_i = 0; k33_i < k33_inData.k33_nameArr.length; k33_i++) {	// k33_nameArr 크기만큼 실행되는 for문
			k33_korTotal += k33_inData.k33_korArr[k33_i];	
			k33_engTotal += k33_inData.k33_engArr[k33_i];
			k33_matTotal += k33_inData.k33_matArr[k33_i];
			k33_sumTotal += k33_inData.k33_sumArr[k33_i];
			k33_aveTotal += k33_inData.k33_aveArr[k33_i];
			// 과목별 합계를 구하기 위해 과목값을 저장해둔 배열들의 합을 구한다.
		}
		
		// 과목별 평균을 구하기 위해서 합계점수를 저장소만큼 나눈다
		k33_korAve = k33_korTotal/k33_iPerson;
		k33_engAve = k33_engTotal/k33_iPerson;
		k33_matAve = k33_matTotal/k33_iPerson;
		k33_sumAve = k33_sumTotal/k33_iPerson;
		k33_aveAve = k33_aveTotal/k33_iPerson;
		
		// 각각의 합계를 출력한다
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "합계", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal,
				(int) (k33_aveTotal));
		
		// 각각의 평균을 출력한다
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "평균", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, (int)(k33_aveAve));

	}
}