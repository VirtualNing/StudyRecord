/**  
 * @Title: LocalNestClassTest.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 07:28:23 
 */
package first;

/**  
 * @ClassName: LocalNestClassTest
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 07:28:23 
*/
public class LocalNestClassTest {

	public static void main(String[] args) {
		// �ֲ��ڲ����ʵ��
		LocalNestClassTestDemo lc1 = new LocalNestClassTestDemo();
		lc1.getLocalNest();
	}

}

class LocalNestClassTestDemo {
	// ����һ��ʵ����Ա
	private int a = 100;

	// ����һ���ֲ��ڲ���
	protected void getLocalNest() {
		class A1 {
			int a, b;

			public A1() {
				// �ֲ��ڲ����Ա�������ⲿ���Ա����һ�µ������
				// ʹ�� ����.this.��Ա����,�޸� this ָ��
				this.a = LocalNestClassTestDemo.this.a;
				// �ֲ��ڲ���ĳ�Ա������ֲ��ڲ�����ڲ����Ա����һ�µ������
				// ��ʹ�þֲ��ڲ�����ڲ����ʵ������
				this.b = new A1ToB1().b;
			}

			// �ھֲ��ڲ������ٶ���һ���ڲ���
			class A1ToB1 {
				int b = 20;
			}
		}
		// ���þֲ��ڲ����Ա
		A1 a1 = new A1();
		System.out.println(a1.a * a1.b);//

	}
}
