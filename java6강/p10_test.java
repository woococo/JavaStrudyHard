package java6��;

public class p10_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p10_Elevater3 k33_elev3 = new p10_Elevater3(); 
		for (int i = 0; i < 10; i++) {	// ���������Ͱ� 10�� �ö�
			k33_elev3.k33_up();	// k33_up�� �̵�
			System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);	// ���� ���� ���
		}
		
		for (int i = 0; i < 10; i++) {// ���������Ͱ� 10�� ������
			k33_elev3.k33_down();	// k33_down�޼ҵ�� �̵�
			System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);	// �������� ���
		}
		
		// k33_Repair �޼ҵ�� �̵�
		k33_elev3.k33_Repair();
		System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);	// ���������� ���
	}
}
