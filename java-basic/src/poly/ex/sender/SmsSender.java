package poly.ex.sender;

public class SmsSender implements Sender {
	private final String name = "SMS";

	@Override
	public void sendMessage(String message) {
		System.out.println(name + "를 발송합니다:" + message);
	}
}
