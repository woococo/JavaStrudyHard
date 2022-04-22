package java7��;

public class p01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("k33_HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("k33_HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("k33_HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ�aa", 15));
		System.out.printf("k33_HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", k33_HanCount("�ѱ��ѱ�aa"));
	}

	public static String k33_HanBlankForeword(String k33_input, int k33_length) {
		String k33_output = "";
		byte [] k33_byte = k33_input.getBytes();
		for (int i = 0; i < k33_length - k33_byte.length; i++) {
			k33_output = k33_output + " ";
		}
		return k33_output + k33_input;
	}

	public static String k33_HanBlankBackword(String k33_input, int k33_length) {
		String k33_output = "";
		byte [] k33_byte = k33_input.getBytes();
		for (int i = 0; i < k33_length - k33_byte.length; i++) {
			k33_output = k33_output + " ";
		}
		return k33_input + k33_output;
	}

	public static int k33_HanCount(String k33_input) {
		int k33_cnt = 0;
		byte [] k33_byte = k33_input.getBytes();
		k33_cnt = k33_byte.length - k33_input.length();
		return k33_cnt;
	}
}
