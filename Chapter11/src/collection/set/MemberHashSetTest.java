package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		
		//멤버를 만들고 
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2"); 
		//같은 id를 가진 멤버를 넣었는데 콘솔에 표시가 됨 
		//이유는 두 멤버가 같다라는 정의가 되지 않았기 때문
		
		
		//그 멤버를 add하면 됨
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		//모든 멤버를 보여주는 메소드를 실행
		manager.showAllMember();
//		Park회원님의 아이디는 300 입니다.
//		Park2회원님의 아이디는 300 입니다.
//		Lee회원님의 아이디는 100 입니다.
//		Kim회원님의 아이디는 200 입니다.
		
		
		//지워보는 명령
		manager.removeMember(100); //100 의 아이디를 가진 멤버를 지우는 메소드 실행
		manager.showAllMember();
//		Park회원님의 아이디는 300 입니다.
//		Kim회원님의 아이디는 200 입니다.
	}

}
