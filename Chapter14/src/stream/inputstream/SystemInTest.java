package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("입력:");
		
		//읽는 것 
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in); //InputStreamReader은 System.in은 1byte씩 읽어들이는데 한글은 2byte씩 읽어 들여서 필요한 것
			while((i = isr.read()) != '끝') { //System.in 대신 InputStreamReader를 선언 했던 isr을 넣어준다.
			System.out.println(i);
			System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
