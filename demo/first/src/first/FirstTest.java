/**  
 * @Title: FirstTest.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-07 12:36:19 
 */
package first;

/**  
 * @ClassName: FirstTest
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-07 12:36:19 
*/
public class FirstTest {
	public static void main(String[] args) {
		// �����෽����ʵ��
		AbsTestDemo atd = new AbsTestDemo();
		atd.getAbs();
		// �ӿڷ�����ʵ��
		InterTestDemo itd = new InterTestDemo();
		System.out.println(itd.getNum());
	}
}

//����һ��������
abstract class TestDemo {
	// ����һ�����󷽷�
	abstract void getAbs();

	// ����һ�����巽��
	public static void printF() {
		System.out.println("�Ǻ�");
	}
}

//����һ���̳��� TestDemo ����
class AbsTestDemo extends TestDemo {
	public AbsTestDemo() {
	}

	// ʵ��/��д ����ĳ��󷽷�
	public void getAbs() {
		printF();// ֱ�ӵ��ü̳��Ը���Ĺ��з���
	}
}

//����һ���̳��� FirstInterface �ӿڵ���
class InterTestDemo implements FirstInterface {
	// ��д�ӿڵķ���
	public int getNum() {
		return num;
	}
}