package java6��;

public class p16_InputData {

	public String[] k33_nameArr;// �̸��� ���� �迭 ����
	public int[] k33_korArr;	// ���� ������ ���� �迭 ����
	public int[] k33_engArr;	// ���� ������ ���� �迭 ����
	public int[] k33_matArr;	// ���� ������ ���� �迭 ����
	public int[] k33_sumArr;	// ���� ������ ���� �迭 ����
	public double[] k33_aveArr;	// ��հ��� ���� �迭 ����

	public p16_InputData(int k33_iPerson) {
		// TODO Auto-generated constructor stub
		k33_nameArr = new String[k33_iPerson];	// �̸� �迭�� ũ�⸦ �����ش�
		k33_korArr = new int[k33_iPerson];	// �������� �迭�� ũ�⸦ �����ش�
		k33_engArr = new int[k33_iPerson];	// �������� �迭�� ũ�⸦ �����ش�
		k33_matArr = new int[k33_iPerson];	// �������� �迭�� ũ�⸦ �����ش�
		k33_sumArr = new int[k33_iPerson];	// �������� �迭�� ũ�⸦ �����ش�
		k33_aveArr = new double[k33_iPerson];	// ��հ� �迭�� ũ�⸦ �����ش�
	}

	// ��ȣ, �̸�, ��������, ��������, ���������� �޾ƿ��� �� �迭�� �־��ش�.
	public void p16_InputData(int k33_i, String k33_name, int k33_kor, int k33_eng, int k33_mat) {
		// TODO Auto-generated method stub
		k33_nameArr[k33_i] = k33_name;
		k33_korArr[k33_i] = k33_kor;
		k33_engArr[k33_i] = k33_eng;
		k33_matArr[k33_i] = k33_mat;
		k33_sumArr[k33_i] = k33_kor + k33_eng + k33_mat;
		k33_aveArr[k33_i] = k33_sumArr[k33_i]/3.0;
	}
}
