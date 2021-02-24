package thread;

//은행에 돈이 있는데
class Bank{
	
	private int money = 10000;
	
	//저금하는 메소드
	public synchronized void saveMoney(int save) {
		int m = this.getMoney(); //돈을 가져와서
		
		try {
			Thread.sleep(3000); //저축하는데 3초정도 걸린다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		setMoney(m + save);
	}

	//돈이 줄어들수 있는데
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney(); //돈을 가져와서
		
		try {
			Thread.sleep(200); //돈을 쓰는데 3초정도 걸린다.
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
		SyncTest.myBank.saveMoney(3000); 	//3000원 저금
		System.out.println("save Money : " +SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000); 	//1000원 지출
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
