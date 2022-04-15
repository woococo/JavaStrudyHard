package java0415;

public class Main06 {

	// 2-1. 단순비교

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_iA, k33_iB; // 정수형 변수 k33_iA와 k33_iB를 선언한다.

		k33_iA = 0; 		// k33_iA의 값을 0으로 초기화시킨다.
		while (true) { 		// 무한으로 실행되는 while문을 생성한다.
			k33_iB = 0; 	// k33_iB의 값을 0으로 초기화시킨다.
			while (true) {	// 무한으로 실행되는 while문을 생성한다.
				System.out.print("*"); 	// 별찍기!
				if (k33_iA == k33_iB) { // 만약 iA와 iB가 같다면?!
					break; // 멈춰!
				}

				k33_iB++; 	// k33_iB 값이 한바퀴 돌때마다 1씩 증가하도록 한다.
			}
			System.out.print("\n"); // 줄 바꾸기!
			k33_iA++; // k33_iA에 1을 증가시킨다.
			if (k33_iA == 30) {  // k33_iA가 30이라면?!
				break; // 멈춰!
			}
		}
	}
}
