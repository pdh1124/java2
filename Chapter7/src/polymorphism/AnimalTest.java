package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() { //�� Ŭ�������ٸ� �ִ� �޼ҵ�
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() { //�� Ŭ�������ٸ� �ִ� �޼ҵ�
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() { //�� Ŭ�������ٸ� �ִ� �޼ҵ�
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}



public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		
		animal.move();
		
	}	
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		Human human = (Human)hAnimal; //�ٿ�ĳ������ �ؾ� ������ Ŭ�������� �ִ� �޼ҵ带 ��� �����ϰ� ��
		human.readBooks();
		
		/* instanceof�� ���� Ȯ�� ������ �ٿ�ĳ������ �Ҷ� �ڹٰ� ������ �� ���������� �ѹ� �Է��ؼ� ������ �ִ��� Ȯ���ϱ�
		if(hAnimal instanceof Human) {
			Human human = (Human)hAnimal;
			human.readBooks();
		}
		*/
		
		System.out.println("---------------");	
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
			
		
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		System.out.println("---------------");
		
		test.testDownCasting(animalList);
		
		System.out.println("---------------");
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		// hAnimal.readBooks(); ������ �ȵ�. ������ �Ϸ��� ������ Ÿ������ ���ư��� ��(�ٿ�ĳ����)
		
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} 
			else {
				System.out.println("ERROR");
			}
		}
		
		
	}
	
	
	
	
	
	//�ϳ��� �ڵ尡 ���� �ڷ����� ������ �Ǽ� �ٸ������� �Ǵ°��� ������Ƽ���̴�.
}
