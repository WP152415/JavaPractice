/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ TypeCasting
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 10.
 * <pre>
 *
 * @author 0707
 * @version 1.0
 */
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. 자동 형변환 : 작은 타입 -> 큰 타입
		byte b = 10;
		int i = b;
		System.out.printf("%d, %d", b, i);

		// 2. 강제 형변환 : 큰 타입 -> 작은 타입 (Casting)
		
		b = (byte) i;
		
		// 강제 형변환 주의사항 (값의 범위)
		
		int i2 = 128;
		byte b2 = (byte) i2; 
		System.out.println(b2);
		
		long l = 10000000000l;
		int i3 = (int) l;
		System.out.println(i3);
	}

}
