/**  
 * @Title: StructureDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-23 06:34:20 
 */
package exception;

import java.util.Scanner;

/**  
 * @ClassName: StructureDemo
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-23 06:34:20 
*/
public class StructureDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ʼ����ѧ����Ϣ----------");
		// �����׷�������������� try ������
		try {

			System.out.println("��������");
			String name = input.next();
			System.out.println("��������");
			int age = input.nextInt();
			System.out.println("�����Ա�");
			String gendar = input.next();
			System.out.println("������" + name);
			System.out.println("���䣺" + age);
			System.out.println("�Ա�" + gendar);
		} catch (Exception e) {
			System.out.println(e);
			e.toString();
		}
		input.close();

	}

}
