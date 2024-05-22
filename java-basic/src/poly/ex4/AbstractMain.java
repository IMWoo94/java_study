package poly.ex4;

public class AbstractMain {
	public static void main(String[] args) {
		// 추상 클래스 생성 불가... 생성하기 위해서는 익명 클래스를 통해서 재정의 해야하는 클래스를 생성해야 한다.
		// AbstractAnimal animal = new AbstractAnimal();

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);

		moveAnimal(cat);
		moveAnimal(dog);
		moveAnimal(cow);
	}

	//동물이 추가 되어도 변하지 않는 코드
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}

	//동물이 추가 되어도 변하지 않는 코드
	private static void moveAnimal(AbstractAnimal animal) {
		System.out.println("동물 이동 테스트 시작");
		animal.move();
		System.out.println("동물 이동 테스트 종료");
	}
}
