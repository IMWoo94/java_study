package variable;

public class Var2 {
	public static void main(String[] args) {
		int a; // 변수 선언

		// 이전과 같이 10의 값을 30으로 변경하는데 이번에는 변수에 할당 된 값을 바꾸어 본다.
		a = 20; // 변수 초기화
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);

		/**
		 * 변수의 값만 변경했음에도, 출력 값이 변경된 값으로 처리가 되는 것을 알 수 있다.
		 * 이 과정을 자세히 보면 " a " 라는 변수를 담아두고, 변수에 값을 할당 합니다.
		 * 그렇다면, 실행을 하면 실행 시점의 " a " 라는 변수를 가져오면서, a 가 가지고 있는 값을 찾아서 가져오게 되는 것이다.
		 */
	}
}
