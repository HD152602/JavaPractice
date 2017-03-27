/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class CarTest3 {
	public static void main(String[] args) {
		Car3 h = new Car3("현대자동차","제네시스","검정색",225,50000000);
		Car3 k = new Car3("기아자동차","K7","흰색",246);
		Car3 s = new Car3("삼성자동차","SM7","회색");
		//h.setColor("검정색");
		//h.setCompany("현대자동차");
		//h.setMaxSpeed(225);
		//h.setModel("제네시스");
		//h.setPrice(50000000);
		
		//k.setColor("흰색");
		//k.setCompany("기아자동차");
		//k.setMaxSpeed(246);
		//k.setModel("K7");
		//k.setPrice(40000000);
		
		//s.setColor("회색");
		//s.setCompany("삼성자동차");
		//s.setMaxSpeed(200);
		//s.setModel("SM7");
		//s.setPrice(28000000);
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+h.getCompany()+"\n모델명 : "+h.getModel()+"\n색상 : "+h.getColor()+"\n최대속도 : "+h.getMaxSpeed()+"km\n가격 : "+String.format("%,d", h.getPrice())+"원\n");
		System.out.println("제조사명 : "+k.getCompany()+"\n모델명 : "+k.getModel()+"\n색상 : "+k.getColor()+"\n최대속도 : "+k.getMaxSpeed()+"km\n가격 : "+String.format("%,d", k.getPrice())+"원\n");
		System.out.println("제조사명 : "+s.getCompany()+"\n모델명 : "+s.getModel()+"\n색상 : "+s.getColor()+"\n최대속도 : "+s.getMaxSpeed()+"km\n가격 : "+String.format("%,d", s.getPrice())+"원\n");

	}
}
