package access;

public class BankAccount {

	// 은행 계좌의 잔액은 외부에 노출하지 않고, BankAccount 클래스의 기능에 의해서만 처리가 된다.
	private int balance;

	// BankAccount 클래스의 인스턴스는 어디서든 생성 가능하도록 한다.
	public BankAccount() {
		balance = 0;
	}

	// public 메서드: deposit
	// 입금 메소드를 접근 가능하도록 하여 잔액을 추가할 수 있다.
	public void deposit(int amount) {
		if (isAmountValid(amount)) {
			balance += amount;
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}

	// public 메서드: withdraw
	// 출금 메소드에 접근하여 잔액을 차감할 수 있다.
	public void withdraw(int amount) {
		if (isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
		}
	}

	// public 메서드: getBalance
	// 잔액을 외부에 허용하여 잔액 정보를 가져온다.
	public int getBalance() {
		return balance;
	}

	// private 메서드: isAmountValid
	// 출금, 입금 시 가능 금액 여부를 외부에 노출할 필요가 없다.
	// 내부 안에서만 검증에만 사용되는 메소드로 노출하지 않는다.
	private boolean isAmountValid(int amount) {
		// 금액이 0보다 커야함
		return amount > 0;
	}

}
