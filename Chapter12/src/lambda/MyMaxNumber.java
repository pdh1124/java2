package lambda;
//이 인터페이스가 함수형 인터페이스라고 선언함
@FunctionalInterface //람다식을 위한 인터페이스
public interface MyMaxNumber {
	
	//@FunctionalInterface를 쓰게 되면 메소드를 하나만 해야 한다.
	int getMaxNumber(int x, int y);
//	void add(int x,int y); 2개 이상 쓸 수 없음

}
