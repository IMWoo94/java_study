package access.limit;

import access.Speaker;

public class SpeakerChild extends Speaker {

	public SpeakerChild(int volume) {
		super(volume);
	}

	public static void main(String[] args) {
		SpeakerChild speaker = new SpeakerChild(100);
		// speaker.volume = 10;
	}
}
