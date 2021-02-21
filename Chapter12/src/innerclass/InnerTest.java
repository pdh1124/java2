package innerclass;


class OutClass { //�ܺ� Ŭ����
	//��������� �����ϴ� �ڸ�
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass { //���� Ŭ���� : �޼ҵ� �ȿ� �ִ°͵� �ƴϰ� staticŰ���尡 �����͵� �ƴϱ� ������ ��������� �ν��Ͻ� ���� Ŭ����
		int iNum = 100;
		//static int sInNum = 200; static�� ����� �� ����
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	//����ƽ �̳� Ŭ������ Ư¡�� outClass ���ο� ����� ������ outClass�� �����ǰ� ���� ���°��� �ƴ�
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		//����ƽ Ŭ���� ���ο� �Ϲ� �޼ҵ尡 �ְ�
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum); //outClass�� �ִ� ����
			
		}
		
		//����ƽ Ŭ���� ���ο� ����ƽ �޼ҵ带 ���� �� �ִ�.
		static void sTest() {
			//System.out.println(inNum); //static Ŭ������ static�޼ҵ�ϱ� static������ ���� �ִ�.
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
		
		//OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //static Ŭ���� ����
		
		OutClass.InStaticClass.sTest();
		
	}
	
	

}
