package java7강;

// 배열의 최대, 최소값 찾기
public class p05_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k33_iArray = { 1, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		// 정수형 배열을 선언하고 값들을 넣어준다
		
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) { // 배열의 값들을 차례로 출력하기 위해 반복문 실행
			System.out.printf("iArray[%d] = %d\n", k33_i, k33_iArray[k33_i]);
		}
		int k33_iMax = k33_iArray[0]; // 초기 max값은 0으로 설정
		int k33_iMaxPt = 0; // 
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {
			if(k33_iMax < k33_iArray[k33_i]) { // iArray[i]의 값이 기존 Max값보다 크다면
				k33_iMax = k33_iArray[k33_i]; // Max값은 iArray[i]로 변경한다.
				k33_iMaxPt = k33_i; // Max값이 배열의 몇번째인지 확인하기 위해서 저장
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", k33_iMaxPt, k33_iMax);
	}
}
