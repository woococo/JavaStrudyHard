package java0418_5;

import java.lang.Character.UnicodeBlock;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k33_df = new DecimalFormat("#,###,###");	// ���� ������ k33_df�� ���Ѵ�.
		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY-MM-dd HH:mm");	// ��¥ ������ k33_sdtA�� ���Ѵ�.
		SimpleDateFormat k33_sdtB = new SimpleDateFormat("YYYYMMdd");	// ��¥ ������ k33_sdtB�� ���Ѵ�.

		String[] k33_itemNames = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 10������", "��������E", "���� ���Ϸ� �� �� ����", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ�� 120g*5", "(��)������������", "���ѱ� �������156g*5��", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư��", "������ݺ�����ġ��ȹ" };
		int[] k33_price = { 75000, 69000, 5980200, 33000, 55000, 33800, 66100, 27500, 118000, 49800, 24800, 79200, 49800, 49080, 71300,
				39800, 44800, 49800, 32100, 69500, 29800, 19900, 19800, 39800, 44800, 34800, 790800 };
		int[] k33_amount = { 2, 6, 8, 1, 20, 1, 5, 2, 99, 1, 4, 1, 3, 50, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1 };
		boolean[] k33_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false };
		double k33_taxRate = 0.1; 		// �ΰ�����
		int k33_sum = 0; 				// k33_price(�ܰ�) * k33_amount(����) ��
		int k33_totalTaxFreePrice = 0; 	// �鼼 ��ǰ �հ�
		int k33_totalNetPrice = 0; 		// ������ǰ �հ� = ������ǰ + �ΰ���
		int k33_NetPrice = 0; 			// ������ǰ
		int k33_tax = 0; 				// �ΰ���
		int k33_totalPrice = 0; 		// ���� �ݾ�
		int k33_point = 0;				// ��ȸ�߻�����Ʈ
		int k33_totalPoint = 5473;		// �� ����Ʈ
		
		System.out.printf("%35s\n", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%9s%21s\n", "emart", "206-86-50913 ����");
		System.out.printf("%29s\n", "���� ������ ������� 552");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("%s%s%18s\n", "[�� ��]", k33_sdtA.format(k33_calt.getTime()), "POS:0011-9861"); // ����ð� ���
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%7s%14s%4s%7s\n", "�� ǰ ��", "�� ��", "����", "�� ��");
		System.out.printf("%s\n", "-----------------------------------------");

		for (int k33_i = 0; k33_i < k33_itemNames.length; k33_i++) { // k33_i�� 0���� �迭 k33_itemNames�� ���̱��� ����Ǵ� for���� �����Ѵ�.
			k33_sum = k33_price[k33_i] * k33_amount[k33_i]; // k33_sum�� k33_price(�ܰ�) * k33_amount(����) ������ ������ �ݾ� �κп� ��µǴ� �����̴�.
			if (k33_taxfree[k33_i] == true) { // k33_i�� ��ǰ�� �鼼 ��ǰ�̶��
				k33_totalTaxFreePrice = k33_totalTaxFreePrice + k33_sum; // k33_totalTaxFreePrice�� ���� �߰��Ѵ�.
				System.out.print("* "); // ��ǰ�� �տ� "* " ǥ�ø� ���ش�.
			} else { // k33_i�� ��ǰ�� �鼼 ��ǰ�� �ƴϰ� ������ǰ�̶��
				System.out.print("  "); // ��ǰ�� �տ� �ƹ��͵� ������� �ʰ�
				k33_totalNetPrice = k33_totalNetPrice + k33_sum; // k33_totalNetPrice�� ���� �߰��Ѵ�.
			}
			
			String k33_itemName = k33_itemNames[k33_i];	// k33_itemName ������ �����ؼ� �迭 k33_itemNames�� k33_i���� �־��ش�.
			int k33_cutLength = 15;	// ��ǰ���� ¥���� ���� ����Ʈ�� �����Ѵ�. 
			
			if (k33_itemName.getBytes().length > k33_cutLength) {	
				StringBuffer k33_sb = new StringBuffer(k33_cutLength);	// ���ڿ� ���� k33_sb�� �����Ѵ�.
				int k33_cnt = 0;	// ������ ���� k33_cnt�� �����Ѵ�.
				for (char k33_ch : k33_itemName.toCharArray()) {	// ���� ���� k33_ch�� �����Ѵ�.
					k33_cnt += String.valueOf(k33_ch).getBytes().length; // k33_cnt�� String.valueOf(k33_ch).getBytes().length ���� ��� ���Ѵ�
					if (k33_cnt > k33_cutLength) { // k33_cnt�� k33_cutLength������ �۾����� 
						break;	// �����.
					}
					k33_sb.append(k33_ch);	// ���ڿ� k33_sb�� k33_ch�� �߰��Ѵ�.
				}
				k33_itemName = k33_sb.toString();	// k33_itemName�� k33_sb.toString() ���� �����Ѵ�.
			}
			
			String k33_blank = ""; // ���ڿ� ���� k33_blank�� �����Ѵ�. 20����Ʈ�� ���� �ʴ� ���ڿ� k33_itemName���� k33_blank�� �Բ� ����ؼ�
									// 20����Ʈ�� �����ش�.
			int k33_itemNameLength = k33_itemName.getBytes().length; // ������ ���� k33_itemNameLength�� �����Ѵ�. ���ڿ�
																		// k33_itemName�� ����Ʈ ũ�⸦ �����Ѵ�.
			for (int k33_j = 0; k33_j < 16 - k33_itemNameLength; k33_j++) { // k33_j �� 0���� (20 - k33_itemNameLength)���� ���������� ����Ǵ� for���� �����Ѵ�.
				k33_blank = k33_blank + " "; // �ʿ��� ��ŭ k33_blank�� ��ĭ�� ä���ش�.
			}

			System.out.printf("%s%s%9s%3d%11s\n", k33_itemName, k33_blank, k33_df.format(k33_price[k33_i]),
					k33_amount[k33_i], k33_df.format(k33_sum));		// ��ǰ��� ��ĭ, �ܰ�, ����, �ݾ��� ������� ����Ѵ�.
			if ((k33_i + 1) % 5 == 0) { // ��ǰ 5���� ����ϰ� ������ ���м��� ����Ѵ�.
				System.out.printf("%s\n", "-----------------------------------------");
			}
		}

		k33_totalPrice = k33_totalNetPrice + k33_totalTaxFreePrice; // k33_totalPrice�� k33_totalNetPrice(�ΰ����� ���Ե� ��ǰ�Ѿ�)��
																	// k33_totalTaxFreePrice(�鼼��ǰ�Ѿ�)�� ���� ������ ���� �����ݾ��� �ȴ�
		k33_NetPrice = (int) (k33_totalNetPrice / (1 + k33_taxRate)); // k33_NetPrice�� �ΰ����� ���Ե��� ���� ��������,
																		// k33_totalNetPrice�� 1 + k33_taxRate(�ΰ�����)��
																		// �������ش�.
		k33_tax = k33_totalNetPrice - k33_NetPrice; // k33_tax�� �ΰ����� k33_totalNetPrice(�ΰ����� ���Ե� ��ǰ�Ѿ�)����
													// k33_NetPrice(�ΰ����� ���ܵ� ��ǰ�Ѿ�)�� ���ָ� ���´�.
		k33_point = k33_totalPrice / 1000;
		System.out.printf("\n%22s %13d\n", "�� ǰ�� ����", k33_itemNames.length); // �� ǰ�� ������ ����ϴµ� �迭 k33_itemNames�� ���� ������ �Ѵ�.
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k33_df.format(k33_totalTaxFreePrice)); // �鼼 ��ǰ �����Ѿ��� ���˿� �°�(###,###,###) ������ش�.
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k33_df.format(k33_NetPrice)); // ���� ��ǰ �����Ѿ��� ���˿� �°�(###,###,###) ������ش�.
		System.out.printf("%24s%14s\n", "��   ��   ��", k33_df.format(k33_tax)); // �ΰ����� ���˿� ���� ������ش�.
		System.out.printf("%25s%14s\n", "��        ��", k33_df.format(k33_totalPrice)); // �հ�ݾ��� ���˿� ���� ������ش�.
		System.out.printf("%s %23s\n", "�� �� �� �� �� ��", k33_df.format(k33_totalPrice)); // ���� ���� �ݾ��� ���˿� ���� ������ش�.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s%15s%11s\n", "ī�����(IC)", "�Ͻú� /", k33_df.format(k33_totalPrice)); // �����ݾ��� ���˿� ���� ������ش�.
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%22s\n", "[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%s%20s%7s\n", "��ȸ�߻�����Ʈ", "9350**9995", k33_df.format(k33_point)); // ��ȸ��������Ʈ�� ���˿� ���� ������ش�.
		System.out.printf("%s%16s(%7s)\n", "����(����)����Ʈ", k33_df.format(k33_totalPoint + k33_point), k33_df.format(k33_totalPoint));	
		// ������Ʈ�� ������ ����Ʈ�� ����Ѵ�.
		System.out.printf("%s\n", "*�ż��� ����Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%21s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s%29s\n", "������ȣ : ", "34��****");
		System.out.printf("%s%30s\n", "�����ð� : ", "2022-04-19 12:20:04");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%15s%s\n", k33_sdtB.format(k33_calt.getTime()), "/00119861/00164980/31"); // ����ð��� ���Ե� ���ڵ� ��ȣ�� ������ش�.
	}
}
