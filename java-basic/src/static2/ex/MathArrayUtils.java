package static2.ex;

public class MathArrayUtils {

	private MathArrayUtils() {
	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}

	public static double average(int[] array) {
		int sum = sum(array);
		int size = array.length;
		return (double)sum / size;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
