package thread;

//�����嵵 Ŭ������ �ϸ� �ȴ�.
class MyThread extends Thread {
	
	//�����尡 ��ŸƮ �Ǹ� ������� run�̶�� �޼ҵ尡 ����ȴ�.
	//�׷��� run�� �����ؾ� �Ѵ�.
	public void run() {
		//run�� �����ϰ� �Ǵµ� ������� 0~200�� 
		int i;
		for (i=0; i<=200; i++) {
			System.out.println(i + "\t");
			try {
				sleep(10); //sleep�̶� �޼ҵ�� ���ͷ����μ����� �߻��ؼ� �� �� �ִ� ���ɼ��� �־ try-catch�� ���ش�.
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
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		//�����带 ��������ַ��� start();�� ���ָ� �ȴ�.
		th1.start();
		th2.start();
		System.out.println("end");
	}
}
