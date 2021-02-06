package thisex;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personNoname = new Person();
		
		personNoname.showInfo();
		
		Person personLee = new Person("Lee", 30);
		Person personKim = new Person("Kim", 25);
		
		personLee.showInfo();
		personKim.showInfo();
		
		System.out.println(personLee);
		
		Person p = personLee.getSelf();
		System.out.println(p);
	}

}
