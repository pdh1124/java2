package chapter6;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.addBook("�¹���1");
		studentLee.addBook("�¹���2");
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("����1");
		studentKim.addBook("����2");
		
		Student studentCho = new Student("Cho");
		studentCho.addBook("�ظ�����1");
		studentCho.addBook("�ظ�����2");
		studentCho.addBook("�ظ�����3");
		studentCho.addBook("�ظ�����4");
		studentCho.addBook("�ظ�����5");
		studentCho.addBook("�ظ�����6");
		
	
		
		studentLee.showBookInfo();
		studentKim.showBookInfo();
		studentCho.showBookInfo();
	}
	
	
}
