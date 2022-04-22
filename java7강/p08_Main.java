package java7°­;

import java.util.ArrayList;

public class p08_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iTestMAX = 1000000;
		ArrayList iAl = new ArrayList();

		for (int i = 0; i < iTestMAX; i++) {
			iAl.add((int) (Math.random() * 1000000));
		}

		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf(" ArrayList %d = %d\n", i, iAl.get(i));
		}

		System.out.printf("******************************\n");
		iAl.sort(null);

		for (int i = 0; i < iAl.size(); i++) {
			System.out.printf(" ArrayList %d = %d \n", i, iAl.get(i));
		}
	}

}
