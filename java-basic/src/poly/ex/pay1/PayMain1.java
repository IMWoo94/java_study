package poly.ex.pay1;

public class PayMain1 {
	public static void main(String[] args) {
		//kakao 결제
		pay("kakao", 5000);
		//naver 결제
		pay("naver", 10000);
		//잘못된 결제 수단 선택
		pay("bad", 15000);
	}

	public static void pay(String option, int amount) {
		PayService payService = new PayService();
		payService.processPay(option, amount);
	}

}
