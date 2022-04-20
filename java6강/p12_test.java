package java6강;

public class p12_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p12_Elevater4 k33_elev4; // 클래스를 받아 객체를 만듬 

		k33_elev4 = new p12_Elevater4(); // 인스턴스를 생성하여 객체에 연결
		for (int k33_i = 0; k33_i < 10; k33_i++) {	// 엘레베이터 10번 상승
			k33_elev4.k33_up();	// k33_up로 이동
			System.out.printf("MSG elev[%s]\n", k33_elev4.k33_help); // 현재층 출력
		}

		for (int k33_i = 0; k33_i < 10; k33_i++) {// 엘레베이터 10번 하강
			k33_elev4.k33_down();		// k33_down로 이동
			System.out.printf("MSG elev4[%s]\n", k33_elev4.k33_help);	// 현재층 출력
		}

		k33_elev4.k33_Repair();
		System.out.printf("MSG elev4[%s]\n", k33_elev4.k33_help);	// 수리중임 출력~!

	}
}
