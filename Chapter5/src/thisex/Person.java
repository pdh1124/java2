package thisex;

public class Person {
	
	
	//this
	String name;
	int age;
	
	public Person() {
		//�ʱⰪ ����
		//this.name = "�̸� ����";  ���
		this("�̸�����", 1);
		//���ٸ� name = null, age = 0���� �ʱ�ȭ ��
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age +"��");
	}

	public Person getSelf() {
		return this;
	}
	
}
