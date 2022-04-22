package java9_0421;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class p01_Main {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		// 파씽을 위한 준비
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml파일을 처리 PC안에 있어서 전체경로를 지정, xml 파싱처리 확시작
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\501-10\\Desktop\\data\\java9\\score.xml"));
		// 파서는 마크업을 분석하고 필요한 정부를 추출하여 애플리케이션에 넘긴다
		Element k33_root = k33_doc.getDocumentElement();	// root 테그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		// 엘리먼트의 HTMLCollection 과 주어진 태그명을 반환한다
		
		NodeList k33_tag_name = k33_doc.getElementsByTagName("name");	// tag_name을 선언하고 이름 엘리먼트를 가져온다
		NodeList k33_tag_studentid = k33_doc.getElementsByTagName("studentid");	// tag_studentid를 선언하고 학번 엘리먼트를 가져온다
		NodeList k33_tag_kor = k33_doc.getElementsByTagName("kor");	// tag_kor를 선언하고 국어 점수 엘리먼트를 가져온다
		NodeList k33_tag_eng = k33_doc.getElementsByTagName("eng");	// tag_eng를 선언하고 영어 점수 엘리먼트를 가져온다 
		NodeList k33_tag_mat = k33_doc.getElementsByTagName("mat");	// tag_mat를 선언하고 수학 점수 엘리먼트를 가져온다
		
		System.out.println("***************");
		for(int i = 0; i < k33_tag_name.getLength(); i++) {
			System.out.printf("이름 : %s\n", k33_tag_name.item(i).getFirstChild().getNodeValue()); // 이름을 출력
			System.out.printf("학번 : %s\n", k33_tag_studentid.item(i).getFirstChild().getNodeValue());	// 학번을 출력
			System.out.printf("국어 : %s\n", k33_tag_kor.item(i).getFirstChild().getNodeValue());	// 국어점수를 출력
			System.out.printf("영어 : %s\n", k33_tag_eng.item(i).getFirstChild().getNodeValue());	// 영어점수를 출력
			System.out.printf("수학 : %s\n", k33_tag_mat.item(i).getFirstChild().getNodeValue());	// 수학점수를 출력
			System.out.println("***************");
		}	
	}
}
