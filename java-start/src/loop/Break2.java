package loop;

public class Break2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		// for( 초기식; 조건식; 증감식 ) -> 초기식, 조건식, 증감식은 선택 사항이다.
		// 생략하는 경우 세미콜론만 제공하면 while(true) 와 같은 방식이다
		for (; ; ) {
			sum += i;
			if (sum > 10) {
				System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
				break;
			}
			i++;
		}
	}
}
