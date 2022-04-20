package java6강;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p16_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 200;	 // 학생수 설정
		int k33_pageAmount = 30;	 // 페이지당 할당량 설정
		int pageCnt = 1;		// 페이지 카운트, 페이지가 넘어갈때마다 1개씩 증가하도록 만듬

		p16_InputData k33_inData = new p16_InputData(k33_iPerson); // 클래스를 받아 객체를 만들고 인스턴스를 생성하여 객체에 연결

		int cnt = 1; // 현재 페이지 평균 값을 내기위한 카운트 선언
		int k33_korSum = 0, k33_engSum = 0, k33_matSum = 0, k33_sumSum = 0, k33_aveSum = 0, // 현재 페이지 과목 합계 값을 내기 위한 변수 선언
				k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;	// 현재 페이지 과목 평균 값을 내기 위한 변수 선언
		int k33_korTotalSum = 0, k33_engTotalSum = 0, k33_matTotalSum = 0, k33_sumTotalSum = 0, k33_aveTotalSum = 0, // 누적 페이지 과목 합계 값 변수 선언
				k33_korTotalAve = 0, k33_engTotalAve = 0, k33_matTotalAve = 0, k33_sumTotalAve = 0, k33_aveTotalAve = 0;	// 누적 페이지 과목 평균 값 변수 선언

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) { // 사람수 만큼 정보 출력
			String k33_name = String.format("홍길%03d", k33_i + 1); // 이름 생성
			int k33_kor = (int) (Math.random() * 100); // 국어 점수 생성
			int k33_eng = (int) (Math.random() * 100); // 영어 점수 생성
			int k33_mat = (int) (Math.random() * 100); // 수학 점수 생성
			k33_inData.p16_InputData(k33_i, k33_name, k33_kor, k33_eng, k33_mat); // 클래스 p16_InputData에 생성한 값 보내기
		}

		firstPrint(pageCnt); // 첫번째 성적집계표 출력을 위함 함수 소환
		
		for (int k33_i = 1; k33_i <= k33_iPerson; k33_i++) { // k33_iPerson 크기만큼 실행되는 for문
			// 번호, 이름, 국어, 영어, 수학, 총점, 평균 순서대로 출력한다 
			System.out.printf("%03d%8s%7d%7d%7d%7d%7d\n", k33_i, k33_inData.k33_nameArr[k33_i - 1],
					k33_inData.k33_korArr[k33_i - 1], k33_inData.k33_engArr[k33_i - 1],
					k33_inData.k33_matArr[k33_i - 1], k33_inData.k33_sumArr[k33_i - 1],
					(int) (k33_inData.k33_aveArr[k33_i - 1]));
			
			// 현재 페이지의 각 과목별 합계를 구하기 위해서 과목별 점수를 누적한다 
			k33_korSum += k33_inData.k33_korArr[k33_i - 1]; k33_engSum += k33_inData.k33_engArr[k33_i - 1];
			k33_matSum += k33_inData.k33_matArr[k33_i - 1]; k33_sumSum += k33_inData.k33_sumArr[k33_i - 1];
			k33_aveSum += k33_inData.k33_aveArr[k33_i - 1];
			
			// 현재 페이지의 각 과목별 평균을 구하기 위해서 과목별 합계점수를 현재페이지의 학생수(cnt)로 나눈다.
			k33_korAve = k33_korSum / cnt; k33_engAve = k33_engSum / cnt;
			k33_matAve = k33_matSum / cnt; k33_sumAve = k33_sumSum / cnt;
			k33_aveAve = k33_aveSum / cnt;

			// 누적 페이지의 각 과목별 합계을 구하기 위해서 과목별 점수를 처음부터 끝까지 누적한다
			k33_korTotalSum += k33_inData.k33_korArr[k33_i - 1]; k33_engTotalSum += k33_inData.k33_engArr[k33_i - 1];
			k33_matTotalSum += k33_inData.k33_matArr[k33_i - 1]; k33_sumTotalSum += k33_inData.k33_sumArr[k33_i - 1];
			k33_aveTotalSum += k33_inData.k33_aveArr[k33_i - 1];

			// 누적 페이지의 각 과목별 평균을 구하기 위해서 과목별 합계를 학생수로 나눈다.
			k33_korTotalAve = k33_korTotalSum / k33_i; k33_engTotalAve = k33_engTotalSum / k33_i;
			k33_matTotalAve = k33_matTotalSum / k33_i; k33_sumTotalAve = k33_sumTotalSum / k33_i;
			k33_aveTotalAve = k33_aveTotalSum / k33_i;
			
			cnt++;	// 현제 페이지 평균을 구하기 위해서 페이지 내에서 한명식 출력될때마다 cnt가 하나씩 증가
			
			if ((k33_i % k33_pageAmount) == 0 && k33_i < k33_iPerson) {	// 출력된 양이 페이지한도량에 도달되면 다음페이지로 넘어간다 
				sumPrint(k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum);	// 현재 페이지의 합계 출력함수로 이동~!
				avePrint(k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);	// 현재 페이지의 평균 출력함수로 이동~!
				sumTotalPrint(k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum);	// 누적페이지의 합계 출력함수로 이동!
				aveTotalPrint(k33_korTotalAve, k33_engTotalAve, k33_matTotalAve, k33_sumTotalAve, k33_aveTotalAve);	// 누적페이지의 평균 출력함수로 이동!
				pageCnt++;	// 페이지가 넘어가므로 1씩 증가시켜준다
				firstPrint(pageCnt);	// 한페이지 출력이 완료되었으므로 다음페이지의 첫 부분을 출력해준다
				// 현재 페이지의 과목 합계와 현재페이지 카운트를 초기화 시켜준다.
				k33_korSum = 0; k33_engSum = 0; k33_matSum = 0; k33_sumSum = 0; k33_aveSum = 0;
				k33_korAve = 0; k33_engAve = 0; k33_matAve = 0; k33_sumAve = 0; k33_aveAve = 0;
				cnt = 1;
			}
			if (k33_i == k33_iPerson) {	// k33_i가 마지막 학생까지 출력됬다면 
				sumPrint(k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum);	// 현재페이지의 합계를 출력하고
				avePrint(k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);	// 평균을 출력하고
				sumTotalPrint(k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum);	// 누적페이지의 합계를 출력하고
				aveTotalPrint(k33_korTotalAve, k33_engTotalAve, k33_matTotalAve, k33_sumTotalAve, k33_aveTotalAve);	// 누적페이지의 평균을 출력하고
				System.out.println("\nEND....."); // 종료표시를 해준다
			}
		}
	}

	public static void firstPrint(int pageCnt) {	// 성적집계표부터 구분선까지 출력해주는 메서드 생성
		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜 포맷을 k33_sdtA로 정한다.
		System.out.printf("%25s\n\n", "성적집계표");
		System.out.printf("%s%s%17s%s\n", "PAGE : ", pageCnt, "출력일자 : ", k33_sdtA.format(k33_calt.getTime())); // 페이지와 출력일자를 출력
		System.out.println("==================================================");
		System.out.printf("%s%6s%6s%5s%5s%5s%5s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==================================================");
	}

	public static void sumPrint(int k33_korTotal, int k33_engTotal, int k33_matTotal, int k33_sumTotal, int k33_aveTotal) {
		// 현재 페이지의 각 과목별 합계 점수를 받아서 출력한다.
		System.out.println("==================================================");
		System.out.printf("%s\n", "현재페이지");
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "합계", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal, k33_aveTotal);
	}

	public static void avePrint(int k33_korAve, int k33_engAve, int k33_matAve, int k33_sumAve, int k33_aveAve) {
		// 현재 페이지의 각 과목별 평균 점수를 받아서 출력한다.
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "평균", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
	}

	public static void sumTotalPrint(int k33_korTotal, int k33_engTotal, int k33_matTotal, int k33_sumTotal, int k33_aveTotal) {
		// 누적 페이지를 출력하기 위해서 각 과목별 총 누적점수를 출력한다
		System.out.println("==================================================");
		System.out.printf("%s\n", "누적페이지");
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "합계", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal, k33_aveTotal);
	}

	public static void aveTotalPrint(int k33_korAve, int k33_engAve, int k33_matAve, int k33_sumAve, int k33_aveAve) {
		// 누적페이지 부분의 각 과목별 평균을 출력한다.
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n\n", "평균", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
	}
}