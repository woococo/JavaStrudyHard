package java0415;

public class Main05 {

	// 1-5. 배열

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] k33_score = new int[5]; 	// 크키가 5인 정수형 배열을 생성한다.
		k33_score[0] = 100; 			// k33_score 배열 0번에 100을 저장한다.
		k33_score[1] = 90; 				// k33_score 배열 1번에 90을 저장한다.
		k33_score[2] = 80;				// k33_score 배열 2번에 80을 저장한다.
		k33_score[3] = 70; 				// k33_score 배열 3번에 70을 저장한다.
		k33_score[4] = 60; 				// k33_score 배열 4번에 60을 저장한다.
		
		// 배열 k33_score 값을 출력해보기 위한 for문을 생성한다. 
		for (int k33_i = 0; k33_i < k33_score.length; k33_i++) { 
			// k33_i가 0부터 배열 k33_score의 길이까지 실행되는 for문이다.
			System.out.println(k33_score[k33_i]);
			// 배열 k33_score값이 순서대로 출력된다.
		}
	}
}
