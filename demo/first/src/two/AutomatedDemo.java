/**  
 * @Title: AutomatedDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-10 10:38:07 
 */
package two;

import java.io.FileInputStream;
import java.io.IOException;

/**  
 * @ClassName: AutomatedDemo
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-10 10:38:07 
*/
public class AutomatedDemo {
	public static void main(String[] args) {
		ThrowsDemo t1 = new ThrowsDemo();
		try {
			t1.readFile(); // ���÷���
		} catch (IOException e) {
			System.out.println(e); // ����쳣 java.io.FileNotFoundException: .\test.txt (ϵͳ�Ҳ���ָ�����ļ���)
		}
	}
}

//����һ����,�ڸ��෽���������쳣��--- IOException
class ThrowsDemo {
	protected void readFile() throws IOException {
		FileInputStream file1 = new FileInputStream("./test.txt");
		int f;
		while ((f = file1.read()) != -1) {
			System.out.println((char) f); // ǿ������ת��Ϊ--- char
			f = file1.read(); // ����ȡ���Ľ����ֵ�� f
		}
		file1.close(); // �ر��ļ���ȡ
	}
}