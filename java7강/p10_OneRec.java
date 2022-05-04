package java7°­;

public class p10_OneRec {

	private int k33_studentId;
	private String k33_name;
	private int k33_kor;
	private int k33_eng;
	private int k33_mat;

	public p10_OneRec(int k33_studentId, String k33_name, int k33_kor, int k33_eng, int k33_mat) {
		this.k33_studentId = k33_studentId;
				this.k33_name = k33_name;
				this.k33_kor = k33_kor;
				this.k33_eng = k33_eng;
				this.k33_mat = k33_mat;
	}
	
	public int k33_studentId() {
		return this.k33_studentId;
	}
	
	public String k33_name() {
		return this.k33_name;
	};

	public int k33_kor() {
		return this.k33_kor;
	}

	public int k33_eng() {
		return this.k33_eng;
	}

	public int k33_mat() {
		return this.k33_mat;
	}

	public int k33_sum() {
		return this.k33_kor + this.k33_eng + this.k33_mat;
	}

	public double k33_ave() {
		return this.k33_sum() / 3.0;

	}
}
