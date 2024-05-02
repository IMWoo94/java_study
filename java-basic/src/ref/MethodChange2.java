package ref;

public class MethodChange2 {
	public static void main(String[] args) {
		// dataA = x001;
		Data dataA = new Data();
		// x001.value = 10;
		dataA.value = 10;
		// x001.value
		System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
		changeReference(dataA);
		// x001.value
		System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
	}

	/**
	 * changeReference(dataA);
	 * changeReference(x001);
	 * dataX = x001
	 * dataX.value = 20;
	 * x001.value = 20;
	 */
	static void changeReference(Data dataX) {
		dataX.value = 20;
	}
}
