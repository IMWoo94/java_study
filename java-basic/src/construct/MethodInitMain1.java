package construct;

/**
 * 지금까지 클래스를 통해서 직접 필드의 값을 초기화 해서 사용하고 있다.
 * 이렇게 사용하면서 불편한 점은 해당 클래스의 객체가 가지고 있는 필드가 어떤 정보를 가지고 있는지를 들어가봐야 알 수 있다.
 * 또한, 필드가 초기화가 되어 있는지 확인하기에도 어려우며 필수로 필요한 정보가 어떠 정보를 필요로 하는지 알 수 없다.
 * 그리고 객체를 생성하는 과정이 지속적으로 반복된다는 것을 알 수 있다.
 */
public class MethodInitMain1 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit();
		member1.name = "user1";
		member1.age = 15;
		member1.grade = 90;
		MemberInit member2 = new MemberInit();
		member2.name = "user2";
		member2.age = 16;
		member2.grade = 80;
		MemberInit[] members = {member1, member2};
		for (MemberInit s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
	}
}
