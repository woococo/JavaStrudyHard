package java6°­;

//Elevater2

public class p08_test {

	static p08_Elevater2 k33_elev1;
	static p08_Elevater2 k33_elev2;
	static p08_Elevater2 k33_elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k33_elev1 = new p08_Elevater2();		// ±âº» ¿¤·¹º£ÀÌÅÍ 
		k33_elev2 = new p08_Elevater2(20, 1, 8);	// ¸ÂÃã ¿¤·¹º£ÀÌÅÍ1 
		k33_elev3 = new p08_Elevater2(50, -3, 5);	// ¸ÂÃã ¿¤·¹º£ÀÌÅÍ2
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {
			k33_elev1.k33_up(); k33_elev1.k33_msg("1¹ø¿¤·¹ ÇÑÃş ¿À¸£±â");
			//k33_elev2.k33_up(); k33_elev2.k33_msg("2¹ø¿¤·¹ ÇÑÃş ¿À¸£±â");
			//k33_elev3.k33_up(); k33_elev3.k33_msg("3¹ø¿¤·¹ ÇÑÃş ¿À¸£±â");
		}
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {
			k33_elev1.k33_up(2); k33_elev1.k33_msg("1¹ø¿¤·¹ 2Ãş¾¿ ¿À¸£±â");
			//k33_elev2.k33_up(2); k33_elev2.k33_msg("2¹ø¿¤·¹ 2Ãş¾¿ ¿À¸£±â");
			//k33_elev3.k33_up(2); k33_elev3.k33_msg("3¹ø¿¤·¹ 2Ãş¾¿ ¿À¸£±â");
		}
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {
			k33_elev1.k33_down(3); k33_elev1.k33_msg("1¹ø¿¤·¹ 3Ãş¾¿ ¿À¸£±â");
			//k33_elev2.k33_down(3); k33_elev2.k33_msg("2¹ø¿¤·¹ 3Ãş¾¿ ¿À¸£±â");
			//k33_elev3.k33_down(3); k33_elev3.k33_msg("3¹ø¿¤·¹ 3Ãş¾¿ ¿À¸£±â");
		}
	}
}