package java0415;

public class Main01 {

	// 1-1. if��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_score = 65;			// ������ ���� k33_score�� �����ϰ� 65�� �����Ѵ�.
		int k33_num = 12;			// ������ ���� k33_num�� �����ϰ� 12�� �����Ѵ�.

		if (k33_score > 60) { 						// k33_score�� 60���� ũ�ٸ�?!
			System.out.println("�հ��Դϴ�."); 		// "�հ��Դϴ�."�� ����Ѵ�.
		} else {									// �ƴ϶��?
			System.out.println("���հ��Դϴ�.");	// "���հ��Դϴ�."�� ����Ѵ�.
		}

		if (k33_num > 0) { 							// k33_num�� 0���� ũ�ٸ�?!
			System.out.println("����Դϴ�.");		// "����Դϴ�."�� ����Ѵ�.
		} else if (k33_num < 0) {					// k33_num�� 0���� �۴ٸ�?!
			System.out.println("�����Դϴ�.");		// "�����Դϴ�."�� ����Ѵ�.
		} else { 									// ��� ���ǽ��� ����� false���?
			System.out.println("���Դϴ�.");		// "���Դϴ�."�� ����Ѵ�.
		}

		if (k33_score >= 90) { 							// k33_score �� 90�̻��̶�� 
			System.out.println("A���");				// "A���"�� ����Ѵ�.
		} else if (k33_score >= 80 && k33_score < 90) { //k33_score �� 80�̻��̸鼭 90 �̸��̶��
			System.out.println("B���");				// "B���"�� ����Ѵ�.
		} else if (k33_score >= 70 && k33_score < 80) { //k33_score �� 70�̻��̸鼭 80 �̸��̶��
			System.out.println("C���");				// "C���"�� ����Ѵ�.
		} else { 										// ��� ���ǽ��� ����� false���
			System.out.println("F���"); 				// "F���"�� ����Ѵ�.
		}
	}
}
