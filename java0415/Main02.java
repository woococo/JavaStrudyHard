package java0415;

public class Main02 {

	// 1-2. case문

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k33_jumin = "123456-1234567";	// 문자형 변수 k33_jumin을 선언하고 123456-1234567을 대입한다.

		switch (k33_jumin.charAt(7)) {			// 문자열 k33_jumin에서 7번째 문자를 조건식에 입력한다.
		case '1':	// 값이 1일 경우
			System.out.println("20세기전에 태어난 남자 사람");	// "20세기전에 태어난 남자 사람"을 출력하고
			break;	// 멈춘다!
		case '2':	// 값이 2일 경우
			System.out.println("20세기전에 태어난 여자 사람");	// "20세기전에 태어난 여자 사람"을 출력하고
			break;	// 멈춘다!
		case '3':	// 값이 3일 경우
			System.out.println("20세기후에 태어난 남자 사람");	// "20세기후에 태어난 남자 사람"을 출력하고
			break;	// 멈춘다!
		case '4':	// 값이 4일 경우
			System.out.println("20세기후에 태어난 여자 사람");	// "20세기후에 태어난 여자 사람"을 출력하고
			break;	// 멈춘다!
		default:	// 조건식의 결과와 일치하는 case문이 없을 경우에는
			System.out.println("사람");	// "사람"을 출력한다.
			break;
		}
	}
}

/*
 * 
 * 1) if문에 대하여 설명하고 간단히 예를 드시오 if (조건식1) { 조건식1의 결과가 true일 때 수행될 문장들 } if else
 * (조건식2) { 조건식1의 결과는 false이고 조건식2에 true일때 수행될 문장들 } else { 모든 조건식의 결과가 false일때
 * 수행될 문장들 }
 * 
 * 2) case 문에 대하여 설명하고 간단히 예를 드시오(필기) switch(조건식) { case 값1 : 조건식의 결과가 값1과 같을 경우
 * 수행되는 문장 break; -> 해당 case문을 실행 한 뒤 switch문을 빠져나가기 위한 것 case 값2 : 조건식의 결과가 값2와
 * 같을 경우 수행되는 문장 break; -> 해당 case문을 실행 한 뒤 switch문을 빠져나가기 위한 것 default : 조건식이
 * 일치하는 case문이 없을 때 수행되는 문장 break; -> 해당 case문을 실행 한 뒤 switch문을 빠져나가기 위한 것
 * 
 * 3) 기본과 복합for문에 대하여 설명하고 간단히 예를 드시오(필기) for (초기치; 조건문; 증가치){
 * 
 * 
 * 4) while 문 에 대하여 설명하고 간단히 예를 드시오(필기) 5) For문과 while문의 변환관계를 설명하고 간단히 예를
 * 드시오(필기) 6) break문과 continue문을 설명하고 간단히 예를 드시오(필기) 7) 배열의 선언,생성,초기화에 대하여 예를 들어
 * 설명하시오(필기)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
