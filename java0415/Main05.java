package java0415;

public class Main05 {

	// 1-5. �迭

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] k33_score = new int[5]; 	// ũŰ�� 5�� ������ �迭�� �����Ѵ�.
		k33_score[0] = 100; 			// k33_score �迭 0���� 100�� �����Ѵ�.
		k33_score[1] = 90; 				// k33_score �迭 1���� 90�� �����Ѵ�.
		k33_score[2] = 80;				// k33_score �迭 2���� 80�� �����Ѵ�.
		k33_score[3] = 70; 				// k33_score �迭 3���� 70�� �����Ѵ�.
		k33_score[4] = 60; 				// k33_score �迭 4���� 60�� �����Ѵ�.
		
		// �迭 k33_score ���� ����غ��� ���� for���� �����Ѵ�. 
		for (int k33_i = 0; k33_i < k33_score.length; k33_i++) { 
			// k33_i�� 0���� �迭 k33_score�� ���̱��� ����Ǵ� for���̴�.
			System.out.println(k33_score[k33_i]);
			// �迭 k33_score���� ������� ��µȴ�.
		}
	}
}
