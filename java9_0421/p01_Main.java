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
		// �ľ��� ���� �غ�
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� Ȯ����
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\501-10\\Desktop\\data\\java9\\score.xml"));
		// �ļ��� ��ũ���� �м��ϰ� �ʿ��� ���θ� �����Ͽ� ���ø����̼ǿ� �ѱ��
		Element k33_root = k33_doc.getDocumentElement();	// root �ױ׸� ������ ���⵵ ������ ������ ���̴� ���� ����
		// ������Ʈ�� HTMLCollection �� �־��� �±׸��� ��ȯ�Ѵ�
		
		NodeList k33_tag_name = k33_doc.getElementsByTagName("name");	// tag_name�� �����ϰ� �̸� ������Ʈ�� �����´�
		NodeList k33_tag_studentid = k33_doc.getElementsByTagName("studentid");	// tag_studentid�� �����ϰ� �й� ������Ʈ�� �����´�
		NodeList k33_tag_kor = k33_doc.getElementsByTagName("kor");	// tag_kor�� �����ϰ� ���� ���� ������Ʈ�� �����´�
		NodeList k33_tag_eng = k33_doc.getElementsByTagName("eng");	// tag_eng�� �����ϰ� ���� ���� ������Ʈ�� �����´� 
		NodeList k33_tag_mat = k33_doc.getElementsByTagName("mat");	// tag_mat�� �����ϰ� ���� ���� ������Ʈ�� �����´�
		
		System.out.println("***************");
		for(int i = 0; i < k33_tag_name.getLength(); i++) {
			System.out.printf("�̸� : %s\n", k33_tag_name.item(i).getFirstChild().getNodeValue()); // �̸��� ���
			System.out.printf("�й� : %s\n", k33_tag_studentid.item(i).getFirstChild().getNodeValue());	// �й��� ���
			System.out.printf("���� : %s\n", k33_tag_kor.item(i).getFirstChild().getNodeValue());	// ���������� ���
			System.out.printf("���� : %s\n", k33_tag_eng.item(i).getFirstChild().getNodeValue());	// ���������� ���
			System.out.printf("���� : %s\n", k33_tag_mat.item(i).getFirstChild().getNodeValue());	// ���������� ���
			System.out.println("***************");
		}	
	}
}
