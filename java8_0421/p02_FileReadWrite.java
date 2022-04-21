package java8_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Buffered 읽고 쓰기

public class p02_FileReadWrite {
	
	public static void k33_FileWrite() throws IOException{
		// 파일에 내용을 입력하기 위한 메서드
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\test2.txt");
		// 새로 만들 파일의 위치와 파일명(test2.txt)을 지정해준다
		BufferedWriter k33_bw = new BufferedWriter(new FileWriter(k33_file));
		// 버퍼를 사용해서 파일에 내용을 입력해 본다.
		
		k33_bw.write("test2 안녕 파일");	// 파일에 내용입력
		k33_bw.newLine();	// 줄바꿈	
		k33_bw.write("heool 헬로");	// 파일에 내용입력
		k33_bw.newLine();	// 줄바꿈
		
		k33_bw.close();	// 파일을 닫는다
	}
	
	public static void k33_FileRead() throws IOException{
		// 파일을 읽기위한 메서드
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\test2.txt");
		// 읽을 파일을 지정한다
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// 버퍼를 사용해서 파일을 읽어보자
		String k33_readtxt;
		
		while((k33_readtxt = k33_br.readLine())!= null) {	
			// k33_readtxt에 k33_br.readLine()을 대입하고 이 값이 null이 아닐경우에
			System.out.printf("%s\n", k33_readtxt);	// k33_readtxt을 출력
		}
		
		k33_br.close(); // 파일을 닫는다
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		k33_FileWrite();	// k33_FileWrite 메서드로 이동
		k33_FileRead();		// k33_FileRead 메서드로 이동

	}
}
