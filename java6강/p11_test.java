package java6��;

public class p11_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����
		p11_TvRemocon3 k33_TvRemocon1 = new p11_TvRemocon3();

		// ä���� 10�� �ø���.
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_TvRemocon1.k33_channelUp();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
	
		// ä���� 10�� ������.
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_TvRemocon1.k33_channelDown();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
		
		// ������ 5�� �ø���
		for (int k33_i = 0; k33_i < 5; k33_i++) {
			k33_TvRemocon1.k33_voulUp();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
		
		// ������ 5�� ������
		for (int k33_i = 0; k33_i < 5; k33_i++) {
			k33_TvRemocon1.k33_voulDown();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
		
		// ������ üũ ������ ����Ѵ�.
		k33_TvRemocon1.k33_Repair();
		System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);	
	}
}
