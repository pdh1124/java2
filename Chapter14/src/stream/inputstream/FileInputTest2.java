package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			 int i;
			 byte[] bs = new byte[10];
			 while ((i = fis.read(bs)) != -1) {
				 /* for(byte b : bs) {
					 System.out.print((char)b);
					 
						//ABCDEFGHIJ
						//KLMNOPQRST
						//UVWXYZQRST
						//로 출력이 되는데 마지막QRST는 남은 가비지 이다.
					  
				 }*/
				 for(int k=0; k<i; k++) {
					 System.out.print((char)bs[k]);
					//ABCDEFGHIJ
					//KLMNOPQRST
					//UVWXYZ
					//로 출력되어 남은 가비지가 프린트 되지 않는다.
				 }
				 System.out.println();
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//System.out.println("end");
	}

}
