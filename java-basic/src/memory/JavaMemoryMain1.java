package memory;

public class JavaMemoryMain1 {
	// main 스택 프레임 생성
	public static void main(String[] args) {
		System.out.println("main start");
		// main 스택 프레임에 method1() 등록
		method1(10);
		System.out.println("main end");
	}
	// main 스택 프레임 제거

	// method1 스택 프레임 생성
	static void method1(int m1) {
		System.out.println("method1 start");
		int cal = m1 * 2;
		// method1 스택 프레임에 method2() 등록
		method2(cal);
		System.out.println("method1 end");
	}
	// method1 스택 프레임 제거

	// method2 스택 프레임 생성
	static void method2(int m2) {
		System.out.println("method2 start");
		System.out.println("method2 end");
	}
	// method2 스택 프레임 제거
}
