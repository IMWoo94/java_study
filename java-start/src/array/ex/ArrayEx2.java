package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요:");

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("출력");
		String join = String.join(",", Arrays.stream(arr).mapToObj(String::valueOf).toList());
		System.out.println(join);
	}
}
