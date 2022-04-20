package java6강;

public class p09_TvRemocon2 {

	private int k33_limitUpVol;			// 최대 볼륨 선언
	private int k33_limitDownVol;		// 최저 볼륨 선언
	private int k33_limitUChannel;		// 최대 채널 선언 
	private int k33_limitDownChannel;	// 최저 채널 선언
	private int k33_vol;				// 현재 볼륨 선언
	private int k33_channel;			// 현재 채널 선언
	protected String k33_help;			// 출력될 안내문

	p09_TvRemocon2(){				// 생성자에서 초기값을 설정
		k33_limitUpVol = 5;			// 최대 볼륨 초기값 설정
		k33_limitDownVol = 0;		// 최저 볼륨 초기값 설정
		k33_limitUChannel = 10;		// 최대 채널 초기값 설정
		k33_limitDownChannel = 0;	// 최저 채널 초기값 설정
		k33_vol = 1;				// 현재 볼륨 초기값 설정
		k33_channel = 1;			// 현재 채널 초기값 설정
		k33_help = "리모컨 기본 설정 완료";		// 출력될 안내문 설정
	}
	
	// 맞춤 TV를 만들기위해 최대볼륨, 최저볼륨, 현재 볼륨, 최대채널, 최저채널, 현재채널을 입력받는다.
	p09_TvRemocon2(int k33_upVol, int k33_downVol, int k33_upChannel, int k33_downChennel, int k33_inVol, int k33_inChennel){
		k33_limitUpVol = k33_upVol;			// 최대 볼륨은 입력받은 최대볼륨으로 설정
		k33_limitDownVol = k33_downVol;		// 최저 볼륨은 입력받은 최저볼륨으로 설정
		k33_limitUChannel = k33_upChannel;		// 최대 채널은 입력받은 최대채널로 설정
		k33_limitDownChannel = k33_downChennel;	// 최저 채널은 입력받은 최대채널로 설정
		k33_vol = k33_inVol;		// 현재 볼륨은 입력받은 현재 불륨으로 설정
		k33_channel = k33_inChennel;	// 현재 채널은 입력받은 현재 볼륨으로 설정
		k33_help = "리모컨 맞춤 설정 완료";		// 출력될 안내문 설정
	}
	
	void k33_voulUp() {	// 볼륨을 올린다
		if (k33_vol == k33_limitUpVol) {	// 현재 볼륨이 최대 볼륨이라면
			k33_help = "볼륨 최대입니다.";	// 최대볼륨이라고 출력
		} else {	// 현재 볼륨이 최대 볼륨이 아니라면
			k33_vol++;	// 볼륨 하나 증가
			k33_help = String.format("볼률 %d 입니다.", k33_vol);	// 현재 볼륨 출력
		}
	}

	void k33_voulDown() {	// 볼륨을 낮춘다.
		if (k33_vol == k33_limitDownVol) {	// 현재 볼륨이 최저 볼륨이라면
			k33_help = "볼륨 최저입니다.";	// 최저	볼륨이라고 출력
		} else {	// 현재 볼륨이 최저 볼륨이 아니라면
			k33_vol--;	// 볼륨 하나 감소
			k33_help = String.format("볼률 %d 입니다.", k33_vol);	// 현재 볼륨 출력
		}
	}
	
	void k33_channelUp() {	// 채널을 올린다.
		if (k33_channel == k33_limitUChannel) {	// 현재 채널이 최대 채널이라면
			k33_help = "채널 최대입니다.";	// 최대 채널이라고 출력
		} else {	// 현재 채널이 최대 채널이 아나라면
			k33_channel++;	// 채널 하나 증가
			k33_help = String.format("채널 %d 입니다.", k33_channel);	// 현재 채널 출력
		}
	}

	void k33_channelDown() {	// 채널을 내린다.
		if (k33_channel == k33_limitDownChannel) {	// 현재 채널이 최저 채널이라면
			k33_help = "채널 최저입니다.";	// 최저 채널이라고 출력
		} else {	// 현재 채널이 최저 채널이 아니라면
			k33_channel--;	// 채널 하나 감소
			k33_help = String.format("채널 %d 입니다.", k33_channel);	// 현재 채널을 출력
		}
	}
	
	// 처음에 볼륨이 몇인지 지정한다면 부족한만큼 올라가도록 한다.
	void k33_voulUp(int k33_u) {	// 볼륨을 지정하면
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0부터 지정볼륨까지 돌아가는 for문
			this.k33_voulUp(); // 현재 클래스의 k33_voulUp으로 이동
		}
	}
	
	// 처음에 볼륨이 몇인지 지정한다면 부족한만큼 내려가도록 한다.
	void k33_voulDown(int k33_u) {		// 볼륨을 지정하면
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0부터 지정볼륨까지 돌아가는 for문
			this.k33_voulDown();  // 현재 클래스의 k33_voulDown으로 이동
		}
	}
	
	// 처음에 채널이 몇인지 지정한다면 부족한만큼 올라가도록 한다.
	void k33_channelUp(int k33_u) {	// 볼륨을 지정하면
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0부터 지정볼륨까지 돌아가는 for문
			this.k33_channelUp();	// 현재 클래스의 k33_channelUp으로 이동
		}
	}

	// 처음에 채널이 몇인지 지정한다면 부족한만큼 내려가도록 한다.
	void k33_channelDown(int k33_u) {	// 볼륨을 지정하면
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0부터 지정볼륨까지 돌아가는 for문
			this.k33_channelDown();	// 현재 클래스의 k33_channelDown으로 이동
		}
	}
	
	void k33_msg(String k33_id) {
		System.out.printf("%s=>[%s] 최대 볼륨[%d] 최소 볼륨[%d] 현재 볼륨[%d], 최대 채널[%d] 최소 채널[%d], 현재 채널[%d]\n", 
				k33_id, k33_help, k33_limitUpVol, k33_limitDownVol, k33_vol, k33_limitUChannel, k33_limitDownChannel, k33_channel);
		// 최대볼륨, 최소볼륨, 현재볼륨, 최대채널, 최소채널, 현재채널을 출력한다.
	}
}
