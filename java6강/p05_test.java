package java6��;

public class p05_test {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			p05_TvRemocon1 k33_TvRemocon;	// p05_TvRemocon1 Ŭ������ �޾Ƽ� k33_TvRemocon ��ü�� �����.
			
			k33_TvRemocon = new p05_TvRemocon1();	// ��ü k33_TvRemocon�� p05_TvRemocon1 �ν��Ͻ��� �����ؼ� �����Ѵ�.
						
			for (int k33_i = 0; k33_i < 5; k33_i++) {	// ������ �ϳ��� 5�� �÷�����
				k33_TvRemocon.k33_Voulup();	// p05_TvRemocon1 Ŭ���� k33_Voulup���� �̵�
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// ���� ���� ���
			}
			
			for (int k33_i = 0; k33_i < 5; k33_i ++) {	// ������ �ϳ��� 5�� ��������
				k33_TvRemocon.k33_VoulDown();	// p05_TvRemocon1 Ŭ���� k33_VoulDown���� �̵�
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// ���� ���� ���
			}
			
			for (int k33_i = 0; k33_i < 10; k33_i++) {	// ä���� �ϳ��� 10�� �÷�����
				k33_TvRemocon.k33_Channelup();	// p05_TvRemocon1 Ŭ���� k33_Channelup���� �̵�
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// ���� ä�� ���
			}
			
			for (int k33_i = 0; k33_i < 10; k33_i ++) {	// ä���� �ϳ��� 10�� ��������
				k33_TvRemocon.k33_ChannelDown();	// p05_TvRemocon1 Ŭ���� k33_ChannelDown���� �̵�
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// ���� ä�� ���
			}
		}
	}