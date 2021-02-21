package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionResourcesTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis2 = new FileInputStream("b.txt")) {
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}	
	}

}
