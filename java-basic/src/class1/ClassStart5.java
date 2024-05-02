package class1;

public class ClassStart5 {
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

		// x111 이라는 배열 인스턴스 안에는 각각의 student 접근 가능한 주소값이 들어가게된다.
		Student[] students = {student1, student2};
		//for문 적용
		for (int i = 0; i < students.length; i++) {
			System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
		}
		for (Student s : students) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
	}
}
