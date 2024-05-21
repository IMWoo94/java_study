package extends1.ex2;

public class CarMain {
	public static void main(String[] args) {
		/**
		 * ElectricCar 클래스는 Car 라는 클래스를 상속받은 클래스 이다.
		 * new ElectricCar() 를 통해 인스턴스를 생성하게 되면, ElectricCar 클래스의 인스턴스도 생성이 되지만 Car 클래스의 인스턴스도 생성이 된다.
		 * ElectricCar 의 기본 생성자를 살펴보면 아무 명령어가 없는게 아닌 상속받은 클래스를 호출하는 걸 알 수 있다.
		 * 	public ElectricCar() {
		 * 		super();
		 *        }
		 * 	 electricCar 이 x001 이라는 주소를 받으면 이 주소 안에는 Car,  ElectricCar 두가지의 인스턴스가 포함되어 있다.
		 */
		// electricCar == x001
		ElectricCar electricCar = new ElectricCar();
		// x001.move() -> x001(Car, ElectricCar) move() 메소드를 찾는다.
		// ElectricCar 에서는 move() 메소드가 없기에, 부모 클래스의 Car 에서 move() 메소드를 검색
		// 부모 클래스의 move() 메소드 호출
		electricCar.move();
		electricCar.charge();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}
