/**  
 * @Title: FinallyDemo1.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-05 08:33:35 
 */
package two;

import java.util.Scanner;

/**  
 * @ClassName: FinallyDemo1
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-05 08:33:35 
*/
public class FinallyDemo1 {
	public static void main(String[] args) {
		// ģ��������г���
		System.out.println("Window Server 2008 ����!");
		// ����ģ�����г���
		String[] strings = new String[] { "�����", "QQ����", "photoshop", "360" };
		// �ṩ�������ݵĽӿ�
		Scanner input1 = new Scanner(System.in);
		// ��ʼ���������쳣����
		try {
			// ���뿪ʼ���еĳ�����
			System.out.println("���������г�����");
			int num1 = input1.nextInt();
			// ȷ���Ƿ����иĳ���
			System.out.println("�Ƿ�ʼ���иó���");
			String b1 = input1.next();

			if (b1.equals("y")) {
				System.out.println("��ʼ���� " + strings[num1 - 1]);
			} else {
				System.out.println("δ֪����!����������");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("��л����ʹ��!");
		}
		input1.close();

	}
}
