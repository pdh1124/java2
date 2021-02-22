package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		//1. FileInputStream을 FileReader로 수정하면 한글이 깨져서 나오는걸 고칠 수 있다.
		FileReader fis = new FileReader("reader.txt");
		
		
		//2. FileInputStream을 InputStreamReader로 받아서 하면 고칠 수 있다.
//		FileInputStream fis = new FileInputStream("reader.txt");
//		InputStreamReader isr = new InputStreamReader(fis); 
		
		int i;
		while( (i = fis.read()) != -1) {
			System.out.println((char)i);
		}
		
		fis.close();
	}

}
