package java7��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class p12_Main {
	
	static int k33_iPerson = 200;	 // �л��� ����
	static int k33_pageAmount = 30;	 // �������� �Ҵ緮 ����
	static int k33_pageCnt = 1;		// ������ ī��Ʈ, �������� �Ѿ������ 1���� �����ϵ��� ����
	static int k33_cnt = 1; // ���� ������ ��� ���� �������� ī��Ʈ ����
	
	static ArrayList<p10_OneRec> k33_ArrayOneRec = new ArrayList<p10_OneRec>(); // Ŭ������ ArrayList ����
	
	static int k33_korSum = 0, k33_engSum = 0, k33_matSum = 0, k33_sumSum = 0, k33_aveSum = 0, // ���� ������ ���� �հ� ���� ���� ���� ���� ����
			k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;	// ���� ������ ���� ��� ���� ���� ���� ���� ����
	static int k33_korTotalSum = 0, k33_engTotalSum = 0, k33_matTotalSum = 0, k33_sumTotalSum = 0, k33_aveTotalSum = 0, // ���� ������ ���� �հ� �� ���� ����
			k33_korTotalAve = 0, k33_engTotalAve = 0, k33_matTotalAve = 0, k33_sumTotalAve = 0, k33_aveTotalAve = 0;	// ���� ������ ���� ��� �� ���� ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k33_HeaderPrint(k33_pageCnt); // ó�� �κ� ���
		k33_dataSet(); // ������ �����
		k33_dataSort(); // ������ ����
		for (int k33_i = 1; k33_i < k33_iPerson + 1; k33_i++) {
			k33_Itemprint(k33_i); // ���� ���
		}
	}

	public static void k33_dataSet() { // ������ �����
		for (int k33_i = 1; k33_i < k33_iPerson + 1; k33_i++) { // ����� ��ŭ ���� ���
			String k33_name = String.format("ȫ��%03d", k33_i); // �̸� ����
			int k33_kor = (int) (Math.random() * 100); // ���� ���� ����
			int k33_eng = (int) (Math.random() * 100); // ���� ���� ����
			int k33_mat = (int) (Math.random() * 100); // ���� ���� ����
			k33_ArrayOneRec.add(new p10_OneRec(k33_i, k33_name, k33_kor, k33_eng, k33_mat)); // ����Ʈ k33_ArrayOneRec�� ������ �� ����
		}
	}
	
	public static void k33_dataSort() { 
		Comparator<p10_OneRec> bikyeokijun = new Comparator<p10_OneRec>() {		
			public int compare(p10_OneRec a1, p10_OneRec a2) { // comparator Ŭ������ �����Ҷ� compare�޼ҵ带 �����ε�
				// �� ���ڵ��� � ���� �� ���ڵ��� ����� ��
				// TODO Auto-generated method stub
				return (a2.k33_sum() - a1.k33_sum()); // �ڷ��ڵ��� �հ�� �� ���ڵ��� �հ� �ʵ带 ���� ���� ��
			}
		};
		Collections.sort(k33_ArrayOneRec, bikyeokijun); // collections�� �̿��ؼ� sort�۾� ����
	}
	public static void k33_HeaderPrint(int pageCnt) {	// ó�� �κ� ���
		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥ ������ k33_sdtA�� ���Ѵ�.
		System.out.printf("%25s\n\n", "��������ǥ");
		System.out.printf("%s %s %17s %s \n", "PAGE : ", pageCnt, "������� : ", k33_sdtA.format(k33_calt.getTime())); // �������� ������ڸ� ���
		System.out.println("=======================================================");
		System.out.printf("%s %6s %6s %5s %5s %5s %5s \n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("=======================================================");
	}
	
	public static void k33_Itemprint(int k33_i) { // ��ȣ, �̸�, ����, ����, ����, ����, ��� ������� ����Ѵ� 
		p10_OneRec k33_rec;
		k33_rec = k33_ArrayOneRec.get(k33_i - 1);
		System.out.printf("%03d %8s %6d %7d %7d %7d %8.2f \n", k33_rec.k33_studentId(), k33_rec.k33_name(), k33_rec.k33_kor(), k33_rec.k33_eng(), k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_ave());
		
		// ���� �������� �� ���� �հ踦 ���ϱ� ���ؼ� ���� ������ �����Ѵ� 
		k33_korSum += k33_rec.k33_kor(); k33_engSum += k33_rec.k33_eng(); k33_matSum += k33_rec.k33_mat(); k33_sumSum += k33_rec.k33_sum();	k33_aveSum += k33_rec.k33_ave();
		// ���� �������� �� ���� ����� ���ϱ� ���ؼ� ���� �հ������� ������������ �л���(k33_cnt)�� ������.
		k33_korAve = k33_korSum / k33_cnt; k33_engAve = k33_engSum / k33_cnt;k33_matAve = k33_matSum / k33_cnt; k33_sumAve = k33_sumSum / k33_cnt;k33_aveAve = k33_aveSum / k33_cnt;		
		// ���� �������� �� ���� �հ��� ���ϱ� ���ؼ� ���� ������ ó������ ������ �����Ѵ�
		k33_korTotalSum += k33_rec.k33_kor(); k33_engTotalSum += k33_rec.k33_eng();	k33_matTotalSum += k33_rec.k33_mat(); k33_sumTotalSum += k33_rec.k33_sum(); k33_aveTotalSum += k33_rec.k33_ave();
		// ���� �������� �� ���� ����� ���ϱ� ���ؼ� ���� �հ踦 �л����� ������.
		k33_korTotalAve = k33_korTotalSum / k33_i; k33_engTotalAve = k33_engTotalSum / k33_i; k33_matTotalAve = k33_matTotalSum / k33_i; k33_sumTotalAve = k33_sumTotalSum / k33_i;	k33_aveTotalAve = k33_aveTotalSum / k33_i;
		
		k33_cnt++; // ���� ������ ����� ���ϱ� ���ؼ� ������ ������ �Ѹ�� ��µɶ����� k33_cnt�� �ϳ��� ����
		
		if ((k33_i % k33_pageAmount) == 0 && k33_i < k33_iPerson) {	// ��µ� ���� �������ѵ����� ���޵Ǹ� ������������ �Ѿ�� 
			k33_sumPrint(k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum, k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);	// ���� �������� �հ� ����Լ��� �̵�~!
			k33_sumTotalPrint(k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum, k33_korTotalAve, k33_engTotalAve, k33_matTotalAve, k33_sumTotalAve, k33_aveTotalAve);	// ������������ �հ� ����Լ��� �̵�!
			k33_pageCnt++;	// �������� �Ѿ�Ƿ� 1�� ���������ش�
			k33_HeaderPrint(k33_pageCnt);	// �������� ����� �Ϸ�Ǿ����Ƿ� ������������ ù �κ��� ������ش�
			// ���� �������� ���� �հ�� ���������� ī��Ʈ�� �ʱ�ȭ �����ش�.
			k33_korSum = 0; k33_engSum = 0; k33_matSum = 0; k33_sumSum = 0; k33_aveSum = 0;
			k33_korAve = 0; k33_engAve = 0; k33_matAve = 0; k33_sumAve = 0; k33_aveAve = 0;
			k33_cnt = 1;
		}
		if (k33_i == k33_iPerson) {	// k33_i�� ������ �л����� ���ٸ� 
			k33_sumPrint(k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum, k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);	// ���� �������� �հ� ����Լ��� �̵�~!
			k33_sumTotalPrint(k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum, k33_korTotalAve, k33_engTotalAve, k33_matTotalAve, k33_sumTotalAve, k33_aveTotalAve);	// ������������ �հ� ����Լ��� �̵�!
		}
	}
	
	public static void k33_sumPrint(int k33_korTotal, int k33_engTotal, int k33_matTotal, int k33_sumTotal, int k33_aveTotal, int k33_korAve, int k33_engAve, int k33_matAve, int k33_sumAve, int k33_aveAve) { // ���������� ��º�
		// ���� �������� �� ���� �հ� ������ ����� �޾Ƽ� ����Ѵ�.
		System.out.println("=======================================================");
		System.out.printf("%s\n", "����������");
		System.out.printf("%s %9s %7d %7d %7d %7d %7d\n", "�հ�", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal, k33_aveTotal);
		System.out.printf("%s %9s %7d %7d %7d %7d %7d\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
	}

	public static void k33_sumTotalPrint(int k33_korTotal, int k33_engTotal, int k33_matTotal, int k33_sumTotal, int k33_aveTotal, int k33_korAve, int k33_engAve, int k33_matAve, int k33_sumAve, int k33_aveAve) { // ���������� ��º�
		// ���� �������� ����ϱ� ���ؼ� �� ���� �� ���������� ��������� ����Ѵ�
		System.out.println("=======================================================");
		System.out.printf("%s\n", "����������");
		System.out.printf("%s %9s %7d %7d %7d %7d %7d\n", "�հ�", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal, k33_aveTotal);
		System.out.printf("%s %9s %7d %7d %7d %7d %7d\n\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
	}
}

