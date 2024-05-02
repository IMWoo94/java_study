package class1;

public class ClassStart4 {
	public static void main(String[] args) {
		Student student1;
		student1 = new Student();
		// student1 = x001
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;

		Student student2;
		student2 = new Student();
		// student2 = x002
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		// students 라는 변수를 Stack 에 생성하고, students 의 실제 메모리 heap 에 배열 인스턴스를 만들어낸다.
		// 만들면서 접근할 수 있는 주소 x111 이라는 값이 students 변수의 값으로 가지게 된다.
		// x111 이라는 배열 인스턴스 안에는 각각의 student 접근 가능한 주소값이 들어가게된다.
		Student[] students = {student1, student2};
		// Student[] students = {x001, x002};
		System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
		System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

		// students[0].name -> students 변수의 값 x111 을 통해서 실제 배열의 인스턴스를 찾아 갑니다.
		// 실제 배열의 인스턴스에서 0번쨰 인덱스의 값을 가져온다.
		// 해당 가져온 값은 student1 학생 인스턴스에 접근가능한 주소값을 가지고 있습니다.
		// 따라서 해당 주소값을 통해 name 의 값을 가져온다.

		/**
		 * students[0].name
		 * x111[0].name
		 * x001.name
		 */
	}
}
