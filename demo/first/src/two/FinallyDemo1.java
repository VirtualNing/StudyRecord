/**  
 * @Title: FinallyDemo1.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-05 08:33:35 
 */
package two;

import java.util.Scanner;

/**  
 * @ClassName: FinallyDemo1
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-05 08:33:35 
*/
public class FinallyDemo1 {
	public static void main(String[] args) {
		// 模拟电脑运行程序
		System.out.println("Window Server 2008 启动!");
		// 设置模拟运行程序
		String[] strings = new String[] { "浏览器", "QQ音乐", "photoshop", "360" };
		// 提供参数传递的接口
		Scanner input1 = new Scanner(System.in);
		// 开始主动进行异常捕获
		try {
			// 输入开始运行的程序编号
			System.out.println("请输入运行程序编号");
			int num1 = input1.nextInt();
			// 确认是否运行改程序
			System.out.println("是否开始运行该程序");
			String b1 = input1.next();

			if (b1.equals("y")) {
				System.out.println("开始运行 " + strings[num1 - 1]);
			} else {
				System.out.println("未知错误!请重新输入");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("感谢您的使用!");
		}
		input1.close();

	}
}
