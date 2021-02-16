package abstractex;

public abstract class Computer {
	
	//추상 메소드(abstract) - 상위 클래스에게도 abstract를 넣어야 함
	//쓰는 이유는 하위 클래스에서 구현이 될때 사용
	//단독으로 쓰지 않고 상위 클래스로 사용해 놓고 책임을 하위클래스에 물어 둔다.
	public abstract void display();
	public abstract void typing();
	
	
	//모든 하위 클래스에 공통적으로 쓸 수 있는 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
