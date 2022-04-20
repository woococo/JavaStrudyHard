package java6강;

public class p11_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 생성
		p11_TvRemocon3 k33_TvRemocon1 = new p11_TvRemocon3();

		// 채널을 10번 올린다.
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_TvRemocon1.k33_channelUp();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
	
		// 채널을 10번 내린다.
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_TvRemocon1.k33_channelDown();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
		
		// 볼륨을 5번 올린다
		for (int k33_i = 0; k33_i < 5; k33_i++) {
			k33_TvRemocon1.k33_voulUp();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
		
		// 볼륨을 5번 내린다
		for (int k33_i = 0; k33_i < 5; k33_i++) {
			k33_TvRemocon1.k33_voulDown();
			System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);
		}
		
		// 건전지 체크 사항을 출력한다.
		k33_TvRemocon1.k33_Repair();
		System.out.printf("MSG k33_TvRemocon1[%s]\n", k33_TvRemocon1.k33_help);	
	}
}
