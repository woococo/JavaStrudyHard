package java6강;

// 클래스, 객체, 인스턴스(2)

public class p04_test {

	private static int k33_inVal;	// k33_inVal라는 정수형 변수 선언

	public static void k33_up() {	// k33_up이라는 public 메소드 생성
		k33_inVal++;	// k33_inVal를 하나 증가
		System.out.printf("난 그냥 메소드 [%d]\n", k33_inVal);	// k33_inVal을 출력한다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		k33_inVal = 0;	// 자기내부변수 사용 (k33_inVal을 0으로 초기화시킨다.)
		p04_Elevater1 k33_elev1;	// p04_Elevater1 클래스를 받아서 k33_elev1 객체를 만든다.

		k33_elev1 = new p04_Elevater1(); // 객체 k33_elev1에 p04_Elevater1 인스턴스를 생성해서 연결한다.

		k33_up(); // 현재 소스내 메소드
		for (int k33_i = 0; k33_i < 10; k33_i++) {	// 엘레베이터를 10번 한층씩 올려보자
			k33_elev1.k33_up();	// 엘레베이터 클래스를 찍어낸 k33_elev1 객체 (인스턴스를 가지고 있음)의 k33_up() 메소드로 이동
			System.out.printf("MSG[%s]\n", k33_elev1.k33_help); // k33_elev1의 k33_help를 출력
		}

		for (int k33_i = 0; k33_i < 10; k33_i++) {	// 엘레베이터를 10번씩 한층씩 내려보자
			k33_elev1.k33_down();	// 엘레베이터 클래스를 찍어낸 k33_elev1 객체 (인스턴스를 가지고 있음)의  k33_down() 메소드로 이동
			System.out.printf("MSG[%s]\n", k33_elev1.k33_help); // k33_elev1의 k33_help를 출력
		}
	}
}

