//������� Ŭ���� Cal�� ������ �� ���� ���°� ��
//1. ���� ������� ���� �ְų�
//2. �������� Ŭ������ �ƴϰų�
//3. �ڹ� ������ �ִ� ����Ǿ� �ִ� Ŭ�����̰ų�

class Cal{
	public int sum(int v1,int v2) {
		return v1+v2;
	}
}

//class Cal�� ���̳ʽ� ����� �ְ� �ʹٸ� ��ӹ��� Ŭ������ ����� �ָ� ��
//Cal Ŭ������ Ȯ���ؼ� CalŬ������ ������ �ִ� ��� �޼ҵ�� ������ ��ӹް� �Ǵ� Ŭ���� Cal3�� �ȴ�.
class Cal3 extends Cal {
	
}




public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		
		//Ŭ���� Cal3�� ��ӹް� �ִ� Ŭ����Cal�ִ� sum�̶�� �޼ҵ带 ����� �� ����
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,3));
	}
}
