package java7��;

public class p01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("k33_HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ�abcd", 15)); // "�ѱ�abcd" �տ� ��ĭ���� ä���
		System.out.printf("k33_HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ��ѱ�aa", 15)); // "�ѱ��ѱ�aa" �տ� ��ĭ���� ä���
		System.out.printf("k33_HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ�aa", 15)); // "�ѱ�aa" �ڿ� ��ĭ���� ä���
		System.out.printf("k33_HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ��ѱ�aa", 15)); // "�ѱ��ѱ�aa" �ڿ� ��ĭ���� ä���
		System.out.printf("�ѱ��� [%d]��\n", k33_HanCount("�ѱ��ѱ�aa")); // �ѱ��� ����� ���
	}

	public static String k33_HanBlankForeword(String k33_input, int k33_length) {	// ���ڿ� ���� ��ĭ���� ä��� �� ���ڿ� ���̸� k33_length�� ����
		String k33_output = ""; // ��ĭ�� ä��� ����
		byte [] k33_byte = k33_input.getBytes(); // �Է¹��� ���ڿ��� �ϳ��� �迭�� �ִ´�
		for (int i = 0; i < k33_length - k33_byte.length; i++) { 
			k33_output = k33_output + " "; // ��ĭ�� �߰��Ѵ�
		}
		return k33_output + k33_input; // ������ ��ĭ�� �Է¹��� ���ڿ��� �����Ѵ�
	}

	public static String k33_HanBlankBackword(String k33_input, int k33_length) { // ���ڿ� �ڸ� ��ĭ���� ä��� �� ���ڿ� ���̸� k33_length�� ����
		String k33_output = ""; // ��ĭ�� ä��� ����
		byte [] k33_byte = k33_input.getBytes(); // �Է¹��� ���ڿ��� �ϳ��� �迭�� �ִ´�
		for (int i = 0; i < k33_length - k33_byte.length; i++) {
			k33_output = k33_output + " "; // ��ĭ�� �߰��Ѵ�
		}
		return k33_input + k33_output; // �Է¹��� ���ڿ��� ������ ��ĭ�� ����Ѵ�
	}

	public static int k33_HanCount(String k33_input) { // �ѱ� ������ ���� �Լ�
		int k33_cnt = 0;	// k33_cnt ������ �����ϰ� 0���� �ʱ�ȭ���ش�
		byte [] k33_byte = k33_input.getBytes(); // �Է¹��� ���ڿ��� byte�� ������ �迭�� �־��ش�
		k33_cnt = k33_byte.length - k33_input.length(); // k33_cnt�� k33_byte ���̿��� k33_input���̸� ���ָ� �ȴ�
		return k33_cnt; // �ѱ۰����� �����Ѵ�
	}
}
