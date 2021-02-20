package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		
		//�� ����� �Ǵµ� ������� ����� ���� ����
		//�׷��ٰ� ������ ������ ����Ǵ� �͵� �ƴ�, �ؽù������ �����
		//�ߺ��� ������� ���� (���̵�, �ֹι�ȣ, �й�, ��� ���� ������ �� ���)
		System.out.println(set); //[������, ������, �̼���]	
		
		//Array������� �ϰ� �Ǹ�
		ArrayList<String> set2 = new ArrayList<String>();
		set2.add("�̼���");
		set2.add("������");
		set2.add("������");
		set2.add("�̼���");
		
		//������� ������ �ߺ��� ����
		System.out.println(set2); //[�̼���, ������, ������, �̼���]
		
		
		//�ϳ����ϳ��� ���ư��鼭 ���� ������ Iterator�� ����ϸ� ��
		Iterator<String> ir = set.iterator();
		
		//��ü�� ��ȯ�ϴ� �ݺ���
		while(ir.hasNext()) { //hasNext()�� ���� ������Ʈ�� �ִ��Ķ�� ���
			String str = ir.next(); //next()�� ��������� �� => ���� ������Ʈ�� �ִٸ� �����Ͷ�
			System.out.println(str);
		}
	}
}
