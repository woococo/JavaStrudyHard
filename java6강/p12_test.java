package java6��;

public class p12_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p12_Elevater4 k33_elev4; // Ŭ������ �޾� ��ü�� ���� 

		k33_elev4 = new p12_Elevater4(); // �ν��Ͻ��� �����Ͽ� ��ü�� ����
		for (int k33_i = 0; k33_i < 10; k33_i++) {	// ���������� 10�� ���
			k33_elev4.k33_up();	// k33_up�� �̵�
			System.out.printf("MSG elev[%s]\n", k33_elev4.k33_help); // ������ ���
		}

		for (int k33_i = 0; k33_i < 10; k33_i++) {// ���������� 10�� �ϰ�
			k33_elev4.k33_down();		// k33_down�� �̵�
			System.out.printf("MSG elev4[%s]\n", k33_elev4.k33_help);	// ������ ���
		}

		k33_elev4.k33_Repair();
		System.out.printf("MSG elev4[%s]\n", k33_elev4.k33_help);	// �������� ���~!

	}
}
