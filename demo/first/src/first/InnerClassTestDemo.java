/**  
 * @Title: InnerClassTestDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-12 04:05:03 
 */
package first;

/**  
 * @ClassName: InnerClassTestDemo
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-12 04:05:03 
*/
public class InnerClassTestDemo {
	public static void main(String[] args) {
		// ����������ʵ��Ƕ���� ����һ
		InnerClassTestDemoNest iCtD = new InnerClassTestDemoNest(20);
		iCtD.getNest();

		// ����������ʵ��Ƕ���� ������
		InnerClassTestDemoNest.OneMyNest iCtDoMn = (new InnerClassTestDemoNest(30)).new OneMyNest(50);
		iCtDoMn.getNum();
	}
}

//����һ��Ƕ����
class InnerClassTestDemoNest {
	// ����һ����Ա����
	private int num;

	// ����һ�����췽��
	public InnerClassTestDemoNest(int num) {
		this.num = num;
	}

	// ��һ���ڲ���
	public class OneMyNest {
		// �����Ա����
		private int num;

		// ���幹�췽��
		public OneMyNest(int num) {
			this.num = num + 10;
		}

		// �����Ա����
		public void getNum() {

			System.out.println(num);
		}
	}

	// ����һ����Ա����,���ڵ���˽�е��ڲ���
	public void getNest() {
		// ������ڲ������ڲ���
		OneMyNest omn = new OneMyNest(num);
		omn.getNum();
	}
}
