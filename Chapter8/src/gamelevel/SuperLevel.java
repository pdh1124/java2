package gamelevel;

public class SuperLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
		
	}
	
	@Override
	public void jump() {
		System.out.println("��û ���� jump �մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("1���� turn �մϴ�.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******* ����� ���� �Դϴ�. *******");
		
	}
}
