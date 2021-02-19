package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		System.out.println(System.identityHashCode(android));
		
		
		//java에 java뒤에 더 붙이게 되면은 새로운 메모리의 가르킴
		java = java.concat(android);
		
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
