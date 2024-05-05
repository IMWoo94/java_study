package access.a;

// 클래스에 접근 제어자는 public, default 만 적용 가능하다.
public class PublicClass {
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		DefaultClass1 class1 = new DefaultClass1();
		DefaultClass2 class2 = new DefaultClass2();
	}
}

class DefaultClass1 {
}

class DefaultClass2 {
}

// private class PrivateClass {
// }
//
// protected class ProtectedClass {
// }
