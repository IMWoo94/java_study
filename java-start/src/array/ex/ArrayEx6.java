package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 숫자의 갯수를 입력하세요. :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.println(size + "개의 정수를 입력하세요:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("가장 작은 정수: " + min);
		System.out.println("가장 큰 정수: " + max);
	}
}
