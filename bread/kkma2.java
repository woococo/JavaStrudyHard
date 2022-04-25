package bread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;
import org.snu.ids.kkma.ma.MExpression;
import org.snu.ids.kkma.ma.MorphemeAnalyzer;
import org.snu.ids.kkma.ma.Sentence;
import org.snu.ids.kkma.util.Timer;

public class kkma2 {

	static String city = "Busan";
	
	static ArrayList<String> word = new ArrayList<>();
	static ArrayList<Integer> cnt = new ArrayList<>();

	public static void FileWrite() throws IOException {
		File file = new File("C:\\Users\\501-10\\Desktop\\data\\bread\\" + city +"Data.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		for (int i = 0; i < word.size(); i++) {
			bw.write(word.get(i));
			bw.write(",");
			bw.write(String.valueOf(cnt.get(i)));
			
			bw.newLine();
		}
		bw.close();
	}

	public static void FileRead() throws IOException {
		File file = new File("C:\\Users\\501-10\\Desktop\\data\\bread\\" + city + ".csv");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String readtxt;

		while ((readtxt = br.readLine()) != null) {
			readtxt.trim();

			System.out.printf("%s\n", readtxt);
			// maTest(readtxt);
			keTest(readtxt);
		}
		br.close();
	}

	public static void main(String[] args) throws IOException {
		FileRead();
		FileWrite();
	}

	public static void maTest(String string) {
		try {
			MorphemeAnalyzer ma = new MorphemeAnalyzer();
			ma.createLogger(null);
			Timer timer = new Timer();
			timer.start();
			List<MExpression> ret = ma.analyze(string);
			timer.stop();
			timer.printMsg("Time");

			ret = ma.postProcess(ret);

			ret = ma.leaveJustBest(ret);

			List<Sentence> stl = ma.divideToSentences(ret);
			for (int i = 0; i < stl.size(); i++) {
				Sentence st = stl.get(i);
				System.out.println("=============================================  " + st.getSentence());
				for (int j = 0; j < st.size(); j++) {
					System.out.println(st.get(j));
				}
			}

			ma.closeLogger();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void keTest(String strToExtrtKwrd) throws IOException {
		KeywordExtractor ke = new KeywordExtractor();
		KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);

		for (int i = 0; i < kl.size(); i++) {
			Keyword kwrd = kl.get(i);
			System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());

			word.add(kwrd.getString());
			cnt.add(kwrd.getCnt());
		}
	}
}