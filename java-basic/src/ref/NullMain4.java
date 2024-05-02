package ref;

public class NullMain4 {
	public static void main(String[] args) {
		// bigData = x001
		BigData bigData = new BigData();
		// bigData.data = x002
		// x001.data = x002
		bigData.data = new Data();
		System.out.println("bigData.count=" + bigData.count);
		System.out.println("bigData.data=" + bigData.data);
		// bigData.data.value > x001.data.value > x002.value
		System.out.println("bigData.data.value=" + bigData.data.value);
	}
}
