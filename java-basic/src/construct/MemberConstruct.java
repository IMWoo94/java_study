package construct;

/**
 * initMember 메소드를 통해서 매번 초기화를 하는 것은 번거롭다.
 * 클래스의 인스턴스를 만들어내면서 바로 초기화 하는 방법으로 생성자라는 기능이 있다.
 * 지금껏 우리는 기본 생성자 class() 를 형식으로 인스턴스를 만들어 왔다.
 * 하지만 우리는 기본 생성자를 선언한 적이 없지만 사용이 가능한데
 * 이는 컴파일 과정에서 생성자에 대한 선언이 없으면 기본 생성자를 자동으로 생성해준다.
 * 그렇기 때문에 class() 를 사용해서 인스턴스를 만들어 낼 수 있엇다.
 */
public class MemberConstruct {
	String name;
	int age;
	int grade;

	/**
	 * 이와 같이 생성자를 선언 할 수 있다.
	 * 생성자의 이름은 클래스 이름과 같아야 하고, 첫글자도 클래스 이름과 같이 대문자로 시작이다.
	 * 생성자는 반환 타입이 없다. class 인스턴스를 만들어 내기 때문
	 * 생성자는 기본생성자 혹은 멤버 필드를 정해서 여러 생성자를 만들어 낼 수 있고 이를 오버로딩이라는 기법으로 볼 수 있다.
	 */
	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	MemberConstruct(String name, int age) {
		/**
		 * System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade= 50");
		 * 		this.name = name;
		 * 		this.age = age;
		 * 		this.grade = 50;
		 *
		 * 	해당 생성자의 코드를 보면 위의 생성자 코드와 비슷한 정보가 많다.
		 * 	이때 this() 를 통해서 클래스의 직접 생성자를 호출할 수 있다.
		 */
		this(name, age, 50);
		// 단 this() 는 메소드의 가장 첫줄에서 사용이 되어야 한다.
	}
}
