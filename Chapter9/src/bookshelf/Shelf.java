package bookshelf;

import java.util.ArrayList; //ArrayList<String>�� import�� ����� �Ѵ�.

public class Shelf {
	
	//�迭�� �ΰ� <���ڿ�>Ÿ������ �޴´�.
	//�׸��� ���� Ŭ�������� ���� �ֵ��� protected�� �ִ´�.
	protected ArrayList<String> shelf; 
	
	
	//���� ArrayList�� �ܽ�Ʈ��Ʈ���� ���� ��
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	//protected�̱� ������ getter,setter �޼ҵ尡 �־�� �ϴµ� getter�� ����� �ش�.
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	//���ݿ� ������ ��� �ִ��� Ȯ��
	public int getCount() {
		return shelf.size(); //����� ���� return ���ָ� ��
	}
}
