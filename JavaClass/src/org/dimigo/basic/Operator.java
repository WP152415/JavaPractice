/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 10.
 * <pre>
 *
 * @author 0707
 * @version 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. 산술 연산자
		int a = 5, b = 2;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println( (double) a / b);
		
		// 2. 다른 타입과의 연산 (큰 타입으로 자동 변환)
		int i = 10;
		double d = 3.14;
		int r1 = (int) (i + d);
		
		// int 보다 작은 타입과의 연산 (int 타입으로 자동 변환)
		short s1 = 1, s2 = 2;
		short r2 = (short) (s1 + s2);
		
		// 3. short-circuit 테스트
		boolean flag = true;
		a = 10;
		b = 0;
		
		// OR 연산은 true가 될 가능성이 높은 것을 먼저 작성
		if (flag || (a / b == 0))
		{
			System.out.println("OR 연산");
		}
		
		// And 연산은 false가 될 가능성이 높은 것을 먼저 작성
		if (!flag && a / b == 0)
		{
			System.out.println("And 연산");
		}
		
		// 4. 문자열 연결 연산자
		String school = "디미고";
		int grade = 2, ban = 4;
		String name = "나자바";
		
		System.out.println(school + (grade + ban) + name);
		System.out.println(grade + (ban + school) + name);
	}

}
