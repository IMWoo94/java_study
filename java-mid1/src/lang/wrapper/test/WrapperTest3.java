package lang.wrapper.test;

public class WrapperTest3 {
	public static void main(String[] args) {
		String str = "100"; // 코드 작성

		Integer num = Integer.parseInt(str);
		int result = num.intValue();
		Integer num2 = Integer.valueOf(result);

		System.out.println("num = " + num);
		System.out.println("result = " + result);
		System.out.println("num2 = " + num2);
	}
}
