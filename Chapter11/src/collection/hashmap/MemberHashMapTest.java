package collection.hashmap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		
		//����� ����� 
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park");

		
		
		//�� ����� add�ϸ� ��
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2); //�ȵ� ������ : Integer�� key���� �ߺ����� �ʱ� ����
		
		//��� ����� �����ִ� �޼ҵ带 ����
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();

	}

}
