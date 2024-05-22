package poly.ex.sender;

public class FaceBookSender implements Sender {
	private final String name = "페이스북";

	@Override
	public void sendMessage(String message) {
		System.out.println(name + "에 발송합니다:" + message);
	}
}
