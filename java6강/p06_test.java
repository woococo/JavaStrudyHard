package java6��;

public class p06_test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		p06_Calc1 k33_cc = new p06_Calc1(); // Ŭ���� p07_Calc1�� �޾� ��ü k33_cc�� ����
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", k33_cc.k33_sum(1, 2));	// ��ü k33_cc�� k33_sum�� 1,2�� �����ϰ� ����� ���
		System.out.printf("3�� ������ ȣ��� [%d]\n", k33_cc.k33_sum(1, 2, 3));	// ��ü k33_cc�� k33_sum�� 1,2,3�� �����ϰ� ����� ���
		System.out.printf("4�� ������ ȣ��� [%d]\n", k33_cc.k33_sum(1, 2, 3, 4));	// ��ü k33_cc�� k33_sum�� 1,2,3,4�� �����ϰ� ����� ���
		System.out.printf("������ ������ ȣ��� [%f]\n", k33_cc.k33_sum(1.3, 2.4));	// ��ü k33_cc�� k33_sum�� 1.3, 2.4�� �����ϰ� ����� ���
		
		// --> �޼ҵ� �̸��� �� ������ �����̳� ������ �ٸ��� ������ ����� �ٸ��� ��� �� ~!
		
	}
}
