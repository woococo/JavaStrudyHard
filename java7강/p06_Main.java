package java7��;

public class p06_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 5; // ��� �� ����

		p06_OneRec[] k33_inData = new p06_OneRec[k33_iPerson]; // Ŭ���� �迭 p06_OneRec�� ����µ� ũ��� ����� ��ŭ���� �Ѵ�

		k33_inData[0] = new p06_OneRec("ȫ��01", 100, 100, 90); // k33_inData[0]�� ���� �����Ѵ�
		k33_inData[1] = new p06_OneRec("ȫ��02", 90, 90, 90); // k33_inData[1]�� ���� �����Ѵ�
		k33_inData[2] = new p06_OneRec("ȫ��03", 80, 70, 90); // k33_inData[2]�� ���� �����Ѵ�
		k33_inData[3] = new p06_OneRec("ȫ��04", 70, 60, 90); // k33_inData[3]�� ���� �����Ѵ�
		k33_inData[4] = new p06_OneRec("ȫ��05", 60, 100, 90); // k33_inData[4]�� ���� �����Ѵ�

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) { // ��� ����ŭ ����Ǵ� �ݺ��� ����
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %2d, ���� : %2d, ���� : %2d, ���� : %3d, ��� : %f\n", k33_i + 1,
					k33_inData[k33_i].k33_name(), k33_inData[k33_i].k33_kor(), k33_inData[k33_i].k33_eng(),
					k33_inData[k33_i].k33_mat(), k33_inData[k33_i].k33_sum(), k33_inData[k33_i].k33_ave()); // ���� ����Ѵ�
		}
	}
}
