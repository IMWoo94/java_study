package method;

public class Method1 {
	public static void main(String[] args) {
		/**
		 * 메소드의 필요성
		 * 동일한 로직을 하나의 기능으로 제공하면서 필요한 부분을 입맛대로 골라서 사용할 수 있다.
		 * 또한 메소드를 구성하게 되면 소스는 수정하는 과정에서 메소드만 수정하면 된다는 장점이 있다.
		 */
		// 계산
		int a = 1;
		int b = 2;
		System.out.println(a + " + " + b + " 연산 수행");
		int sum1 = a + b;
		System.out.println("결과 1 출력 : " + sum1);

		// 계산
		int x = 10;
		int y = 20;
		System.out.println(x + " + " + y + " 연산 수행");
		int sum2 = x + y;
		System.out.println("결과 1 출력 : " + sum2);
	}
}
