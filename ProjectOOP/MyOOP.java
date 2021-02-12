/*
public class MyOOP {
	
		
	public static void main(String[] args) {
		delimiter = "----";
		//.....
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "****";	
		printA();
		printA();
		printB();
		printB();

	}
	
	public static String delimiter = "";

	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	//...


}

*/
//위에 코드를 class를 만들어 간단하게 만들기

class Print{
	public static String delimiter = "";

	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	//...
}

public class MyOOP {
	
	public static void main(String[] args) {
		Print.delimiter = "----";
		//.....
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";	
		Print.A();
		Print.A();
		Print.B();
		Print.B();

	}
	
	


}
