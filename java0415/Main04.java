package java0415;

public class Main04 {

	// 1-4. while��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_i = 2;				// ������ ������ k33_i�� �����ϰ� 2�� �����Ѵ�.
		while (k33_i <= 9) { 		// k33_i�� 9�϶� �����ϴ� while���� �����Ѵ�.
			int k33_j = 1; 			// ������ ������ k33_j�� �����ϰ� 1�� �����Ѵ�.
			while (k33_j <= 9) {	// k33_j�� 9�϶� �����ϴ� while���� �����Ѵ�.
				System.out.println(k33_i + " * " + k33_j + " = " + k33_i * k33_j);
				k33_j++; // �ѹ� �������� k33_j�� 1�� �����Ѵ�.
			}
			k33_i++;	// �ѹ� �������� k33_i�� 1�� �����Ѵ�.
		}
	}
}
