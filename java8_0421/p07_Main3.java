package java8_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

// �Ｚ������ �ְ��� ���Ͽ� 2015�� �ִ밪�� �ּҰ��� ���Ͻÿ�(��������)

public class p07_Main3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\StockDailyPrice.csv");
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// StockDailyPrice.csv ������ ���۷� �д´�
		
		File k33_file1 = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\A005930_2015.csv");
		BufferedWriter k33_bw1 = new BufferedWriter(new FileWriter(k33_file1));
		// ���۷� A005930_2015.csv������ �����ϰ� ������ �Է�����
		
		long k33_startTime = System.currentTimeMillis();
		// ���۽ð��� ����ϱ� ���ؼ� ����ð��� �޾ƿ´�
		
		String k33_readtxt; // ���پ� �о�� ���ڿ� ���� ����
		String k33_code1 = "2015";  	// code1 ������ �����ؼ� ���� �⵵�� ����ش�
		String k33_code2 = "A005930";	// code2 ������ �����ؼ� �Ｚ���� �ڵ带 ����ش�
		ArrayList<String> k33_stckPrp = new ArrayList<>();	
		// �ְ� �ִ밪�� ���ϱ� ���ؼ� �ֽ� ������ ���� ���ڿ��� ArrayList�� �����Ѵ�
		ArrayList<String> k33_date = new ArrayList<>();
		// �ְ� �ִ밪�� ���� ��¥�� ���ϱ� ���ؼ� ��¥�� ���� ���ڿ��� ArrayList�� �����Ѵ�
		int k33_cnt = 0;	// ��� �����͸� �о����� Ȯ���ϱ� ���ؼ� ������ ������ ����
		int k33_wcnt = 0;	// ��� �����͸� ��Ҵ��� Ȯ���ϱ� ���ؼ� ������ ������ ����

		System.out.println("*** �Ｚ����(A005930)�� 2015�� �ְ� ���� ***");
		System.out.printf("���� �ð� : %s\n", k33_formatTime(k33_startTime)); 	// ���۽ð��� ���

		while ((k33_readtxt = k33_br.readLine()) != null) {
			// k33_readtxt�� k33_br.readLine() ���� �����ϰ� �� ���� null�� �ƴ� ��쿡
			StringBuffer k33_s = new StringBuffer();
			// ���Ͽ� ������ �Է��ϱ� ���� �ʿ��� StringBuffer������ ����
			String[] k33_field = k33_readtxt.split(",");
			// ���ڿ� �迭 k33_field�� �����ϰ� k33_readtxt�� ,�� �������� ���� ���� �����Ѵ�

			if (k33_field[1].contains(k33_code1) && k33_field[2].equals(k33_code2)) {
				// �ŷ����� ����� k33_field[1]���� ���� ��¥�� ��ġ�ϸ鼭
				// ���� �ڵ尡 ����Ǿ� �ִ� k33_field[2]���� �Ｚ���� �ڵ�� ��ġ�ϴ� ���� ã�´�
				for (int k33_i = 1; k33_i < k33_field.length; k33_i++) {
					// 1���� k33_fieldũ�⸸ŭ ����Ǵ� for�� ����
					k33_s.append(k33_field[k33_i] + ",");
					// k33_field�� k33_i���� ,�� k33_s�� �����Ѵ�
					k33_stckPrp.add(k33_field[3]);
					// �ְ� �������� ���ϱ� ���ؼ� ���������� k33_stckPrp�� �����Ѵ�
					k33_date.add(k33_field[1]); 
					// �ְ� �������� �ش��ϴ� ��¥�� ���ϱ� ���ؼ� ��¥�� k33_date�� �����Ѵ�
				}
				k33_bw1.write(k33_s.toString()); // k33_s ���� k33_bw1 ���Ͽ� �Է��Ѵ�
				k33_bw1.newLine(); // �� �ѱ��
				k33_wcnt++;	// �����͸� ���������Ƿ� k33_wcnt�� ������Ų��
			}
			k33_cnt++; // ������ �����͸� �о����Ƿ� k33_cnt�� ������Ų��
		}
		
		k33_br.close();	// ����ξ��� k33_br�� �ݴ´�
		k33_bw1.close();	// ������ �� �Է������Ƿ� k33_bw1�� �ݴ´�
		
		System.out.printf("Program End [%d] [%d] records\n", k33_cnt, k33_wcnt);
		// ���� �������� ���� ����� �������� ���� ����Ѵ�
		
		k33_resultPrint(k33_stckPrp, k33_date);	// ���� ���� �ְ��� �������� ����ϱ� ���� �޼���� �̵�
		
		long k33_endTime = System.currentTimeMillis();	// ����ð��� �Է¹޴´�
		System.out.printf("���� �ð� : %s\n", k33_formatTime(k33_endTime));	// ����ð��� ���
		System.out.printf("�ҿ� �ð�(��) : %s", (k33_endTime - k33_startTime) / 1000.0f + "��");	// �ҿ�ð��� ���
	}
			
	public static void k33_resultPrint(ArrayList<String> k33_stckPrp, ArrayList<String> k33_date) {
		// �ְ��� �������� ����ϱ� ���� �޼����̴�
		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");	// ���� ����Ҷ� ���� ������ ���Ѵ�
		int k33_Max = 0; // �ִ밪 k33_Max�� ����, �ʱⰪ�� 0���� �����Ѵ�
		int k33_Min = 999999999; // ������ k33_Min�� ����, �ʱⰪ�� 999999999�� �����Ѵ�
		String k33_maxDate = ""; // �ְ��� ��¥�� ���� ���ڿ� ���� k33_maxAdr�� ����
		String k33_minDate = ""; // �������� ��¥�� ���� ���ڿ� ���� k33_minAdr�� ����

		for (int k33_i = 0; k33_i < k33_stckPrp.size(); k33_i++) { // 0���� k33_stckPrp�� ũ�⸸ŭ ����Ǵ� for�� ����
			if (Integer.parseInt(k33_stckPrp.get(k33_i)) > k33_Max) { // k33_stckPrp�� k33_i ���� k33_Max�� ���� ũ�ٸ�
				k33_Max = Integer.parseInt(k33_stckPrp.get(k33_i)); // �ְ��� k33_stckPrp�� k33_i ������ ����
				k33_maxDate = k33_date.get(k33_i);	// �ְ��� ���� ��¥�� ����ϱ� ���ؼ� k33_date�� k33_i���� �޾ƿ´�
			}

			if (Integer.parseInt(k33_stckPrp.get(k33_i)) < k33_Min) { // k33_stckPrp�� k33_i ���� k33_Max�� ���� �۴ٸ�
				k33_Min = Integer.parseInt(k33_stckPrp.get(k33_i)); // �������� k33_stckPrp�� k33_i ������ ����
				k33_minDate = k33_date.get(k33_i);	// �������� ���� ��¥�� ����ϱ� ���ؼ� k33_date�� k33_i���� �޾ƿ´�
			}
		}
		System.out.printf("�Ｚ����(2015��)�� �ְ� �ְ�(���� ����) : %s (%s)\n", k33_df.format(k33_Max), k33_maxDate);	// �ְ��� �ʰ��� ��¥�� ���
		System.out.printf("�Ｚ����(2015��)�� �ְ� ������(���� ����) : %s (%s)\n", k33_df.format(k33_Min), k33_minDate);	// �������� �������� ��¥�� ���
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
