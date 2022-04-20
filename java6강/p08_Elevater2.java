package java6��;

// ������, �Ҹ���, �̺�Ʈ

public class p08_Elevater2 {

	protected int k33_limitUpFloor; 	// �ִ��� ����
	private int k33_limitDownFloor; 	// ������ ����
	protected int k33_floor; 			// ������ ����
	String k33_help; 					// ��µ� �ȳ��� ����

	p08_Elevater2() {	// �����ڷ� ����, �ʱⰪ ����
		k33_limitUpFloor = 10;	// �ִ����� 10���� ����
		k33_limitDownFloor = 1;	// �������� 1������ ����
		k33_floor = 1;	// �������� 1������ ����
		k33_help = "���������� �⺻ �ذ��Ϸ�";	// �ȳ����� ����
	}
	
	// �ִ���, �ּ���, �������� �־ Ŭ������ ������ �� �ֵ��� �Ѵ�.
	p08_Elevater2(int k33_upFloor, int k33_downFloor, int k33_inFloor) {
		k33_limitUpFloor = k33_upFloor;	// �ִ����� �Է¹��� ������ ����
		k33_limitDownFloor = k33_downFloor; // �������� �Է¹��� ������ ����
		k33_floor = k33_inFloor;	// �������� �Է¹��� ������ ����
		k33_help = "���������� ���� �ذ��Ϸ�";	// �ȳ����� ���
	}
 
	void k33_up() {	// ���������Ͱ� ����� ��
		if (k33_floor == k33_limitUpFloor) {	// �������� �ִ����̶��
			k33_help = "������ ���Դϴ�.";	// ���������̶�� ���
		} else {	// �������� �ִ����� �ƴ϶��
			k33_floor++;	// ���������͸� 1�� ��½�Ų��.
			k33_help = String.format("[%d] ���Դϴ�.", k33_floor);	// ������ �ȳ�
		}
	}

	void k33_down() {	// ���������Ͱ� �ϰ��� ��
		if (k33_floor == k33_limitDownFloor) {	// �������� �������̶��
			k33_help = "ó�� ���Դϴ�.";	// ó�����̶�� ���
		} else {	// �������� �������� �ƴ϶��
			k33_floor--;	// ���������͸� 1�� �ϰ���Ų��.
			k33_help = String.format("[%d] ���Դϴ�.", k33_floor);	// ������ �ȳ�
		}
	}
	
	// ó���� �������� �����Ѵٸ� �׸�ŭ �ö󰡵��� �Ѵ�.
	void k33_up(int k33_u) {	// �������� �޴´�.
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0���� �Է¹��� ���������� ���ư��� for��
			this.k33_up();	// �� Ŭ������ k33_up�Լ��� �̵�, this�� ����ϸ� ��Ȯ������.
		}
	}

	// ó�� �������� �����Ѵٸ� �׸�ŭ ���������� �Ѵ�.
	void k33_down(int k33_u) {	// �������� �Է¹޴´�
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0���� �Է¹��� ���������� ���ư��� for��
			k33_down();	// this�� ������� ���� ���
		}
	}
	
	void k33_msg(String k33_id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d], ������[%d]\n",
				k33_id, k33_help, k33_limitUpFloor, k33_limitDownFloor, k33_floor);
		// �ִ���, �ּ���, �������� ����Ѵ�.
	}
}
 