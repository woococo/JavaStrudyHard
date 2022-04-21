package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// �Ÿ����
public class p04_Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// ���������������_��⵵ ������ ���۷� �о����
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\���������������_��⵵.txt");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));

		String k33_readtxt; // ���پ� �о�� ���ڿ� ���� ����

		if ((k33_readtxt = k33_br.readLine()) == null) {
			// k33_readtxt�� br.readLine()���� �����ϴµ� �� ���� null�� ��쿡
			System.out.printf("�� �����Դϴ�\n"); // �� �����̶�� ���
			return;
		}

		String[] k33_fieldName = k33_readtxt.split("\t");
		// �迭 k33_fieldName�� k33_readtxt�� \t�� �������� ���� ���� �����Ѵ�
		// k33_readtxt�� ù��° �ٷ� �ʵ� ���̴�.
		
		double k33_lat = 37.3860521;	// ������ �� ���� ���� ����
		double k33_lng = 127.1214038;	// ������ �� �浵 ���� ����

		int k33_LineCnt = 0;	// �׸������ ����� ������ �����Ѵ�
		
		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt�� k33_br.readLine() ���� �����ϰ� �� ���� null�� �ƴ� ��쿡
			String[] k33_field = k33_readtxt.split("\t");
			// ���ڿ� �迭 k33_field�� �����ϰ� k33_readtxt�� \t�� �������� ���� ���� �����Ѵ�
			System.out.printf("**[%d��° �׸�]*****************************************\n", k33_LineCnt); // �׸��ȣ ����Ѵ�
			System.out.printf(" %s : %s\n", k33_fieldName[9], k33_field[9]);	//	9��° �ʵ��̸��� �ʵ� ���� ����Ѵ� (���θ��ּ�)
			System.out.printf(" %s : %s\n", k33_fieldName[13], k33_field[13]);	// 13��° �ʵ��̸��� �ʵ� ���� ����Ѵ� (���� �ּ�)
			System.out.printf(" %s : %s\n", k33_fieldName[14], k33_field[14]);	// 14��° �ʵ��̸��� �ʵ� ���� ����Ѵ� (�浵 �ּ�)
			double k33_dist = Math.sqrt(Math.pow(Double.parseDouble(k33_field[13]) - k33_lat, 2)	
					+ Math.pow(Double.parseDouble(k33_field[14]) - k33_lng, 2));
			// ���� ��ҿ��� �Ÿ��� ��� --> ��(a,b) ��(c,d)���� �Ÿ��� ��Ÿ��� ������ �̿�
			System.out.printf(" ���������� �Ÿ� : %f\n", k33_dist); // ���� �������� �Ÿ��� ���
			System.out.println("**********************************************************\n");

			k33_LineCnt++;	// �׸��ȣ�� ����
		}
		k33_br.close();	// ������ �ݴ´�!
	}
}

