package java0414;

public class Main7 {

	// �Һ��ڰ� ���� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] k33_item = { "����", "����Ĩ", "�Ƕ�", "����" };	// ���ڿ� �迭�� k33_item�� �����ϰ� ������� �����̸��� �Է��Ѵ�.
		
		int[] k33_price = { 1000, 1100, 900, 1200 }; // ������ �迭�� k33_price�� �����ϰ�, ������� ������ �Է��Ѵ�.
		int[] k33_amount = { 3, 2, 3, 6 }; // ������ �迭�� k33_price�� �����ϰ�, ������� ������ �Է��Ѵ�.
		double k33_taxRate = 0.1;	// �Ǽ��� ������ 0.1���� ���� k33_taxRate�� �����Ѵ�. k33_taxRate�� �����̴�.
		int k33_totalSum = 0;	// ������ ���� k33_totalSum�� �����ϸ鼭 ���� 0���� �ʱ�ȭ���ش�.

		System.out.printf("*********************************************\n");
		System.out.printf("                     ������                  \n");
		System.out.printf(" �� ��             �� ��      �� ��     �� �� \n");

		for (int i = 0; i < k33_item.length; i++) { // 0���� �迭 k33_item�� ���̸�ŭ ����Ǵ� for���� �Է��Ѵ�.
			int k33_sum = k33_price[i] * k33_amount[i];	// ������ ���� k33_sum�� �����ϰ� k33_price[i]�� k33_amount[i]�� ���հ��� �����Ѵ�.
			k33_totalSum = k33_totalSum + k33_sum;	// k33_totalSum�� k33_totalSum�� k33_sum�� ���� ���� �����Ѵ�.
			System.out.printf(" %-8s\t%8d\t%-3d\t%5d\n", k33_item[i], k33_price[i], k33_amount[i], k33_sum);
			// ������� k33_item[i], k33_price[i], k33_amount[i], k33_sum���� ����Ѵ�.
		}

		System.out.printf("*********************************************\n");
		System.out.printf(" ���� �ݾ� : %32d\n", k33_totalSum); // k33_totalSum(���ұݾ�)�� ����Ѵ�.

		int k33_totalNetPrice = (int) (k33_totalSum / (1 + k33_taxRate)); 
		// ������ ���� k33_totalNetPrice�� �����Ѵ�. k33_totalNetPrice�� k33_totalSum�� k33_taxRate�� 1�� ���� ������ ������ ���������� ��ȯ�� ���̴�.
		System.out.printf(" ���� �ݾ� : %32d\n", k33_totalNetPrice); // k33_totalNetPrice(�����ݾ�)�� ����Ѵ�.

		int k33_tax = k33_totalSum - k33_totalNetPrice; // ������ ������  k33_tax�� �����ϰ�  k33_tax�� k33_totalSum���� k33_totalNetPrice�� �� ���̴�.
		System.out.printf(" ��     �� : %32d\n", k33_tax); // k33_tax(����)�� ����Ѵ�.
	}
}
