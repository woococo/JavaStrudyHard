package java0415;

public class Main11 {

	// 2-6. case�� ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 1; k33_i < 13; k33_i++) {		// 1���� 12���� ������� ����Ǵ� for���� �����Ѵ�.
			System.out.printf("%d�� =>", k33_i);		// "k33_i�� =>"�� ����Ѵ�. 
			LOOP: for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1���� 31���� ������� ����Ǵ� for���� �����Ѵ�. 
				// �ؿ��� ��ȯ�ϸ� ���ƿ� �� �ִ� LOOP�� �����.
				// �̷� ǥ���� ���� ������� �ʴ´�.
				System.out.printf("%d,", k33_j);		//	k33_j�� ����Ѵ�.

				switch (k33_i) {	// ���ǽĿ� k33_i�� �Է��Ѵ�.
				case 4:		// k33_i ���� 4�� ���
				case 6:		// k33_i ���� 6�� ���
				case 9:		// k33_i ���� 9�� ���
				case 11:	// k33_i ���� 11�� ���
					if (k33_j == 30) {	// k33_j ���� 30�� ��ġ�ϴٸ� 
						break LOOP;		// ���߰� LOOP�� �̵��Ѵ�. (12����)
					}
					break;	// ����!
				case 2:		// k33_i ���� 2�� ���
					if (k33_j == 28) {	//	k33_j���� 28�� ��ġ�Ѵٸ�
						break LOOP;		// ���߰� LOOP�� �̵��Ѵ�. (12����)
					}
					break;	// ����!
				}
			}
			System.out.println(""); // �ٹٲ��� ���� ""�� �Է��Ѵ�.
		}
	}
}
