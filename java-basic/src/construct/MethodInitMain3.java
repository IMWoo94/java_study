package construct;

public class MethodInitMain3 {
	public static void main(String[] args) {
		// x001
		MemberInit member1 = new MemberInit();
		member1.initMember("user1", 15, 90);
		/**
		 * 	void initMember(String name, int age, int grade) {
		 * 		this.name = name;
		 * 		this.age = age;
		 * 		this.grade = grade;
		 *    }
		 *
		 * 	x001.initMember("user1", 15, 90){
		 * 		this.name = "user1" -> x001.name = "user1"
		 *    }
		 *
		 */
		MemberInit member2 = new MemberInit();
		member2.initMember("user2", 16, 80);
		MemberInit[] members = {member1, member2};
		for (MemberInit s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
	}
}
