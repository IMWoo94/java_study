package loop.ex;

public class WhileEx2 {
	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		while (count < 10) {
			num++;
			if (num % 2 != 0) {
				continue;
			}
			System.out.println(num);
			count++;
		}

	}
}
