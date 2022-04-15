package java0415;

public class Main16 {

	// 3-2. sin함수 그래프

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k33_fSin;	// 실수형 변수인 k33_fSin을 선언한다.

		// 360도까지 값이 어떻게 나오는지 확인하기 위해서..
		for (int k33_i = 0; k33_i < 360; k33_i++) {	// 0부터 359까지 k33_i에 순서대로 대입하는 for문을 생성한다.
			k33_fSin = Math.sin(k33_i * 3.141592 / 180);	
			// k33_i에 3.141592을 곱하고 180을 나눈 값을 Math.sin함수에 넣고 그 값을 k33_fSin에 대입한다.
			System.out.printf("%d sin ==> %f\n", k33_i, k33_fSin);	// k33_i와 k33_fSin를 출력한다.
		}
		
		// 360도까지 그려보자!
		for (int k33_i = 0; k33_i < 360; k33_i++) {	// 0부터 360까지 k33_i에 순서대로 대입되는 for문을 생성한다.
			k33_fSin = Math.sin(k33_i * 3.141592 / 180);
			// k33_i에 3.141592을 곱하고 180을 나눈 값을 Math.sin함수에 넣고 그 값을 k33_fSin에 대입한다.
			int k33_iSpace = (int) ((1.0 - k33_fSin) * 50); 
			// 1.0에서 k33_fSin을 뺀 값에 50을 곱하고 정수형으로 변환하고 k33_iSpace에 대입하면 0부터 100까지의 값이 나온다.
			for (int k33_j = 0; k33_j < k33_iSpace; k33_j++) {	// 0부터 k33_iSpace값까지 k33_j에 순서대로 대입되는 for문을 생성한다.
				System.out.printf(" ");	// k33_iSpace값까지 공백을 출력한다.
			}
			System.out.printf("*[%f][%d]\n", k33_fSin, k33_iSpace); // k33_fSin와 k33_iSpace 값을 출력한다.
		}
	}
}
