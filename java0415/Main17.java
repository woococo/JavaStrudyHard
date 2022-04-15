package java0415;

public class Main17 {

	// 2-4. 피라미드 찍기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_n, k33_m;	// 정수형 변수 k33_n와 k33_m을 선언한다.
		k33_n = 1;			// k33_n에 1을 대입한다.
		k33_m = 20;			// k33_m에 20을 대입한다.

		while (true) {	// 조건에 일치될때까지 무한으로 실행되는 while문을 생성한다.
			for (int k33_i = 0; k33_i < k33_m; k33_i++) {	//	0부터 k33_m 값까지 k33_i에 순서대로 대입되는 for문을 생성한다.
				System.out.print(" ");						// 공백 출력
			}
			for (int k33_i = 0; k33_i < k33_n; k33_i++) {	//	0부터 k33_n 값까지 k33_i에 순서대로 대입되는 for문을 생성한다.
				System.out.print("*");						// 별찍기!
			}
			System.out.println("");	// 줄 바꿈을 위한 ""을 입력한다.
									// 가운데를 중심으로 공백은 한 칸 줄어들고 있고, 별은 두개씩 늘어나게 하도록
			k33_m = k33_m - 1;		// k33_m에는 -1을 해주고
			k33_n = k33_n + 2;		// k33_n에는 +2를 해준다.
			
			if (k33_m < 0) {		// k33_m이 0보다 작아지면
				break;				// 멈춘다.
			}
		}
	}
}
