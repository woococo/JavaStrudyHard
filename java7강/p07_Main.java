package java7강;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class p07_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k33_iAl = new ArrayList(); //  k33_iAl라는 ArrayList를 생성한다

		k33_iAl.add("abc");	// k33_iAl에 "abc"를 추가
		k33_iAl.add("abcd"); // k33_iAl에 "abcd"를 추가
		k33_iAl.add("efga"); // k33_iAl에 "efga"를 추가
		k33_iAl.add("가나다0"); // k33_iAl에 "가나다0"를 추가
		k33_iAl.add("1234"); // k33_iAl에 "1234"를 추가
		k33_iAl.add("12rk34"); // k33_iAl에 "12rk34"를 추가
		// iAl.add("356"); // k33_iAl를 스트링으로 쓰려고 하기 때문에 숫자를 넣으면 안된다.

		System.out.printf("***************************************\n");
		System.out.printf("시작 ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}

		k33_iAl.set(3, "가라라라"); // 3번 내용 변경
		System.out.printf("***************************************\n");
		System.out.printf("내용변경 ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
		
		k33_iAl.remove(4); // 4번 삭제
		System.out.printf("***************************************\n");
		System.out.printf("내용변경 ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
		
		k33_iAl.sort(null); // 정렬
		System.out.printf("***************************************\n");
		System.out.printf("리스트Sort ArraySize %d \n", k33_iAl.size());
		for (int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
		
		k33_iAl.clear(); // 삭제
		System.out.printf("***************************************\n");
		System.out.printf("전부 삭제 ArraySize %d \n", k33_iAl.size());
		for(int k33_i = 0; k33_i < k33_iAl.size(); k33_i++) {
			System.out.printf("ArraySize %d  = %s \n", k33_i, k33_iAl.get(k33_i));
		}
	}
}