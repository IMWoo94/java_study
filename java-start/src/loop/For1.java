package loop;

public class For1 {
	public static void main(String[] args) {

		// for( 초기식; 조건식; 증감식 )
		/**
		 * 1. 초기식을 통해 초기화
		 * 2. 초기화 값을 조건식에 맞추어 true, false 를 확인
		 * 2-1. true 인 경우 for 문 안의 코드가 동작
		 * 2-2. false 인 경우 for 코드 동작 하지 않고 for 문의 마지막으로 가며, 이후 다음 코드 실행
		 * 3. 증감식에 의해서 초기값 증감
		 * 4. 조건식 재 확인 이후 반복
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
