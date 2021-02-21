package innerclass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
		
	//�޼ҵ带 �ϳ� ����µ� Runnable�̶�� ���� ��ȭ���ִ� �޼ҵ�
	//Runnable�̶� ��ü�� ��ȯ(return)����� �ϴµ�
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		//Ŭ���� Ÿ������ �ϳ� ����
		return new Runnable() {
			
			//run�̶�� �޼ҵ带 �����ؾ� ��
			@Override
			public void run() {
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		};
	}
	
	//�͸� �̳� Ŭ����
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("test");
			
		}
		
		
	};
	
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		outer.runner.run();
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();

	}

}
