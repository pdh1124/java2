package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		// Computer computer = new Computer(); //�ν��Ͻ�ȭ�� �ȵ�
		// computer.display();
		
		
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		Computer myNote1 = new MyNoteBook(); //������ ������ Computer�� ����
		NoteBook myNote2 = new MyNoteBook(); //������ NoteBook���� �ص� ����

	}

}
