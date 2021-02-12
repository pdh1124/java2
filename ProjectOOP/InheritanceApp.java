//예를들어 클래스 Cal이 수정할 수 없는 상태가 됨
//1. 많은 사람들이 쓰고 있거나
//2. 내가만든 클래스가 아니거나
//3. 자바 가지고 있는 내장되어 있는 클래스이거나

class Cal{
	public int sum(int v1,int v2) {
		return v1+v2;
	}
}

//class Cal에 마이너스 기능을 넣고 싶다면 상속받은 클래스를 만들어 주면 됨
//Cal 클래스를 확장해서 Cal클래스가 가지고 있는 모든 메소드와 변수를 상속받게 되는 클래스 Cal3가 된다.
class Cal3 extends Cal {
	
}




public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		
		//클래스 Cal3에 상속받고 있는 클래스Cal있는 sum이라는 메소드를 사용할 수 있음
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,3));
	}
}
