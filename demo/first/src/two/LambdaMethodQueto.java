/**  
 * @Title: LambdaMethodQueto.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 11:38:28 
 */
package two;

/**  
 * @ClassName: LambdaMethodQueto
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 11:38:28 
*/
public class LambdaMethodQueto {
	// ����һ������,ʵ��Lambda ��������
	static void getResult(MethodQuote cale, int a, int b) {
		System.out.println(cale.getFollow(a, b));
	}

	public static void main(String[] args) {
		getResult(MethodQuetoClass::getAdd, 10, 30);
		getResult(new MethodQuetoClass()::getSub, 10, 30);

	}

}

//����һ������ʽ�ӿ�
@FunctionalInterface
interface MethodQuote {
	public abstract int getFollow(int a, int b);
}

//����һ����
class MethodQuetoClass {
	// Ҫ���õķ��������ʽҪ�� �ӿڷ���һ��
	public static int getAdd(int a, int b) {
		return a + b;
	}

	public int getSub(int a, int b) {
		return a - b;
	}
}