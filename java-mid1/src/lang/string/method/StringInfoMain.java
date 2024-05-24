package lang.string.method;

public class StringInfoMain {
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("문자열의 길이: " + str.length());
		System.out.println("문자열이 비어 있는지: " + str.isEmpty());
		System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank());

		String empty = "   ";
		System.out.println("문자열이 비어 있는지: " + empty.isEmpty());
		System.out.println("문자열이 비어 있거나 공백인지1: " + empty.isBlank());

		System.out.println("문자열이 비어 있거나 공백인지2: " + "		".isBlank());
		char c = str.charAt(7);
		System.out.println("7번 인덱스의 문자: " + c);

		// 벗어난 인덱스를 접근하게 되면 예외 발생
		// str.charAt(12);
	}
}
