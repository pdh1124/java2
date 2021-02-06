package thisex;

public class Person {
	
	
	//this
	String name;
	int age;
	
	public Person() {
		//초기값 설정
		//this.name = "이름 없음";  대신
		this("이름없음", 1);
		//없다면 name = null, age = 0으로 초기화 됨
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age +"세");
	}

	public Person getSelf() {
		return this;
	}
	
}
