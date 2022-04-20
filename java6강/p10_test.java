package java6강;

public class p10_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p10_Elevater3 k33_elev3 = new p10_Elevater3(); 
		for (int i = 0; i < 10; i++) {	// 엘레베이터가 10번 올라감
			k33_elev3.k33_up();	// k33_up로 이동
			System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);	// 현재 층수 출력
		}
		
		for (int i = 0; i < 10; i++) {// 엘레베이터가 10번 내려감
			k33_elev3.k33_down();	// k33_down메소드로 이동
			System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);	// 현재층수 출력
		}
		
		// k33_Repair 메소드로 이동
		k33_elev3.k33_Repair();
		System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);	// 수리중임을 출력
	}
}
