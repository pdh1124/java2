class Foo {

	//static�� ������ ����
	//static�� ������ class �Ҽ�
	//static�� ������ instence�Ҽ�
	//Ŭ������ ���ο� �ν��Ͻ��� ����� �ν��Ͻ� ������ ���� �����ϸ� 
	//Ŭ���� �Ҽ��� ��ü������ ���� ������ �ν��Ͻ� �Ҽ��� ������ �ν��Ͻ��� �������� �ȴ�.
	
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	
	public static void classMethod() {
		System.out.println(classVar); //OK
		//System.out.println(instanceVar); //Error
	}
	
	public void instanceMethod() {
		System.out.println(classVar); //OK
		System.out.println(instanceVar); //OK
		
	}
}

public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println(Foo.classVar); //OK
		//System.out.println(Foo.instanceVar); //Error
		
		Foo.classMethod();
		//Foo.instanceMethod(); //Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); //I class var
		System.out.println(f1.instanceVar); //I instance var
		
		//Ŭ������ �ٲٸ� 
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); //changed by f1
		System.out.println(f1.classVar); //changed by f1
		System.out.println(f2.classVar); //changed by f1
		
		//�ν��Ͻ��� �ٲٸ�
		f1.instanceVar = "Changed by f1";
		//System.out.println(Foo.instanceVar); //Error
		System.out.println(f1.instanceVar); //Changed by f1
		System.out.println(f2.instanceVar); //I instance var
		
	}

}
