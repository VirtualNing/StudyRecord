/**  
 * @Title: NoStaticDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 12:37:50 
 */
package first;

/**  
 * @ClassName: NoStaticDemo
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 12:37:50 
*/
public class NoStaticDemo {
	// ����һ���ڲ���
	private class NestClassTest {
		// The field num cannot be declared static in a non-static inner type, unless
		// initialized with a constant expression
		// �ֶ�num�����ڷǾ�̬�ڲ�����������Ϊ��̬�������ó������ʽ��ʼ��
		// private static int num = 10; ����д��
		private static final int num = 10;
		private int sum = 10;
	}

	public static void main(String[] args) {
		// ��̬��������ͨ����������
		System.out.println(NestClassTest.num);
		// �Ǿ�̬������Ҫͨ���ڲ����ʵ������
		System.out.println(new NoStaticDemo().new NestClassTest().sum);
	}
}
