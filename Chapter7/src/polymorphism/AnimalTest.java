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
	
	public void readBooks() { //각 클래스마다만 있는 메소드
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() { //각 클래스마다만 있는 메소드
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() { //각 클래스마다만 있는 메소드
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
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
		
		Human human = (Human)hAnimal; //다운캐스팅을 해야 각각의 클래스마다 있는 메소드를 사용 가능하게 함
		human.readBooks();
		
		/* instanceof는 오류 확인 법으로 다운캐스팅을 할때 자바가 오류를 잘 못잡음으로 한번 입력해서 오류가 있는지 확인하기
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
		
		// hAnimal.readBooks(); 실행이 안됨. 실행을 하려면 원래의 타입으로 돌아가야 함(다운캐스팅)
		
		
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
	
	
	
	
	
	//하나의 코드가 여러 자료형이 구현이 되서 다른실행이 되는것이 폴리모티즘이다.
}
