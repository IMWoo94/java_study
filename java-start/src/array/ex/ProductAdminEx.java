package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 1;
		String[] productNames = new String[size];
		int[] productPrices = new int[size];
		int productCount = 0;

		while (true) {
			System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
			System.out.print("메뉴를 선택하세요 :");
			int input = sc.nextInt();
			if (input == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (input == 2) {
				if (productCount == 0) {
					System.out.println("등록된 상품이 없습니다.");
					continue;
				}
				for (int i = 0; i < productCount; i++) {
					System.out.println(productNames[i] + ":" + productPrices[i] + "원");
				}
			} else if (input == 1) {
				if (productCount >= size) {
					System.out.println("더 이상 상품을 등록할 수 없습니다.");
					continue;
				} else {
					System.out.print("상품 이름을 입력하세요 : ");
					String name = sc.next();
					productNames[productCount] = name;

					System.out.print("상품 가격을 입력하세요 : ");
					int price = sc.nextInt();
					productPrices[productCount] = price;

					productCount++;
				}
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}

	}
}
