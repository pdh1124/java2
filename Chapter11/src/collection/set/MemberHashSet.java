package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	
	//HashSet를 만들고 멤버를 관리
	private HashSet<Member> hashSet;
	
	
	//MemberHashSet의 콘스트럭트(생성자)에서 hashSet을 생성
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //HashSet이 하나 만들어 짐
		
		
		
	}
	//멤버를 추가
	public void addMember(Member member) {
		hashSet.add(member);
	} 
	
	//만약에 멤버를 한명 삭제를 한다면
	//멤버 id를 알아야 삭제하도록
	public boolean removeMember(int memberId) { //
		//한명씩 보려면 Iterator를 사용함
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //hasNext()는 다음 엘리먼트가 있느냐라고 물어봄
			Member member = ir.next(); //member로 next(가져옴)해라
			if( member.getMemberId() == memberId) { //member의 리스트에 가져온 아이디와 매개변수로 입력한 아이디가 같다면
				hashSet.remove(member); //멤버를 삭제해라
				return true; //true를 반환한다.
			}
		}
		
		//만약 찾는 아이디가 없다면
		System.out.println(memberId + "번호가 존재하지 않습니다.");
		return false; //제대로 안지워 졌기 때문에 false를 반환한다.
	}
	
	//모든 멤버를 보여주는 메소드
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
