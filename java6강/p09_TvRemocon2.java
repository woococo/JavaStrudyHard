package java6��;

public class p09_TvRemocon2 {

	private int k33_limitUpVol;			// �ִ� ���� ����
	private int k33_limitDownVol;		// ���� ���� ����
	private int k33_limitUChannel;		// �ִ� ä�� ���� 
	private int k33_limitDownChannel;	// ���� ä�� ����
	private int k33_vol;				// ���� ���� ����
	private int k33_channel;			// ���� ä�� ����
	protected String k33_help;			// ��µ� �ȳ���

	p09_TvRemocon2(){				// �����ڿ��� �ʱⰪ�� ����
		k33_limitUpVol = 5;			// �ִ� ���� �ʱⰪ ����
		k33_limitDownVol = 0;		// ���� ���� �ʱⰪ ����
		k33_limitUChannel = 10;		// �ִ� ä�� �ʱⰪ ����
		k33_limitDownChannel = 0;	// ���� ä�� �ʱⰪ ����
		k33_vol = 1;				// ���� ���� �ʱⰪ ����
		k33_channel = 1;			// ���� ä�� �ʱⰪ ����
		k33_help = "������ �⺻ ���� �Ϸ�";		// ��µ� �ȳ��� ����
	}
	
	// ���� TV�� ��������� �ִ뺼��, ��������, ���� ����, �ִ�ä��, ����ä��, ����ä���� �Է¹޴´�.
	p09_TvRemocon2(int k33_upVol, int k33_downVol, int k33_upChannel, int k33_downChennel, int k33_inVol, int k33_inChennel){
		k33_limitUpVol = k33_upVol;			// �ִ� ������ �Է¹��� �ִ뺼������ ����
		k33_limitDownVol = k33_downVol;		// ���� ������ �Է¹��� ������������ ����
		k33_limitUChannel = k33_upChannel;		// �ִ� ä���� �Է¹��� �ִ�ä�η� ����
		k33_limitDownChannel = k33_downChennel;	// ���� ä���� �Է¹��� �ִ�ä�η� ����
		k33_vol = k33_inVol;		// ���� ������ �Է¹��� ���� �ҷ����� ����
		k33_channel = k33_inChennel;	// ���� ä���� �Է¹��� ���� �������� ����
		k33_help = "������ ���� ���� �Ϸ�";		// ��µ� �ȳ��� ����
	}
	
	void k33_voulUp() {	// ������ �ø���
		if (k33_vol == k33_limitUpVol) {	// ���� ������ �ִ� �����̶��
			k33_help = "���� �ִ��Դϴ�.";	// �ִ뺼���̶�� ���
		} else {	// ���� ������ �ִ� ������ �ƴ϶��
			k33_vol++;	// ���� �ϳ� ����
			k33_help = String.format("���� %d �Դϴ�.", k33_vol);	// ���� ���� ���
		}
	}

	void k33_voulDown() {	// ������ �����.
		if (k33_vol == k33_limitDownVol) {	// ���� ������ ���� �����̶��
			k33_help = "���� �����Դϴ�.";	// ����	�����̶�� ���
		} else {	// ���� ������ ���� ������ �ƴ϶��
			k33_vol--;	// ���� �ϳ� ����
			k33_help = String.format("���� %d �Դϴ�.", k33_vol);	// ���� ���� ���
		}
	}
	
	void k33_channelUp() {	// ä���� �ø���.
		if (k33_channel == k33_limitUChannel) {	// ���� ä���� �ִ� ä���̶��
			k33_help = "ä�� �ִ��Դϴ�.";	// �ִ� ä���̶�� ���
		} else {	// ���� ä���� �ִ� ä���� �Ƴ����
			k33_channel++;	// ä�� �ϳ� ����
			k33_help = String.format("ä�� %d �Դϴ�.", k33_channel);	// ���� ä�� ���
		}
	}

	void k33_channelDown() {	// ä���� ������.
		if (k33_channel == k33_limitDownChannel) {	// ���� ä���� ���� ä���̶��
			k33_help = "ä�� �����Դϴ�.";	// ���� ä���̶�� ���
		} else {	// ���� ä���� ���� ä���� �ƴ϶��
			k33_channel--;	// ä�� �ϳ� ����
			k33_help = String.format("ä�� %d �Դϴ�.", k33_channel);	// ���� ä���� ���
		}
	}
	
	// ó���� ������ ������ �����Ѵٸ� �����Ѹ�ŭ �ö󰡵��� �Ѵ�.
	void k33_voulUp(int k33_u) {	// ������ �����ϸ�
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0���� ������������ ���ư��� for��
			this.k33_voulUp(); // ���� Ŭ������ k33_voulUp���� �̵�
		}
	}
	
	// ó���� ������ ������ �����Ѵٸ� �����Ѹ�ŭ ���������� �Ѵ�.
	void k33_voulDown(int k33_u) {		// ������ �����ϸ�
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0���� ������������ ���ư��� for��
			this.k33_voulDown();  // ���� Ŭ������ k33_voulDown���� �̵�
		}
	}
	
	// ó���� ä���� ������ �����Ѵٸ� �����Ѹ�ŭ �ö󰡵��� �Ѵ�.
	void k33_channelUp(int k33_u) {	// ������ �����ϸ�
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0���� ������������ ���ư��� for��
			this.k33_channelUp();	// ���� Ŭ������ k33_channelUp���� �̵�
		}
	}

	// ó���� ä���� ������ �����Ѵٸ� �����Ѹ�ŭ ���������� �Ѵ�.
	void k33_channelDown(int k33_u) {	// ������ �����ϸ�
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0���� ������������ ���ư��� for��
			this.k33_channelDown();	// ���� Ŭ������ k33_channelDown���� �̵�
		}
	}
	
	void k33_msg(String k33_id) {
		System.out.printf("%s=>[%s] �ִ� ����[%d] �ּ� ����[%d] ���� ����[%d], �ִ� ä��[%d] �ּ� ä��[%d], ���� ä��[%d]\n", 
				k33_id, k33_help, k33_limitUpVol, k33_limitDownVol, k33_vol, k33_limitUChannel, k33_limitDownChannel, k33_channel);
		// �ִ뺼��, �ּҺ���, ���纼��, �ִ�ä��, �ּ�ä��, ����ä���� ����Ѵ�.
	}
}
