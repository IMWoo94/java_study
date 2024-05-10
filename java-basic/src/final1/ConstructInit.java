package final1;

public class ConstructInit {
	// 필드 멤버에 final 이 선언되는 경우 생성자에 의해서 초기화가 꼭 진행되어야 한다.
	// 생성자가 아닌 경우 필드 변수에 값을 대입을 꼭 대입해서 초기화를 진행해야하며, 이럴경우 모든 인스턴스가 해당 필드에 대해서 값을 선언할 수 없으므로 동일한 값을 호출한다.
	final int value;
	// final int value = 10;

	public ConstructInit(int value) {
		this.value = value;
	}
}
