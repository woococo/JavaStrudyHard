package java7��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class p11_Main {

	static ArrayList<p09_OneRec> k33_ArrayOneRec = new ArrayList<p09_OneRec>(); // Ŭ������ ArrayList ����
	static int k33_sumKor = 0; // ���������� �հ�� 0���� �ʱ�ȭ�Ѵ�
	static int k33_sumEng = 0; // ���������� �հ�� 0���� �ʱ�ȭ�Ѵ�
	static int k33_sumMat = 0; // ���������� �հ�� 0���� �ʱ�ȭ�Ѵ�
	static int k33_sumSum = 0; // �հ������� �հ�� 0���� �ʱ�ȭ�Ѵ�
	static double k33_sumAve = 0; // ��������� �հ�� 0���� �ʱ�ȭ�Ѵ�
	static int k33_iPerson = 20; // ��� ����  20���� �ʱ� �����Ѵ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k33_dataSet(); // ������ �����
		k33_dataSort(); // ������ ����
		k33_HeaderPrint(); // k33_HeaderPrint �޼��� ����, �� �κ� ���
		for (int k33_i = 0; k33_i < k33_ArrayOneRec.size(); k33_i++) {
			k33_Itemprint(k33_i); // k33_Itemprint�޼��忡 k33_i���� �־ ����
		}
		k33_TailPrint();	// k33_TailPrint ����, �Ʒ��κ� ���
	}

	public static void k33_dataSet() { // k33_dataSet �޼��� ����
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {
			String k33_name = String.format("ȫ��%02d", k33_i); // �̸� ����
			int k33_kor = (int) (Math.random() * 100); // 0���� 100���� �������� �������� ����
			int k33_eng = (int) (Math.random() * 100); // 0���� 100���� �������� �������� ����
			int k33_mat = (int) (Math.random() * 100); // 0���� 100���� �������� �������� ����
			k33_ArrayOneRec.add(new p09_OneRec(k33_i, k33_name, k33_kor, k33_eng, k33_mat)); // k33_ArrayOneRec�� ���� �߰�
		}
	}
	
	public static void k33_dataSort() { 
		Comparator<p09_OneRec> bikyeokijun = new Comparator<p09_OneRec>() {		
			public int compare(p09_OneRec a1, p09_OneRec a2) { // comparator Ŭ������ �����Ҷ� compare�޼ҵ带 �����ε�
				// �� ���ڵ��� � ���� �� ���ڵ��� ����� ��
				// TODO Auto-generated method stub
				return (a2.k33_sum() - a1.k33_sum()); // �ڷ��ڵ��� �հ�� �� ���ڵ��� �հ� �ʵ带 ���� ���� ��
			}
		};
		Collections.sort(k33_ArrayOneRec, bikyeokijun); // collections�� �̿��ؼ� sort�۾� ����
	}

	public static void k33_HeaderPrint() { // ó�� �κ� ��º�
		System.out.printf("***********************************************\n");
		System.out.printf("%2s %3s %4s %4s %4s %4s %5s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("***********************************************\n");
	}

	public static void k33_Itemprint(int k33_i) { //  �߰��κ� ��º�
		p09_OneRec k33_rec; // Ŭ���� p09_OneRec�� ����ϱ� ���ؼ� k33_rec ����
		k33_rec = k33_ArrayOneRec.get(k33_i); // k33_rec�� ����Ʈ k33_ArrayOneRec�� k33_i���� ����
		System.out.printf("%02d %6s %4d %6d %6d %7d %8.2f \n", k33_rec.k33_studentId(), k33_rec.k33_name(),
				k33_rec.k33_kor(), k33_rec.k33_eng(), k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_ave());
		k33_sumKor += k33_rec.k33_kor(); // �������������� ���ϱ� ���ؼ� �������� ����
		k33_sumEng += k33_rec.k33_eng(); // �������������� ���ϱ� ���ؼ� �������� ����
		k33_sumMat += k33_rec.k33_mat(); // �������������� ���ϱ� ���ؼ� �������� ����
		k33_sumSum += k33_rec.k33_sum(); // �հ����������� ���ϱ� ���ؼ� �հ����� ����
		k33_sumAve += k33_rec.k33_ave(); // ������������� ���ϱ� ���ؼ� ������� ����
	}

	public static void k33_TailPrint() { // ������ �κ� ��º�
		System.out.printf("***********************************************\n");
		System.out.printf("�����հ� : %d   �������: %6.2f\n", k33_sumKor, k33_sumKor / (double) k33_ArrayOneRec.size());
		System.out.printf("�����հ� : %d   �������: %6.2f\n", k33_sumEng, k33_sumEng / (double) k33_ArrayOneRec.size());
		System.out.printf("�����հ� : %d   �������: %6.2f\n", k33_sumMat, k33_sumMat / (double) k33_ArrayOneRec.size());
		System.out.printf("***********************************************\n");
		System.out.printf("������հ� : %d ����� : %6.2f\n", k33_sumSum, k33_sumAve / (double) k33_ArrayOneRec.size());
	}
}
