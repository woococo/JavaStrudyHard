package java6��;

public class p02_Method {
	
	// ������ �޼���(2)
	// ������ Ŭ�������� �������� ����ϴ� static���� ���� (���� ��� ����)
	// ������ �޼ҵ� ���� �����Ͽ� �ް������� �����ϰ� ���Ϲ޴� ���·� ���
	
	static int k33_iStatic;	// Ŭ������ ���� ���� static�� ����
	
	public static void k33_add(int k33_i) {	// ���� i�� �޾ƿ��� �޼ҵ� add�� �����Ѵ�.
		k33_iStatic++;	// iStatic�� �ϳ��� ������Ų��.
		k33_i++;		// i�� �ϳ��� ������Ų��.
		System.out.printf("k33_add�޼ҵ忡�� -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic�� ����Ѵ�.
		System.out.printf("k33_add�޼ҵ忡�� -> k33_i = [%d]\n", k33_i);	// k33_i�� ����Ѵ�.
	}
	
	public static int k33_add2(int k33_i) { // ���� i�� �޾ƿ��� �޼ҵ� add1�� �����Ѵ�.
		k33_iStatic++;	// iStatic�� �ϳ��� ������Ų��.
		k33_i++;		// i�� �ϳ��� ������Ų��.
		System.out.printf("k33_add�޼ҵ忡�� -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic�� ����Ѵ�.
		System.out.printf("k33_add�޼ҵ忡�� -> k33_i = [%d]\n", k33_i);	// k33_i�� ����Ѵ�.
		return k33_i;	// i�� ��ȯ�Ѵ�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k33_iMain = 1;	// 1 ���� ���� ������ ���� k33_iMain�� �����Ѵ�.
		k33_iStatic = 1;	// k33_iStatic�� 1�� �����Ѵ�.
		
		System.out.printf("*****************************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic�� ����Ѵ�.
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k33_iMain = [%d]\n", k33_iMain);		// k33_iMain�� ����Ѵ�.
		System.out.printf("*****************************************************\n");
		k33_add(k33_iMain);
		System.out.printf("*****************************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic�� ����Ѵ�.
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k33_iMain = [%d]\n", k33_iMain);		// k33_iMain�� ����Ѵ�.
		System.out.printf("*****************************************************\n");
		
		k33_iMain = k33_add2(k33_iMain);	// �̷������� ���� �����ϰ� �޴� ����� �����ϱ� ����.
								// ���������� ���� �� ���Լ�, �ƴ� �޼ҵ� �� �޼ҵ忡�� ������ ������
								// ����ü ��� ������ �Ǿ��ִ��� �˾ƺ��� ��ƴ�.
		
		System.out.printf("*****************************************************\n");
		System.out.printf("�޼ҵ� k33_add2 ȣ�� �� ���ο��� -> k33_iStatic = [%d]\n", k33_iStatic);	// k33_iStatic�� ����Ѵ�.
		System.out.printf("�޼ҵ� k33_add2 ȣ�� �� ���ο��� -> k33_iMain = [%d]\n", k33_iMain);		// k33_iMain�� ����Ѵ�.
		System.out.printf("*****************************************************\n");
	}
}
