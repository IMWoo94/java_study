package lang.string.test;

public class TestString6 {
	public static void main(String[] args) {
		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";

		int count = 0;
		int index = 0;

		while (true) {
			if (str.indexOf(key, index + 1) != -1) {
				count++;
				index = str.indexOf(key, index + 1);
			} else {
				break;
			}
		}
		System.out.println("count = " + count);
	}
}
