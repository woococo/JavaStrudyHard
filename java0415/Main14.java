package java0415;

public class Main14 {

	// 2-9. �����б� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_iNumVal = 1001034567;	
		// ������ ������ k33_iNumVal�� �����ϰ� 1001034567�� �����Ѵ�.
		String k33_sNumVal = String.valueOf(k33_iNumVal);	
		// ���ڿ� ������ k33_sNumVal�� �����ϰ� k33_iNumVal�� String���� ��ȯ�� ���� �����Ѵ�.
		String k33_sNumVoice = "";	
		// ���ڿ� ������ k33_sNumVoice�� �����ϰ� �ʱ�ȭ���ش�.
		System.out.printf("==> %s [%d�ڸ�]\n", k33_sNumVal, k33_sNumVal.length());
		// k33_sNumVal�� ���ڿ� k33_sNumVal�� ���̸� ����Ѵ�.
		int k33_i, k33_j; // ������ ������ k33_i�� k33_j�� �����Ѵ�.
		
		String[] k33_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		String[] k33_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���ڿ� �迭�� k33_units�� k33_unitX�� �����ϰ� �� ���� �־� �����Ѵ�.
		
		k33_i = 0;	// k33_i�� ���� 0���� �ʱ�ȭ�����ش�.
		k33_j = k33_sNumVal.length() - 1;	// k33_j�� ���ڿ� k33_sNumVal�� ���̿� 1�� �� ���� �����Ѵ�.

		while (true) {	// ���ǿ� ���� ���⶧���� �������� ���ư��� while���� �����Ѵ�.
			if (k33_i >= k33_sNumVal.length()) {	// k33_i�� ���ڿ� k33_sNumVal�� ���̺��� �۰ų� ���ٸ�
				break;	// �����!
			}

			System.out.printf("%s[%s]", k33_sNumVal.substring(k33_i, k33_i + 1),
					k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i + 1))]);
			// ���ڿ� k33_sNumVal�� k33_i ���� k33_i + 1������ ���� 
			// ���� k33_units�� ���ڿ� k33_sNumVal�� k33_i ���� k33_i + 1������ ���� ������ ��ȯ�� ���� ����Ѵ�.
			if (k33_sNumVal.substring(k33_i, k33_i + 1).equals("0")) { // ���ڿ� k33_sNumVal�� k33_i���� k33_i + 1������ ���� "0"�� ��ġ�Ѵٸ�
				if (k33_unitX[k33_j].equals("��") || k33_unitX[k33_j].equals("��")) { 
					// �迭 k33_unitX[k33_j]�� ���� "��"�� ��ġ�ϰų�  k33_unitX[k33_j]�� ���� "��"�� ��ġ�Ѵٸ�
					k33_sNumVoice = k33_sNumVoice + "" + k33_unitX[k33_j];
					// k33_sNumVoice�� k33_sNumVoice + "" + k33_unitX[k33_j]�� �����Ѵ�.
				} else {	// �ƴ϶�� ?
					// �ƹ����� ���� �ʴ´�.
				}
			} else { // �ƴ϶��?
				k33_sNumVoice = k33_sNumVoice + k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i + 1))] + k33_unitX[k33_j];
				// k33_sNumVoice�� k33_sNumVoice�� ���ϰ� �迭 k33_units��  k33_sNumVal�� substring�� ���� ���� ������ ��ȯ�� 
			}
			k33_i++;	// k33_i�� 1�� �����ǵ��� �Ѵ�.
			k33_j--;	// k33_j�� 1�� ���ҵǵ��� �Ѵ�.
		}
		System.out.printf("\n %s[%s]\n", k33_sNumVal, k33_sNumVoice); // k33_sNumVa�� k33_sNumVoice�� ����Ѵ�.
	}
}
