package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		
		//멤버를 만들고 
		Member memberPark = new Member(300, "Park");
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark2 = new Member(400, "Park");

		
		
		//그 멤버를 add하면 됨
		manager.addMember(memberPark);
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark2); //안들어감 이유는 : Integer의 key값이 중복되지 않기 때문
		
		//모든 멤버를 보여주는 메소드를 실행
		manager.showAllMember();
		manager.removeMember(200);
		manager.showAllMember();

	}

}
