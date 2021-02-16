package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
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
		// hAnimal.readBooks(); 실행이 안됨. 실행을 하려면 원래의 타입으로 돌아가야 함(다운캐스팅)
	}
	
	
	
	
	//하나의 코드가 여러 자료형이 구현이 되서 다른실행이 되는것이 폴리모티즘이다.
}
