package java0415;

public class Main10_a {

	// 2-5. ��������3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 1; k33_i < 13; k33_i++) {		// 1���� 12���� ���������� ����Ǵ� for���� �����Ѵ�.
			System.out.printf(" %d�� =>", k33_i);		// "k33_i�� =>"�� ����Ѵ�. 
			for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1���� 31���� ������� ����Ǵ� for���� �����Ѵ�.
				System.out.printf("%d,", k33_j);		//	k33_j�� ����Ѵ�.
				if ((k33_i == 4 || k33_i == 6 || k33_i == 9 || k33_i == 11) && k33_j == 30) {	
							// k33_i ���� 4�̰ų� 6�̰ų� 9�ų� 11�� ����̸鼭 k33_j�̰� 30�̸� 
					break;	// ����!
				}
				if ((k33_i == 2) && (k33_j == 28)) {	// k33_i�� ���� 2�� ��쿡	k33_j�� 28�� ��ġ�ϸ�
					break;								// ����
				}
			}
			System.out.println("");	// ���� �ٲٱ� ���ؼ� println("")�� �Է��Ѵ�.
		}
	}
}
