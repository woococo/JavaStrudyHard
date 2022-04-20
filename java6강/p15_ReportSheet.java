package java6��;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p15_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 30; // �� ���� �ִ¸�ŭ ����� ����

		p15_InputData k33_inData = new p15_InputData(k33_iPerson); // Ŭ������ �޾� ��ü�� ����� �ν��Ͻ��� �����Ͽ� ��ü�� �����Ѵ�

		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	// ��¥ ������ k33_sdtA�� ���Ѵ�.
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {	// k33_iPersonũ�⸸ŭ ����Ǵ� for��
			String k33_name = String.format("ȫ��%02d", k33_i); // �̸� �����
			int k33_kor = (int) (Math.random() * 100); // ���� ���� �����
			int k33_eng = (int) (Math.random() * 100); // ���� ���� �����
			int k33_mat = (int) (Math.random() * 100); // ���� ���� �����
			k33_inData.p15_InputData(k33_i, k33_name, k33_kor, k33_eng, k33_mat); // Ŭ������ �� �Է�
		}

		System.out.printf("%25s\n", "��������ǥ");
		System.out.printf("%26s%s\n", "������� : ", k33_sdtA.format(k33_calt.getTime()));	// ����ð��� ����Ѵ�.
		System.out.println("==================================================");
		System.out.printf("%s%6s%6s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("==================================================");

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {	// k33_iPerson ũ�⸸ŭ ����Ǵ� for��
			System.out.printf("%03d%8s%7d%7d%7d%7d%7d\n", 
					k33_i + 1, k33_inData.k33_nameArr[k33_i], k33_inData.k33_korArr[k33_i], k33_inData.k33_engArr[k33_i],
					k33_inData.k33_matArr[k33_i], k33_inData.k33_sumArr[k33_i], (int) (k33_inData.k33_aveArr[k33_i]));
			// ��ȣ, �̸�, ����, ����, ����, ����, ��� ������� ����Ѵ�
		}
		System.out.println("==================================================");
		// �հ�� ����� ���ϱ� ���� �������� �����Ѵ�.
		int k33_korTotal = 0, k33_engTotal = 0, k33_matTotal = 0, k33_sumTotal = 0, k33_aveTotal = 0, 
				k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;

		for (int k33_i = 0; k33_i < k33_inData.k33_nameArr.length; k33_i++) {	// k33_nameArr ũ�⸸ŭ ����Ǵ� for��
			k33_korTotal += k33_inData.k33_korArr[k33_i];	
			k33_engTotal += k33_inData.k33_engArr[k33_i];
			k33_matTotal += k33_inData.k33_matArr[k33_i];
			k33_sumTotal += k33_inData.k33_sumArr[k33_i];
			k33_aveTotal += k33_inData.k33_aveArr[k33_i];
			// ���� �հ踦 ���ϱ� ���� ������ �����ص� �迭���� ���� ���Ѵ�.
		}
		
		// ���� ����� ���ϱ� ���ؼ� �հ������� ����Ҹ�ŭ ������
		k33_korAve = k33_korTotal/k33_iPerson;
		k33_engAve = k33_engTotal/k33_iPerson;
		k33_matAve = k33_matTotal/k33_iPerson;
		k33_sumAve = k33_sumTotal/k33_iPerson;
		k33_aveAve = k33_aveTotal/k33_iPerson;
		
		// ������ �հ踦 ����Ѵ�
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "�հ�", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal,
				(int) (k33_aveTotal));
		
		// ������ ����� ����Ѵ�
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, (int)(k33_aveAve));

	}
}