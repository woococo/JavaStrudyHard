package java6강;

// TvRemocon

public class p05_TvRemocon1 {

	int k33_limitUpVol = 5;			// 최대 볼륨
	int k33_limitDownVol = 0;		// 최저 볼륨
	int k33_limitUChannel = 10;		// 최대 채널
	int k33_limitDownChannel = 0;	// 최저 채널
	
	int k33_vol = 1;		// 현재 볼륨
	int k33_channel = 1;	// 현재 채널
	String k33_help;		// 출력될 안내문

	void k33_Voulup() {	// 볼륨을 올린다
		if (k33_vol == k33_limitUpVol) {	// 현재 볼륨이 최대 볼륨이라면
			k33_help = "볼륨 최대입니다.";	// 최대볼륨이라고 출력
		} else {	// 현재 볼륨이 최대 볼륨이 아니라면
			k33_vol++;	// 볼륨 하나 증가
			k33_help = String.format("볼률 %d 입니다.", k33_vol);	// 현재 볼륨 출력
		}
	}

	void k33_VoulDown() {	// 볼륨을 낮춘다.
		if (k33_vol == k33_limitDownVol) {	// 현재 볼륨이 최저 볼륨이라면
			k33_help = "볼륨 최저입니다.";	// 최저	볼륨이라고 출력
		} else {	// 현재 볼륨이 최저 볼륨이 아니라면
			k33_vol--;	// 볼륨 하나 감소
			k33_help = String.format("볼률 %d 입니다.", k33_vol);	// 현재 볼륨 출력
		}
	}
	
	void k33_Channelup() {	// 채널을 올린다.
		if (k33_channel == k33_limitUChannel) {	// 현재 채널이 최대 채널이라면
			k33_help = "채널 최대입니다.";	// 최대 채널이라고 출력
		} else {	// 현재 채널이 최대 채널이 아나라면
			k33_channel++;	// 채널 하나 증가
			k33_help = String.format("채널 %d 입니다.", k33_channel);	// 현재 채널 출력
		}
	}

	void k33_ChannelDown() {	// 채널을 내린다.
		if (k33_channel == k33_limitDownChannel) {	// 현재 채널이 최저 채널이라면
			k33_help = "채널 최저입니다.";	// 최저 채널이라고 출력
		} else {	// 현재 채널이 최저 채널이 아니라면
			k33_channel--;	// 채널 하나 감소
			k33_help = String.format("채널 %d 입니다.", k33_channel);	// 현재 채널을 출력
		}
	}
}