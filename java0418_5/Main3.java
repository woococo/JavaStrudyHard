package java0418_5;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k33_firstDay = 5; // 2022�� 1�� 1���� ����������� ���ȿ� �ݿ����̶�� ���� �־. 5�� �����Ѵ�.
		int [] k33_end = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// ���� �迭 k33_end�� �����ؼ� �� ���� ������ ���� �Է��Ѵ�.
	
		for (int k33_mon = 0; k33_mon < 12; k33_mon++) {	// k33_mon�� 0���� 11���� ���������� ����Ǵ� for���� �����Ѵ�.
			System.out.printf("\n\n\t%d��\n", k33_mon + 1);	
			System.out.println("=====================");
			System.out.println(" �� �� ȭ �� �� �� ��");
			
			for (int k33_i = 0; k33_i < k33_firstDay; k33_i++) {
				System.out.print("   "); // ù������ ��¥�� ��ĭ���� ������ش�.
			}
			
			for (int k33_j = 1; k33_j <= k33_end[k33_mon]; k33_j++) {	 // ��¥�� ����ϱ� ���ؼ� �迭 k33_end���� �ش� ���� ���� �������� �� ������ ����� ���ش�.
				System.out.printf(" %2d", k33_j);
				k33_firstDay++;	// �������� ù���� ����ϱ� ���ؼ� 1�Ͼ� ��µɶ����� 1�� �����ش�.
				if (k33_firstDay % 7 == 0) {	// k33_firstDay�� 7�� �������� �������� 0�� ��쿡�� �����ַ� �Ѿ�� ���̱� ������ �ٹٲ��� ���ش�.
					System.out.println("");
				}
			}
			k33_firstDay = k33_firstDay % 7;	// �������� ù¶���� 1�� ����ؼ� �߰��� k33_firstDay�� 7�� ���� �������� �ش��Ѵ�.
		}
	}
}
