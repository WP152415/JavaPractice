/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 15.
 * <pre>
 *
 * @author 0707
 * @version 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// 1. for문
//		// 구구단 출력하기
//		for(int i=2; i<10; i++)
//		{
//			for(int j=1; j<10; j++)
//			{
//				System.out.printf("%d * %d = %d\t", i, j ,i*j);
//			}
//			System.out.println();
//		}
//
//		// 2. for-each 문
//		//int[] arr = {1,2,3,4,5};
//		
//		String[] twice = {"다현", "쯔위", "모모", "사나"};
//		for(String m : twice)
//		{
//			System.out.println(m);
//		}
//		
//		//do~while : 메뉴 처리
//		Scanner scanner = new Scanner(System.in);
//		int choice;
//		
//		do
//		{
//			System.out.println("<< 메뉴 선택 >>");
//			System.out.println("1. 치킨");
//			System.out.println("2. 피자");
//			System.out.println("9. 종료");
//			System.out.println("== 당신의 선택은? ==");
//			
//			choice = scanner.nextInt();
//			
//			switch (choice)
//			{
//			case 1 :
//				System.out.println("치킨~~~~~~~");
//				break;
//			case 2 :
//				System.out.println("피자~~~~~");
//				break;
//			case 9 :
//				System.out.println("다이어트 중");
//				scanner.close();
//				break;
//			default :
//				System.out.println("ss");
//			}
//		}while(choice != 9);
		
		Scanner scanner = new Scanner(System.in);
		
		int choice, str = 100, random;
		String[] chara = {"마법사", "영주", "기사", "농민"};
		
		System.out.println("<< 게임 메뉴 >>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		
		do
		{
			
			System.out.printf("메뉴 입력 => ");
			
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1 :
				str += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " +str);
				break;
			case 2 : 
				str -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " +str);
				break;
			case 3 : 
				random = new Random().nextInt(4);
				System.out.println(chara[random]+"(으)로 설정되었습니다.");
				break;
			case 9 :
				System.out.println("이제 공부하세요!");
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
				continue;
			}
		}while(choice != 9);
	}
}