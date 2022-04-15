package java0414;

public class Main6 {

	// �ܼ� ���� ���

	public static int k33_taxcal(int k33_val, int k33_rate) { // main���� �Է¹��� k33_val, k33_rate�� �Լ� k33_taxcal�� �����Ѵ�.
		
		int k33_ret; // k33_ret��� ������ ������ �����Ѵ�. k33_ret�� �����̴�.

		if (((double) k33_val * (double) k33_rate / 100.0) == k33_val * k33_rate / 100) {	
			// �Ǽ��� ��ȯ�� k33_val�� k33_rate�� ���ϰ� 100.0���� ���� ���� k33_val�� k33_rate�� ���ϰ� 100���� ���� ���� ���ٸ�
			k33_ret = k33_val * k33_rate / 100; //k33_ret�� k33_val�� k33_rate�� ���ϰ� 100���� ���� ���� �����Ѵ�.
		} else {	// �ƴ϶��?!
			k33_ret = k33_val * k33_rate / 100 + 1;	// k33_ret�� k33_val�� k33_rate�� ���ϰ� 100���� ������ 1�� ���Ѱ��� �����Ѵ�.
		}
		return k33_ret; // k33_ret�� ��ȯ�ϸ� ���� �Լ��� 25������ ���� �ȴ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k33_val = 271; // 271�� ������ ������ ���� k33_val�� �����Ѵ�. k33_val�� ���������̴�.
		int k33_rate = 3;	// 3�� ������ ������ ���� k33_rate�� �����Ѵ�. k33_rate�� ���� 3�ۼ�Ʈ�̴�.
		int k33_tax = k33_taxcal(k33_val, k33_rate);	// �Լ� k33_taxcal�� k33_val, k33_rate�� �����ؼ� ���� ���� ������ ���� k33_tax�� �����Ѵ�.

		System.out.printf("*******************************************\n");
		System.out.printf("*               �ܼ� ���� ���            *\n");
		System.out.printf("���� ���� ��� : %f\n", k33_val * k33_rate / 100.0);	// ���������� k33_val�� k33_rate�� ���ϰ� 100.0���� ���� ���� ��µȴ�.
		System.out.printf("���� ���� : %d ���� : %d �������԰��� : %d\n", k33_val, k33_tax, k33_val + k33_tax); 
		// ���� ���� ������ k33_val�� k33_tax�� ���� ���� ��µȴ�.
		System.out.printf("*******************************************\n");
	}
}
