/**  
 * @Title: Try_Catch_finally_return.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-06 02:48:47 
 */
package two;

import java.util.StringJoiner;

/**  
 * @ClassName: Try_Catch_finally_return
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-06 02:48:47 
*/
public class Try_Catch_finally_return {

	// 定义一个私有方法,返回 int 类型
	private static int getNumber() {
		int i = 1; // 初始化基本类型数值
		StringJoiner str1 = new StringJoiner(", "); // 初始化引用类型
		// 捕捉异常
		try {
			i++;
			str1.add(i + ""); // 字符串数组追加字符
			System.out.println("try: " + i);
			// 打印数组
			System.out.println("tryList: " + str1);
			// try 语句块中带有 return
			return i;
		} catch (Exception e) {
			i++;
			str1.add(i + ""); // 字符串数组追加字符
			System.out.println("catch: " + i);
			// 打印数组
			System.out.println("tryList: " + str1);
			// catch 语句块中带有 return
			return i;
		} finally {

			i++;
			// 字符串数组追加字符
			str1.add(i + "");
			System.out.println("finally: " + i); // 输出 4
			// 打印数组
			System.out.println("finallyList: " + str1); // finallyList: 2, 3, 4
		}
	}

	public static void main(String[] args) {
		System.out.println(getNumber());

	}

}
