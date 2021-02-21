package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws FileNotFoundException, ClassNotFoundException�� ������ �̷�� ��ɾ�
	// ������ �̷�� �Ǹ� �� �޼ҵ带 ȣ���ϴ� ������ ó���ؾ� ��
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		
		//���ܸ� ó���ϴ� �� -> ���⼭�� throws�ϸ� JVM���� �Ѿ�ϱ� �ڵ鸵�� �ϴ°� �ƴϱ� ������ try-catch�� �ɾ�� �Ѵ�.
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("c.txt", "java.lang.string"); //a.txt�� �ٲٰ� String���� �ٲٸ� �� ó���� �Ǿ� end�� ������ �� 
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //catch (Exception e) ����Ʈ �μ������� ��Ƽ �μ��� ó���Ҷ��� �� ���߿� �ɾ�� �Ѵ�.
			System.out.println(e);
		}
		System.out.println("end");
	}

}
