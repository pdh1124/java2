package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		//Chapter13���� �ȿ� a.txt
		try {
			fis = new FileInputStream("a.txt");
			//fis.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			//fis.close();
			return;
		} 
		finally { //20������ return�� ���൵ finally�� ������ ������ ��
			try {
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end"); //20���� �ٿ� return�� �־ �ȵ�
	}

}
