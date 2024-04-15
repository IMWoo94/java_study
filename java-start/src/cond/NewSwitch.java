package cond;

public class NewSwitch {
	public static void main(String[] args) {
		// grade 1:1000, 2:2000, 3:3000, 4:3000, 나머지: 500

		int grade = 3;

		int coupon = switch (grade) {
			case 1 -> {
				System.out.println(1000);
				// yield 예약어를 통해 제한된 식별자로 var 처럼 식별자로 사용이 가능합니다.
				// switch 에서 return 이전에 특정 작업을 하고 싶으면 아래와 같이 사용하면 됩니다.
				yield 1000;
			}
			case 2 -> 2000;
			case 3, 4 -> 3000;
			default -> 500;
		};

		int coupon2 = switch (2) {
			case 1 -> {
				System.out.println(1000);
				yield 1000;
			}
			case 2 -> {
				System.out.println(2000);
				yield 2000;
			}
			case 3, 4 -> 3000;
			default -> 500;
		};

		switch (grade) {
			case 1 -> System.out.println(1000);
			case 2 -> System.out.println(2000);
			case 3, 4 -> System.out.println(3000);
			default -> System.out.println(500);
		}

		switch (grade) {
			case 1 -> {
				System.out.println(1000);
				System.out.println(1000);
			}
			case 2 -> {
				System.out.println(2000);
				System.out.println(2000);
			}
			case 3, 4 -> {
				System.out.println(3000);
				System.out.println(3000);
			}
			default -> System.out.println(500);
		}

		System.out.println("발급받은 쿠폰 : " + coupon);
		System.out.println("발급받은 쿠폰 : " + coupon2);

	}
}