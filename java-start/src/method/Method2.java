package method;

public class Method2 {
	public static void main(String[] args) {
		printHeader();
		System.out.println("프로그램이 동작합니다.");
		printFooter();
	}

	private static void printHeader() {
		System.out.println("= 프로그램을 시작합니다. = ");
		return; // 메소드의 반환타입이 없는 경우 즉, void 인 경우 return 은 생략가능.
		// 생략시 컴파일 때 return 을 자동으로 넣어준다.
	}

	private static void printFooter() {
		System.out.println("= 프로그램을 종료합니다 =");
	}
}
