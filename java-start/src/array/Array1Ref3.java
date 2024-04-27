package array;

public class Array1Ref3 {
	public static void main(String[] args) {
		int[] students;
		/**
		 * 		students[0] = 90;
		 * 		students[1] = 80;
		 * 		students[2] = 70;
		 * 		students[3] = 60;
		 * 		students[4] = 50;
		 */
		students = new int[] {90, 80, 70, 60, 50};
		int[] students2 = new int[] {90, 80, 70, 60, 50, 111};
		int[] students3 = {90, 80, 70, 60, 50, 222};
		// 불가능
		int[] students4;
		// students4 = {90, 80, 70, 60, 50};

		/**
		 * 		System.out.println("students[0] = " + students[0]);
		 * 		System.out.println("students[1] = " + students[1]);
		 * 		System.out.println("students[2] = " + students[2]);
		 * 		System.out.println("students[3] = " + students[3]);
		 * 		System.out.println("students[4] = " + students[4]);
		 */
		for (int i = 0; i < students.length; i++) {
			System.out.println("students[" + i + "] = " + students[i]);
		}
		for (int i = 0; i < students2.length; i++) {
			System.out.println("students2[" + i + "] = " + students2[i]);
		}
		for (int i = 0; i < students3.length; i++) {
			System.out.println("students3[" + i + "] = " + students3[i]);
		}

	}
}
