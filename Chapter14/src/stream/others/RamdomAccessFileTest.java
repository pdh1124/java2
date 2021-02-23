package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RamdomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println(rf.getFilePointer()); //4 getFilePointer() ��ġ�� �� �� ���� 
		
		rf.writeDouble(3.14);
		rf.writeUTF("�ȳ��ϼ���.");
		
		rf.seek(0);  //week(0) �� ó�� ��ġ�� ���ư���.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		rf.close();

	}

}
