package java6강;

public class p06_test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		p06_Calc1 k33_cc = new p06_Calc1(); // 클래스 p07_Calc1를 받아 객체 k33_cc를 생성
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k33_cc.k33_sum(1, 2));	// 객체 k33_cc의 k33_sum에 1,2를 대입하고 결과를 출력
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k33_cc.k33_sum(1, 2, 3));	// 객체 k33_cc의 k33_sum에 1,2,3을 대입하고 결과를 출력
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k33_cc.k33_sum(1, 2, 3, 4));	// 객체 k33_cc의 k33_sum에 1,2,3,4를 대입하고 결과를 출력
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k33_cc.k33_sum(1.3, 2.4));	// 객체 k33_cc의 k33_sum에 1.3, 2.4를 대입하고 결과를 출력
		
		// --> 메소드 이름은 다 같으나 형식이나 갯수가 다르기 때문에 결과는 다르게 출력 됨 ~!
		
	}
}
