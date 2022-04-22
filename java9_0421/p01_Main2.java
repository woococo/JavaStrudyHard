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

public class p01_Main2 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		// �ľ��� ���� �غ�
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� Ȯ����
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\501-10\\Desktop\\data\\java9\\queryDFS.xml"));
		// �ļ��� ��ũ���� �м��ϰ� �ʿ��� ���θ� �����Ͽ� ���ø����̼ǿ� �ѱ��
		Element k33_root = k33_doc.getDocumentElement();	// root �ױ׸� ������ ���⵵ ������ ������ ���̴� ���� ����
		// ������Ʈ�� HTMLCollection �� �־��� �±׸��� ��ȯ�Ѵ�
		NodeList k33_tag_001 = k33_doc.getElementsByTagName("data");
		
		String k33_seq = "";	//48�ð� �� ���° ���� ����Ŵ
		String k33_hour = "";	// ���׿��� 3�ð� ����
		String k33_day = "";	// 1��° �� (0:����, 1:����, 2:��)
		String k33_temp = "";	// ���� �ð��µ�
		String k33_tmx = "";	// �ְ�µ�
		String k33_tmn = "";	// �����µ�
		String k33_sky = "";	// �ϴ� �����ڵ� (1 : ����, 2: ��������, 3: ��������, 4:�帲)
		String k33_pty = "";	// ���� �����ڵ� (0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��)
		String k33_wfKor = "";	// ���� �ѱ���
		String k33_wfEn = "";	// ���� ����
		String k33_pop = "";	// ���� Ȯ�� %
		String k33_r12 = "";	// 12�ð� ���� ������
		String k33_s12 = "";	// 12�ð� ���� ������
		String k33_ws = "";		// ǳ��(m/s)
		String k33_wd = "";		// ǳ��(0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k33_wdKor = "";	// ǳ�� �ѱ���
		String k33_wdEn = "";	// ǳ�� ����
		String k33_reh = "";	// ���� %
		String k33_r06 = "";	// 6�ð� ���� ������
		String k33_s06 = "";	// 6�ð� ���� ������
		
		for (int k33_i = 0; k33_i < k33_tag_001.getLength(); k33_i++) {
			Element k33_elmt = (Element) k33_tag_001.item(k33_i);
			
			// ���� �������� �κ�
			k33_seq = k33_tag_001.item(k33_i).getAttributes().getNamedItem("seq").getNodeValue();	
			k33_hour = k33_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k33_day = k33_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k33_temp = k33_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k33_tmx = k33_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k33_tmn = k33_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k33_sky = k33_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k33_pty = k33_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k33_wfKor = k33_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k33_wfEn = k33_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k33_pop = k33_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k33_r12 = k33_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k33_s12 = k33_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k33_ws = k33_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k33_wd = k33_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k33_wdKor = k33_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k33_wdEn = k33_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k33_reh = k33_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k33_r06 = k33_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k33_s06 = k33_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			
			// ��� �κ�
			System.out.printf("************************ [%s��] ************************ \n", k33_seq); 
			System.out.printf("�ð� : %s\n", k33_hour); 
			System.out.printf("day : %s (0:����, 1:����, 2:��) \n", k33_day); 
			System.out.printf("���� �ð� �µ� : %s\n", k33_temp); 
			System.out.printf("�ְ� �µ� : %s\n", k33_tmx); 
			System.out.printf("���� �µ� : %s\n", k33_tmn); 
			System.out.printf("�ϴ� ���� : %s (1 : ����, 2: ��������, 3: ��������, 4:�帲) \n", k33_sky); 
			System.out.printf("���� ���� : %s (0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��) \n", k33_pty); 
			System.out.printf("���� : %s\n", k33_wfKor); 
			System.out.printf("weather : %s\n", k33_wfEn); 
			System.out.printf("���� Ȯ�� : %s\n", k33_pop); 
			System.out.printf("12�ð� ���� ������ : %s\n", k33_r12); 
			System.out.printf("12�ð� ���� ������ : %s\n", k33_s12); 
			System.out.printf("ǳ��(m/s) : %s\n", k33_ws); 
			System.out.printf("ǳ�� : %s (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�) \n", k33_wd); 
			System.out.printf("ǳ�� : %s\n", k33_wdKor); 
			System.out.printf("ǳ��(����) : %s\n", k33_wdEn); 
			System.out.printf("���� : %s\n", k33_reh); 
			System.out.printf("6�ð� ���� ������ : %s\n", k33_r06); 
			System.out.printf("6�ð� ���� ������ : %s\n", k33_s06); 
			System.out.println("********************************************************");
		}	
	}
}
