package template;

public class UsingDefine {

	public static void main(String[] args) {
		//(Define.GOOD_MORNING)�� static���� ���������Ƿ� �ν��Ͻ��� ���������ʰ�(new���� �ʰ�) Ŭ���� �̸����� â�� ����  
		System.out.println(Define.GOOD_MORNING);
		System.out.println("�ּҰ��� " + Define.MIN + " �Դϴ�.");
		System.out.println("�ִ��� " + Define.MAX + " �Դϴ�.");
		System.out.println("���� ���� �ڵ� ���� " + Define.MATH + " �Դϴ�." );
		System.out.println("���� ���� �ڵ� ���� " + Define.ENG + " �Դϴ�." );
	}

}
