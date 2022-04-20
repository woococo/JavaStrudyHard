package java6강;

public class p16_InputData {

	public String[] k33_nameArr;// 이름을 담을 배열 선언
	public int[] k33_korArr;	// 국어 점수를 담을 배열 선언
	public int[] k33_engArr;	// 영어 점수를 담을 배열 선언
	public int[] k33_matArr;	// 수학 점수를 담을 배열 선언
	public int[] k33_sumArr;	// 총합 점수를 담을 배열 선언
	public double[] k33_aveArr;	// 평균값을 담을 배열 선언

	public p16_InputData(int k33_iPerson) {
		// TODO Auto-generated constructor stub
		k33_nameArr = new String[k33_iPerson];	// 이름 배열의 크기를 정해준다
		k33_korArr = new int[k33_iPerson];	// 국어점수 배열의 크기를 정해준다
		k33_engArr = new int[k33_iPerson];	// 영어점수 배열의 크기를 정해준다
		k33_matArr = new int[k33_iPerson];	// 수학점수 배열의 크기를 정해준다
		k33_sumArr = new int[k33_iPerson];	// 총합점수 배열의 크기를 정해준다
		k33_aveArr = new double[k33_iPerson];	// 평균값 배열의 크기를 정해준다
	}

	// 번호, 이름, 국어점수, 영어점수, 수학점수를 받아오면 각 배열에 넣어준다.
	public void p16_InputData(int k33_i, String k33_name, int k33_kor, int k33_eng, int k33_mat) {
		// TODO Auto-generated method stub
		k33_nameArr[k33_i] = k33_name;
		k33_korArr[k33_i] = k33_kor;
		k33_engArr[k33_i] = k33_eng;
		k33_matArr[k33_i] = k33_mat;
		k33_sumArr[k33_i] = k33_kor + k33_eng + k33_mat;
		k33_aveArr[k33_i] = k33_sumArr[k33_i]/3.0;
	}
}
