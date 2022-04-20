package java6강;

public class p07_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k33_name = "폴리융";	// 

		p07_score Main08_A = new p07_score();
		System.out.println("3월 성적표");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("=================================================");
		System.out.printf("%s%6d%6d%6d%6d%7.1f\n\n", k33_name, 100, 100, 100, 
				Main08_A.k33_sum(100, 100, 100), (Main08_A.k33_ave(100, 100, 100)));
		System.out.println("4월 성적표");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균");
		System.out.println("=================================================");
		System.out.printf("%s%6d%6d%6d%6d%6d%7.1f\n\n", k33_name, 100, 100, 100, 100, 
				Main08_A.k33_sum(100, 100, 100, 100), (Main08_A.k33_ave(100, 100, 100, 100)));
		System.out.println("5월 성적표");
		System.out.println("=================================================");
		System.out.printf("%s%6s%4s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
		System.out.println("=================================================");
		System.out.printf("%s%6d%6d%6d%6d%6d%6d%7.1f\n", k33_name, 100, 100, 100, 100, 100,
				Main08_A.k33_sum(100, 100, 100, 100, 100), (Main08_A.k33_ave(100, 100, 100, 100, 100)));
	}
}
