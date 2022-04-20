package java6강;

public class p12_Elevater4 extends p08_Elevater2 {

	void k33_Repair() {
		k33_help = String.format("수리중입니다.");
	}

	void k33_up() {	// 엘레베이터가 올라감
		if (k33_floor >= k33_limitUpFloor) { // 현재층이 최대층이면
			k33_help = "마지막층입니다.";	// 마지막층이라고 출력
		} else {	// 현재층이 최대층이 아니라면
			k33_floor = k33_floor + 2;	// 현재층에서 2층을 올라감
			k33_help = String.format("%d층입니다.", k33_floor);	// 현재층 출력
		}
		this.k33_down();	// 현재 클래스의 k33_down으로 이동
		// 이렇게 하면 2칸 올라가고 한칸 내려감
	}

	void k33_down() {	// 엘레베이터가 내려감
		super.k33_down();	// 아버지 클래스의 k33_down로 이동
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k33_help);
		// 클래스 안에서 출력되고 있음을 출력
	}
}
 