package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
	public static void main(String[] args) {
		// Class 조회
		Class clazz = String.class; // 1.클래스에서 조회
		//Class clazz = new String().getClass();// 2.인스턴스에서 조회
		//Class clazz = Class.forName("java.lang.String"); // 3.문자열로 조회

		// 모든 필드 조회
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println("Field: " + field.getType() + " " +
				field.getName());
		}

		// 모든 메서드 출력
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println("Method: " + method);
		}

		// 상위 클래스 정보 출력
		System.out.println("Superclass: " + clazz.getSuperclass().getName());

		// 인터페이스 정보 출력
		Class[] interfaces = clazz.getInterfaces();
		for (Class i : interfaces) {
			System.out.println("Interface: " + i.getName());
		}
	}
}
