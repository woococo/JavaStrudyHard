package java6��;

public class p07_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k33_name = "������";	// 

		p07_score Main08_A = new p07_score();
		System.out.println("3�� ����ǥ");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s\n", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("=================================================");
		System.out.printf("%s%6d%6d%6d%6d%7.1f\n\n", k33_name, 100, 100, 100, 
				Main08_A.k33_sum(100, 100, 100), (Main08_A.k33_ave(100, 100, 100)));
		System.out.println("4�� ����ǥ");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s%4s\n", "�̸�", "����", "����", "����", "����", "����", "���");
		System.out.println("=================================================");
		System.out.printf("%s%6d%6d%6d%6d%6d%7.1f\n\n", k33_name, 100, 100, 100, 100, 
				Main08_A.k33_sum(100, 100, 100, 100), (Main08_A.k33_ave(100, 100, 100, 100)));
		System.out.println("5�� ����ǥ");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s%4s%4s\n", "�̸�", "����", "����", "����", "����", "��ȸ", "����", "���");
		System.out.println("=================================================");
		System.out.printf("%s%6d%6d%6d%6d%6d%6d%7.1f\n", k33_name, 100, 100, 100, 100, 100,
				Main08_A.k33_sum(100, 100, 100, 100, 100), (Main08_A.k33_ave(100, 100, 100, 100, 100)));
	}
}
