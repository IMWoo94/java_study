package method;

public class MethodValue1 {
	/**
	 * 자바는 기본적으로 변수끼리의 대입 및 인수로 등록 시 call by value 형식으로
	 * 값을 복사하면서 진행하게 된다.
	 * 새로운 메모리 공간을 할당하고 이를 복사할 변수의 값을 읽어와서 새로운 메모리 값을 할당하는 방법으로 진행한다.
	 * 이로써 각각의 변수는 서로 독립적인 상황이 된다.
	 */
	public static void main(String[] args) {
		int num1 = 5;
		System.out.println("1. changeNumber 호출 전, num1: " + num1);
		// num1 이라는 변수의 값을 num2 라는 새로운 변수에 값을 복사해서 할당한다.
		// 따라서 num1 과 num2 는 전혀 관계없는 독립적인 변수다.
		changeNumber(num1);
		System.out.println("4. changeNumber 호출 후, num1: " + num1);
	}

	public static void changeNumber(int num2) {
		// num2 의 값을 아무리 바꾸고 더하고 곱해도, 바깥의 num1 과는 전혀 관계가 없다.
		System.out.println("2. changeNumber 변경 전, num2: " + num2);
		num2 = num2 * 2;
		System.out.println("3. changeNumber 변경 후, num2: " + num2);
	}
}
