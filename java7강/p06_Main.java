package java7강;

public class p06_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 5; // 사람 수 설정

		p06_OneRec[] k33_inData = new p06_OneRec[k33_iPerson]; // 클래스 배열 p06_OneRec을 만드는데 크기는 사람수 만큼으로 한다

		k33_inData[0] = new p06_OneRec("홍길01", 100, 100, 90); // k33_inData[0]에 값을 저장한다
		k33_inData[1] = new p06_OneRec("홍길02", 90, 90, 90); // k33_inData[1]에 값을 저장한다
		k33_inData[2] = new p06_OneRec("홍길03", 80, 70, 90); // k33_inData[2]에 값을 저장한다
		k33_inData[3] = new p06_OneRec("홍길04", 70, 60, 90); // k33_inData[3]에 값을 저장한다
		k33_inData[4] = new p06_OneRec("홍길05", 60, 100, 90); // k33_inData[4]에 값을 저장한다

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) { // 사람 수만큼 실행되는 반복문 생성
			System.out.printf("번호 : %d, 이름 : %s, 국어 : %2d, 영어 : %2d, 수학 : %2d, 총점 : %3d, 평균 : %f\n", k33_i + 1,
					k33_inData[k33_i].k33_name(), k33_inData[k33_i].k33_kor(), k33_inData[k33_i].k33_eng(),
					k33_inData[k33_i].k33_mat(), k33_inData[k33_i].k33_sum(), k33_inData[k33_i].k33_ave()); // 값을 출력한다
		}
	}
}
