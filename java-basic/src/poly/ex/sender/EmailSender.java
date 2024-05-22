package poly.ex.sender;

public class EmailSender implements Sender {
	private final String name = "메일";

	@Override
	public void sendMessage(String message) {
		System.out.println(name + "를 발송합니다:" + message);
	}
}
