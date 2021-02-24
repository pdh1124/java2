package thread;

//쓰레드도 클래스로 하면 된다.
class MyThread implements Runnable { //extends Thread 대신 implements Runnable을 쓸 수 있다.

	//쓰레드가 스타트 되면 쓰레드는 run이라는 메소드가 실행된다.
	//그래서 run을 구현해야 한다.
	public void run() {
		//run을 실행하게 되는데 예를들어 0~200깢 
		int i;
		for (i=0; i<=200; i++) {
			System.out.println(i + "\t");
			try {
				Thread.sleep(10); //sleep이란 메소드는 인터럭스인셉션이 발생해서 꺨 수 있는 가능성이 있어서 try-catch로 해준다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TheadTest {
	public static void main(String[] args) {
		
		
		System.out.println("start");
		/*
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		//쓰레드를 실행시켜주려면 start();를 해주면 된다.
		th1.start();
		th2.start();
		*/
		
		MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MyThread runner2 = new MyThread();
		Thread th2 = new Thread(runner2);
		th2.start();
		
		
		System.out.println("end");
	}
}
