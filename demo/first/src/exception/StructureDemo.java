/**  
 * @Title: StructureDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-23 06:34:20 
 */
package exception;

import java.util.Scanner;

/**  
 * @ClassName: StructureDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-23 06:34:20 
*/
public class StructureDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("开始输入学生信息----------");
		// 将容易发生错误的语句放在 try 语句块中
		try {

			System.out.println("输入姓名");
			String name = input.next();
			System.out.println("输入年龄");
			int age = input.nextInt();
			System.out.println("输入性别");
			String gendar = input.next();
			System.out.println("姓名：" + name);
			System.out.println("年龄：" + age);
			System.out.println("性别：" + gendar);
		} catch (Exception e) {
			System.out.println(e);
			e.toString();
		}
		input.close();

	}

}
