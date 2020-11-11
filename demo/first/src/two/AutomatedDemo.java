/**  
 * @Title: AutomatedDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-10 10:38:07 
 */
package two;

import java.io.FileInputStream;
import java.io.IOException;

/**  
 * @ClassName: AutomatedDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-10 10:38:07 
*/
public class AutomatedDemo {
	public static void main(String[] args) {
		ThrowsDemo t1 = new ThrowsDemo();
		try {
			t1.readFile(); // 调用方法
		} catch (IOException e) {
			System.out.println(e); // 输出异常 java.io.FileNotFoundException: .\test.txt (系统找不到指定的文件。)
		}
	}
}

//定义一个类,在该类方法下声明异常类--- IOException
class ThrowsDemo {
	protected void readFile() throws IOException {
		FileInputStream file1 = new FileInputStream("./test.txt");
		int f;
		while ((f = file1.read()) != -1) {
			System.out.println((char) f); // 强制类型转换为--- char
			f = file1.read(); // 将读取到的结果赋值给 f
		}
		file1.close(); // 关闭文件读取
	}
}