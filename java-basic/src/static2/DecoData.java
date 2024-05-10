package static2;

public class DecoData {
	private int instanceValue;
	private static int staticValue;

	public static void staticCall() {
		// static 메소드의 경우 static 필드에 대해서만 접근이 가능하다.
		// 인스턴스 필드에 접근하기 위해서는 객체 생성 후 접근해야 한다.
		// instanceValue++;
		// 메소드도 동일하게 static 메소드만 접근이 가능하다.
		// instanceMethod();
		DecoData decoData = new DecoData();
		decoData.instanceValue++;
		decoData.instanceMethod();

		// 반면 static 필드와 메소드의 경우 바로 사용이 가능하다.
		staticValue++;
		staticMethod();
	}

	public void instanceCall() {
		instanceValue++; //인스턴스 변수 접근
		instanceMethod(); //인스턴스 메서드 접근
		staticValue++; //정적 변수 접근
		staticMethod(); //정적 메서드 접근
	}

	private void instanceMethod() {
		System.out.println("instanceValue=" + instanceValue);
	}

	private static void staticMethod() {
		System.out.println("staticValue=" + staticValue);
	}
}
