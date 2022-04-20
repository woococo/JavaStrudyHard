package java6강;

// 클래스, 객체, 인스턴스(1)

public class p04_Elevater1 {

	int k33_limitUpFloor = 10;	// 최대층
	int k33_limitDownFloor = 0; // 최저층
	int k33_floor = 1; 			// 현재층
	String k33_help; 			// 출력될 안내문

	void k33_up() { 	// 엘레베이터가 상승
		if (k33_floor == k33_limitUpFloor) { 	// 현재층이 최대층이면
			k33_help = "마지막층입니다."; 	// 마지막층이라고 안내
		} else {	// 현재층이 최대층이 아니라면
			k33_floor++;	// 현재층수를 하나씩 증가시킨다.
			k33_help = String.format("%d층입니다", k33_floor);	// 현재층수를 안내
		}
	}

	void k33_down() {	// 엘레베이터가 하강
		if (k33_floor == k33_limitDownFloor) {	// 현재층이 최저층이면
			k33_help = "처음층입니다.";	// 처음층이라고 안내
		} else {	// 현재층이 최저층이 아니라면
			k33_floor--;	// 현재층수를 하니씩 감소시킨다.
			k33_help = String.format("%d층입니다.", k33_floor);	// 현재층수를 안내
		}
	}
}





