package java6강;

/* 메소드 오버로딩
 클래스 메소드는 argument(매개변수) 형식이나 갯수가 다르면 
이름은 동일하게 사용하여 편리하게 사용할 수 있다.
*/
public class p06_Calc1 {

	public int k33_sum(int k33_a, int k33_b) {
		return k33_a + k33_b;
		// 메소드 k33_sum을 생성 정수 2개를 받아서 2개를 더한 값을 리턴함
	}

	public int k33_sum(int k33_a, int k33_b, int k33_c) { 
		return k33_a + k33_b + k33_c;
		// 메소드 k33_sum을 생성 정수 3개를 받아서 3개를 더한 값을 리턴함
	}

	public int k33_sum(int k33_a, int k33_b, int k33_c, int k33_d) { 
		return k33_a + k33_b + k33_c + k33_d;
		// 메소드 k33_sum을 생성 정수 4개를 받아서 4개를 더한 값을 리턴함
	}

	public double k33_sum(double k33_a, double k33_b) {	
		return k33_a + k33_b;
		// 메소드 k33_sum을 생성 실수 2개를 받아서 2개를 더한 값을 리턴함
	}
}
