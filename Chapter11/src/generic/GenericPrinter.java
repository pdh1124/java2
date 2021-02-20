package generic;

//재료를 쓰는 프린트를 만든다.
public class GenericPrinter<T extends Meterial> { //<T> 타입에 적용되서 실제로 적용 될때 T타입에 대입이 될 예정
	//<T>는 Meterial에 상속받은 클래스의 재료만 사용 할 수 있다.
	
	
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
