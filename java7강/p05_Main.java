package java7��;

// �迭�� �ִ�, �ּҰ� ã��
public class p05_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k33_iArray = { 1, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		// ������ �迭�� �����ϰ� ������ �־��ش�
		
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) { // �迭�� ������ ���ʷ� ����ϱ� ���� �ݺ��� ����
			System.out.printf("iArray[%d] = %d\n", k33_i, k33_iArray[k33_i]);
		}
		int k33_iMax = k33_iArray[0]; // �ʱ� max���� 0���� ����
		int k33_iMaxPt = 0; // 
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {
			if(k33_iMax < k33_iArray[k33_i]) { // iArray[i]�� ���� ���� Max������ ũ�ٸ�
				k33_iMax = k33_iArray[k33_i]; // Max���� iArray[i]�� �����Ѵ�.
				k33_iMaxPt = k33_i; // Max���� �迭�� ���°���� Ȯ���ϱ� ���ؼ� ����
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", k33_iMaxPt, k33_iMax);
	}
}
