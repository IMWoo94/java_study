package final1;

public class FinalLocalMain {
	public static void main(String[] args) {
		final int data1;
		data1 = 10;// final 예약어를 지역변수에 사용 시 최초 한번의 초기화만 가능하다.
		// Variable 'data1' might already have been assigned to
		// 컴파일 오류
		// data1 = 20;

		//final 지역 변수2
		final int data2 = 10;
		//data2 = 20; //컴파일 오류

		method(10);

		// 단, 기본타입이 아닌 객체 타입 배열과 같은 여러 저장소라면 객체의 주소값에 대해서 변경이 불가능할 뿐, 실제 인스턴스 안의 변수는 수정이 가능하다.
		final int[] array1 = {1, 2, 3, 4};
		int[] array2 = {5, 6};
		// array1= array2; // 컴파일 오류

		// 배열의 실제 인스턴스의 접근해서 안의 존재하는 값은 수정이 가능하다.
		/**
		 * 왜 가능할까?
		 * 이는 Java 에서 객체 타입을 변수에 선언하게 되면, 변수의 값은 주소의 참조값을 가지게 된다.
		 * final 이라는 예약어는 변수의 값을 최초로 한번만 작성할 수 있다는 것이다.
		 * 주소의 값을 바꿀 수는 없지만 해당 주소로 접근 가능한 인스턴스에 대해서 수정이 불가능한 것은 아니다.
		 * 그렇기 때문에 final 을 사용한다고 해서 무조건 값을 수정하지 못한다는 것은 아니므로 함정을 조심하자.
		 */
		array1[0] = 2;
	}

	//final 매개변수
	static void method(final int parameter) {
		// parameter = 20;
		//컴파일 오류
	}
}
