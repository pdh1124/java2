class Print2 {
	public String delimiter = "";

	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

public class InstenceOOP {
	
	public static void main(String[] args) {
		
		Print2 p2 = new Print2();
		
		p2.delimiter = "----";
		
		//.....
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		Print2 p3 = new Print2();
		p3.delimiter = "****";	
		p3.A();
		p3.A();
		p3.B();
		p3.B();
		
		p2.A();
		p3.A();
		p2.B();
		p3.B();

	}

}
