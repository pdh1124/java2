package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		//Chapter13폴더 안에 a.txt
		try {
			fis = new FileInputStream("a.txt");
			//fis.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			//fis.close();
			return;
		} 
		finally { //20번쨰에 return을 해줘도 finally는 무조건 실행이 됨
			try {
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end"); //20번쨰 줄에 return이 있어서 안됨
	}

}
