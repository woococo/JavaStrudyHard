package java7��;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class p03_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] OneRec = { 
				"����,��ȣ��,������(���θ�),����ó",
				"1,��������,�λ걤���� �ϱ� �ݰ��� 469, �����ϳ���Ŭ�� 2�� (�ݰ),051-363-9087",
				"2,�����ٶ���,�λ걤���� �ϱ� ��������� 48, 3�� (������),051-338-5559",
				"3,�ĸ�����(ȭ����),�λ걤���� �ϱ� �ݰ���303���� 2, ��ƼŸ�� 1201ȣ (ȭ��),051-363-0060",
				"4,����� �λ�ȭ����,�λ걤���� �ϱ� ȭ���� 32, �ٿ�Ÿ�������� 5�� 502ȣ (ȭ��),051-363-3631",
				"5,Ű����ũ(���ھ� ��õ�� �ǳ�������),�λ걤���� �ϱ� ������� 23, ���󷺽� 5�� (��õ��)",
				"6,�������� ������,�λ걤���� �ϱ� ����3��16���� 11, 4��(������,��������ѹ̸�Ÿ��),070-8252-3921",
				"7,�ִϾ�ŷ��(�Ϲ������� ���),�λ걤���� �ϱ� ȭ���� 17, ��������� 4��,051-363-2288" };

		String[] fieldName = OneRec[0].split(",");
		for (int i = 1;  i < OneRec.length; i++) {
			String[] field = OneRec[i].split(",");
			System.out.printf("****************************************************\n");
			for (int j = 0; j < fieldName.length; j++) {
				System.out.printf(" %s : %s\n", fieldName[j], field[j]);
			}
			System.out.printf("****************************************************\n");
		}
	}
}
