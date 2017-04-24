/**
 * 
 */

/**
 * <pre>
 * 
 *   |_ CarTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 17.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		Car.setCompnay("현대");
		Car[] cars = {
			new Car("1"),new Car("2")
		};
		for(Car car : cars) {
			System.out.println(car);
		}
		System.out.println(String.format("%,d", 100000));
		System.out.println(Integer.parseInt("10000"));
	}
}
