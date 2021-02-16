package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 킵니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	//final을 붙이게 되면 재정의 할 수 없는 메소드가 됨 ('시동을 키고 - 드라이브 하고 - 멈추고 - 시동끄고'의 시나리오가 바뀌면 안됨)
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
