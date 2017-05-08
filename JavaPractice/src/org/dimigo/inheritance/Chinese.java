/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Chinese
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class Chinese extends Person{
	public Chinese(String name) {
		super(name);
	}
	public void sayHello() {
		System.out.println("ni hao");
	}
	public void sayBye() {
		System.out.println("zai jian");
	}
	public String toString() {
		return "저는 중국사람 "+super.getName()+"입니다.";
	}
}
