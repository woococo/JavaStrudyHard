package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// ���� �Ⱦ�� �����

public class p05_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\day_data\\THTSKS010H00.dat");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// THTSKS010H00 ������ ���۷� �о����

		String k33_readtxt; // ���پ� �о�� ���ڿ� ���� ����

		int k33_n = -1;	//false�� ���ڷ� ��ȯ�� ���� ����

		StringBuffer k33_s = new StringBuffer();	
		// ���� ������ ����ϱ� ���ؼ� StringBuffer ������ ����

		while (true) {	// ���ǿ� �����ϸ� ���ߴ� while���� ����
			char[] k33_ch = new char[1000]; // ũ�Ⱑ 1000�� ������ �迭�� ����
			k33_n = k33_br.read(k33_ch);

			if (k33_n == -1) { // k33_n�� -1�� �Ǹ� while���� Ż��
				break;
			}

			for (char k33_c : k33_ch) {	// for�� �ȿ� ������ ���� k33_c�� ����
				if (k33_c == '\n') {	// k33_c�� '\n'�� ��ġ�ϸ�
					System.out.printf("[%s]***\n", k33_s.toString()); // k33_s.toString�� ���
					k33_s.delete(0, k33_s.length()); // k33_s�� 0���� ũ����� ����
					} else {	// k33_c�� '\n'�� ��ġ���� �ʴٸ�
					k33_s.append(k33_c);	// k33_s�� k33_c�� �߰�
				}
			}
		}
		System.out.printf("[%s]***\n", k33_s.toString());	// k33_s�� ���
		k33_br.close();	// k33_br�� �ݴ´�
	}
}
