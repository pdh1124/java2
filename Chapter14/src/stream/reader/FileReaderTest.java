package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		//1. FileInputStream�� FileReader�� �����ϸ� �ѱ��� ������ �����°� ��ĥ �� �ִ�.
		FileReader fis = new FileReader("reader.txt");
		
		
		//2. FileInputStream�� InputStreamReader�� �޾Ƽ� �ϸ� ��ĥ �� �ִ�.
//		FileInputStream fis = new FileInputStream("reader.txt");
//		InputStreamReader isr = new InputStreamReader(fis); 
		
		int i;
		while( (i = fis.read()) != -1) {
			System.out.println((char)i);
		}
		
		fis.close();
	}

}
