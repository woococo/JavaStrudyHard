package java7��;

import java.util.ArrayList;

public class p08_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iTestMAX = 1000000; // test�� �ִ밪�� �������ش�
		ArrayList k33_iAl = new ArrayList(); // ArrayList k33_iAl�� ����

		for (int k33_i = 0; k33_i < k33_iTestMAX; k33_i++) { // 0���� k33_iTestMAX���� ����Ǵ� �ݺ���
			k33_iAl.add((int)(Math.random() * 1000000)); // k33_iAl�� 1000000�ȿ��� �������� �����Ǵ� ���� �߰�
		}

		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) { // 0���� k33_iAlũ�� ��ŭ ����Ǵ� �ݺ���
			System.out.printf(" ArrayList %d = %d\n", k33_i, k33_iAl.get(k33_i)); // ����Ʈ k33_iAl�� k33_i���� ���
		}

		System.out.printf("******************************\n");
		k33_iAl.sort(null); // k33_iAl�� �����Ѵ�

		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf(" ArrayList %d = %d \n", k33_i, k33_iAl.get(k33_i));
		} // ���ĵ� ����Ʈ�� �ٽ� ������� ���
	}

}
