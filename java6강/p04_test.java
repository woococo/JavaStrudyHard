package java6��;

// Ŭ����, ��ü, �ν��Ͻ�(2)

public class p04_test {

	private static int k33_inVal;	// k33_inVal��� ������ ���� ����

	public static void k33_up() {	// k33_up�̶�� public �޼ҵ� ����
		k33_inVal++;	// k33_inVal�� �ϳ� ����
		System.out.printf("�� �׳� �޼ҵ� [%d]\n", k33_inVal);	// k33_inVal�� ����Ѵ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		k33_inVal = 0;	// �ڱ⳻�κ��� ��� (k33_inVal�� 0���� �ʱ�ȭ��Ų��.)
		p04_Elevater1 k33_elev1;	// p04_Elevater1 Ŭ������ �޾Ƽ� k33_elev1 ��ü�� �����.

		k33_elev1 = new p04_Elevater1(); // ��ü k33_elev1�� p04_Elevater1 �ν��Ͻ��� �����ؼ� �����Ѵ�.

		k33_up(); // ���� �ҽ��� �޼ҵ�
		for (int k33_i = 0; k33_i < 10; k33_i++) {	// ���������͸� 10�� ������ �÷�����
			k33_elev1.k33_up();	// ���������� Ŭ������ �� k33_elev1 ��ü (�ν��Ͻ��� ������ ����)�� k33_up() �޼ҵ�� �̵�
			System.out.printf("MSG[%s]\n", k33_elev1.k33_help); // k33_elev1�� k33_help�� ���
		}

		for (int k33_i = 0; k33_i < 10; k33_i++) {	// ���������͸� 10���� ������ ��������
			k33_elev1.k33_down();	// ���������� Ŭ������ �� k33_elev1 ��ü (�ν��Ͻ��� ������ ����)��  k33_down() �޼ҵ�� �̵�
			System.out.printf("MSG[%s]\n", k33_elev1.k33_help); // k33_elev1�� k33_help�� ���
		}
	}
}

