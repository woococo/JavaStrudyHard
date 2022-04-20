package java6강;

// 생성자, 소멸자, 이벤트

public class p08_Elevater2 {

	protected int k33_limitUpFloor; 	// 최대층 선언
	private int k33_limitDownFloor; 	// 최저층 선언
	protected int k33_floor; 			// 현재층 선언
	String k33_help; 					// 출력될 안내문 선언

	p08_Elevater2() {	// 생성자로 생성, 초기값 설정
		k33_limitUpFloor = 10;	// 최대층을 10으로 설정
		k33_limitDownFloor = 1;	// 최저층을 1층으로 설정
		k33_floor = 1;	// 현재층을 1층으로 설정
		k33_help = "엘레베이터 기본 준공완료";	// 안내문구 설정
	}
	
	// 최대층, 최소층, 현재층을 주어서 클래스를 생성할 수 있도록 한다.
	p08_Elevater2(int k33_upFloor, int k33_downFloor, int k33_inFloor) {
		k33_limitUpFloor = k33_upFloor;	// 최대층을 입력받은 값으로 설정
		k33_limitDownFloor = k33_downFloor; // 최저층을 입력받은 값으로 설정
		k33_floor = k33_inFloor;	// 현재층을 입력받은 값으로 설정
		k33_help = "엘레베이터 맞춤 준공완료";	// 안내문구 출력
	}
 
	void k33_up() {	// 엘레베이터가 상승할 때
		if (k33_floor == k33_limitUpFloor) {	// 현재층이 최대층이라면
			k33_help = "마지막 층입니다.";	// 마지막층이라고 출력
		} else {	// 현재층이 최대층이 아니라면
			k33_floor++;	// 엘레베이터를 1층 상승시킨다.
			k33_help = String.format("[%d] 층입니다.", k33_floor);	// 현재층 안내
		}
	}

	void k33_down() {	// 엘레베이터가 하강할 때
		if (k33_floor == k33_limitDownFloor) {	// 현재층이 최저층이라면
			k33_help = "처음 층입니다.";	// 처음층이라고 출력
		} else {	// 현재층이 최저층이 아니라면
			k33_floor--;	// 엘레베이터를 1층 하강시킨다.
			k33_help = String.format("[%d] 층입니다.", k33_floor);	// 현재층 안내
		}
	}
	
	// 처음에 몇층인지 지정한다면 그만큼 올라가도록 한다.
	void k33_up(int k33_u) {	// 현재층을 받는다.
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0부터 입력받은 현재층까지 돌아가는 for문
			this.k33_up();	// 이 클래스의 k33_up함수로 이동, this를 사용하면 명확해진다.
		}
	}

	// 처음 몇층인지 지정한다면 그만큼 내려가도록 한다.
	void k33_down(int k33_u) {	// 현재층을 입력받는다
		for (int k33_i = 0; k33_i < k33_u; k33_i++) {	// 0부터 입력받은 현재층까지 돌아가는 for문
			k33_down();	// this를 사용하지 않은 경우
		}
	}
	
	void k33_msg(String k33_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d], 현재층[%d]\n",
				k33_id, k33_help, k33_limitUpFloor, k33_limitDownFloor, k33_floor);
		// 최대층, 최소층, 현재층을 출력한다.
	}
}
 