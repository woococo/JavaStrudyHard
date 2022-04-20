package java6강;

public class p09_test {

	static p09_TvRemocon2 k33_TvRemocon1;
	static p09_TvRemocon2 k33_TvRemocon2;
	static p09_TvRemocon2 k33_TvRemocon3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k33_TvRemocon1 = new p09_TvRemocon2();		// 기본 TV
		k33_TvRemocon2 = new p09_TvRemocon2(15, 1, 150, 1, 5, 5);	// 맞춤 TV1 
		k33_TvRemocon3 = new p09_TvRemocon2(10, 1, 50, 1, 3, 7);	// 맞춤 TV2
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_TvRemocon1.k33_channelUp(1); k33_TvRemocon1.k33_msg("1번TV 볼륨 1 올리기");
			//k33_TvRemocon1.k33_channellUp(1); k33_TvRemocon1.k33_msg("2번TV 볼륨 1 올리기");
			//k33_TvRemocon1.k33_channellUp(1); k33_TvRemocon1.k33_msg("3번TV 볼륨 1 올리기");
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_TvRemocon1.k33_channelDown(1); k33_TvRemocon1.k33_msg("1번TV 볼륨 1 내리기");
			//k33_TvRemocon1.k33_channelDown(1); k33_TvRemocon1.k33_msg("2번TV 볼륨 1 내리기");
			//k33_TvRemocon1.k33_channelDown(1); k33_TvRemocon1.k33_msg("3번TV 볼륨 1 내리기");
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {
			k33_TvRemocon1.k33_voulUp(1); k33_TvRemocon1.k33_msg("1번TV 채널 1 올리기");
			//k33_TvRemocon1.k33_voulUp(1); k33_TvRemocon1.k33_msg("2번TV 채널 1 올리기");
			//k33_TvRemocon1.k33_voulUp(1); k33_TvRemocon1.k33_msg("3번TV 채널 1 올리기");
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {
			k33_TvRemocon1.k33_voulDown(1); k33_TvRemocon1.k33_msg("1번TV 채널 1 내리기");
			//k33_TvRemocon1.k33_voulUp(1); k33_TvRemocon1.k33_msg("2번TV 채널 1 내리기");
			//k33_TvRemocon1.k33_voulUp(1); k33_TvRemocon1.k33_msg("3번TV 채널 1 내리기");
		}
	}
}
