package generic;

//��Ḧ ���� ����Ʈ�� �����.
public class GenericPrinter<T extends Meterial> { //<T> Ÿ�Կ� ����Ǽ� ������ ���� �ɶ� TŸ�Կ� ������ �� ����
	//<T>�� Meterial�� ��ӹ��� Ŭ������ ��Ḹ ��� �� �� �ִ�.
	
	
	private T material; //material

	//getter, setter
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
