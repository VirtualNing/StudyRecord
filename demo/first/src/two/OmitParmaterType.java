/**  
 * @Title: OmitParmaterType.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 07:01:13 
 */
package two;

/**  
 * @ClassName: OmitParmaterType
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-20 07:01:13 
*/
public class OmitParmaterType {
	// ���þֲ��ڲ�������̳� Interface1 �ӿ�
	private static Interface1 getResult(char symol) {
		Interface1 result; // ����һ���ӿ����͵ı���
		// ���ݲ�����ͬ,ִ�в�ͬ�ķ�����
		if (symol == '+') {
			// ���������Ļ�ò���������,�ʲ������Ϳ�ֱ��ʡ��
			// ���ֻ��һ������,��ʡ��С����
			// �������ִ������ֻ��һ�����,����ʡ�� return �������
			result = a -> a + Math.random();
		} else {
			result = a -> a - Math.random();
		}
		return result;
	}

	public static void main(String[] args) {
		Interface1 rAdd = getResult('+');
		System.out.println(rAdd.getDouble(3.5));

	}

}

//����һ���ӿ�
interface Interface1 {
	// �ӿ��ڶ��巽��
	public abstract double getDouble(double a);
}
