package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 숫자의 갯수를 입력하세요. :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		double average;

		System.out.println(size + "개의 정수를 입력하세요:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		average = (double)sum / arr.length;
		System.out.println("입력한 정수의 합계: " + sum);
		System.out.println("입력한 정수의 평균: " + average);
	}
}
