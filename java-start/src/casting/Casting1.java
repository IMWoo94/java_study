package casting;

public class Casting1 {
	public static void main(String[] args) {
		int intValue = 10;
		long longValue;
		double doubleValue;

		// 묵시적 형변환 ( 작은 범위의 타입이 큰 범위의 타입으로 변경되는 경우에만 적용 )
		longValue = intValue; // int -> long
		/**
		 * longValue = intValue; // int -> long
		 * longValue = (long)intValue;
		 */
		System.out.println("longValue: " + longValue);
		doubleValue = intValue; // int -> double
		System.out.println("doubleValue: " + doubleValue);
		doubleValue = 20L;
		System.out.println("doubleValue: " + doubleValue);
	}
}
