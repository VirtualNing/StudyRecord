/**  
 * @Title: StaticClassTestDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 12:57:13 
 */
package first;

/**  
 * @ClassName: StaticClassTestDemo
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 12:57:13 
*/
public class StaticClassTestDemo {
	// ����һ����̬���ڲ���
	static class A1 {
		// ����һ����Ա����
		private String str1;

		public A1(String str1) {
			this.str1 = str1;
		}

		// ��дһ�� toString ����
		public String toString() {
			return str1;
		}
	}

	// ����һ���ڲ���,������һ���ڲ���
	private class B1 {
		// ���ڲ��� B1 �з��� �ڲ��� A1,����Ҫ�����ⲿ���ʵ��
		StaticClassTestDemo.A1 a1 = new StaticClassTestDemo.A1("����A1");

		// ����һ������,��A1 �ĳ�Ա��ֵ�� B1 �ĳ�Ա
		private String str2 = a1.str1;
	}

	// ����һ������,���ʾ�̬�ڲ���ĳ�Ա����
	private void getMethod() {
		B1 b1 = new B1();
		System.out.println(b1.str2);
	}

	public static void main(String[] args) {
		// ʵ���ڲ���ķ���һ
		new StaticClassTestDemo().getMethod();
	}
}
