package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
		
	//�޼ҵ带 �ϳ� ����µ� Runnable�̶�� ���� ��ȭ���ִ� �޼ҵ�
	//Runnable�̶� ��ü�� ��ȯ(return)����� �ϴµ�
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		//Ŭ���� Ÿ������ �ϳ� ����
		class MyRunnable implements Runnable {
			
			//run�̶�� �޼ҵ带 �����ؾ� ��
			@Override
			public void run() {
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
			
		}
		return new MyRunnable();
	}
	
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();

	}

}
