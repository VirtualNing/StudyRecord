/**  
 * @Title: ArraySortTestDemo.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-23 04:47:37 
 */
package two;

import java.util.Arrays;

/**  
 * @ClassName: ArraySortTestDemo
 * @Description: ����ð�ݡ�ϣ���㷨,����������
 * @author author
 * @date 2020-10-23 04:47:37 
*/
public class ArraySortTestDemo {
	// ���� Lambda �ķ�������
	static void getResult(ArraySortTestInterface cale, int[] array) {
		System.out.println(Arrays.toString(cale.getArraySort(array)));
	}

	public static void main(String[] args) {
		// ʵ�� Lambda ��������
		int[] array = new int[] { 3, 6, 1, 9, 5, 2, 4 };
		// ð������
		getResult(ArraySortShowDemo::bubbleSort, array);
		// ϣ������
		getResult(new ArraySortShowDemo()::shellSort, array);

	}
}

//��������ʽ�ӿ�
@FunctionalInterface
interface ArraySortTestInterface {
	public abstract int[] getArraySort(int[] array);
}

//����һ����,�ֱ�ʵ��ð�������ϣ������
class ArraySortShowDemo {
	protected static int[] bubbleSort(int[] array) {
		// ������鳤��
		int len = array.length;
		// ����ϴ�ֵ
		int temp;
		// �Ż�����
		boolean exchange;
		for (int i = 0; i < len; i++) {
			exchange = false;
			for (int j = len - 1; j > i; j--) {
				if (array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					exchange = true;
				}
			}
			if (!exchange)
				continue;
		}
		return array;
	}

	protected int[] shellSort(int[] array) {
		// �������鳤��
		int len = array.length;
		// ���������к�һ����ʼ�Ƚϵ���ֵ
		int temp;
		// ��������ʣ�౻�ָ��
		int gap = len / 2;

		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				temp = array[i];
				// ���ô�ʱҪ�Ƚϵ�ǰһ����ֵ�±�
				int perIndex = i - gap;

				// ������ֵ���бȽ�
				while (perIndex >= 0 && array[perIndex] > temp) {
					// ���ϴ�ֵ����Ų
					array[perIndex + gap] = array[perIndex];
					// ���� perIndex ��������ѭ��
					perIndex -= gap;
				}
				// ����Сֵ��ǰŲ
				array[perIndex + gap] = temp;
			}
			// �������ٴηָ�
			gap /= 2;
		}
		return array;
	}

}