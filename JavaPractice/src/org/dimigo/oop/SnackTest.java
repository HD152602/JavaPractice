/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class SnackTest {
	
	public static void main(String[] args) {
		int total = 0;
		Snack[] sarr = new Snack[] {
			new Snack("새우깡","농심",1100,2), new Snack("콘칲","크라운",1200,1),new Snack("허니버터칩","해태",1500,4)	
		};
		for(int i =0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
			total+=sarr[i].calcPrice();
		}
		System.out.println("총 구매 금액 : "+String.format("%,d", total)+"원");
	}
}
