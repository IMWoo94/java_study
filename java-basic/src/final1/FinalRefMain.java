package final1;

public class FinalRefMain {
	public static void main(String[] args) {
		final Data data = new Data();
		// data 의 변수는 final 에 의해서 초기화 후 변경이 불가능하다.

		// data = new Data();// 컴파일 오류

		// 그럼 data 인스턴스의 value 필드멤버는 수정이 가능할까?
		// 결론은 가능하다.
		data.value = 10;
		System.out.println(data.value);

		data.value = 20;
		System.out.println(data.value);
	}
}
