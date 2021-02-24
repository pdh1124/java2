package thread;

public class InterrupTest extends Thread {
	
	
	public void run() {
		int i;
		for(i=0; i<100; i++) {
			System.out.println(i);
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake!!!");
		}
	}


	public static void main(String[] args) {
		
		InterrupTest test = new InterrupTest();
		test.start();
		test.interrupt(); //sleep의 5초를 기다리는게 아니고 catch로 빠진다.
		
		System.out.println("end");

	}

}
