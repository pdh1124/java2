package innerclass;


class OutClass { //외부 클래스
	//멤버변수를 선언하는 자리
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass { //내부 클래스 : 메소드 안에 있는것도 아니고 static키워드가 붙은것도 아니기 때문에 용어적으로 인스턴스 내부 클래스
		int iNum = 100;
		//static int sInNum = 200; static은 사용할 수 없음
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	//스태틱 이너 클래스의 특징은 outClass 내부에 만들긴 하지만 outClass가 생성되고 나서 쓰는것이 아님
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		//스태틱 클래스 내부에 일반 메소드가 있고
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum); //outClass에 있는 변수
			
		}
		
		//스태틱 클래스 내부에 스태틱 메소드를 만들 수 있다.
		static void sTest() {
			//System.out.println(inNum); //static 클래스에 static메소드니까 static변수만 쓸수 있다.
			System.out.println(sInNum);
			System.out.println(sNum);
			
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		//OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //static 클래스 생성
		
		OutClass.InStaticClass.sTest();
		
	}
	
	

}
