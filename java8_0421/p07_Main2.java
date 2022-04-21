package java8_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 20150112(�ƹ�Ư������)�� ��� ������ �����Ͽ� ������ ����ÿ�

public class p07_Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\StockDailyPrice.csv");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// StockDailyPrice.csv ������ ���۷� �д´�
		
		File k33_file1 = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\20150112.csv");
		BufferedWriter k33_bw1 = new BufferedWriter(new FileWriter(k33_file1));
		// ���۷� 20150112.csv������ �����ϰ� ������ �Է�����
		
		long k33_startTime = System.currentTimeMillis();
		// ���۽ð��� ����ϱ� ���ؼ� ����ð��� �޾ƿ´�
		
		String k33_readtxt; // ���پ� �о�� ���ڿ� ���� ����
		String k33_code = "20150112";	// code ������ �����ؼ� ���� ��¥�� ����ش�

		int k33_cnt = 0;	// ��� �����͸� �о����� Ȯ���ϱ� ���ؼ� ������ ������ ����
		int k33_wcnt = 0;	// ��� �����͸� ��Ҵ��� Ȯ���ϱ� ���ؼ� ������ ������ ����
		
		System.out.println("*** 2015�� 1�� 12�� �ְ� ���� ***");
		System.out.printf("���� �ð� : %s\n", k33_formatTime(k33_startTime)); 	// ���۽ð��� ���
		
		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt�� k33_br.readLine() ���� �����ϰ� �� ���� null�� �ƴ� ��쿡
			StringBuffer k33_s = new StringBuffer();
			// ���Ͽ� ������ �Է��ϱ� ���� �ʿ��� StringBuffer������ ����
			String[] k33_field = k33_readtxt.split(",");
			// ���ڿ� �迭 k33_field�� �����ϰ� k33_readtxt�� ,�� �������� ���� ���� �����Ѵ�

			if (k33_field[1].equals(k33_code)) {
				// �ŷ����� ����ִ� k33_field[1]���� ���� ��¥�� ��ġ�ϴ� ���� ã�´�
				for (int k33_i = 1; k33_i < k33_field.length; k33_i++) {
					// 1���� k33_fieldũ�⸸ŭ ����Ǵ� for�� ����
					k33_s.append(k33_field[k33_i] + ",");
					// k33_field�� k33_i���� ,�� k33_s�� �����Ѵ�
				}
				k33_bw1.write(k33_s.toString());
				// k33_s ���� k33_bw1 ���Ͽ� �Է��Ѵ�
				k33_bw1.newLine(); // �� �ѱ��
				k33_wcnt++;	// �����͸� ���������Ƿ� k33_wcnt�� ������Ų��
			}
			k33_cnt++; // ������ �����͸� �о����Ƿ� k33_cnt�� ������Ų��
		}
		k33_br.close();	// ����ξ��� k33_br�� �ݴ´�
		k33_bw1.close();	// ������ �� �Է������Ƿ� k33_bw1�� �ݴ´�
		
		System.out.printf("Program End [%d] [%d] records\n", k33_cnt, k33_wcnt);
		// ���� �������� ���� ����� �������� ���� ����Ѵ�
		
		long k33_endTime = System.currentTimeMillis();	// ����ð��� �Է¹޴´�
		System.out.printf("���� �ð� : %s\n", k33_formatTime(k33_endTime));	// ����ð��� ���
		System.out.printf("�ҿ� �ð�(��) : %s", (k33_endTime - k33_startTime) / 1000.0f + "��");	// �ҿ�ð��� ���
	}
	
	public static String k33_formatTime(long k33_time) {
		// ���۽ð��� ����ð��� ����ϱ� ���� �޼���
		Calendar k33_c = Calendar.getInstance();	// ����ð��� �Է¹޴´�
		k33_c.setTimeInMillis(k33_time);	// �ҿ�ð��� ����ϱ� ���ؼ� �ʴ����� �޴´�
		return (k33_c.get(Calendar.YEAR) + "�� " + (k33_c.get(Calendar.MONTH) + 1) + "�� " + k33_c.get(Calendar.DATE) + "�� "
				+ k33_c.get(Calendar.HOUR_OF_DAY) + "�� " + k33_c.get(Calendar.MINUTE) + "�� " + k33_c.get(Calendar.SECOND) + "."
				+ k33_c.get(Calendar.MILLISECOND) + "��");	// �ð��� ����Ѵ�~
	}
}

