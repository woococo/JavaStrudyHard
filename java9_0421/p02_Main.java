package java9_0421;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class p02_Main {

	public static JSONObject k33_oneRec(String k33_name, int k33_studentid, int k33_kor, int k33_eng, int k33_mat) {
		// �̸�, �й�, ��������, ��������, ���������� �޾Ƽ� k33_dataObject�� �����ϰ� �����ϴ� �޼���
		JSONObject k33_dataObject = new JSONObject();	// JSONObject�� ����
		k33_dataObject.put("name", k33_name); // k33_dataObject�� �̸��� ����
		k33_dataObject.put("studentid", k33_studentid);	// k33_dataObject�� �й��� ����
		JSONArray k33_score = new JSONArray();	// �� �л����� ������ JSON������ ���� JSONArray ����
		k33_score.add(k33_kor);	// k33_score Array�� ���� ������ �߰�
		k33_score.add(k33_eng);	// k33_score Array�� ���� ������ �߰�
		k33_score.add(k33_mat);	// k33_score Array�� ���� ������ �߰�
		k33_dataObject.put("score", k33_score);	// JSONObject�� ������ ����

		return k33_dataObject;	// k33_dataObject�� ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject k33_JSONObject = new JSONObject();	// ���� �ϼ��� JSONObject ����
		JSONArray k33_datasArray = new JSONArray();		// �� �л����� ������ JSON������ ���� JSONArray ����
		JSONObject k33_dataObject = new JSONObject();	// �Ѹ��� �����͸� ���� JSONObject ����
		k33_dataObject.put("name", "����");	// k33_dataObject�� �̸��� ����
		k33_dataObject.put("studentid", 209901);	// k33_dataObject�� �й��� ����
		JSONArray k33_score = new JSONArray();	// 	������ ���� JSON Array ����
		k33_score.add(90);	// k33_score�� ���� ���� �߰�
		k33_score.add(100);	// k33_score�� ���� ���� �߰�
		k33_score.add(95);	// k33_score�� ���� ���� �߰�
		k33_dataObject.put("score", k33_score);	// k33_dataObject�� ���� ����
		k33_datasArray.add(k33_dataObject);	// k33_datasArray�� k33_dataObject�� ����
		
		// ���� 27~34������ ������ �ݺ��ǹǷ� k33_oneRec �޼ҵ带 ���� ���� �־��ֵ��� �Ѵ�
		k33_datasArray.add(k33_oneRec("����", 209902, 100, 85, 75));
		k33_datasArray.add(k33_oneRec("���", 209903, 90, 75, 85));
		k33_datasArray.add(k33_oneRec("�糪", 209904, 90, 85, 75));
		k33_datasArray.add(k33_oneRec("��ȿ", 209905, 80, 75, 85));
		k33_datasArray.add(k33_oneRec("�̳�", 209906, 90, 85, 55));
		k33_datasArray.add(k33_oneRec("�ٿ�", 209907, 70, 75, 65));
		k33_datasArray.add(k33_oneRec("ä��", 209908, 100, 75, 95));
		k33_datasArray.add(k33_oneRec("����", 209909, 80, 65, 95));
	
		try { // ���� ó���� �ϱ� ���� try/catch���� ����, ������ �߻����� �ʴ´ٸ�
			FileWriter k33_file = new FileWriter("C:\\Users\\501-10\\Desktop\\data\\java9\\jsonTast.json");
			// jsonTast.Json������ ���� ������ �Է�
			k33_file.write(k33_datasArray.toJSONString());	// k33_file�� k33_datasArray ������ �Է��Ѵ�
			k33_file.flush();	//k33_file�� flush�Ѵ�
			k33_file.close();	// k33_file�� �ݴ´�
		} catch(IOException e) {	// ������ �߻��ϸ�
			e.printStackTrace();	// ������ ���
		}
		
		System.out.println("JSON ����� : " + k33_datasArray);	// k33_datasArray�� ����Ѵ�
	}
}
