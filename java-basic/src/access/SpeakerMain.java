package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		// 필드에 직접 접근
		// 직접 볼륨에 대해서 접근을 허용하게 되면서 시스템이 엉망이 되는 것을 알수 있다.
		System.out.println("volume 필드 직접 접근 수정");
		// 볼륨이라는 필드에 접근하지 못하도록 막을 방법이 필요하고 이때 접근 제어자를 통해서 제어할 수 있다.
		// private 제어자를 제공하면서 접근하지 못하도록 막히는 것을 볼수 있다.
		// speaker.volume = 200;
		// private 볼륨 필드를 수정하기 위해서는 volumeUp, volumeDown 을 통해서만 제어가 가능하다.
		speaker.showVolume();

		/**
		 * Java 접근 제어자 종류
		 * public - 모든 접근이 허용 된다.
		 * protected - 같은 패키지 내에서 허용가능하며, 상속을 받은 클래스에 대해서만 한정적으로 추가 허용
		 * default(package-private) - 생략하게 되면 기본적으로 적용되며, 같은 패키지 내에서만 접근이 가능하다.
		 * private - 외부 접근은 불가능하며, 내부 클래스 안에서만 접근 가능
		 */
	}
}
