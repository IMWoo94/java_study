package pack;

import pack.a.User;
// 클래스 이름이 같으면 하나만 import 할 수 있다.
// import pack.b.User;

public class PackageMain3 {
	public static void main(String[] args) {
		Data data = new Data();
		// 패키지의 강점은 같은 클래스명을 가져도 다른 기능을 가져갈 수 있다.
		// 이는 장점이기도 하지만 단점이 될수도 있다.
		// 클래스명이 중복이 많다면 원하는 클래스명을 가져오기 위해서 확인이 필요하다.

		User userA = new User();
		pack.b.User userB = new pack.b.User();
	}
}
