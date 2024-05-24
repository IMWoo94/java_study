package lang.string.test;

public class TestString2 {
	public static void main(String[] args) {
		String[] arr = {"hello", "java", "jvm", "spring", "jpa"}; // 코드 작성
		int len = 0;
		for (String str : arr) {
			len += str.length();
		}
		System.out.println("len = " + len);
	}
}
