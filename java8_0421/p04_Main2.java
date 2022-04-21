package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// �д� ������� ���� ����� ����, �� ���� ã�Ƽ� ���

public class p04_Main2 {

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

		double k33_lat = 37.3860521; // ������ �� ���� ���� ����
		double k33_lng = 127.1214038; // ������ �� �浵 ���� ����

		ArrayList<String> k33_adressArr = new ArrayList<>();	// �ּҸ� �����ص� ���ڿ� ArratList ����
		ArrayList<Double> k33_distArr = new ArrayList<>();	// �Ÿ� ���� ������ �� ���� ArrayList ����
		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt�� k33_br.readLine() ���� �����ϰ� �� ���� null�� �ƴ� ��쿡
			String[] k33_field = k33_readtxt.split("\t");
			// ���ڿ� �迭 k33_field�� �����ϰ� k33_readtxt�� \t�� �������� ���� ���� �����Ѵ�
			double k33_dist = Math.sqrt(Math.pow(Double.parseDouble(k33_field[13]) - k33_lat, 2)
					+ Math.pow(Double.parseDouble(k33_field[14]) - k33_lng, 2));
			// ���� ��ҿ��� �Ÿ��� ��� --> ��(a,b) ��(c,d)���� �Ÿ��� ��Ÿ��� ������ �̿�
			k33_distArr.add(k33_dist);	// k33_distArr�� �Ÿ� �� (k33_dist)�� �߰��Ѵ�.
			k33_adressArr.add(k33_field[9]);	// k33_adressArr�� �ּҸ� �߰��Ѵ�.
		}
		k33_br.close();	// ������ �ݴ´�
		k33_resultPrint(k33_adressArr, k33_distArr);	// ���� ����� ���� ���� �� ���� ����ϱ� ���� �޼ҵ�� �̵�
	}

	public static void k33_resultPrint(ArrayList<String> k33_adressArr, ArrayList<Double> k33_distArr) {
		// ���� ����� ���� ���� �� ���� ����ϱ� ���� �޼ҵ��̴�.
		double k33_Max = -1.0;	// �ִ밪 k33_Max�� ����, �ʱⰪ�� -1�� �����Ѵ�
		double k33_Min = 1.0;		// ������ k33_Min�� ����, �ʱⰪ�� 1�� �����Ѵ�
		String k33_maxAdr = "";	// ���� �� ���� ��Ҹ� ���� ���ڿ� ���� k33_maxAdr�� ����
		String k33_minAdr = "";	// ���� ����� ���� ��Ҹ� ���� ���ڿ� ���� k33_minAdr�� ����

		for (int k33_i = 0; k33_i < k33_distArr.size(); k33_i++) { // 0���� k33_distArr�� ũ�⸸ŭ ����Ǵ� for�� ����
			if (k33_distArr.get(k33_i) > k33_Max) {	// k33_distArr�� k33_i ���� k33_Max�� ���� ũ�ٸ�
				k33_Max = k33_distArr.get(k33_i);	// �ִ밪�� k33_distArr�� k33_i ������ ����
				k33_maxAdr = k33_adressArr.get(k33_i);	// �ִ밪�� ���� ��� ���� k33_adressArr�� k33_i������ ����
			}

			if (k33_distArr.get(k33_i) < k33_Min) {	// k33_distArr�� k33_i ���� k33_Max�� ���� �۴ٸ�
				k33_Min = k33_distArr.get(k33_i);	// �������� k33_distArr�� k33_i ������ ����
				k33_minAdr = k33_adressArr.get(k33_i);	// �ִ밪�� ���� ��� ���� k33_adressArr�� k33_i������ ����
			}
		}

		System.out.printf("�д�������� ���� ����� �� : %s, %fkm\n", k33_minAdr, k33_Min * 100);	// ���� ����� ���� ��ҿ� �Ÿ��� ���
		System.out.printf("�д�������� ���� �� �� : %s, %fkm\n", k33_maxAdr, k33_Max * 100);	// ���� �� ���� ��ҿ� �Ÿ��� ���
	}
}
