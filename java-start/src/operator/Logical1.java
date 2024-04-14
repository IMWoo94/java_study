package operator;

public class Logical1 {
	public static void main(String[] args) {
		System.out.println("&&: AND 연산");
		System.out.println(true && true); //true
		System.out.println(true && false);//false
		System.out.println(false && false);//false
		// AND 연산의 경우 왼쪽, 오른쪽 결과를 모두다 확인해야 한다.
		System.out.println();
		System.out.println("AND 연산의 경우 왼쪽, 오른쪽 결과를 모두다 확인해야 한다.");
		System.out.println(oper(true) && oper(true));
		System.out.println();

		System.out.println("||: OR 연산");
		System.out.println(true || true); //true
		System.out.println(true || false);//true
		System.out.println(false || false);//false
		// OR 연산의 경우 왼쪽이 true 면 오른쪽의 결과를 바라보지 않는다.
		System.out.println();
		System.out.println("OR 연산의 경우 왼쪽이 true 면 오른쪽의 결과를 바라보지 않는다.");
		System.out.println(oper(true) || oper(false));
		System.out.println();

		System.out.println("! 연산");
		System.out.println(!true); //false
		System.out.println(!false); //true

		System.out.println("변수 활용");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b); // false
		System.out.println(a || b); // true
		System.out.println(!a); // false
		System.out.println(!b); // true
	}

	public static boolean oper(boolean boll) {
		System.out.println("oper !!!");
		return boll;
	}
}
