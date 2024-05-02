package ref;

public class NullMain1 {
	public static void main(String[] args) {
		Data data = null;
		System.out.println("data = " + data);
		// x001 참조값 대입
		data = new Data();
		System.out.println("2. data = " + data);
		// x001 참조값을 null 로 바꾸면서 x001 에 대한 정보가 없어진다.
		// 이와 같이 x001 이 더이상 어떠한 변수에서도 사용되지 않으면 Java 는 GC 에 의해서 삭제가 된다.
		data = null;
		System.out.println("3. data = " + data);

	}
}
