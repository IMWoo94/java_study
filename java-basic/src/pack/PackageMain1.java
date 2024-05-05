package pack;

public class PackageMain1 {
	public static void main(String[] args) {
		// 동일 패키지에 있는 클래스라면 바로 사용 가능
		Data data = new Data();

		// 패키지가 다른 경우 패키지 경로를 포함하여 알려주어야 합니다.
		pack.a.User user = new pack.a.User();
	}
}
