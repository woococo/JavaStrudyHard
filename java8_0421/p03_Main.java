package java8_0421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// �������Ͽ� ����

public class p03_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// ���������������_��⵵ ������ ���۷� �о����
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\���������������_��⵵.csv");
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_file));
		
		String k33_readtxt;	// ���پ� �о�� ���ڿ� ���� ����
		
		if((k33_readtxt = k33_br.readLine()) == null) {	
			// k33_readtxt�� br.readLine()���� �����ϴµ� �� ���� null�� ��쿡
			System.out.printf("�� �����Դϴ�\n");	// �� �����̶�� ���
			return;
		}
		
		String[] k33_fieldName = k33_readtxt.split(",");	
		// �迭 k33_fieldName�� k33_readtxt�� ,�� �������� ���� ���� �����Ѵ�
		// k33_readtxt�� ù��° �ٷ� �ʵ� ���̴�.
		
		int k33_LineCnt = 1;	// �׸������ ����� ������ �����Ѵ�
		
		while((k33_readtxt = k33_br.readLine())!= null) {	
			// k33_readtxt�� k33_br.readLine() ���� �����ϰ� �� ���� null�� �ƴ� ��쿡
			String[] k33_field = k33_readtxt.split(",");
			// ���ڿ� �迭 k33_field�� �����ϰ� k33_readtxt�� ,�� �������� ���� ���� �����Ѵ�
			System.out.printf("**[%02d��° �׸�]***************\n", k33_LineCnt);	// �׸��ȣ ����Ѵ�
			for (int k33_i = 0; k33_i < k33_fieldName.length; k33_i++) {	
				// 0���� �迭 k33_fieldName�� ũ�⸸ŭ ����Ǵ� for���� ����
				System.out.printf(" %s : %s\n", k33_fieldName[k33_i], k33_field[k33_i]);
				// �ʵ��� �ʵ� ���� ����Ѵ�.
			}
			
			System.out.println("******************************\n");
			if(k33_LineCnt == 7909) {	// �׸�ȣ�� 100�� �Ǹ� while���� Ż���Ѵ�~
				break;
			}
			
			k33_LineCnt++; // �״��� �׸��� �����ϱ����ؼ� 1�� ����
		}
		
		k33_br.close();	// ���� ��! ������ �ݴ´�
	}
}

