package construct;

public class ConstructMain1 {
	public static void main(String[] args) {
		// 생성자를 통해 클래스의 인스턴스를 만들어내면서 필요한 멤버 필드를 초기화 할 수 있다.
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

		/**
		 * 		사용자 정의 생성자를 정의하면 정의된 생성자만 사용해야 함으로 클래스를 구현한 의도대로 사용할 수 있다.
		 * 		또한, 정의되지 않은 생성자를 사용하게 되면 컴파일 오류가 보여지게 되면서 빠른 대응이 가능하다.
		 * 		사용자 정의 생성자를 하나라도 선언하게 되면 기본 생성자를 직접 선언하지 않는한 사용할 수 없다.
		 * 		또한 다른 생성자도 불가능하다.
		 * 		MemberConstruct member3 = new MemberConstruct();
		 * 		MemberConstruct member4 = new MemberConstruct("user4");
		 */

		MemberConstruct[] members = {member1, member2};
		for (MemberConstruct s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
	}
}
