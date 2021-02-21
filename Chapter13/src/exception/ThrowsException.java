package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws FileNotFoundException, ClassNotFoundException로 에러를 미루는 명령어
	// 에러를 미루게 되면 이 메소드를 호출하는 곳에서 처리해야 함
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		
		//예외를 처리하는 곳 -> 여기서도 throws하면 JVM으로 넘어가니까 핸들링을 하는게 아니기 때문에 try-catch를 걸어야 한다.
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("c.txt", "java.lang.string"); //a.txt로 바꾸고 String으로 바꾸면 잘 처리가 되어 end만 나오게 됨 
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //catch (Exception e) 디폴트 인셉션으로 멀티 인셉션 처리할때는 맨 나중에 걸어야 한다.
			System.out.println(e);
		}
		System.out.println("end");
	}

}
