package ref;

public class NullMain3 {
	public static void main(String[] args) {
		// 지역변수 bigData 를 선언하고 BigData 클래스의 인스턴스를 생성하고 참조값을 대입했다.
		// x001
		BigData bigData = new BigData();
		// x001 에 다가가서 인스턴스 필드 값의 count 값을 가져온다.
		// 별도로 선언하지 않았지만, count primitive type 으로 자동 초기화된 값을 가져올수 있다.
		System.out.println("bigData.count=" + bigData.count);
		// data 의 경우 reference type 으로 null 로 가져온다.
		System.out.println("bigData.data=" + bigData.data);
		// 여기까지는 문제가 없다. 왜냐 bigData 의 인스턴스가 존재하기도 하고, 필드값만 가져오는데 있어서는 문제가 없다.

		//NullPointerException
		System.out.println("bigData.data.value=" + bigData.data.value);
		// 문제가 되는 부분이다.
		// 이전의 단계에서 bigData.data 까지는 문제 없이 가져올 수 있었다. 단, null 이라는 값을 가져올 뿐
		// bigData.data.value > null.value > ???
		// 위를 보면 null 이라는 주소값을 찾아서 value 를 가져와야하는데 null 은 주소가 없다는 뜻이다.
	}
}
