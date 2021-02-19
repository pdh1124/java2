package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClssTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class 클래스 가져오기1
		Class c1 = String.class;
		
		//Class 클래스 가져오기2
		String str = new String();
		Class c2 = str.getClass();
		
		//Class 클래스 가져오기3 (동적 로딩)
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
