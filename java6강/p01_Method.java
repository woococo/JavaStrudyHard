package java6��;

public class p01_Method {

	// ������ �޼���(1)
	// ������ ����, �޼���(Method)�� �Լ��� �޼����� �Ѵ�.
	// �ϴ� �ڱ� Ŭ���� �ȿ� �Լ��� �����ϸ� �Լ��̸������� �ҷ��� �� �ִ�. (Ŭ������.�޼ҵ���� ��Ģ������ Ŭ������ ����)
	
	public static void k33_iamMethod() {	// �޼ҵ� k33_iamMethod�̴�.
		System.out.println("�޼ҵ�� �ҷ����~");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p01_Method.k33_iamMethod();	// Ŭ������.�޼ҵ�� << ��Ģ������
		k33_iamMethod();			// Ŭ������ ������ ����
	}
}
