package ref;

public class VarChange2 {
	public static void main(String[] args) {
		// Data 클래스의 인스턴스
		// x001
		Data dataA = new Data();
		// 인스턴스의 value 의 값을 대입
		dataA.value = 10;

		// Data 클래스의 인스턴스를 복사합니다.
		Data dataB = dataA;
		/**
		 * dataB = dataA;
		 * dataB = x001;
		 */
		System.out.println(dataA == dataB);

		System.out.println("dataA 참조값=" + dataA);
		System.out.println("dataB 참조값=" + dataB);
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);

		//dataA 변경
		dataA.value = 20;
		/**
		 * dataA.value = 20;
		 * x001.value = 20;
		 */
		System.out.println("변경 dataA.value = 20");
		// dataA.value > x001.value
		System.out.println("dataA.value = " + dataA.value);
		// dataB.value > x001.value
		System.out.println("dataB.value = " + dataB.value);

		//dataB 변경
		dataB.value = 30;
		System.out.println("변경 dataB.value = 30");
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);

	}
}
