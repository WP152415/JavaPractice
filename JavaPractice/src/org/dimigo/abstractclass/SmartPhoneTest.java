/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * <pre>
 *
 * @author 0707
 * @version 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone a = new IPhone("iPhone 7", "애플", 900000);
		SmartPhone s = new Galaxy("갤럭시 S8", "삼성", 800000);
		
		System.out.println(a);
		System.out.println(s);
		
		a.turnOn();
		s.turnOn();
		
		a.pay();
		s.pay();
		
		a.useSpecialFunction();
		s.useSpecialFunction();
		
		a.turnOff();
		s.turnOff();
		
		
		

	}

}
