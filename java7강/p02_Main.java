package java7��;

import java.text.DecimalFormat;

public class p02_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] OneRec = { 
				"01	 ����Ȩ SAFE365     75,000  2    150,000", 
				"02	 (G)LH��������ȭ    69,000  6    414,000",
				"03	 ��������E       5,980,200  8 47,841,600", 
				"04	 ���� ���Ϸ�      33,000  1     33,000",
				"05	 ����Ȩ SAFE ��     55,000 20  1,100,000", 
				"06	 ��� �Ŷ�� 120    33,800  1     33,800",
				"07* (��)��������     66,100  5    330,500", 
				"08	 ���ѱ� �������    27,500  2     55,000",
				"09* GAP ������ 4-   118,000 99 11,682,100", 
				"10* �� ����� �ٳ�     49,800  1     49,800",
				"11	 ����ũ ź�θ�      24,800  4     99,200", 
				"12	 (����)����߰�     79,200  1     79,200",
				"13	 DZ�ִϾ�縻3��    49,800  3    149,400", 
				"14	 DZ�ִϾ�縻3��    49,080 50  2,451,050",
				"15	 �����̾�������     71,300  2    142,600", 
				"16	 ����ũ ����̿�    39,800  1     39,800", 
				"17* ���� ���ִ¿���    44,800  1     44,800",
				"18	 ���������÷�1    49,800  2     99,600",
				"19	 ��������(��)6    32,100  1     12,100", 
				"20	 �ɶ�ý� ����      69,500  1     69,500",
				"21	 Ǫ���� �̼�����    29,800  2     59,600", 
				"22	 ���Ϸν�������     19,900  1     19,900",
				"23	 CJ ����Ĩ 20G    19,800  1     19,800", 
				"24	 ����ũ ����̿�    39,800  1     39,800",
				"25	 ����� ���� ��     44,800  1     44,800", 
				"26* 1+ ��޶� 10��     34,800  2     69,600",
				"27	 ������ݺ�����    790,800  1    790,800" };

		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");

		for (int i = 0; i < OneRec.length; i++) {
			int price = Integer.parseInt((new String(OneRec[i].getBytes(), 20, 9)).replaceAll(",", "").trim());
			int amount = Integer.parseInt((new String(OneRec[i].getBytes(), 30, 2)).replaceAll(",", "").trim());
			int sum = Integer.parseInt((new String(OneRec[i].getBytes(), 33, 10)).replaceAll(",", "").trim());
			if (sum != price * amount) {
				System.out.printf("%s\n", "*************************************************");
				System.out.printf("%s[%s]\n", "����", OneRec[i]);
				System.out.printf("%s[%s%10s]\n", "����", (new String(OneRec[i].getBytes(), 0, 33)),
						k33_df.format(price * amount));
				System.out.printf("%s\n", "*************************************************");
			}
		}
	}
}


