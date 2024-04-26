package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("상품의 가격을 입력하세요 ( -1 을 입력하면 종료 ) :");
			int price = scanner.nextInt();

			if (price == -1) {
				System.out.println("프로그램 종료");
				break;
			}

			System.out.print("구매하려는 수량을 입력하세요 : ");
			int quantity = scanner.nextInt();

			System.out.println("총 비용 : " + price * quantity);
		}
	}
}
