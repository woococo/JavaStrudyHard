package java7강;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class p11_Main {

	static ArrayList<p09_OneRec> k33_ArrayOneRec = new ArrayList<p09_OneRec>(); // 클래스의 ArrayList 설정
	static int k33_sumKor = 0; // 국어점수의 합계로 0으로 초기화한다
	static int k33_sumEng = 0; // 영어점수의 합계로 0으로 초기화한다
	static int k33_sumMat = 0; // 수학점수의 합계로 0으로 초기화한다
	static int k33_sumSum = 0; // 합계점수의 합계로 0으로 초기화한다
	static double k33_sumAve = 0; // 평균점수의 합계로 0으로 초기화한다
	static int k33_iPerson = 20; // 사람 수를  20으로 초기 설정한다

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k33_dataSet(); // 데이터 만들기
		k33_dataSort(); // 데이터 정렬
		k33_HeaderPrint(); // k33_HeaderPrint 메서드 실행, 윗 부분 출력
		for (int k33_i = 0; k33_i < k33_ArrayOneRec.size(); k33_i++) {
			k33_Itemprint(k33_i); // k33_Itemprint메서드에 k33_i값을 넣어서 실행
		}
		k33_TailPrint();	// k33_TailPrint 실행, 아래부분 출력
	}

	public static void k33_dataSet() { // k33_dataSet 메서드 생성
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {
			String k33_name = String.format("홍길%02d", k33_i); // 이름 저장
			int k33_kor = (int) (Math.random() * 100); // 0부터 100까지 랜덤으로 국어점수 생성
			int k33_eng = (int) (Math.random() * 100); // 0부터 100까지 랜덤으로 영어점수 생성
			int k33_mat = (int) (Math.random() * 100); // 0부터 100까지 랜덤으로 수학점수 생성
			k33_ArrayOneRec.add(new p09_OneRec(k33_i, k33_name, k33_kor, k33_eng, k33_mat)); // k33_ArrayOneRec에 값을 추가
		}
	}
	
	public static void k33_dataSort() { 
		Comparator<p09_OneRec> bikyeokijun = new Comparator<p09_OneRec>() {		
			public int compare(p09_OneRec a1, p09_OneRec a2) { // comparator 클래서를 생성할때 compare메소드를 오버로딩
				// 앞 레코드의 어떤 값과 뒷 레코드의 어떤값을 비교
				// TODO Auto-generated method stub
				return (a2.k33_sum() - a1.k33_sum()); // 뒤레코드의 합계와 앞 레코드의 합계 필드를 빼는 것을 비교
			}
		};
		Collections.sort(k33_ArrayOneRec, bikyeokijun); // collections을 이용해서 sort작업 수행
	}

	public static void k33_HeaderPrint() { // 처음 부분 출력부
		System.out.printf("***********************************************\n");
		System.out.printf("%2s %3s %4s %4s %4s %4s %5s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("***********************************************\n");
	}

	public static void k33_Itemprint(int k33_i) { //  중간부분 출력부
		p09_OneRec k33_rec; // 클래스 p09_OneRec을 사용하기 위해서 k33_rec 생성
		k33_rec = k33_ArrayOneRec.get(k33_i); // k33_rec에 리스트 k33_ArrayOneRec의 k33_i값을 저장
		System.out.printf("%02d %6s %4d %6d %6d %7d %8.2f \n", k33_rec.k33_studentId(), k33_rec.k33_name(),
				k33_rec.k33_kor(), k33_rec.k33_eng(), k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_ave());
		k33_sumKor += k33_rec.k33_kor(); // 국어총합점수를 구하기 위해서 국어점수 누적
		k33_sumEng += k33_rec.k33_eng(); // 영어총합점수를 구하기 위해서 영어점수 누적
		k33_sumMat += k33_rec.k33_mat(); // 수학총합점수를 구하기 위해서 수학점수 누적
		k33_sumSum += k33_rec.k33_sum(); // 합계총합점수를 구하기 위해서 합계점수 누적
		k33_sumAve += k33_rec.k33_ave(); // 평균총합점수를 구하기 위해서 평균점수 누적
	}

	public static void k33_TailPrint() { // 마지막 부분 출력부
		System.out.printf("***********************************************\n");
		System.out.printf("국어합계 : %d   국어평균: %6.2f\n", k33_sumKor, k33_sumKor / (double) k33_ArrayOneRec.size());
		System.out.printf("영어합계 : %d   영어평균: %6.2f\n", k33_sumEng, k33_sumEng / (double) k33_ArrayOneRec.size());
		System.out.printf("수학합계 : %d   수학평균: %6.2f\n", k33_sumMat, k33_sumMat / (double) k33_ArrayOneRec.size());
		System.out.printf("***********************************************\n");
		System.out.printf("반평균합계 : %d 반평균 : %6.2f\n", k33_sumSum, k33_sumAve / (double) k33_ArrayOneRec.size());
	}
}
