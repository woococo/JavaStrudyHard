package java8_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Buffered �а� ����

public class p02_FileReadWrite {
	
	public static void k33_FileWrite() throws IOException{
		// ���Ͽ� ������ �Է��ϱ� ���� �޼���
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\test2.txt");
		// ���� ���� ������ ��ġ�� ���ϸ�(test2.txt)�� �������ش�
		BufferedWriter k33_bw = new BufferedWriter(new FileWriter(k33_file));
		// ���۸� ����ؼ� ���Ͽ� ������ �Է��� ����.
		
		k33_bw.write("test2 �ȳ� ����");	// ���Ͽ� �����Է�
		k33_bw.newLine();	// �ٹٲ�	
		k33_bw.write("heool ���");	// ���Ͽ� �����Է�
		k33_bw.newLine();	// �ٹٲ�
		
		k33_bw.close();	// ������ �ݴ´�
	}
	
	public static void k33_FileRead() throws IOException{
		// ������ �б����� �޼���
		File k33_file = new File("C:\\Users\\501-10\\Desktop\\data\\java8\\test2.txt");
		// ���� ������ �����Ѵ�
		BufferedReader k33_br = new BufferedReader(new FileReader(k33_file));
		// ���۸� ����ؼ� ������ �о��
		String k33_readtxt;
		
		while((k33_readtxt = k33_br.readLine())!= null) {	
			// k33_readtxt�� k33_br.readLine()�� �����ϰ� �� ���� null�� �ƴҰ�쿡
			System.out.printf("%s\n", k33_readtxt);	// k33_readtxt�� ���
		}
		
		k33_br.close(); // ������ �ݴ´�
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		k33_FileWrite();	// k33_FileWrite �޼���� �̵�
		k33_FileRead();		// k33_FileRead �޼���� �̵�

	}
}
