import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		//class : System, Math, FileWriter
		//instance : f1�� ����Ű�� �ִ°�, f2�� ����Ű�� �ִ� ��
		
		System.out.println(Math.PI);
		//Math��� Ŭ������ �ٷ� ����ϰ�
		System.out.println(Math.floor(1.75)); //����
		System.out.println(Math.ceil(1.42)); //�ø�
		//Math.PI�� Math.floor ���� Ŭ������ ���������� � ���¸� ��� ������ �ʿ䰡 ����.
		//�׳� �ʿ��Ҷ����� ���� 1ȸ�� ���� Ŭ����
		//�̷��� 1ȸ������ ���� Ŭ������ Ŭ������ �ִ� �״�� ����ϸ� �� 
		
		
		
		//� ������ ���Ͽ� ����Ҷ� ���� Ŭ����
		FileWriter f1 = new FileWriter("data.txt");
		//fileWriter�� new�� �ٿ��� f1�̶�� ������ ���� �������� ���� 
		f1.write("Hello");
		f1.write(" Java");
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close(); //close 
		
		//FileWriter��� Ŭ������ �۾��ߴ��� ó�� f1.write("Hello"); �̳�	f1.write(" Java"); ó�� ������ �۾��� �ϱ� ����
		//FileWriter f1 = new FileWriter("data.txt");�� �ν��Ͻ��� ����� ���
		//Ŭ������ ���� ����ϴ°� �ƴ϶� ���纻�� ���� �����Ѵ�.
	}

}
