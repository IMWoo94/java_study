package variable;

public class Var8 {
	public static void main(String[] args) {
		//정수
		byte b = 127; //-128 ~ 127
		short s = 32767; // -32,768 ~ 32,767
		int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

		//-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long l = 9223372036854775807L;

		//실수
		float f = 10.0f;
		double d = 10.0;

		/**
		 * 메모리를 적게 사용하며 적은 숫자를 표현할 수 있고, 메모리를 많이 사용하면 그만큼 큰 숫자를 사용할 수 있다.
		 * 변수를 선언하면 타입에 따라 표현할수 있는 크기가 다르다.
		 *
		 * 정수형
		 * byte 	: -128 ~ 127 (1byte, 28)
		 * short 	: -32,768 ~ 32,767 (2byte, 216)
		 * int 		: -2,147,483,648 ~ 2,147,483,647 (약 20억) (4byte, 232)
		 * long 	: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte, 264)
		 *
		 * 실수형
		 * float 	: 대략 -3.4E38 ~ 3.4E38, 7자리 정밀도 (4byte, 232)
		 * double 	: 대략 -1.7E308 ~ 1.7E308, 15자리 정밀도 (8byte, 264)
		 *
		 * 기타
		 * boolean 	: true , false (1byte)
		 * char 	: 문자 하나(2byte)
		 */
	}
}
