package java7°­;

public class p06_Main {

	private String name;
	private int kor;
	private int eng;
	private int mat;

	public void OneRec(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String name() {
		return this.name;
	};
	public int kor() {
		return this.kor;
	}
	public int eng() {
		return this.eng;
	}
	public int mat() {
		return this.mat;
	}
	public int sum() {
		return this.kor + this.eng + this.mat;
	}
	public double ave() {
		return this.sum()/3.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iPerson = 5;
		
		OneRec [] inData = new OneRed[iPerson];
		inData[0] = new OneRec("È«±æ01", 100, 100, 90);
		inData[1] = new OneRec("È«±æ02", 90, 90, 90);
		inData[2] = new OneRec("È«±æ03", 80, 70, 90);
		inData[3] = new OneRec("È«±æ04", 70, 60, 90);
		inData[4] = new OneRec("È«±æ05", 60, 100, 90);
	
	}
}
