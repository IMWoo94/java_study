package lang.wrapper.test;

public class WrapperTest4 {
	public static void main(String[] args) {
		String str = "100"; // 코드 작성

		Integer num = Integer.parseInt(str);
		int result = num;
		Integer num2 = result;

		System.out.println("num = " + num);
		System.out.println("result = " + result);
		System.out.println("num2 = " + num2);
	}
}
