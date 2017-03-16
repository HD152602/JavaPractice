/**
 * 
 */
package org.dimigo.basic;
/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
import java.util.*;
public class Loop {

	public static void main(String[] args) {
		int power = 100, jobChoice;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int choice;
		String[] job = {"","마법사","영주","기사","농민"};
		
		do {
			System.out.println("--------------------\n<<게임 메뉴>>\n1. 공격력 증가\n2. 공격력 감소"
					+ "\n3. 캐릭터 설정\n9. 종료\n\n--------------------\n");
			choice = scan.nextInt();
			System.out.println("메뉴 입력 => "+choice);
			switch(choice) {
			case 1:
				power+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+power+"\n");
				break;
			case 2:
				power-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+power+"\n");
				break;
			case 3:
				jobChoice = random.nextInt(4)+1;
				System.out.println(job[jobChoice]+"(으)로 설정되었습니다.\n");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!\n");
			}
		}while(choice!=9);
	}

}
