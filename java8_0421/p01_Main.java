 package java8_0421;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// �а� ����

public class p01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	// ����ó���� �ϱ� ���� try/catch���� ����!
			File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\test1.txt"); 
			// ���� ���� ������ ��ġ�� ���ϸ�(test1.txt)�� �������ش�
			FileWriter k33_fw = new FileWriter(k33_file);	//  ���Ͽ� ������ �Է��ϴ� ����
			k33_fw.write("�ȳ� ����\n");	// ���Ͽ� ������ �Է��Ѵ�
			k33_fw.write("hello ���\n");	// ���Ͽ� ������ �Է��Ѵ�

			k33_fw.close();	// ������ �ݾ��ش�.

			FileReader k33_fr = new FileReader(k33_file);	// ������ ������ �д� ����

			int k33_n = -1;	// ������ ���� k33_n ����
			char[] k33_ch;	// ������ �迭 k33_ch ����

			while (true) {	// Ż�����ǿ� ���������� ���ư��� while�� ����
				k33_ch = new char[100];	// k33_ch�迭�� ũ�⸦ ����
				k33_n = k33_fr.read(k33_ch);	
				if (k33_n == -1) {	// �� �̻� ���� ���� ���� ���°� �Ǹ�
					break;	// while������ Ż���Ѵ�
				}
				for (int k33_i = 0; k33_i < k33_n; k33_i++) {	// 0���� k33_n���� ����Ǵ� for���� ����
					System.out.printf("%c", k33_ch[k33_i]);	// �迭 k33_ch�� k33_i���� ����Ѵ�.
				}
			}
			k33_fr.close();	// k33_fr�� �ݴ´�. �� �ݾ��־�� ��
			System.out.println("\nFILE READ END");	// ���� �д� ���� �������� ���
		} catch (Exception k33_e) {	// ���ܰ� �߻����� ���
			System.out.printf("�� ���� [%s]\n", k33_e);	// ������� ǥ���Ѵ�~
		}
	}
}
