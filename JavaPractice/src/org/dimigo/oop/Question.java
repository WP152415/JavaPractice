/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

/**
 * <pre>
 * org.dimigo.oop
 *		|_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * <pre>
 *
 * @author 0707
 * @version 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] question = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answer = {"오혁", "박보영", "응용 프로그래밍"};
		
		Scanner scanner = new Scanner(System.in);
		// String answer = scanner.nextLine();
		
		for(int i=0; i<3; i++)
		{
			System.out.println(question[i]);
			String answer1 = scanner.nextLine();
			if(answer1.equals(answer[i]))
			{
				System.out.println("정답입니다!");
			}
			else System.out.println("틀렸습니다!");
		}
		
		System.out.println("<< 결과출력 >>");
		
		for(int i=0; i<3; i++)
		{
			StringBuilder sb = new StringBuilder(question[i]);
			System.out.println(sb.append(" "+answer[i])+"입니다.");
		}
	}
}
