package java0415;

public class Main08 {

	// 2-3. ������ �־� ��(ã��)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_iVal;	// ������ ������ k33_iVal�� �����Ѵ�.

		for (int k33_i = 0; k33_i < 300; k33_i++) {	// 0���� 300���� ���������� ����Ǵ� for���� �����Ѵ�.
			k33_iVal = 5 * k33_i;					//	k33_iVal�� 5 * k33_i �� �����Ѵ�.
			if (k33_iVal >= 0 && k33_iVal < 10) {			//	k33_iVal���� 0���� ũ�鼭 10���� �۴ٸ�
				System.out.printf("�� %d\n", k33_iVal);		// "�� k33_iVal"�� ����Ѵ�. 
			} else if (k33_iVal >= 10 && k33_iVal < 100) {	// k33_iVal ���� 10���� ũ�鼭 100���� �۴ٸ�
				System.out.printf("�� %d\n", k33_iVal);		// "�� k33_iVal"�� ����Ѵ�. 
			} else if (k33_iVal >= 100 && k33_iVal < 1000) {	// k33_iVal ���� 100���� ũ�鼭 1000���� �۴ٸ�
				System.out.printf("�� %d\n", k33_iVal);			// "�� k33_iVal"�� ����Ѵ�.
			} else { 									// ���� ���ǽĿ� ��� �ش����� �ʴ´ٸ�
				System.out.printf("õ %d\n", k33_iVal);	//  "õ k33_iVal"�� ����Ѵ�.
			}
		}
	}
}
