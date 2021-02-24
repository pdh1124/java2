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
		test.interrupt(); //sleep�� 5�ʸ� ��ٸ��°� �ƴϰ� catch�� ������.
		
		System.out.println("end");

	}

}
