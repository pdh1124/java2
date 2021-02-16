package gamelevel;

public class Player {
	
	/*
	이것은 객체지향 프로그래밍이 아니다.
	BeginnerLevel blevel;
	AdvancedLevel alevel;
	SuperLevel slevel;
	*/
	
	private PlayerLevel level; //level변수에 PlayerLevel에 상속받은 모든 레벨이 대입이 될 수 있다. 
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel( PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
