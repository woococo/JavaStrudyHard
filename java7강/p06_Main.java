package java7��;

public class p06_Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iPerson = 5;
		
		p06_OneRec [] inData = new p06_OneRec[iPerson];
		
		inData[0] = new p06_OneRec("ȫ��01", 100, 100, 90);
		inData[1] = new p06_OneRec("ȫ��02", 90, 90, 90);
		inData[2] = new p06_OneRec("ȫ��03", 80, 70, 90);
		inData[3] = new p06_OneRec("ȫ��04", 70, 60, 90);
		inData[4] = new p06_OneRec("ȫ��05", 60, 100, 90);
		
		for (int i = 0; i < iPerson; i++) {
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %2d, ���� : %2d, ���� : %2d, ���� : %3d, ��� : %f\n",
					i, inData[i].name(), inData[i].kor(), inData[i].eng(), inData[i].mat(), inData[i].sum(), inData[i].ave());
		}
		
	
	}
}
