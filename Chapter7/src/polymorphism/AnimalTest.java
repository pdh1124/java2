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
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
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
		
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		
		
		
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		// hAnimal.readBooks(); ������ �ȵ�. ������ �Ϸ��� ������ Ÿ������ ���ư��� ��(�ٿ�ĳ����)
	}
	
	
	
	
	//�ϳ��� �ڵ尡 ���� �ڷ����� ������ �Ǽ� �ٸ������� �Ǵ°��� ������Ƽ���̴�.
}
