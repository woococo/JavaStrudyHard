package java0415;

public class Main17 {

	// 2-4. �Ƕ�̵� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_n, k33_m;	// ������ ���� k33_n�� k33_m�� �����Ѵ�.
		k33_n = 1;			// k33_n�� 1�� �����Ѵ�.
		k33_m = 20;			// k33_m�� 20�� �����Ѵ�.

		while (true) {	// ���ǿ� ��ġ�ɶ����� �������� ����Ǵ� while���� �����Ѵ�.
			for (int k33_i = 0; k33_i < k33_m; k33_i++) {	//	0���� k33_m ������ k33_i�� ������� ���ԵǴ� for���� �����Ѵ�.
				System.out.print(" ");						// ���� ���
			}
			for (int k33_i = 0; k33_i < k33_n; k33_i++) {	//	0���� k33_n ������ k33_i�� ������� ���ԵǴ� for���� �����Ѵ�.
				System.out.print("*");						// �����!
			}
			System.out.println("");	// �� �ٲ��� ���� ""�� �Է��Ѵ�.
									// ����� �߽����� ������ �� ĭ �پ��� �ְ�, ���� �ΰ��� �þ�� �ϵ���
			k33_m = k33_m - 1;		// k33_m���� -1�� ���ְ�
			k33_n = k33_n + 2;		// k33_n���� +2�� ���ش�.
			
			if (k33_m < 0) {		// k33_m�� 0���� �۾�����
				break;				// �����.
			}
		}
	}
}
