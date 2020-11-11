/**  
 * @Title: LambdaVisitVarible.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 10:29:58 
 */
package two;

/**  
 * @ClassName: LambdaVisitVarible
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 10:29:58 
*/
public class LambdaVisitVarible {
	// ����һ����̬����
	private static int valueStatic = 20;
	// ����һ��ʵ������
	private int value = 10;

	// ����һ����̬����,ʵ�ֽӿڵļ̳�
	public static VaribleDemo getAdd() {
		final int s = 1;
		VaribleDemo result = (a, b) -> {
			// ��̬������ֻ��ֱ�ӵ����ⲿ�ľ�̬����
			valueStatic++;
			return a + b + s;
		};

		return result;
	}

	// ����һ��ʵ������,ʵ�ֽӿڵļ̳�
	public VaribleDemo getSub() {
		final int s = 2;
		VaribleDemo result = (a, b) -> {
			int c = a - b - value - s;
			valueStatic--;
			return c;
		};
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getAdd().getFollow(10, 20));
		System.out.println(valueStatic);// 21

		System.out.println(new LambdaVisitVarible().getSub().getFollow(10, 20));
		System.out.println(valueStatic);// 20
	}
}

//����һ���ӿ�
interface VaribleDemo {
	public abstract int getFollow(int a, int b);
}