package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		
		//멤버를 만들고 
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");
				
		
		//그 멤버를 add하면 됨
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		//모든 멤버를 보여주는 메소드를 실행
		manager.showAllMember();

	}

}
