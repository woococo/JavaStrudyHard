package java6��;

public class p12_Elevater4 extends p08_Elevater2 {

	void k33_Repair() {
		k33_help = String.format("�������Դϴ�.");
	}

	void k33_up() {	// ���������Ͱ� �ö�
		if (k33_floor >= k33_limitUpFloor) { // �������� �ִ����̸�
			k33_help = "���������Դϴ�.";	// ���������̶�� ���
		} else {	// �������� �ִ����� �ƴ϶��
			k33_floor = k33_floor + 2;	// ���������� 2���� �ö�
			k33_help = String.format("%d���Դϴ�.", k33_floor);	// ������ ���
		}
		this.k33_down();	// ���� Ŭ������ k33_down���� �̵�
		// �̷��� �ϸ� 2ĭ �ö󰡰� ��ĭ ������
	}

	void k33_down() {	// ���������Ͱ� ������
		super.k33_down();	// �ƹ��� Ŭ������ k33_down�� �̵�
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k33_help);
		// Ŭ���� �ȿ��� ��µǰ� ������ ���
	}
}
 