package cond;

public class If6 {
	public static void main(String[] args) {
		int price = 10_000;
		int age = 10;
		int discount = 0;

		if (price >= 10_000) {
			discount += 1_000;
			System.out.println("10,000원 이상 구매, 1,000원 할인");

		} else if (age <= 10) {
			discount += 1_000;
			System.out.println("어린이 1,000원 할인");
		} else {
			System.out.println("할인 없음");
		}

		System.out.println("총 할인 금액: " + discount + "원");
	}
}
