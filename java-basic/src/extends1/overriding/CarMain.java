package extends1.overriding;

public class CarMain {
	public static void main(String[] args) {
		// ElectricCar 의 경우 부모 클래스의 move() 메소드를 재정의 했다.
		// 재정의하게 되면서 부모 클래스의 move() 가 아닌 ElectricCar 의 move() 메소드가 호출이 된다.
		// 이는 상속 받은 클래스를 생성하면서 메모리 과정을 보면 왜 이렇게 되는지 이어서 보자.
		/**
		 * ElectricCar 클래스의 인스턴스를 생성하면서 x001 이라는 주소를 받게 된다.
		 * x001 안에는 ElectricCar 의 인스턴스와, Car 의 인스턴스가 함께 포함되게 된다.
		 * 여기서 현재 x001 인스턴스의 타입은 ElectricCar 이므로 ElectricCar 가 가지고 있는 메소드가 가장 우선순위를 가진다.
		 * move() 메소드를 호출하게 되면, ElectricCar 가 가지는 move() 메소드를 찾아 호출한다.
		 * 여기서 만약 재정의가 되어 있지 않았다면, 부모클래스 Car 의 move() 를 찾아 호출하게 된다.
		 */
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();

		// 여기서 만약 ElectricCar 인스턴스를 부모 클래스로 캐스팅을 한다면 그럼 부모 클래스의 move() 를 호출하게 될까?
		Car car = (Car)electricCar;
		// 부모 클래스의 move 를 호출하기를 기대했지만, 실제로는 car 의 인스턴스는 ElectricCar 타입이다.
		// 그렇기 때문에 ElectricCar 의 move() 메소드가 호출되는 것이다.
		car.move();

		GasCar gasCar = new GasCar();
		gasCar.move();
	}
}
