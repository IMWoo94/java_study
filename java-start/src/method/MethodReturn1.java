package method;

public class MethodReturn1 {
	public static void main(String[] args) {
		boolean result = odd(2);
		System.out.println(result);

		System.out.println(text());
	}

	public static boolean odd(int i) {
		boolean result = false;
		try {
			if (i % 2 == 0) {
				// 메소드에서 return 을 만나게 되면 아래 로직을 무시하고 종료된다.
				result = true;
				return result;
			}
		} catch (Exception e) {

		} finally {
			// return 을 만나도 finally 는 동작하게 됩니다.
			System.out.println("finally");
			result = false;
			// return result;
		}

		System.out.println("짝수라면 날 볼 수 없어요.");
		return result;
	}

	public static String text() {
		String str = "basic";
		try {
			System.out.println("try");
			str = "try!";
			return str;
		} catch (Exception e) {
			System.out.println("catch");
			str = "catch!";
			// return str;
		} finally {
			System.out.println("finally");
			str = "finally!";
			// return str;
		}
		return str;
	}
}
