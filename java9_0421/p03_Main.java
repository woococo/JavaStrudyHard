package java9_0421;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// JSON�� �ľ��ϱ�

public class p03_Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser k33_parser = new JSONParser();
		// JSON �ľ�
		Object k33_obj = k33_parser.parse(new FileReader("C:\\Users\\501-10\\Desktop\\data\\java9\\jsonTast.json"));
		// jsonTast.json ������ �о �ľ�
		// JSONObject jsonObject = (JSONObject) obj;
		JSONArray k33_array = (JSONArray) k33_obj; // �����͸� ���� JSONArray�� ����
		
		System.out.println("***************");
		for(int k33_i = 0; k33_i < k33_array.size(); k33_i++) {	// k33_arrayũ�⸸ŭ ����Ǵ� for�� ����
			JSONObject k33_result = (JSONObject) k33_array.get(k33_i);	// k33_result���ٰ� k33_array ���� ���ʷ� ����
			System.out.println("�̸� : " + k33_result.get("name"));	// �̸��� ����Ѵ�
			System.out.println("�й� : " + k33_result.get("studentid"));	// �й��� ����Ѵ�
			
			JSONArray k33_score = (JSONArray) k33_result.get("score");	// k33_score�� �����ؼ� k33_result�� ���������͸� �����´�
			long k33_kor = (long)k33_score.get(0);	// ���������� k33_score�� 0��
			long k33_eng = (long)k33_score.get(1);	// ���������� k33_score�� 0��
			long k33_mat = (long)k33_score.get(2);	// ���������� k33_score�� 0��
			System.out.println("���� : " + k33_kor);	// �������� ���
			System.out.println("���� : " + k33_eng);	// �������� ���
			System.out.println("���� : " + k33_mat);	// �������� ���
			System.out.println("���� : " + (k33_kor + k33_eng + k33_mat));	// ���� ���� ���� ������ ���� ������ ���
			System.out.println("��� : " + (k33_kor + k33_eng + k33_mat)/3);	// ������ ������� ���� ����� ���
			System.out.println("***************");
			
		}
	}
}
