package java0415;

public class Main16 {

	// 3-2. sin�Լ� �׷���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k33_fSin;	// �Ǽ��� ������ k33_fSin�� �����Ѵ�.

		// 360������ ���� ��� �������� Ȯ���ϱ� ���ؼ�..
		for (int k33_i = 0; k33_i < 360; k33_i++) {	// 0���� 359���� k33_i�� ������� �����ϴ� for���� �����Ѵ�.
			k33_fSin = Math.sin(k33_i * 3.141592 / 180);	
			// k33_i�� 3.141592�� ���ϰ� 180�� ���� ���� Math.sin�Լ��� �ְ� �� ���� k33_fSin�� �����Ѵ�.
			System.out.printf("%d sin ==> %f\n", k33_i, k33_fSin);	// k33_i�� k33_fSin�� ����Ѵ�.
		}
		
		// 360������ �׷�����!
		for (int k33_i = 0; k33_i < 360; k33_i++) {	// 0���� 360���� k33_i�� ������� ���ԵǴ� for���� �����Ѵ�.
			k33_fSin = Math.sin(k33_i * 3.141592 / 180);
			// k33_i�� 3.141592�� ���ϰ� 180�� ���� ���� Math.sin�Լ��� �ְ� �� ���� k33_fSin�� �����Ѵ�.
			int k33_iSpace = (int) ((1.0 - k33_fSin) * 50); 
			// 1.0���� k33_fSin�� �� ���� 50�� ���ϰ� ���������� ��ȯ�ϰ� k33_iSpace�� �����ϸ� 0���� 100������ ���� ���´�.
			for (int k33_j = 0; k33_j < k33_iSpace; k33_j++) {	// 0���� k33_iSpace������ k33_j�� ������� ���ԵǴ� for���� �����Ѵ�.
				System.out.printf(" ");	// k33_iSpace������ ������ ����Ѵ�.
			}
			System.out.printf("*[%f][%d]\n", k33_fSin, k33_iSpace); // k33_fSin�� k33_iSpace ���� ����Ѵ�.
		}
	}
}
