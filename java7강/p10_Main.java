package java7��;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class p10_Main {

	static int k33_iPerson = 200;	 // �л��� ����
	static int k33_pageAmount = 30;	 // �������� �Ҵ緮 ����
	static int pageCnt = 1;		// ������ ī��Ʈ, �������� �Ѿ������ 1���� �����ϵ��� ����
	static int cnt = 1; // ���� ������ ��� ���� �������� ī��Ʈ ����
	
	static ArrayList<p09_OneRec> ArrayOneRec = new ArrayList<p09_OneRec>();
	
	static int k33_korSum = 0, k33_engSum = 0, k33_matSum = 0, k33_sumSum = 0, k33_aveSum = 0, // ���� ������ ���� �հ� ���� ���� ���� ���� ����
			k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;	// ���� ������ ���� ��� ���� ���� ���� ���� ����
	static int k33_korTotalSum = 0, k33_engTotalSum = 0, k33_matTotalSum = 0, k33_sumTotalSum = 0, k33_aveTotalSum = 0, // ���� ������ ���� �հ� �� ���� ����
			k33_korTotalAve = 0, k33_engTotalAve = 0, k33_matTotalAve = 0, k33_sumTotalAve = 0, k33_aveTotalAve = 0;	// ���� ������ ���� ��� �� ���� ����

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();
		for (int i = 0; i < pageCnt; i++) {
			HeaderPrint();
			for ( int j = 0; j < cnt; j++) {
				Itemprint(i);
			}
		}
		TailPrint();
	}

	public static void dataSet() {
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) { // ����� ��ŭ ���� ���
			String k33_name = String.format("ȫ��%03d", k33_i + 1); // �̸� ����
			int k33_kor = (int) (Math.random() * 100); // ���� ���� ����
			int k33_eng = (int) (Math.random() * 100); // ���� ���� ����
			int k33_mat = (int) (Math.random() * 100); // ���� ���� ����
			ArrayOneRec.add(new p10_OneRec(k33_i, k33_name, k33_kor, k33_eng, k33_mat));	
		}
		if (k33_iPerson % k33_pageAmount == 0) {
			pageCnt = k33_iPerson / k33_pageAmount;
		} else {
			pageCnt = (k33_iPerson / k33_pageAmount) + 1;
		}
	}
	
	public static void HeaderPrint() {
		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥ ������ k33_sdtA�� ���Ѵ�.
		System.out.printf("%25s\n\n", "��������ǥ");
		System.out.printf("%s%s%17s%s\n", "PAGE : ", pageCnt, "������� : ", k33_sdtA.format(k33_calt.getTime())); // �������� ������ڸ� ���
		System.out.println("==================================================");
		System.out.printf("%s%6s%6s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("==================================================");
	}
	
	public static void Itemprint(int i) {
		
		p09_OneRec rec;
		rec = ArrayOneRec.get(cnt);
		System.out.printf("%02d %6s %4d %6d %6d %7d %8.2f \n", rec.studentId(), rec.name(), rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		
		
		k33_korSum += rec.kor();
		k33_engSum += rec.eng();
		k33_matSum += rec.mat();
		k33_sumSum += rec.sum();
		k33_aveSum += rec.ave();
		k33_korTotalSum += rec.kor();
		k33_engTotalSum += rec.eng();
		k33_matTotalSum += rec.mat();
		k33_sumTotalSum += rec.sum();
		k33_aveTotalSum += rec.ave();
		cnt++;
	}
	
	public static void TailPrint() {
		System.out.println("==================================================");
		System.out.printf("%s\n", "����������");
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "�հ�", " ", k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum);
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
		System.out.println("==================================================");
		System.out.printf("%s\n", "����������");
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "�հ�", " ", k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum);
		// ���������� �κ��� �� ���� ����� ����Ѵ�.
		System.out.printf("%s%9s%7d%7d%7d%7d%7d\n\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
		k33_korSum = 0; k33_engSum = 0; k33_matSum = 0; k33_sumSum = 0; k33_aveSum = 0;
		k33_korAve = 0; k33_engAve = 0; k33_matAve = 0; k33_sumAve = 0; k33_aveAve = 0;
		cnt = 1;
	}
	
	
	
}
