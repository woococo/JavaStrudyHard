package java7강;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class p10_Main {

	static int k33_iPerson = 200;	 // 학생수 설정
	static int k33_pageAmount = 30;	 // 페이지당 할당량 설정
	static int pageCnt = 1;		// 페이지 카운트, 페이지가 넘어갈때마다 1개씩 증가하도록 만듬
	static int cnt = 1; // 현재 페이지 평균 값을 내기위한 카운트 선언
	
	static ArrayList<p09_OneRec> ArrayOneRec = new ArrayList<p09_OneRec>();
	
	static int k33_korSum = 0, k33_engSum = 0, k33_matSum = 0, k33_sumSum = 0, k33_aveSum = 0, // 현재 페이지 과목 합계 값을 내기 위한 변수 선언
			k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;	// 현재 페이지 과목 평균 값을 내기 위한 변수 선언
	static int k33_korTotalSum = 0, k33_engTotalSum = 0, k33_matTotalSum = 0, k33_sumTotalSum = 0, k33_aveTotalSum = 0, // 누적 페이지 과목 합계 값 변수 선언
			k33_korTotalAve = 0, k33_engTotalAve = 0, k33_matTotalAve = 0, k33_sumTotalAve = 0, k33_aveTotalAve = 0;	// 누적 페이지 과목 평균 값 변수 선언

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();
		for (int i = 0; i < pageCnt; i++) {
			HeaderPrint();
			for ( int j = 0; j < cnt; j++) {
				Itemprint(i);
			}
		}
		TailPrint();
	}

	public static void dataSet() {
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) { // 사람수 만큼 정보 출력
			String k33_name = String.format("홍길%03d", k33_i + 1); // 이름 생성
			int k33_kor = (int) (Math.random() * 100); // 국어 점수 생성
			int k33_eng = (int) (Math.random() * 100); // 영어 점수 생성
			int k33_mat = (int) (Math.random() * 100); // 수학 점수 생성
			ArrayOneRec.add(new p10_OneRec(k33_i, k33_name, k33_kor, k33_eng, k33_mat));	
		}
		if (k33_iPerson % k33_pageAmount == 0) {
			pageCnt = k33_iPerson / k33_pageAmount;
		} else {
			pageCnt = (k33_iPerson / k33_pageAmount) + 1;
		}
	}
	
	public static void HeaderPrint() {
		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜 포맷을 k33_sdtA로 정한다.
		System.out.printf("%25s\n\n", "성적집계표");
		System.out.printf("%s%s%17s%s\n", "PAGE : ", pageCnt, "출력일자 : ", k33_sdtA.format(k33_calt.getTime())); // 페이지와 출력일자를 출력
		System.out.println("==================================================");
		System.out.printf("%s%6s%6s%5s%5s%5s%5s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==================================================");
	}
	
	public static void Itemprint(int i) {
		
		p09_OneRec rec;
		rec = ArrayOneRec.get(cnt);
		System.out.printf("%02d %6s %4d %6d %6d %7d %8.2f \n", rec.studentId(), rec.name(), rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		
		
		k33_korSum += rec.kor();
		k33_engSum += rec.eng();
		k33_matSum += rec.mat();
		k33_sumSum += rec.sum();
		k33_aveSum += rec.ave();
		k33_korTotalSum += rec.kor();
		k33_engTotalSum += rec.eng();
		k33_matTotalSum += rec.mat();
		k33_sumTotalSum += rec.sum();
		k33_aveTotalSum += rec.ave();
		cnt++;
	}
	
	public static void TailPrint() {
		System.out.println("==================================================");
		System.out.printf("%s\n", "현재페이지");
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "합계", " ", k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum);
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "평균", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
		System.out.println("==================================================");
		System.out.printf("%s\n", "누적페이지");
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "합계", " ", k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum);
		// 누적페이지 부분의 각 과목별 평균을 출력한다.
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n\n", "평균", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
		k33_korSum = 0; k33_engSum = 0; k33_matSum = 0; k33_sumSum = 0; k33_aveSum = 0;
		k33_korAve = 0; k33_engAve = 0; k33_matAve = 0; k33_sumAve = 0; k33_aveAve = 0;
		cnt = 1;
	}
	
	
	
}
