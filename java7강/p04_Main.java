package java7��;

import java.text.DecimalFormat;

public class p04_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] OneRec = { "����,����,�������,����,����,�� �̿��ο�", 
				"1,�λ걤����,�λ꿪(2600055),8819,5788,14607",
				"2,�λ걤����,�Ե�ȣ�ڹ�ȭ�����鿪(2613488),7187,2662,9848", "3,�λ걤����,�Ե�ȣ�ڹ�ȭ�����鿪(2613487),4927,4111,9038n",
				"4,�λ걤����,�Ե�ȣ�ڹ�ȭ�����鿪(2616302),5749,2469,8219", "5,�λ걤����,��������(2600925),4329,3514,7842",
				"6,�λ걤����,���鿪.�������ϻ�(2621684),5182,1465,6647", "7,�λ걤����,��������(2621685),4227,2013,6241",
				"8,�λ걤����,�Ե�ȣ�ڹ�ȭ�����鿪(2616303),3066,3114,6181", "9,�λ걤����,����û(2600498),4031,1984,6015",
				"10,�λ걤����,��õ��(2601444),3543,2404,5946" };

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");
		System.out.println("<<�λ걤���� �ִ� �̿� ������>>");
		String[] fieldName = OneRec[0].split(",");
		for (int i = 1; i < OneRec.length; i++) {
			String[] field = OneRec[i].split(",");
			System.out.printf("****************************************************\n");
			System.out.printf(" %s : %s\n", fieldName[0], field[0]);
			System.out.printf(" %s : %s\n", fieldName[1], field[1]);
			System.out.printf(" %s : %s\n", fieldName[2], field[2]);
			
			for (int j = 3; j < fieldName.length-1; j++) {
				System.out.printf(" %s : %s[%s]\n", fieldName[j], k33_df.format(Integer.parseInt(field[j])), k33_print(field[j]));
			}
			System.out.printf("****************************************************\n");
		}
	}

	public static String k33_print(String k33_sNumVal) {
		int k33_i = 0; // k33_i�� ���� 0���� �ʱ�ȭ�����ش�.
		int k33_j = k33_sNumVal.length() -1; // k33_j�� ���ڿ� k33_sNumVal�� ���̿� 1�� �� ���� �����Ѵ�.
		// �迭�� ���� �ҷ��� �� ����ϱ� ������ -1
		String k33_sNumVoice = "";
		String[] k33_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		String[] k33_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���ڿ� �迭�� k33_units�� k33_unitX�� �����ϰ� �� ���� �־� �����Ѵ�.
		// k33_units���� ���ڸ� �ѱ۷� ���� ���� �Է�
		// k33_unitX���� ���� ������ �Է�

		while (true) { // ���ǿ� ���� ���⶧���� �������� ���ư��� while���� �����Ѵ�.
			if (k33_i >= k33_sNumVal.length()) { // k33_i�� ���ڿ� k33_sNumVal�� ���̺��� �۰ų� ���ٸ�
				break; // �����!
			}

			if (k33_sNumVal.substring(k33_i, k33_i + 1).equals("0")) { // ���ڿ� k33_sNumVal�� k33_i ���� "0"�� ��ġ�Ѵٸ�
				if (k33_sNumVal.length() <= 8) {
					k33_sNumVoice = k33_sNumVoice
							+ k33_units[Integer.parseInt(k33_sNumVoice.substring(k33_i, k33_i + 1))] 
							+ k33_unitX[k33_j];

				} else {
					if (k33_sNumVal.substring(k33_sNumVal.length() - 8, k33_sNumVal.length() - 4).equals("0000")) {
						k33_sNumVal = k33_sNumVal.replace("��", "");
						// õ���ڸ����� ���ڸ����� ��� 0���� 0000�̸� ���ڿ����� "��"�� �����Ѵ�.
						// 2000000000 �� �Է������� �̽ʾ����� ��µǾ�� �ϴµ� �̽ʾ︸���� ��µǴ� ������ �������ؼ�.
					} else if (k33_unitX[k33_j].equals("��") || k33_unitX[k33_j].equals("��")) {
						// �� �迭 k33_unitX[k33_j]�� ���� "��"�̳� "��"�� ��ġ�Ѵٸ�
						k33_sNumVoice = k33_sNumVoice + "" + k33_unitX[k33_j];
						// k33_sNumVoice�� k33_sNumVoice + "" + k33_unitX[k33_j]�� �����Ѵ�.
					} else { // �迭 k33_unitX[k33_j]�� ���� "��"�̳� "��"�� ��ġ���� �ʴ´ٸ�
						// �ƹ����� ���� �ʴ´�.
					}
				}
			} else { // ���ڿ� k33_sNumVal�� k33_i ���� "0"�� ��ġ���� �ʴ´ٸ�?
				k33_sNumVoice = k33_sNumVoice + k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i + 1))]
						+ k33_unitX[k33_j];
				// k33_sNumVoice�� ���� k33_sNumVoice�� �迭 k33_units�� k33_sNumVal�� k33_i�� ������ ��ȯ�� ����
				// ������ ��(���ڰ� �ѱ۷� ���)��
				// �迭 k33_unitX�� k33_j(������ �ѱ۷� ���)�� �߰��Ѵ�.
				// while�� ���鼭 ���ڰ� �߰���
			}
			k33_i++; // k33_i�� 1�� �����ؼ� ���� ���ڷ� �̵��ϰ� �Ѵ�.
			k33_j--; // k33_j�� 1�� �����ؼ� ������ �������� �̵��ϰ� �Ѵ�.
		}
		return k33_sNumVoice;
	}

}