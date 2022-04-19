package java0418_5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main4 {

	// ������ ��� 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat k33_df = new DecimalFormat("#,###,###"); // �鸸������ ���� ������ �����Ѵ�.
		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ���� �ð��� ��� ������� ������ k33_sdtA �̸�����
																					// �����ش�.
		SimpleDateFormat k33_sdtB = new SimpleDateFormat("YYYYMMdd "); // ���� �ð��� ��� ������� ������ k33_sdtB �̸����� �����ش�.

		int k33_totalPrice = 33000; // ��ǰ ���ݰ� �ΰ����� ������ �ݾ��� ������ ���� k33_totalPrice�� �������ش�.
		double k33_taxRate = 1.1; // �ΰ������� 0.1�� 1�� ���� 1.1�� �����Ѵ�.
		int k33_price = (int) (k33_totalPrice / k33_taxRate) + 1;
		// �ΰ����� ������ ��ǰ������ �˱� ���ؼ� k33_totalPrice�� �ΰ���(k33_taxRate)�� ���� ���� ���������� ��ȯ�ؼ�
		// k33_price�� �����Ѵ�.
		int k33_tax = k33_totalPrice - k33_price; // k33_tax�� �ΰ����� k33_totalPrice���� k33_price�� �� ���̴�.

		System.out.printf("%s\n", "�ſ����");
		System.out.printf("%s %17s\n", "�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");
		System.out.printf("%s\n", "������ : �Ѿ��ġ�");
		System.out.printf("%s\n", "��  �� : ��� ������ �д籸 Ȳ�����251��\n�� 10 , 1��");
		System.out.printf("%s\n", "��ǥ�� : ��â��");
		System.out.printf("%s %19s\n", "����� : 752-53-00558", "TEL : 7055695");
		System.out.printf("%s\n", "- - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("%s%32s ��\n", "��  ��", k33_df.format(k33_price)); // k33_price(�ݾ�)�� �������˿� ���� ����Ѵ�.
		System.out.printf("%s%32s ��\n", "�ΰ���", k33_df.format(k33_tax)); // k33_tax(�ΰ���)�� �������˿� ���� ����Ѵ�.
		System.out.printf("%s%32s ��\n", "��  ��", k33_df.format(k33_totalPrice)); // k33_totalPrice(�հ�ݾ�)�� ���� ���˿� ���� ����Ѵ�.
		System.out.printf("%s\n", "- - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("%s\n", "�츮ī��");
		System.out.printf("%s%5s\n", "ī���ȣ : 5387-20**-****-4613(S)", "�Ͻú�");
		System.out.printf("%s%s\n", "�ŷ��Ͻ� : ", k33_sdtA.format(k33_calt.getTime())); // �ŷ��Ͻÿ� ����ð��� �ҷ��ͼ� ���˿� ���� ����Ѵ�.
		System.out.printf("%s\n", "���ι�ȣ : 70404427");
		System.out.printf("%s\n", "�ŷ���ȣ : 357734873739");
		System.out.printf("%s%22s\n", "���� : ��ī���", "���� : 720068568");
		System.out.printf("%s\n", "�˸� : EDC����ǥ");
		System.out.printf("%s\n", "���� : TEL)1544-4700");
		System.out.printf("%s\n", "- - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("%23s\n", "* �����մϴ� *");
		System.out.printf("%31s%s\n", "ǥ��V2.08_", k33_sdtB.format(k33_calt.getTime())); // ������ �������� ���ó�¥�� ���Ե� ������ ������ش�.

	}
}
