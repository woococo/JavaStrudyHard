package java7��;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class p07_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList iAl = new ArrayList();

		iAl.add("abc");
		iAl.add("abcd");
		iAl.add("efga");
		iAl.add("������0");
		iAl.add("1234");
		iAl.add("12rk34");
		// iAl.add("356");

		System.out.printf("***************************************\n");
		System.out.printf("���� ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}

		iAl.set(3, "������");
		System.out.printf("***************************************\n");
		System.out.printf("���뺯�� ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
		
		iAl.remove(4);
		System.out.printf("***************************************\n");
		System.out.printf("���뺯�� ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
		
		iAl.sort(null);
		System.out.printf("***************************************\n");
		System.out.printf("����ƮSort ArraySize %d \n", iAl.size());
		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
		
		iAl.clear();
		System.out.printf("***************************************\n");
		System.out.printf("���� ���� ArraySize %d \n", iAl.size());
		for(int i = 0; i < iAl.size(); i++) {
			System.out.printf("ArraySize %d  = %s \n", i, iAl.get(i));
		}
	}
}