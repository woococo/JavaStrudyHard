package java6강;

public class p02_Method {
	
	// 변수와 메서드(2)
	// 변수는 클래스에서 전역으로 사용하는 static으로 선언 (값이 계속 유지)
	// 변수는 메소드 내에 선언하여 메개변수로 전달하고 리턴받는 형태로 사용
	
	static int k33_iStatic;	// 클래스내 전역 변수 static에 주의
	
	public static void k33_add(int k33_i) {	// 정수 i를 받아오는 메소드 add를 생성한다.
		k33_iStatic++;	// iStatic을 하나씩 증가시킨다.
		k33_i++;		// i를 하나씩 증가시킨다.
		System.out.printf("k33_add메소드에서 -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic을 출력한다.
		System.out.printf("k33_add메소드에서 -> k33_i = [%d]\n", k33_i);	// k33_i를 출력한다.
	}
	
	public static int k33_add2(int k33_i) { // 정수 i를 받아오는 메소드 add1를 생성한다.
		k33_iStatic++;	// iStatic을 하나씩 증가시킨다.
		k33_i++;		// i를 하나씩 증가시킨다.
		System.out.printf("k33_add메소드에서 -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic를 출력한다.
		System.out.printf("k33_add메소드에서 -> k33_i = [%d]\n", k33_i);	// k33_i을 출력한다.
		return k33_i;	// i를 반환한다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iMain = 1;	// 1 값을 갖는 정수형 변수 k33_iMain을 선언한다.
		k33_iStatic = 1;	// k33_iStatic에 1을 대입한다.
		
		System.out.printf("*****************************************************\n");
		System.out.printf("메소드 호출 전 메인에서 -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic을 출력한다.
		System.out.printf("메소드 호출 전 메인에서 -> k33_iMain = [%d]\n", k33_iMain);		// k33_iMain을 출력한다.
		System.out.printf("*****************************************************\n");
		k33_add(k33_iMain);
		System.out.printf("*****************************************************\n");
		System.out.printf("메소드 호출 후 메인에서 -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic을 출력한다.
		System.out.printf("메소드 호출 후 메인에서 -> k33_iMain = [%d]\n", k33_iMain);		// k33_iMain을 출력한다.
		System.out.printf("*****************************************************\n");
		
		k33_iMain = k33_add2(k33_iMain);	// 이런식으로 값을 전달하고 받는 방법이 이해하기 쉽다.
								// 전역변수로 선언 후 이함수, 아니 메소드 저 메소드에서 변경해 버리면
								// 도대체 어떻게 로직이 되어있는지 알아보기 어렵다.
		
		System.out.printf("*****************************************************\n");
		System.out.printf("메소드 k33_add2 호출 후 메인에서 -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic을 출력한다.
		System.out.printf("메소드 k33_add2 호출 후 메인에서 -> k33_iMain = [%d]\n", k33_iMain);		// k33_iMain을 출력한다.
		System.out.printf("*****************************************************\n");
	}
}
