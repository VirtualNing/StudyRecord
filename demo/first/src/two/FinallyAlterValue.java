/**  
 * @Title: FinallyAlterValue.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-10 09:42:44 
 */
package two;

import java.util.StringJoiner;

/**  
 * @ClassName: FinallyAlterValue
 * @Description: TODO(����)
 * @author author
 * @date 2020-11-10 09:42:44 
*/
public class FinallyAlterValue {

	public static void main(String[] args) {
		// ʵ����
		System.out.println(FinallyAlterValueDemo1.getArrayJoiner());

	}
}

//����һ����
class FinallyAlterValueDemo1 {
	protected static StringJoiner getArrayJoiner() {
		// ����һ���ɱ��ַ�������
		StringJoiner sj1 = new StringJoiner(", ");
		// �ֶ�����������
		try {
			sj1.add("try");
			System.out.println("tryList: " + sj1);
			return sj1;
		} finally {
			sj1.add("finally"); // �����������͵ķ���ֵ��˵,finally ���ܽ���ı��
			System.out.println("finallyList: " + sj1);
		}
	}
}
