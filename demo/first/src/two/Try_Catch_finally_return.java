/**  
 * @Title: Try_Catch_finally_return.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-06 02:48:47 
 */
package two;

import java.util.StringJoiner;

/**  
 * @ClassName: Try_Catch_finally_return
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-06 02:48:47 
*/
public class Try_Catch_finally_return {

	// ����һ��˽�з���,���� int ����
	private static int getNumber() {
		int i = 1; // ��ʼ������������ֵ
		StringJoiner str1 = new StringJoiner(", "); // ��ʼ����������
		// ��׽�쳣
		try {
			i++;
			str1.add(i + ""); // �ַ�������׷���ַ�
			System.out.println("try: " + i);
			// ��ӡ����
			System.out.println("tryList: " + str1);
			// try �����д��� return
			return i;
		} catch (Exception e) {
			i++;
			str1.add(i + ""); // �ַ�������׷���ַ�
			System.out.println("catch: " + i);
			// ��ӡ����
			System.out.println("tryList: " + str1);
			// catch �����д��� return
			return i;
		} finally {

			i++;
			// �ַ�������׷���ַ�
			str1.add(i + "");
			System.out.println("finally: " + i); // ��� 4
			// ��ӡ����
			System.out.println("finallyList: " + str1); // finallyList: 2, 3, 4
		}
	}

	public static void main(String[] args) {
		System.out.println(getNumber());

	}

}
