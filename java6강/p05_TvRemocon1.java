package java6��;

// TvRemocon

public class p05_TvRemocon1 {

	int k33_limitUpVol = 5;			// �ִ� ����
	int k33_limitDownVol = 0;		// ���� ����
	int k33_limitUChannel = 10;		// �ִ� ä��
	int k33_limitDownChannel = 0;	// ���� ä��
	
	int k33_vol = 1;		// ���� ����
	int k33_channel = 1;	// ���� ä��
	String k33_help;		// ��µ� �ȳ���

	void k33_Voulup() {	// ������ �ø���
		if (k33_vol == k33_limitUpVol) {	// ���� ������ �ִ� �����̶��
			k33_help = "���� �ִ��Դϴ�.";	// �ִ뺼���̶�� ���
		} else {	// ���� ������ �ִ� ������ �ƴ϶��
			k33_vol++;	// ���� �ϳ� ����
			k33_help = String.format("���� %d �Դϴ�.", k33_vol);	// ���� ���� ���
		}
	}

	void k33_VoulDown() {	// ������ �����.
		if (k33_vol == k33_limitDownVol) {	// ���� ������ ���� �����̶��
			k33_help = "���� �����Դϴ�.";	// ����	�����̶�� ���
		} else {	// ���� ������ ���� ������ �ƴ϶��
			k33_vol--;	// ���� �ϳ� ����
			k33_help = String.format("���� %d �Դϴ�.", k33_vol);	// ���� ���� ���
		}
	}
	
	void k33_Channelup() {	// ä���� �ø���.
		if (k33_channel == k33_limitUChannel) {	// ���� ä���� �ִ� ä���̶��
			k33_help = "ä�� �ִ��Դϴ�.";	// �ִ� ä���̶�� ���
		} else {	// ���� ä���� �ִ� ä���� �Ƴ����
			k33_channel++;	// ä�� �ϳ� ����
			k33_help = String.format("ä�� %d �Դϴ�.", k33_channel);	// ���� ä�� ���
		}
	}

	void k33_ChannelDown() {	// ä���� ������.
		if (k33_channel == k33_limitDownChannel) {	// ���� ä���� ���� ä���̶��
			k33_help = "ä�� �����Դϴ�.";	// ���� ä���̶�� ���
		} else {	// ���� ä���� ���� ä���� �ƴ϶��
			k33_channel--;	// ä�� �ϳ� ����
			k33_help = String.format("ä�� %d �Դϴ�.", k33_channel);	// ���� ä���� ���
		}
	}
}