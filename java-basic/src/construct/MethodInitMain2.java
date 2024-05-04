package construct;

/**
 * 객체 생성을 반복적을 나타나는 것을 메소드로 바꾸어 해결해보자
 * 반복적인 문제는 해결할 수 있지만 한가지 걸리는 것이 있다
 * 객체 지향 프로그래밍을 하면서 객체의 속성과 동작은 객체 안에서 처리할수 있도록 구성하는 것이 좋다.
 * 그게 객체 지향이다라고 생각해 왔다.
 * 아래와 같이 메소드를 통해 필드에 접근하는게 내가 생각한 객체 지향인가? 아니다. 이는 멤버 클래스 안에서 필드의 값을 수정하고 초기화하는 작업이 더욱
 * 객체 지향 스러움이다.
 * initMember 를 멤버 객체 안에서 구현해보도록 하자
 */
public class MethodInitMain2 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit();
		initMember(member1, "user1", 15, 90);
		MemberInit member2 = new MemberInit();
		initMember(member2, "user2", 16, 80);
		MemberInit[] members = {member1, member2};
		for (MemberInit s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
	}

	private static void initMember(MemberInit member, String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}
}
