class Foo {

	//static의 유무의 따라
	//static이 있으면 class 소속
	//static이 없으면 instence소속
	//클래스의 새로운 인스턴스를 만들고 인스턴스 변수에 값을 수정하면 
	//클래스 소속은 전체적으로 수정 되지만 인스턴스 소속은 수정한 인스턴스의 값만수정 된다.
	
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
		
		//클래스를 바꾸면 
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); //changed by f1
		System.out.println(f1.classVar); //changed by f1
		System.out.println(f2.classVar); //changed by f1
		
		//인스턴스를 바꾸면
		f1.instanceVar = "Changed by f1";
		//System.out.println(Foo.instanceVar); //Error
		System.out.println(f1.instanceVar); //Changed by f1
		System.out.println(f2.instanceVar); //I instance var
		
	}

}
