package java7��;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class p07_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k33_iAl = new ArrayList(); //  k33_iAl��� ArrayList�� �����Ѵ�

		k33_iAl.add("abc");	// k33_iAl�� "abc"�� �߰�
		k33_iAl.add("abcd"); // k33_iAl�� "abcd"�� �߰�
		k33_iAl.add("efga"); // k33_iAl�� "efga"�� �߰�
		k33_iAl.add("������0"); // k33_iAl�� "������0"�� �߰�
		k33_iAl.add("1234"); // k33_iAl�� "1234"�� �߰�
		k33_iAl.add("12rk34"); // k33_iAl�� "12rk34"�� �߰�
		// iAl.add("356"); // k33_iAl�� ��Ʈ������ ������ �ϱ� ������ ���ڸ� ������ �ȵȴ�.

		System.out.printf("***************************************\n");
		System.out.printf("���� ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}

		k33_iAl.set(3, "������"); // 3�� ���� ����
		System.out.printf("***************************************\n");
		System.out.printf("���뺯�� ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
		
		k33_iAl.remove(4); // 4�� ����
		System.out.printf("***************************************\n");
		System.out.printf("���뺯�� ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
		
		k33_iAl.sort(null); // ����
		System.out.printf("***************************************\n");
		System.out.printf("����ƮSort ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
		
		k33_iAl.clear(); // ����
		System.out.printf("***************************************\n");
		System.out.printf("���� ���� ArraySize %d \n", k33_iAl.size());
		for(int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
	}
}