package java7강;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class p07_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList iAl = new ArrayList();

		iAl.add("abc");
		iAl.add("abcd");
		iAl.add("efga");
		iAl.add("가나다0");
		iAl.add("1234");
		iAl.add("12rk34");
		// iAl.add("356");

		System.out.printf("***************************************\n");
		System.out.printf("시작 ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}

		iAl.set(3, "가라라라");
		System.out.printf("***************************************\n");
		System.out.printf("내용변경 ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
		
		iAl.remove(4);
		System.out.printf("***************************************\n");
		System.out.printf("내용변경 ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
		
		iAl.sort(null);
		System.out.printf("***************************************\n");
		System.out.printf("리스트Sort ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
		
		iAl.clear();
		System.out.printf("***************************************\n");
		System.out.printf("전부 삭제 ArraySize %d \n", iAl.size());
		for(int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
	}
}