package operator.ex;

public class OperationEx1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int sum = num1 + num2 + num3;
		// 소수점 x
		int average = sum / 3;
		double avg = sum / 3.0;

		System.out.println(sum);
		System.out.println(average);
		System.out.println(avg);
	}
}
