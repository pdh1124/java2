class Print {
	
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}

public class staticMethod {
	
	public static void main(String[] args) {
		//Print.a("-")은 클래스의 소속이기 때문에 static이 있어야 한다.
//		Print.a("-");
//		Print.b("-");
		
	
		
		//인스턴스
		Print t1 = new Print();
		t1.delimiter = "-";
		//t1.a();는 Print t1 = new Print();라는 인스턴스 소속이기 때문에
		//static을 빼야 한다.
		t1.a();
		t1.b();
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		
		//Print.c("%");는 클래스 소속이기 때문에 static을 넣어야 한다.
		Print.c("%");
	}	

}
