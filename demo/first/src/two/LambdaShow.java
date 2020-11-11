/**  
 * @Title: LambdaShow.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-16 10:11:03 
 */
package two;

/**  
 * @ClassName: LambdaShow
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-16 10:11:03 
*/
public class LambdaShow {

	public static void main(String[] args) {
		// ����ʵ�ֲ�ͬ�ӿڷ���
		AddAndSubtract add = AlgShow.getResult('+');
		AddAndSubtract subtract = AlgShow.getResult('-');
		System.out.println(add.addOrSub(5, 9));//
		System.out.println(subtract.addOrSub(8, 19));//

		// Lambda ������ʵ�ּ̳нӿڲ�ͬ����
		AddAndSubtract lAdd = LambdaImprove.getResult('+');
		System.out.println(lAdd.addOrSub(1, 4));//
	}

}

//����һ���ӿ�
@FunctionalInterface // ��ʾ���Ǹ�����ʽ�ӿ�
interface AddAndSubtract {
	// ����һ������,Ҫʵ�ּӷ����߼���
	public abstract int addOrSub(int a, int b);
}

//����һ����,������ʵ�ֽӿڵļ̳�
class AlgShow {
	// ����һ������,�÷�����ʵ�־ֲ������ڲ���̳нӿ�
	// �÷�������ֵΪ Ҫ�̳еĽӿ�����
	public static AddAndSubtract getResult(char symbol) {
		// ����һ���ӿ����͵ı���
		AddAndSubtract result;

		// ʹ��������̳нӿ�
		if (symbol == '+') {
			result = new AddAndSubtract() {
				public int addOrSub(int a, int b) {

					return a + b;
				}
			};
		} else {
			result = new AddAndSubtract() {
				public int addOrSub(int a, int b) {
					return a - b;
				}
			};
		}
		return result;
	}
}

//Lambda ��������ļ̳�
class LambdaImprove {
	// ͬ����һ��������ʵ�ֽӿڵķ���
	public static AddAndSubtract getResult(char symbol) {
		// ����һ���ӿ���ı���
		AddAndSubtract result;
		if (symbol == '+') {
			result = (int a, int b) -> {
				return a + b;
			};
		} else {
			result = (int a, int b) -> {
				return a - b;
			};
		}
		return result;
	}
}
