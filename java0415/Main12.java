package java0415;

public class Main12 {

	// 2-7. Array�̿� ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k33_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	
		// ������ �迭 k33_iLMD�� �����ϰ�  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 �� �����Ѵ�.
		// �迭�� 0���� �����ϴ� ���� ����Ѵ� --> k33_iLMD[0] ~ k33_iLMD[11]

		for (int k33_i = 1; k33_i < 13; k33_i++) {		// 1���� 12���� ������� ����Ǵ� for���� �����Ѵ�.
			System.out.printf(" %d�� =>", k33_i);		// "k33_i�� => " �� ����Ѵ� ->  "1�� => "
			for (int k33_j = 1; k33_j < 32; k33_j++) {	// 1���� 31���� ������� ����Ǵ� for���� �����Ѵ�.
				System.out.printf("%d", k33_j);			// "K33_j," �� ����Ѵ� -> "25,"
				if (k33_iLMD[k33_i - 1] == k33_j) {		// �迭 k33_iLMD���� [k33_i - 1] ���� k33_j ���� ��ġ�ϴٸ�
					break;								// ����
				}
				System.out.print(",");	// �ϴ����� ������ ���ֱ� ���ؼ� ,�� ����Ѵ�. ������ ������ ,�� ������ ����.
				
			}
			System.out.println("");	// ���� �ٲٱ� ���ؼ� "" �� �Է��Ѵ�.
		}
	}

}
