package java0418_5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main5 {

	// ������ ��� 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###,###");	// �鸸������ ���� ������ �����Ѵ�.
		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // SimpleDateFormatŬ������ ��¥ ���� ������ �����Ѵ�.
		
		String k33_itemName1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";	// ���ڿ� k33_itemName1�� ù��° ��ǰ���� �Է��Ѵ�.
		String k33_itemCode1 = "1031615";	// ���ڿ� k33_itemCode1�� ù��° ��ǰ�� �ĺ���ȣ�� �Է��Ѵ�.
		int k33_price1 = 3000;	// ������ ���� k33_price1�� ù��° ��ǰ�� ������ �Է��Ѵ�.
		int k33_amount1 = 1;	// ������ ���� k33_amount1�� ù��° ��ǰ�� ������ �Է��Ѵ�.

		String k33_itemName2 = "�����̵�ĸ��� (������) (100ȣ)";	// ���ڿ� k33_itemName2�� �ι�° ��ǰ���� �Է��Ѵ�.
		String k33_itemCode2 = "1008152";	// ���ڿ� k33_itemCode2�� �� ��° ��ǰ�� �ĺ���ȣ�� �Է��Ѵ�.
		int k33_price2 = 1000;	// ������ ���� k33_price2�� �ι�° ��ǰ�� ������ �Է��Ѵ�.
		int k33_amount2 = 1;	// ������ ���� k33_amount2�� �ι�° ��ǰ�� ������ �Է��Ѵ�.

		String k33_itemName3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";	// // ���ڿ� k33_itemName3�� ����° ��ǰ���� �Է��Ѵ�.
		String k33_itemCode3 = "1020800";	// ���ڿ� k33_itemCode3�� �� ��° ��ǰ�� �ĺ���ȣ�� �Է��Ѵ�.
		int k33_price3 = 1000;	// ������ ���� k33_price3�� ����° ��ǰ�� ������ �Է��Ѵ�.
		int k33_amount3 = 1;	// ������ ���� k33_amount3�� ����° ��ǰ�� ������ �Է��Ѵ�.
		
		double k33_taxRate = 0.1;	// �ΰ������� 0.1�� �����Ѵ�.
		int k33_totalPrice = (k33_price1 * k33_amount1) + (k33_price2 * k33_amount2) + (k33_price3 * k33_amount3); 
		// k33_totalPrice�� ù��° �ι�° ����° ��ǰ�� ���ݰ� �� �������� ���� ���� ���� ���̴�.
		int k33_price = (int) (k33_totalPrice / (1 + k33_taxRate));	// �ΰ����� ������ ������ �˱� ���ؼ� k33_totalPrice�� k33_taxRate�� 1�� ���� ���� ���������� ��ȯ���ش�.
		int k33_tax = k33_totalPrice - k33_price;	// �ΰ����� k33_tax�� k33_totalPrice���� k33_price�� �� ���̴�. (�ΰ��� ���԰��� - �ΰ��� ������ ����)
		
		System.out.printf("\n%25s\n", "\"���ΰ���, ���̼�\"");
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����");
		System.out.printf("%s\n", "��ȭ:031-702-6016");
		System.out.printf("%s\n", "����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.printf("%s\n", "��ǥ:������, ��ȣ�� 213-81-52063");
		System.out.printf("%s\n", "����:��⵵ ������ �д籸 �д��53���� 11 \n(������)");
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%23s\n", "�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%26s\n", "ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%27s\n", "��ȯ/ȯ�� 14��(03��12��)�̳�,");
		System.out.printf("%24s\n", "(����)������, ����ī�� ���� ��");
		System.out.printf("%20s\n", "���Ը��忡�� ����");
		System.out.printf("%25s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%24s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%s %27s\n", "[POS 1058231]", k33_sdt.format(k33_calt.getTime()));	// ����ð��� ���˿� ���� ������ش�.
		System.out.printf("%s\n", "=========================================");
		k33_printItemName(k33_itemName1);	// ù��° ��ǰ�� ��ǰ���� ����ϱ� ���ؼ� �Լ� k33_printItemName�� k33_itemName1�� �־��ش�.
		System.out.printf("%7s %d %s \n[%s]\n", k33_df.format(k33_price1), k33_amount1,	// ��ǰ���ݰ� ����, ��ǰ���ݰ� ������ ���� �ݾ��� ������ش�.
				k33_df.format(k33_price1 * k33_amount1), k33_itemCode1);
		k33_printItemName(k33_itemName2);	// �ι�° ��ǰ�� ��ǰ���� ����ϱ� ���ؼ� �Լ� k33_printItemName�� k33_itemName2�� �־��ش�.
		System.out.printf("%7s %d %s \n[%s]\n", k33_df.format(k33_price2), k33_amount2,	// ��ǰ���ݰ� ����, ��ǰ���ݰ� ������ ���� �ݾ��� ������ش�.
				k33_df.format(k33_price2 * k33_amount2), k33_itemCode2);
		k33_printItemName(k33_itemName3);	// ����° ��ǰ�� ��ǰ���� ����ϱ� ���ؼ� �Լ� k33_printItemName�� k33_itemName3�� �־��ش�.
		System.out.printf("%7s %d %s \n[%s]\n", k33_df.format(k33_price3), k33_amount3,	// ��ǰ���ݰ� ����, ��ǰ���ݰ� ������ ���� �ݾ��� ������ش�.
				k33_df.format(k33_price3 * k33_amount3), k33_itemCode3);
		System.out.printf("%18s%19s\n", "�����հ�", k33_df.format(k33_price));	// ������ ���Ե� ���� k33_price�� ���� ���˿� ���� ������ش�.
		System.out.printf("%19s%19s\n", "�ΰ���", k33_df.format(k33_tax));	// �ΰ����� k33_tax�� ���� ���˿� ���� ����Ѵ�.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%33s\n", "�Ǹ��հ�", k33_df.format(k33_totalPrice));	// �Ǹ��հ踦 ���� ���˿� ���� ����Ѵ�.
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%s %32s\n", "�ſ�ī��", k33_df.format(k33_totalPrice));	// �����ݾ��� ���� ���˿� ���� ����Ѵ�.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%33s\n", "�츮ī��", "538720**********");
		System.out.printf("%s%12s%s\n", "���ι�ȣ 77982843(0)", "���αݾ�", k33_df.format(k33_totalPrice));	// ���αݾ��� ���� ���˿� ���� ����Ѵ�.
		System.out.printf("%s\n", "=========================================");
		System.out.printf("%25s%s\n", k33_sdt.format(k33_calt.getTime()), "�д缭����");	// ����ð��� ���˿� ����������ش�.
		System.out.printf("%s\n", "��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.printf("%s\n", "����� �� �����̼� ���� ���� : 1599-2211");
		System.out.printf("%34s\n", "||||||||||||||||||||||||");
		System.out.printf("%30s\n", "2112820610158231");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s\n", "�´��̼Ҹ���� �� �Ǵ� Ȩ�������� �����ϼ�");
		System.out.printf("%s\n", "�� ȸ������ �� �پ��� ������ ����������!��");

	}
	
	public static void k33_printItemName(String k33_itemname) {	// ��ǰ���� ����ϱ� ���� �Լ��̴�
		if (k33_itemname.getBytes().length > 26) {	// ��ǰ���� ���̰� 26���� ��ٸ� 
			byte[] k33_byte = k33_itemname.getBytes();	//	����Ʈ �迭 k33_byte�� �����ϰ� k33_itemname�� ����Ʈ ���� �����Ѵ�.
			System.out.printf("%s", new String(k33_byte, 0, 26));	// k33_byte �迭�� 0���� 25���� ����Ѵ�.
		} else {
			System.out.printf("%s",  k33_itemname);	// ��ǰ���� ���̰� 26���� ���� �ʴٸ� �׳� ��ǰ���� ����Ѵ�.
		}
	}

}
