package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RamdomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println(rf.getFilePointer()); //4 getFilePointer() 위치를 알 수 있음 
		
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요.");
		
		rf.seek(0);  //week(0) 이 처음 위치로 돌아간다.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		rf.close();

	}

}
