package java9_0421;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// JSON을 파씽하기

public class p03_Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser k33_parser = new JSONParser();
		// JSON 파씽
		Object k33_obj = k33_parser.parse(new FileReader("C:\\Users\\501-10\\Desktop\\data\\java9\\jsonTast.json"));
		// jsonTast.json 파일을 읽어서 파씽
		// JSONObject jsonObject = (JSONObject) obj;
		JSONArray k33_array = (JSONArray) k33_obj; // 데이터를 담을 JSONArray을 선언
		
		System.out.println("***************");
		for(int k33_i = 0; k33_i < k33_array.size(); k33_i++) {	// k33_array크기만큼 실행되는 for문 생성
			JSONObject k33_result = (JSONObject) k33_array.get(k33_i);	// k33_result에다가 k33_array 값을 차례로 저장
			System.out.println("이름 : " + k33_result.get("name"));	// 이름을 출력한다
			System.out.println("학번 : " + k33_result.get("studentid"));	// 학번을 출력한다
			
			JSONArray k33_score = (JSONArray) k33_result.get("score");	// k33_score를 선언해서 k33_result의 점수데이터를 가져온다
			long k33_kor = (long)k33_score.get(0);	// 국여점수는 k33_score의 0번
			long k33_eng = (long)k33_score.get(1);	// 영어점수는 k33_score의 0번
			long k33_mat = (long)k33_score.get(2);	// 수학점수는 k33_score의 0번
			System.out.println("국어 : " + k33_kor);	// 국어점수 출력
			System.out.println("영어 : " + k33_eng);	// 영어점수 출력
			System.out.println("수학 : " + k33_mat);	// 수학점수 출력
			System.out.println("총점 : " + (k33_kor + k33_eng + k33_mat));	// 국어 영어 수학 점수를 더한 총점을 출력
			System.out.println("평균 : " + (k33_kor + k33_eng + k33_mat)/3);	// 총점을 과목수로 나눈 평균을 출력
			System.out.println("***************");
			
		}
	}
}
