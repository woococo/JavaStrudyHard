package java0415;

import java.text.DecimalFormat;

public class Main18 {

	// 3-5. ĭ ���� �μ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k33_item = "���"; 	// ���ڿ� ������ k33_item�� �����ϰ� "���"�� �����Ѵ�.
									// �ѱ��� �ϳ��� 2byte�̰�, ����� 1byte�̴�. 
		int k33_unit_price = 5000;	// ������ ������ k33_unit_price�� �����ϰ� 5000�� �����Ѵ�. (�ܰ�)
		int k33_num = 500;			// ������ ������ k33_num�� �����ϰ� 500�� �����Ѵ�. (����)
		int k33_total = 0;			// ������ ������ k33_total�� �����ϰ� 0���� �ʱ�ȭ ���ش�.

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###,###"); 	// �� �ڸ����� ,(�޸�)�� ��� ������ �����Ѵ�.

		System.out.println("==========================================================");
		System.out.printf("%10.20s%8.8s%8.8s%18.16s\n", "ǰ��", "�ܰ�", "����", "�հ�");		
		// %20.20só�� ���ڿ��� ĭ�� �����ϰ� "ǰ��", "�ܰ�", "����", "�հ�"�� ������� ��µǵ��� �Ѵ�.
		System.out.println("==========================================================");
		System.out.printf("%10.20s%10.10s%10.10s%20.20s\n", k33_item, k33_df.format(k33_unit_price),
				k33_df.format(k33_num), k33_df.format(k33_unit_price * k33_num));
		// %20.20só�� ���ڿ��� �������� ĭ�� �����ϰ� k33_item, k33_df������ ������ k33_unit_price),
		// k33_df������ ������k33_num, k33_df ������ ������ k33_unit_price ���ϱ� k33_num���� ������� ��µǵ��� �Ѵ�.
		System.out.println("==========================================================");
	}
}
