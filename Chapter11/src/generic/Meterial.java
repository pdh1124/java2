package generic;

//플라스틱과 파우더 외에 재료가 되지 못하는 재료를 사용해서 넣을 수 있는데
//그것을 방지하기 위해 상위 클래스인 Meterial(재료)클래스를 만들고 하위 클래스(Plastic,Powder)에 상속시킨다.
public abstract class Meterial {
	
	public abstract void doPrinting();
}
