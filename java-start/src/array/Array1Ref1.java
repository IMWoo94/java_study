package array;

public class Array1Ref1 {
	public static void main(String[] args) {
		/**
		 * 배열은 고정된 크기의 저장공간을 가지게 된다.
		 * 초기에 설정된 크기를 변경하거나 수정할 수 없다.
		 * 또한 저장된 공간에서 순차적으로 인덱스를 통해 데이터를 가져올 수 있다.
		 * 단, 0부터 시작한다.
		 */
		int[] students;
		students = new int[5];

		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		System.out.println("students[0] = " + students[0]);
		System.out.println("students[1] = " + students[1]);
		System.out.println("students[2] = " + students[2]);
		System.out.println("students[3] = " + students[3]);
		System.out.println("students[4] = " + students[4]);

		// 배열의 index 를 벗어나는 경우 오류가 발생
		System.out.println("students[5] = " + students[5]);

	}
}
