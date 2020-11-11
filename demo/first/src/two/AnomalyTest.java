/**  
 * @Title: AnomalyTest.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-21 04:43:18 
 */
package two;

import java.util.Scanner;

/**  
 * @ClassName: AnomalyTest
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-21 04:43:18 
*/
public class AnomalyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// 请输入任一数字
		int string = input.nextInt();
		if (string == 3) {
			System.out.println("是数字 " + string);
		} else {
			System.out.println("不是数字,而是 " + string);
		}
		input.close();
	}

}
