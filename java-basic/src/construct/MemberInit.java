package construct;

public class MemberInit {
	String name;
	int age;
	int grade;

	//추가
	void initMember(String name, int age, int grade) {
		/**
		 * 여기서 this 란 파라미터 name 필드 name 과 이름이 동일하다.
		 * 그렇다면 무엇이 무엇인지 구분할 수 없다.
		 * this 를 사용하게 되면서 외부 파라미터가 아닌 필드 값을 더 우선하여 멤버 필드 값으로 인식하게 한다.
		 * this 를 사용하지 않게 되면 해당 메소드 안에서의 우선순위는 파라미터가 가지게 된다.
		 */
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
