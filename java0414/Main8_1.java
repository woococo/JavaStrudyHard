package java0414;

public class Main8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k33_myWon = 1000000; // k33_myWon�̶�� ������ ������ ����, ȯ���� �ݾ��� �Է��Ѵ�.
		double k33_moneyEx = 1238.21; // k33_moneyEx��� �Ǽ��� ������ ����, �޷�ȯ���� �Է��Ѵ�.
		double k33_commission = 0.003; // k33_commission��� �Ǽ��� ������ ����, ȯ�������Ḧ �Է��Ѵ�.

		int k33_usd = (int) (k33_myWon / k33_moneyEx);	// k33_usd��� ������ ������ ����, k33_myWon(ȯ���� �ݾ�)�� k33_moneyEx(ȯ��)�� ���������� ������ �޷��̴�.
														// ���� ���� ���������� ����� �Ҽ��� �ڸ��� ����ó���� �ȴ�.
														
		int k33_remain = (int) (k33_myWon - k33_usd * k33_moneyEx); // k33_remain��� ������ ������ ����, �ܵ� ���̴�.
																	// k33_myWon(ȯ���� �ݾ�)���� k33_usd(ȯ���� �޷�)�� k33_moneyEx(ȯ��)�� ���� ���� ����.

		double k33_comPerOne = k33_moneyEx * k33_commission; // k33_comPerOne��� �Ǽ��� ������ ����, �޷��� �����ᰪ�̴�.
															 // k33_moneyEx(ȯ��)�� k33_commission(ȯ��������)�� ���Ѵ�.
		
		double k33_totalCom = k33_usd * k33_comPerOne;	// k33_totalCom�̶�� �Ǽ��� ������ ����, �� ������ ���̴�.
														// k33_usd(ȯ���� �޷�)�� k33_comPerOne(�޷��� ������ ��)�� ���Ѵ�.
		
		System.out.printf("**********************************************************************\n");
		System.out.printf("*                          ������ ���                               *\n");
		System.out.printf("�� ������ : %f�� => ��ȭ : %d�޷�, �޷��� ������: %f��\n", k33_totalCom, k33_usd, k33_comPerOne);
		System.out.printf("**********************************************************************\n");
	}
}
