package java6강;

public class p05_test {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			p05_TvRemocon1 k33_TvRemocon;	// p05_TvRemocon1 클래스를 받아서 k33_TvRemocon 객체를 만든다.
			
			k33_TvRemocon = new p05_TvRemocon1();	// 객체 k33_TvRemocon에 p05_TvRemocon1 인스턴스를 생성해서 연결한다.
						
			for (int k33_i = 0; k33_i < 5; k33_i++) {	// 볼륨을 하나씩 5번 올려보자
				k33_TvRemocon.k33_Voulup();	// p05_TvRemocon1 클래스 k33_Voulup으로 이동
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// 현재 볼륨 출력
			}
			
			for (int k33_i = 0; k33_i < 5; k33_i ++) {	// 볼륨을 하나씩 5번 내려보자
				k33_TvRemocon.k33_VoulDown();	// p05_TvRemocon1 클래스 k33_VoulDown으로 이동
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// 현재 볼륨 출력
			}
			
			for (int k33_i = 0; k33_i < 10; k33_i++) {	// 채널을 하나씩 10번 올려보자
				k33_TvRemocon.k33_Channelup();	// p05_TvRemocon1 클래스 k33_Channelup으로 이동
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// 현재 채널 출력
			}
			
			for (int k33_i = 0; k33_i < 10; k33_i ++) {	// 채널을 하나씩 10번 내려보자
				k33_TvRemocon.k33_ChannelDown();	// p05_TvRemocon1 클래스 k33_ChannelDown으로 이동
				System.out.printf("[%s]\n", k33_TvRemocon.k33_help);	// 현재 채널 출력
			}
		}
	}