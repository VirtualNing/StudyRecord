/**  
 * @Title: AnomalyTest.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-21 04:43:18 
 */
package two;

import java.util.Scanner;

/**  
 * @ClassName: AnomalyTest
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-21 04:43:18 
*/
public class AnomalyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// ��������һ����
		int string = input.nextInt();
		if (string == 3) {
			System.out.println("������ " + string);
		} else {
			System.out.println("��������,���� " + string);
		}
		input.close();
	}

}
