package variable.ex;

public class VarEx3Question {
	/**
	 * 클래스 이름: `VarEx3`
	 * `long` 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하세요.
	 * `boolean` 타입의 변수를 선언하고, 그 변수를 `true` 로 초기화한 후 출력하는 프로그램을 작성하세요.
	 */

	static class VarEx3 {
		long num = 10000000000L;
		boolean boll = true;
	}

	public static void main(String[] args) {
		VarEx3 varEx3 = new VarEx3();

		System.out.println(varEx3.num);
		System.out.println(varEx3.boll);
	}
}
