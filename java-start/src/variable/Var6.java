package variable;

public class Var6 {
	public static void main(String[] args) {
		// 만약 변수의 초기화를 진행하지 않으면 어떻게 될까?
		int a;

		// 해당 변수에 대해서 쓰임이 없다면 아무런 문제없이 컴파일 및 실행이 된다.
		// 하지만 쓰임이 없다면 굳이 변수를 선언할 필요가 없다. 그저 빈 공간을 아무런 의미 없는 것으로 채워두는 것이다.

		// 사용을 하게 되면 문제가 된다.
		// System.out.println(a);

		/**
		 * variable a might not have been initialized 컴파일 에러가 나온다.
		 * 변수가 초기화 되지 않앗다는 이야기를 하고 있다.
		 * 왜 이런 에러가 발생할까? 컴퓨터에서 메모리는 여러 시스템이 함께 사용하는 공간이다.
		 * 그래서 어떤 값 들이 보이지는 않지만 저장되고 있다.
		 * 변수를 선언하면 메모리상에 어떤 공간을 차지하고 사용하게 된다. 그런데 그 공간에 기존에 어떤 값이 있었는지는 알수 없다.
		 * 따라서 초기화를 하지 않으면 이전의 다른 메모리 값이 차지하고 있던 값이 나오게 될 수 있다.
		 * 이런 문제를 예뱡하기 위해서 자바는 변수를 초기화하도록 강제한다.
		 */

		/**
		 * 별도로 현재 메소드 안에서 사용되는 변수를 지역 변수라고 하는데,
		 * 클래스 변수, 인스턴스 변수는 초기화를 하지 않아도 컴파일 과정에서 초기화를 진행 해준다.
		 */

	}
}
