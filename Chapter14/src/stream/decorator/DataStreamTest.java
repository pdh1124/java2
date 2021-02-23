package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis);){
			//Data 인풋,아웃풋 스트림은데이터를 그대로 읽고 쓰는데 사용하는 보조 스트림이다.
			
			//쓰기
			dos.writeByte(100); //1바이트
			dos.write(100); //4바이트
			dos.writeChar('A'); //한문자 단위
			dos.writeUTF("안녕하세요"); //언어 단위
			
			//읽기
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		
		}catch (IOException e) {
			
		}
		
	}

}
