package oop1;

/**
 * 메서드 추출
 */
public class MusicPlayerMain3 {
	public static void main(String[] args) {
		/**
		 * 아래와 같이 하면서 각각의 기능을 분리해서 만들어내면서 깔끔하게 구현했다.
		 * 하지만 여기서 한가지 아쉬운 점은 MusicPlayerData 의 필드를 main 에서 메소드를 통해 처리한다는 점이 아쉽다.
		 * MusicPlayerData 필드의 값은 MusicPlayerData 안에서 관리한다면 어떤 동작을 아는지 알 수 있지 않을까?
		 * 만약 현재 음악 플레이어의 동작이 바뀌게 된다면 MusicPlayerData 와 main 에 메소드 2곳을 수정해야 한다.
		 * 음악 플레이어와 관련된 것이라면 한곳에 모아두는 것이 어떨까.
		 */
		MusicPlayerData data = new MusicPlayerData();

		// 음악 플레이어 켜기
		on(data);

		// 볼륨 증가
		volumeUp(data);

		// 볼륨 증가
		volumeUp(data);

		// 볼륨 증가
		volumeUp(data);

		//음악 플레이어 상태
		showStatus(data);

		//음악 플레이어 끄기
		off(data);
	}

	private static void off(MusicPlayerData data) {
		data.isOn = false;
		System.out.println("음악 플레이어를 종료합니다");
	}

	private static void showStatus(MusicPlayerData data) {
		System.out.println("음악 플레이어 상태 확인");
		if (data.isOn) {
			System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
	}

	private static void volumeUp(MusicPlayerData data) {
		data.volume++;
		System.out.println("음악 플레이어 볼륨 : " + data.volume);
	}

	private static void on(MusicPlayerData data) {
		data.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
}
