package java0418_5;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k33_firstDay = 5; // 2022년 1월 1일은 토요일이지만 교안에 금요일이라고 나와 있어서. 5로 설정한다.
		int [] k33_end = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 정수 배열 k33_end를 선언해서 매 달의 마지막 날을 입력한다.
	
		for (int k33_mon = 0; k33_mon < 12; k33_mon++) {	// k33_mon가 0부터 11까지 순차적으로 실행되는 for문을 생성한다.
			System.out.printf("\n\n\t%d월\n", k33_mon + 1);	
			System.out.println("=====================");
			System.out.println(" 일 월 화 수 목 금 토");
			
			for (int k33_i = 0; k33_i < k33_firstDay; k33_i++) {
				System.out.print("   "); // 첫날까지 날짜를 빈칸으로 출력해준다.
			}
			
			for (int k33_j = 1; k33_j <= k33_end[k33_mon]; k33_j++) {	 // 날짜를 출력하기 위해서 배열 k33_end에서 해당 달의 값을 가져오고 그 값까지 출력을 해준다.
				System.out.printf(" %2d", k33_j);
				k33_firstDay++;	// 다음달의 첫날을 계산하기 위해서 1일씩 출력될때마다 1을 더해준다.
				if (k33_firstDay % 7 == 0) {	// k33_firstDay가 7로 나눴을때 나머지가 0인 경우에는 다음주로 넘어가는 날이기 때문에 줄바꿈을 해준다.
					System.out.println("");
				}
			}
			k33_firstDay = k33_firstDay % 7;	// 다음달의 첫쨋날을 1씩 계속해서 추가된 k33_firstDay을 7로 나눈 나머지에 해당한다.
		}
	}
}
