package java6강;

// Inheritance (상속으로 클래스 만들기 )

public class p10_Elevater3 extends p08_Elevater2 {	
	// 클래스 p10_Elevater3는 클래스 p08_Elevater2를 상속받는다.  

	void k33_Repair() {	// k33_Repair메소드를 생성
		k33_help = String.format("수리중입니다.");	// 수리중임을 출력
	}
}
