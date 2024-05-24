package lang.string.test;

public class TestString9 {
	public static void main(String[] args) {
		String email = "hello@example.com"; // 코드 작성
		String[] strings = email.split("@");
		System.out.println(strings[0]);
		System.out.println(strings[1]);
	}
}
