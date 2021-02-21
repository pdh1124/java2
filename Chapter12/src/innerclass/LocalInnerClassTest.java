package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
		
	//메소드를 하나 만드는데 Runnable이라는 것을 반화해주는 메소드
	//Runnable이란 객체를 반환(return)해줘야 하는데
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		//클래스 타입으로 하나 선언
		class MyRunnable implements Runnable {
			
			//run이라는 메소드를 구현해야 함
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
