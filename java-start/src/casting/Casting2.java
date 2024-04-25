package casting;

public class Casting2 {
	public static void main(String[] args) {
		int intValue = 0;
		double doubleValue = 1.5;

		// 명시적 형변환
		// intValue = doubleValue // 컴파일 오류 발생
		intValue = (int)doubleValue; // int 로 형변환
		System.out.println(intValue); // 실수에서 정수로 변환하게 되면서 소수점 제거

	}
}
