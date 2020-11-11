/**  
 * @Title: LambdaOfPara.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 08:09:45 
 */
package two;

/**  
 * @ClassName: LambdaOfPara
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 08:09:45 
*/
public class LambdaOfPara {
	// ʵ�ֳ�����--LambdaAbstractDemo
	static LambdaAbstractDemo getInt(char symol) {
		LambdaAbstractDemo result;
		if (symol == '+') {
			result = (a, b) -> a + b;
		} else {
			result = (a, b) -> a - b;
		}
		// �˴����ص��Ǳ��ʽ,�����ǽ��
		return result;
	}

	// ���պ�����Ϊ����
	private static int getInt(LambdaAbstractDemo cale, int a, int b) {
		return cale.getResult(a, b);
	}

	public static void main(String[] args) {
		int a = 10, b = 30;
		// �ȿ��Խ��պ�����Ϊ����
		System.out.println(getInt(getInt('+'), a, b));
		// ����Խ��� Lambda ���ʽ��Ϊ����
		System.out.println(getInt((c, d) -> {
			return c - d;
		}, a, b));
	}
}

//����һ��������
interface LambdaAbstractDemo {
	public abstract int getResult(int a, int b);
}