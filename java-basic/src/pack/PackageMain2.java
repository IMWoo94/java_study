package pack;

import pack.a.User;

public class PackageMain2 {
	public static void main(String[] args) {
		Data data = new Data();

		// 패키지가 다른 경우 패키지 경로를 포함하여 알려주어야 합니다.
		// pack.a.User user = new pack.a.User();
		// 하지만 여기서 패키지의 경로가 엄청나게 길면? xxxx~~xxxx 와 같이 있으면 다 적어주고 그걸 언제 다 위치를 외우고 맞는지 확인하는 것도 어렵다.
		// import 를 통해서 다른 패키지에 있는 클래스를 가져와서 쓸 수 있습니다.
		// import 를 통해 타 패키지 정보를 가져왔기 때문에 클래스명만 사용해서 쓸 수 있다.
		User user = new User();
	}
}
