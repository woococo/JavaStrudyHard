package java0418_5;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k33_i = 1; k33_i < 10; k33_i = k33_i + 3) { // k33_i�� 1, 4, 7�� ����ϱ� ���ؼ� 1���� 9���� k33_i + 3�� �����ϴ� for���� �����Ѵ�.. 
			System.out.printf("*************\t*************\t************* \n");
			System.out.printf(" ������ %d�� \t ������ %d�� \t ������ %d�� \n", k33_i, k33_i + 1, k33_i + 2); // 1��, 2��, 3�ܰ� ���� ����ϱ� ���ؼ� k33_i, k33_i + 1, k33_i + 2�� �Է��Ѵ�.
			System.out.printf("*************\t*************\t************* \n");

			for (int k33_j = 1; k33_j < 10; k33_j++) {	// k33_j�� 1���� 9���� ���������� ����Ǵ� for���� �����Ѵ�.
				System.out.printf(" %d * %d = %d \t %d * %d = %d \t %d * %d = %d\n", k33_i, k33_j, k33_i * k33_j, k33_i + 1,
						k33_j, k33_i + 1 * k33_j, k33_i + 2, k33_j, k33_i + 2 * k33_j); 
				// ������ ������ ��µ� �� �ֵ��� ���� �Է��Ѵ�. k33_i�� k33_j �׸��� k33_i�� k33_j�� ���� ���� �Է��Ѵ�.
			}
		}
	}
}
