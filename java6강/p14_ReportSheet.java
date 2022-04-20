package java6강;

public class p14_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 10;	// 이 값을 주는만큼 저장소 생성
  
		p14_InputData k33_inData = new p14_InputData(k33_iPerson);	// 생성자의 숫자를 준만큼 배열을 만든다.

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {
			String k33_name = String.format("홍길%02d", k33_i);	// 이름 만들기
			int k33_kor = (int) (Math.random() * 100);	// 국어 점수 만들기
			int k33_eng = (int) (Math.random() * 100);	// 영어 점수 만들기
			int k33_mat = (int) (Math.random() * 100);	// 수학 점수 만들기
			k33_inData.p14_InputData(k33_i, k33_name, k33_kor, k33_eng, k33_mat);	// 클래스내 값 입력
		}
		
		for (int k33_i = 0; k33_i <k33_iPerson; k33_i++) {
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", 
					k33_i, k33_inData.k33_nameArr[k33_i], k33_inData.k33_korArr[k33_i], k33_inData.k33_engArr[k33_i],  
					k33_inData.k33_matArr[k33_i], k33_inData.k33_sumArr[k33_i], k33_inData.k33_aveArr[k33_i]);
		// 번호 이름 국어 영어 수학 총점 평균 순으로 출력한다
		}
	}
}
