package java7��;

import java.util.ArrayList;

public class p09_Main {
	
	static ArrayList<p09_OneRec> ArrayOneRec = new ArrayList<p09_OneRec>();
	static int sumKor = 0;
	static int sumEng = 0;
	static int sumMat = 0;
	static int sumSum = 0;
	static double sumAve = 0;
	static int iPerson = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();
		HeaderPrint();
		for (int i = 0; i < ArrayOneRec.size(); i++) {
			Itemprint(i);
		}
		TailPrint();
	}

	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			ArrayOneRec.add(new p09_OneRec(i, name, kor, eng, mat));
		}
	}
	
	
	public static void HeaderPrint() {
			System.out.printf("***********************************************\n");
			System.out.printf("%2s %3s %4s %4s %4s %4s %5s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
			System.out.printf("***********************************************\n");
	}
	
	public static void Itemprint(int i) {
		p09_OneRec rec;
		 rec = ArrayOneRec.get(i);
		 System.out.printf("%02d %6s %4d %6d %6d %7d %8.2f \n", rec.studentId(), rec.name(), rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		 sumKor += rec.kor();
		 sumEng += rec.eng();
		 sumMat += rec.mat();
		 sumSum += rec.sum();
		 sumAve += rec.ave();
	}

	public static void TailPrint() {
		System.out.printf("***********************************************\n");
		System.out.printf("�����հ� : %d   �������: %6.2f\n", sumKor, sumKor / (double) ArrayOneRec.size());
		System.out.printf("�����հ� : %d   �������: %6.2f\n", sumEng, sumEng / (double) ArrayOneRec.size());
		System.out.printf("�����հ� : %d   �������: %6.2f\n", sumMat, sumMat / (double) ArrayOneRec.size());
		System.out.printf("***********************************************\n");
		System.out.printf("������հ� : %d ����� : %6.2f\n", sumSum, sumAve / (double) ArrayOneRec.size());
	}
}
