/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class IdolGroup {
	
	public static void main(String[] args) {
		String[] groupName = {"빅뱅","2NE1","걸스데이"};
		String[][] groupMember = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"},
		};
		for(int i=0; i<groupName.length; i++) {
			System.out.println("<<"+groupName[i]+">>");
			for(int j=0; j<groupMember[i].length; j++) {
				System.out.println(groupMember[i][j]);
			}
			System.out.println();
		}
	}
}
