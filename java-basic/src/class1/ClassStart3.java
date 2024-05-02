package class1;

public class ClassStart3 {
	public static void main(String[] args) {
		// 학생 클래스의 인스턴스
		// Stack 에 student1 이라는 변수가 생성되어 등록.
		Student student1;
		// Heap 에 Student 객체를 하나 생성하고, 해당 주소값을 Stack student1 변수에 값에 대입
		student1 = new Student();
		System.out.println(student1);
		// 필드값 등록
		// 단, 아래와 같이 직접적으로 필드에 접근하는 것은 좋은 방식은 아니다.
		// 8bcc55f 주소값을 통해 Student 객체를 찾아간 후 name 의 값에 대입
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;

		Student student2;
		student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		//  8bcc55f 주소값을 통해 Student 객체를 찾아간 후 name 의 값을 가져온다.
		System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성 적:" + student1.grade);
		System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성 적:" + student2.grade);
	}
}
