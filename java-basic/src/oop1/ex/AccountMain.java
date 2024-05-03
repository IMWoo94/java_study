package oop1.ex;

public class AccountMain {
	public static void main(String[] args) {
		// 계좌 생성
		Account account = new Account();

		// 10000원 입금
		account.deposit(10000);
		// 9000원 출금
		account.withdraw(9000);

		// 2000원 출금 하지만 잔액 부족
		account.withdraw(2000);

		// 잔액 확인
		account.showBalance();
	}
}
