package java0415;

public class Main07 {

	// 2-2. ������, ������ ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k33_il;		// ������ ���� k33_il�� �����Ѵ�.
		double k33_iD;	// �Ǽ��� ���� k33_iD�� �����Ѵ�.

		k33_il = 10 / 3;	// k33_il�� 10�� 3���� ���� ���� �����Ѵ�.
		k33_iD = 10 / 3.0;	// k33_iD�� 10�� 3.0���� ���� ���� �����Ѵ�.

		// int�� double�� ����������� �Ǽ��� �����̴�. 
		if (k33_il == k33_iD) {	// k33_il ���� k33_iD�� ���� ���ٸ�
			System.out.printf("equal\n");	// equal�� ����Ѵ�.
		} else {	// �ƴ϶��?!
			System.out.printf("Not equal [%f][%f] \n", (double) k33_il, k33_iD); 
			// Not equal�� �Բ� k33_il�� �Ǽ��� ��ȯ�� ���� k33_iD�� ������� ����Ѵ�.
		}
		
		// ���� ��ȿ���ڱ��� ǥ�õ� �� ������ �ٸ���.
		if (k33_iD == 3.333333) {	// k33_iD���� 3.333333�̶��
			System.out.printf("equal\n");	// equal�� ����Ѵ�.
		} else {	// �ƴ϶�� ?!
			System.out.printf("Not equal [3.333333][%f] \n", k33_iD);
			// Not equal, 3.333333�� �Բ� k33_iD�� ������� ����Ѵ�.
		}
		
		k33_iD = (int) k33_iD;	// k33_iD�� k33_iD�� ���������� ��ȯ�� ���� �����Ѵ�.
		if (k33_il == k33_iD) {	// k33_il�� ���� k33_iD ���� ���ٸ�
			System.out.println("equal\n");	// equal�� ����Ѵ�.
		} else {	// �ƴ϶�� ?!
			System.out.printf("Not equal [%f][%f] \n", (double) k33_il, k33_iD);
			// Not equal�� �Բ� k33_il�� �Ǽ��� ��ȯ�� ���� k33_iD�� ������� ����Ѵ�.
		}

		System.out.printf("int�� �μ� [%d][%f]\n", k33_il, k33_iD);
		// int�� �μ� --> [3][3.000000]
		System.out.printf("double�� �μ� [%f][%f]\n", (double) k33_il, k33_iD);
		// double�� �μ� --> [3.000000][3.000000]

		char k33_a = 'c'; // ������ ������ k33_a�� �����ϰ� 'c'�� �����Ѵ�.
		// char(����)�������� ''�� ����Ѵ�.

		if (k33_a == 'b') {	// k33_a �� 'b'�� ���ٸ�
			System.out.println("k33_a�� b�̴�");	// "k33_a�� b�̴�"�� ����Ѵ�.
		}
		if (k33_a == 'c') {	// k33_a�� 'c'�� ���ٸ�
			System.out.println("k33_a�� c�̴�");	// "k33_a�� c�̴�"�� ����Ѵ�.
		}
		if (k33_a == 'd') {	// k33_a�� 'd'�� ���ٸ�
			System.out.println("k33_a�� d�̴�");	//"k33_a�� d�̴�"�� ����Ѵ�.
		}

		String k33_aa = "abcd"; // ���ڿ� ������ k33_aa�� �����ϰ� "abcd"�� �����Ѵ�.
		// String(���ڿ�)�������� ""�� ����Ѵ�.
		
		if (k33_aa.equals("abcd")) {	//	���ڿ� k33_aa�� "abcd"�� ��ġ�ϴٸ�
			System.out.println("k33_aa�� abcd�̴�");	// "k33_aa�� abcd�̴�"�� ����Ѵ�.
		} else {	//  �ƴ϶��?!
			System.out.println("k33_aa�� abcd�� �ƴϴ�");	// "k33_aa�� abcd�� �ƴϴ�"�� ����Ѵ�.
		}

		boolean k33_bb = true;	// ���� ������ k33_bb�� �����ϰ� true�� �����Ѵ�.

		if (!!k33_bb) {	// k33_bb�� true�� �ƴ϶�� ?
			System.out.println("k33_bb�� �ƴϰ� �ƴϸ� ���̴�");	// "k33_bb�� �ƴϰ� �ƴϸ� ���̴�"�� ����Ѵ�.
		} else { // k33_bb�� true�� �ƴѰ��� �ƴ϶�� ?? ==> k33_bb�� true��
			System.out.println("k33_bb�� �ƴϰ� �ƴϸ� �����̴�");	// "k33_bb�� �ƴϰ� �ƴϸ� �����̴�"�� ����Ѵ�.
		}
	}
}