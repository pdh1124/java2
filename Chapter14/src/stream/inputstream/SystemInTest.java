package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("�Է�:");
		
		//�д� �� 
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in); //InputStreamReader�� System.in�� 1byte�� �о���̴µ� �ѱ��� 2byte�� �о� �鿩�� �ʿ��� ��
			while((i = isr.read()) != '��') { //System.in ��� InputStreamReader�� ���� �ߴ� isr�� �־��ش�.
			System.out.println(i);
			System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
