/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones = {
			new IPhone("Iphone 7","애플",900000),new Galaxy("갤럭시 S8","삼성",800000)	
		};
		for(SmartPhone i:phones) {
			System.out.println(i);
			i.turnOn();
			i.pay();
			i.useSpecialFunction();
			i.turnOff();
			System.out.println();
		}
	}
}
