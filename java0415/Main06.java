package java0415;

public class Main06 {

	// 2-1. �ܼ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_iA, k33_iB; // ������ ���� k33_iA�� k33_iB�� �����Ѵ�.

		k33_iA = 0; 		// k33_iA�� ���� 0���� �ʱ�ȭ��Ų��.
		while (true) { 		// �������� ����Ǵ� while���� �����Ѵ�.
			k33_iB = 0; 	// k33_iB�� ���� 0���� �ʱ�ȭ��Ų��.
			while (true) {	// �������� ����Ǵ� while���� �����Ѵ�.
				System.out.print("*"); 	// �����!
				if (k33_iA == k33_iB) { // ���� iA�� iB�� ���ٸ�?!
					break; // ����!
				}

				k33_iB++; 	// k33_iB ���� �ѹ��� �������� 1�� �����ϵ��� �Ѵ�.
			}
			System.out.print("\n"); // �� �ٲٱ�!
			k33_iA++; // k33_iA�� 1�� ������Ų��.
			if (k33_iA == 30) {  // k33_iA�� 30�̶��?!
				break; // ����!
			}
		}
	}
}
