package lang.wrapper;

public class WrapperUtilsMain {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 반환
		Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 반환
		int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 반환

		// 비교
		int a = i1.compareTo(i2);
		int b = i1.compareTo(20);
		int c = i1.compareTo(9);
		// 내 값이 크면 1, 같으면 0, 작으면 -1  // 기본적으로 오름차순 정렬

		// 산술 연산
		System.out.println("sum: " + Integer.sum(10, 20));
		System.out.println("min: " + Integer.min(10, 20));
		System.out.println("max: " + Integer.max(10, 20));
	}
}
