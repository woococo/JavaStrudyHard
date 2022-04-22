package java9_0421;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class p02_Main {

	public static JSONObject k33_oneRec(String k33_name, int k33_studentid, int k33_kor, int k33_eng, int k33_mat) {
		// 이름, 학번, 국어점수, 영어점수, 수학점수를 받아서 k33_dataObject에 저장하고 리턴하는 메서드
		JSONObject k33_dataObject = new JSONObject();	// JSONObject를 생성
		k33_dataObject.put("name", k33_name); // k33_dataObject에 이름을 저장
		k33_dataObject.put("studentid", k33_studentid);	// k33_dataObject에 학번을 저장
		JSONArray k33_score = new JSONArray();	// 각 학생들의 성적의 JSON정보를 담을 JSONArray 생성
		k33_score.add(k33_kor);	// k33_score Array에 국어 점수를 추가
		k33_score.add(k33_eng);	// k33_score Array에 영어 점수를 추가
		k33_score.add(k33_mat);	// k33_score Array에 수학 점수를 추가
		k33_dataObject.put("score", k33_score);	// JSONObject에 점수를 저장

		return k33_dataObject;	// k33_dataObject을 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject k33_JSONObject = new JSONObject();	// 최종 완성될 JSONObject 생성
		JSONArray k33_datasArray = new JSONArray();		// 각 학생들의 성적의 JSON정보를 담을 JSONArray 생성
		JSONObject k33_dataObject = new JSONObject();	// 한명의 데이터를 담을 JSONObject 생성
		k33_dataObject.put("name", "나연");	// k33_dataObject에 이름을 저장
		k33_dataObject.put("studentid", 209901);	// k33_dataObject에 학번을 저장
		JSONArray k33_score = new JSONArray();	// 	점수를 담을 JSON Array 생성
		k33_score.add(90);	// k33_score에 국어 점수 추가
		k33_score.add(100);	// k33_score에 영어 점수 추가
		k33_score.add(95);	// k33_score에 수학 점수 추가
		k33_dataObject.put("score", k33_score);	// k33_dataObject에 점수 저장
		k33_datasArray.add(k33_dataObject);	// k33_datasArray에 k33_dataObject를 저장
		
		// 위에 27~34까지의 과정이 반복되므로 k33_oneRec 메소드를 만들어서 값만 넣어주도록 한다
		k33_datasArray.add(k33_oneRec("정연", 209902, 100, 85, 75));
		k33_datasArray.add(k33_oneRec("모모", 209903, 90, 75, 85));
		k33_datasArray.add(k33_oneRec("사나", 209904, 90, 85, 75));
		k33_datasArray.add(k33_oneRec("지효", 209905, 80, 75, 85));
		k33_datasArray.add(k33_oneRec("미나", 209906, 90, 85, 55));
		k33_datasArray.add(k33_oneRec("다연", 209907, 70, 75, 65));
		k33_datasArray.add(k33_oneRec("채영", 209908, 100, 75, 95));
		k33_datasArray.add(k33_oneRec("쯔위", 209909, 80, 65, 95));
	
		try { // 예외 처리를 하기 위한 try/catch문을 생성, 에러가 발생하지 않는다면
			FileWriter k33_file = new FileWriter("C:\\Users\\501-10\\Desktop\\data\\java9\\jsonTast.json");
			// jsonTast.Json파일을 만들어서 내용을 입력
			k33_file.write(k33_datasArray.toJSONString());	// k33_file에 k33_datasArray 내용을 입력한다
			k33_file.flush();	//k33_file을 flush한다
			k33_file.close();	// k33_file을 닫는다
		} catch(IOException e) {	// 오류가 발생하면
			e.printStackTrace();	// 오류를 출력
		}
		
		System.out.println("JSON 만든거 : " + k33_datasArray);	// k33_datasArray을 출력한다
	}
}
