package oop1;

/**
 * 객체 지향
 */
public class MusicPlayerMain4 {
	public static void main(String[] args) {

		/**
		 * 음악플레이어를 보면 음악 플레이어가 가지는 속성 그리고 동작을 하나에 다 가지고 있다.
		 * 이는 캡슐안에 모여있는 것처럼 보인다.
		 * 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.
		 * 즉, 해당 객체 사물이 동작하는 정보를 외부에 알리지 않고 객체가 가지고 있으며 객체만이 할수있는 동작을 한다.
		 */
		MusicPlayer player = new MusicPlayer();

		// 음악 플레이어 켜기
		player.on();

		// 볼륨 증가
		player.volumeUp();
		// 볼륨 증가
		player.volumeUp();
		// 볼륨 증가
		player.volumeUp();

		//음악 플레이어 상태
		player.showStatus();

		//음악 플레이어 끄기
		player.off();
	}

}
