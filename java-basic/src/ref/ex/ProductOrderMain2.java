package ref.ex;

public class ProductOrderMain2 {
	public static void main(String[] args) {
		// 여러 상품의 주문 정보를 담는 배열 생성
		ProductOrder[] orders = new ProductOrder[3];

		// createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
		orders[0] = createOrder("두부", 2000, 2);
		orders[1] = createOrder("김치", 5000, 1);
		orders[2] = createOrder("콜라", 1500, 2);

		// printOrders()를 사용해서 상품 주문 정보 출력
		printOrders(orders);
		// getTotalAmount()를 사용해서 총 결제 금액 계산
		int totalAmount = getTotalAmount(orders);
		// 총 결제 금액 출력
		System.out.println("totalAmount = " + totalAmount);
	}

	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}

	static void printOrders(ProductOrder[] orders) {
		for (ProductOrder order : orders) {
			System.out.println("상품명:" + order.productName + ", 가격:" + order.price + ", 수량:" + order.quantity);
		}
	}

	static int getTotalAmount(ProductOrder[] orders) {
		int total = 0;
		for (ProductOrder order : orders) {
			total += order.price * order.quantity;
		}
		return total;
	}
}
