package java6��;

// Ŭ����, ��ü, �ν��Ͻ�(1)

public class p04_Elevater1 {

	int k33_limitUpFloor = 10;	// �ִ���
	int k33_limitDownFloor = 0; // ������
	int k33_floor = 1; 			// ������
	String k33_help; 			// ��µ� �ȳ���

	void k33_up() { 	// ���������Ͱ� ���
		if (k33_floor == k33_limitUpFloor) { 	// �������� �ִ����̸�
			k33_help = "���������Դϴ�."; 	// ���������̶�� �ȳ�
		} else {	// �������� �ִ����� �ƴ϶��
			k33_floor++;	// ���������� �ϳ��� ������Ų��.
			k33_help = String.format("%d���Դϴ�", k33_floor);	// ���������� �ȳ�
		}
	}

	void k33_down() {	// ���������Ͱ� �ϰ�
		if (k33_floor == k33_limitDownFloor) {	// �������� �������̸�
			k33_help = "ó�����Դϴ�.";	// ó�����̶�� �ȳ�
		} else {	// �������� �������� �ƴ϶��
			k33_floor--;	// ���������� �ϴϾ� ���ҽ�Ų��.
			k33_help = String.format("%d���Դϴ�.", k33_floor);	// ���������� �ȳ�
		}
	}
}





