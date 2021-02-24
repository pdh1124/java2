package stream.coffee;

//new해서 쓰지않을 것이라 abstract를 쓴다.
public abstract class Decorator extends Coffee {
	
	//데코레이터는 혼자 돌아갈 수 없다.
	//생성자에는 항상 또다른 커피를 가지고 오고
	//이 가지고 있는 커피라는 상위 클래스 객체를 가지고 있다.
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	} 
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
}
