package java0415;

public class Main03 {

	// 1-3. for��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 9���� �� ���ϱ�
		int k33_sum = 0;	// ������ ������ k33_sum�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�. 
		for (int k33_i = 0; k33_i < 10; k33_i++) { // 0���� 9���� ������� ����Ǵ� for�� �����Ѵ�.
			k33_sum = k33_sum + k33_i;	// k33_sum�� ���� k33_sum�� k33_i�� ���� ���� �����Ѵ�.
		}
		System.out.printf("sum %d\n", k33_sum);	// k33_sum���� ����Ѵ�.
		System.out.println("");	// �ٹٲ��� ���� ""�� ����Ѵ�.

		
		// ������ ����ϱ� 
		for (int k33_i = 1; k33_i < 10; k33_i++) {  // 1���� 9���� ������� k33_i�� ���ԵǴ� for�� �����Ѵ�
			System.out.printf("*****************\n");
			System.out.printf("  ������ %d  ��  \n", k33_i); // ������ k33_i���� ����Ѵ�.
			System.out.printf("*****************\n");
			for (int k33_j = 1; k33_j < 10; k33_j++) {	// 1���� 9���� ������� k33_j�� ���ԵǴ� ���� for�� �����Ѵ�.
														// ���� for���� ��� 
				System.out.printf(" %d * %d = %d \n", k33_i, k33_j, k33_i * k33_j);
				// k33_i * k33_j = k33_i * k33_j ���� ����ϸ�  4 * 6 = 24 �� ���� ��µȴ�.
			}
		}
	}
}
