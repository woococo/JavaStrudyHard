package java6��;

public class p14_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iPerson = 10;	// �� ���� �ִ¸�ŭ ����� ����
  
		p14_InputData k33_inData = new p14_InputData(k33_iPerson);	// �������� ���ڸ� �ظ�ŭ �迭�� �����.

		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {
			String k33_name = String.format("ȫ��%02d", k33_i);	// �̸� �����
			int k33_kor = (int) (Math.random() * 100);	// ���� ���� �����
			int k33_eng = (int) (Math.random() * 100);	// ���� ���� �����
			int k33_mat = (int) (Math.random() * 100);	// ���� ���� �����
			k33_inData.p14_InputData(k33_i, k33_name, k33_kor, k33_eng, k33_mat);	// Ŭ������ �� �Է�
		}
		
		for (int k33_i = 0; k33_i <k33_iPerson; k33_i++) {
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", 
					k33_i, k33_inData.k33_nameArr[k33_i], k33_inData.k33_korArr[k33_i], k33_inData.k33_engArr[k33_i],  
					k33_inData.k33_matArr[k33_i], k33_inData.k33_sumArr[k33_i], k33_inData.k33_aveArr[k33_i]);
		// ��ȣ �̸� ���� ���� ���� ���� ��� ������ ����Ѵ�
		}
	}
}
