package bread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;
import org.snu.ids.kkma.ma.MExpression;
import org.snu.ids.kkma.ma.MorphemeAnalyzer;
import org.snu.ids.kkma.ma.Sentence;
import org.snu.ids.kkma.util.Timer;

public class bread {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";

	static String busan = "부산 빵 맛집";
	static String seoul = "서울 빵 맛집";
	static String gyeonggi = "경기 빵 맛집";

	public static void main(String[] args) throws IOException {
		busanFile();
		seoulFile();
		gyeonggiFile();
	}

	public static void busanFile() throws IOException {
		File file = new File("C:\\Users\\501-10\\Desktop\\data\\bread\\Busan.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		ArrayList<String> titleArr = crawlingBread(busan);

		for (int i = 0; i < titleArr.size(); i++) {
			bw.write(titleArr.get(i));
			// bw.newLine();
		}
		bw.close();
	}

	public static void seoulFile() throws IOException {
		File file = new File("C:\\Users\\501-10\\Desktop\\data\\bread\\Seoul.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		ArrayList<String> titleArr = crawlingBread(seoul);

		for (int i = 0; i < titleArr.size(); i++) {
			bw.write(titleArr.get(i));
			// bw.newLine();
		}
		bw.close();
	}

	public static void gyeonggiFile() throws IOException {
		File file = new File("C:\\Users\\501-10\\Desktop\\data\\bread\\Gyeonggi.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		ArrayList<String> titleArr = crawlingBread(gyeonggi);

		for (int i = 0; i < titleArr.size(); i++) {
			bw.write(titleArr.get(i));
			// bw.newLine();
		}
		bw.close();
	}

	public static ArrayList<String> crawlingBread(String city) {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		ArrayList<String> titleArr = new ArrayList<String>();

		driver.get("https://www.naver.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// 검색창 클릭
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// 검색어 키워드 입력
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
				.sendKeys(city);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// 돋보기 클릭
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button/span[2]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// VIEW 클릭
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/ul/li[2]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// 옵션 클릭
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div/div[3]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// 1년 클릭
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div[1]/a[8]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated
		}

		// 제목 긁어오기
		String title = "";
		int max = 100;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		          
		for (int i = 1; i < max + 1; i++) {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			title = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div[1]/div/a"))
					.getText();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated
			}

			titleArr.add(title);
			System.out.println(title);
			
			// maTest(title);
			// keTest(title);
		}
		return titleArr;
	}
}
