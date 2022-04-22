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
		// 파씽을 위한 준비
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml파일을 처리 PC안에 있어서 전체경로를 지정, xml 파싱처리 확시작
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\501-10\\Desktop\\data\\java9\\queryDFS.xml"));
		// 파서는 마크업을 분석하고 필요한 정부를 추출하여 애플리케이션에 넘긴다
		Element k33_root = k33_doc.getDocumentElement();	// root 테그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		// 엘리먼트의 HTMLCollection 과 주어진 태그명을 반환한다
		NodeList k33_tag_001 = k33_doc.getElementsByTagName("data");
		
		String k33_seq = "";	//48시간 중 몇번째 인지 가르킴
		String k33_hour = "";	// 동네예보 3시간 단위
		String k33_day = "";	// 1번째 날 (0:오늘, 1:내일, 2:모레)
		String k33_temp = "";	// 현재 시간온도
		String k33_tmx = "";	// 최고온도
		String k33_tmn = "";	// 최저온도
		String k33_sky = "";	// 하늘 상태코드 (1 : 맑음, 2: 구름조금, 3: 구름많음, 4:흐림)
		String k33_pty = "";	// 강수 상태코드 (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈)
		String k33_wfKor = "";	// 날씨 한국어
		String k33_wfEn = "";	// 날씨 영어
		String k33_pop = "";	// 강수 확률 %
		String k33_r12 = "";	// 12시간 예상 강수량
		String k33_s12 = "";	// 12시간 예상 적설량
		String k33_ws = "";		// 풍속(m/s)
		String k33_wd = "";		// 풍향(0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k33_wdKor = "";	// 풍향 한국어
		String k33_wdEn = "";	// 풍향 영어
		String k33_reh = "";	// 습도 %
		String k33_r06 = "";	// 6시간 예상 강수량
		String k33_s06 = "";	// 6시간 예상 적설량
		
		for (int k33_i = 0; k33_i < k33_tag_001.getLength(); k33_i++) {
			Element k33_elmt = (Element) k33_tag_001.item(k33_i);
			
			// 값을 가져오는 부분
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
			
			// 출력 부분
			System.out.printf("************************ [%s번] ************************ \n", k33_seq); 
			System.out.printf("시간 : %s\n", k33_hour); 
			System.out.printf("day : %s (0:오늘, 1:내일, 2:모레) \n", k33_day); 
			System.out.printf("현재 시간 온도 : %s\n", k33_temp); 
			System.out.printf("최고 온도 : %s\n", k33_tmx); 
			System.out.printf("최저 온도 : %s\n", k33_tmn); 
			System.out.printf("하늘 상태 : %s (1 : 맑음, 2: 구름조금, 3: 구름많음, 4:흐림) \n", k33_sky); 
			System.out.printf("강수 상태 : %s (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈) \n", k33_pty); 
			System.out.printf("날씨 : %s\n", k33_wfKor); 
			System.out.printf("weather : %s\n", k33_wfEn); 
			System.out.printf("강수 확률 : %s\n", k33_pop); 
			System.out.printf("12시간 예상 강수량 : %s\n", k33_r12); 
			System.out.printf("12시간 예상 적설량 : %s\n", k33_s12); 
			System.out.printf("풍속(m/s) : %s\n", k33_ws); 
			System.out.printf("풍향 : %s (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서) \n", k33_wd); 
			System.out.printf("풍향 : %s\n", k33_wdKor); 
			System.out.printf("풍향(영어) : %s\n", k33_wdEn); 
			System.out.printf("습도 : %s\n", k33_reh); 
			System.out.printf("6시간 예상 강수량 : %s\n", k33_r06); 
			System.out.printf("6시간 예상 적설량 : %s\n", k33_s06); 
			System.out.println("********************************************************");
		}	
	}
}
