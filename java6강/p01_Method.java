package java6강;

public class p01_Method {

	// 변수와 메서드(1)
	// 변수는 변수, 메서드(Method)는 함수를 메서드라고 한다.
	// 일단 자기 클래스 안에 함수를 정의하면 함수이름만으로 불러올 수 있다. (클래스명.메소드명이 원칙이지만 클래스명 생략)
	
	public static void k33_iamMethod() {	// 메소드 k33_iamMethod이다.
		System.out.println("메소드라 불러줘요~");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p01_Method.k33_iamMethod();	// 클래스명.메소드명 << 원칙이지만
		k33_iamMethod();			// 클래스명 생략도 가능
	}
}
