package java7강;

import java.util.ArrayList;

public class p09_Main {

	public class OneRec {
		private int student_id;
		private String name;
		private int kor;
		private int eng;
		private int mat;

		public OneRec(int student_id, String name, int kor, int eng, int mat) {
			this.student_id = student_id;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}

		public int student_id() {
			return this.student_id;
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
			return this.sum() / 3.0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();
		HeaderPrint();
		for (int i = 0; i < ArrayOneRec.size(); i++) {
			Itemprint(i);
			TailPrint();
		}
	}

	static ArrayList<OneRec> ArrayOneRec = new ArrayList<OneRec>();

	static int sumkor = 0;
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static int iPerson = 20;

	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			ArrayOneRec.add(new OneRec(i, name, kor, eng, mat));
		}
	}
	
	public static void HeaderPrint() {
		for (int i = 0; i < iPerson; i++) {
			System.out.printf("***********************************\n");
			System.out.printf("%2s %4s %2s %2s %2s %2s %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
			System.out.printf("***********************************\n");
		}
	}
	
	public static void Itemprint(int i) {
		OneRec rec;
		 rec = ArrayOneRec.get(i);
		 System.out.printf("%4d %4s %3d %3d %3d  %3d %6.2f \n", rec.student_id(), rec.name(), rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		 sumkor += rec.kor();
		 sumeng += rec.eng();
		 summat += rec.mat();
		 sumsum += rec.sum();
		 sumave += rec.ave();
	}

	public static void TailPrint() {
		System.out.printf("***********************************\n");
		System.out.printf("국어합계 %d   국어평균: %6.2f\n", sumkor, sumkor / (double) ArrayOneRec.size());
		System.out.printf("영어합계 %d   영어평균: %6.2f\n", sumeng, sumeng / (double) ArrayOneRec.size());
		System.out.printf("수학합계 %d   수학평균: %6.2f\n", summat, summat / (double) ArrayOneRec.size());
		System.out.printf("***********************************\n");
		System.out.printf("반평균합계 %d 반평균 : %6.2f\n", sumave, sumave / (double) ArrayOneRec.size());
	}
}
