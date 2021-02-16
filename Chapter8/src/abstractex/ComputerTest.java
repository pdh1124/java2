package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		// Computer computer = new Computer(); //인스턴스화가 안됨
		// computer.display();
		
		
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		Computer myNote1 = new MyNoteBook(); //상위의 상위인 Computer도 가능
		NoteBook myNote2 = new MyNoteBook(); //상위인 NoteBook으로 해도 가능

	}

}
