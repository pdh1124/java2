package gamelevel;

public abstract class PlayerLevel {

	//예시
	//player가 게임을 하는데 3가지 기능을 구현함
	//초보자는 천천히 달리기만 가능함
	//중급자는 빠르게 달리고 점프까지만 가능함
	//고급자는 엄청 빠르게 달리고 점프도 하고 한 바퀴 돌수도 있음
	//go()라는 명령어를 받으면 3가지 기능을 수행하고 할 수 없다는 것이 있으면 메세지로 보냄
	
	
	//기능을 추상 클래스로 만듦
	public abstract void run(); //달리기
	public abstract void jump(); //점프
	public abstract void turn(); //턴
	public abstract void showLevelMessage(); //상태를 알려줌
	
	//go()라는 명령어
	final public void go(int count) {
		run(); //달리고
		for(int i = 0 ; i < count; i++) {//count만큼 점프함
			jump();
		}
		turn(); //턴
	}

}
