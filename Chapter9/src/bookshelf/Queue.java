package bookshelf;

public interface Queue {
	
	//enQueue�� ���� �ִ� �޼ҵ�
	void enQueue(String title);
	//String�� ��ȯ���ִ� deQueue��� �޼ҵ尡 ����
	String deQueue();
	
	int getSize();
}
