package thread;

//���࿡ ���� �ִµ�
class Bank{
	
	private int money = 10000;
	
	//�����ϴ� �޼ҵ�
	public synchronized void saveMoney(int save) {
		int m = this.getMoney(); //���� �����ͼ�
		
		try {
			Thread.sleep(3000); //�����ϴµ� 3������ �ɸ���.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		setMoney(m + save);
	}

	//���� �پ��� �ִµ�
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney(); //���� �����ͼ�
		
		try {
			Thread.sleep(200); //���� ���µ� 3������ �ɸ���.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	} 
			
}


class Park extends Thread{

	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000); 	//3000�� ����
		System.out.println("save Money : " +SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000); 	//1000�� ����
		System.out.println("save minus : " +SyncTest.myBank.getMoney());
	}
}



public class SyncTest {
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		
	}

}
