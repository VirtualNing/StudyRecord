/**  
 * @Title: ShellSortDemoTwo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-21 03:53:18 
 */
package two;

import java.util.Arrays;

/**  
 * @ClassName: ShellSortDemoTwo
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-21 03:53:18 
*/
public class ShellSortDemoTwo {
	// ʵ�ֽӿڷ���
	public static void getResult(ShellSortDemoTwoInterface cale, int[] array) {
		System.out.println(Arrays.toString(cale.getArraySort(array)));//
	}

	public static void main(String[] args) {
		// ���� Lambda ��������,ʵ�����������
		int[] array = new int[] { 9, 3, 7, 5, 1, 8, 4 };
		getResult(ShellSortDemoTwoTest::shellArraySort, array);
	}
}

//����һ������ʽ�ӿ�
@FunctionalInterface
interface ShellSortDemoTwoInterface {
	public abstract int[] getArraySort(int[] array);
}

//����һ����,������ʵ�ֺ���ʽ�ӿڵķ�������
class ShellSortDemoTwoTest {
	public static int[] shellArraySort(int[] array) {
		// ������鳤��
		int len = array.length;
		// ������������
		// �����һ��Ҫ�Ƚϵ���ֵ--temp
		int temp;
		// ����Ӻδ���ʼ�Ƚϵ��±�
		int gap = len / 2;
		// ��֤�����е�Ԫ�ظ������� 1
		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				// ����һ��Ҫ�Ƚϵ���ֵ��������
				temp = array[i];
				// ���ǰһ��Ҫ�Ƚϵ���ֵ�±�
				int perIndex = i - gap;

				// �ж�ǰһ����ֵ���һ����ֵ��С
				while (perIndex >= 0 && array[perIndex] > temp) {
					// ��ǰһ��Ԫ��ֵ��ֵ����һ��Ԫ��
					array[perIndex + gap] = array[perIndex];
					// ����ѭ��,��ʱ perIndex = perIndex - gap
					perIndex -= gap;
				}
				// ����һ��Ԫ�ص�ֵ��ֵ��ǰһ��Ԫ��
				array[perIndex + gap] = temp;
			}
			// �ٽ�����ָ�
			gap /= 2;
		}
		return array;
	}
}