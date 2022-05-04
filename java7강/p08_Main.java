package java7강;

import java.util.ArrayList;

public class p08_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iTestMAX = 1000000; // test할 최대값을 설정해준다
		ArrayList k33_iAl = new ArrayList(); // ArrayList k33_iAl를 선언

		for (int k33_i = 0; k33_i < k33_iTestMAX; k33_i++) { // 0부터 k33_iTestMAX까지 실행되는 반복문
			k33_iAl.add((int)(Math.random() * 1000000)); // k33_iAl에 1000000안에서 랜덤으로 생성되는 값을 추가
		}

		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) { // 0부터 k33_iAl크기 만큼 실행되는 반복문
			System.out.printf(" ArrayList %d = %d\n", k33_i, k33_iAl.get(k33_i)); // 리스트 k33_iAl의 k33_i값을 출력
		}

		System.out.printf("******************************\n");
		k33_iAl.sort(null); // k33_iAl를 정렬한다

		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf(" ArrayList %d = %d \n", k33_i, k33_iAl.get(k33_i));
		} // 정렬된 리스트를 다시 순서대로 출력
	}

}
