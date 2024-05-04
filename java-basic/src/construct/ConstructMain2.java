package construct;

public class ConstructMain2 {
	public static void main(String[] args) {
		// 생성자를 통해 클래스의 인스턴스를 만들어내면서 필요한 멤버 필드를 초기화 할 수 있다.
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16);

		MemberConstruct[] members = {member1, member2};
		for (MemberConstruct s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
	}
}
