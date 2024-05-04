package construct;

public class MemberDefault {
	String name;

	// 별도의 생성자를 선언하지 않으면 기본 생성자가 컴파일을 하면서 자동 생성 된다.
	// public MemberDefault() {
	// }
	public MemberDefault() {
		System.out.println("생성자 호출");
	}
}
