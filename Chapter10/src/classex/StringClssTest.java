package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClssTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class Ŭ���� ��������1
		Class c1 = String.class;
		
		//Class Ŭ���� ��������2
		String str = new String();
		Class c2 = str.getClass();
		
		//Class Ŭ���� ��������3 (���� �ε�)
		Class c3 = Class.forName("java.lang.String"); //throws ClassNotFoundException
		
		Constructor[] cons = c3.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}

}
