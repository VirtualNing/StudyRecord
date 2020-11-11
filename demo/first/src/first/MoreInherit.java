/**  
 * @Title: MoreInherit.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-14 11:46:39 
 */
package first;

import java.util.Arrays;

/**  
 * @ClassName: MoreInherit
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-14 11:46:39 
*/
public class MoreInherit {

	public static void main(String[] args) {
		// int[] array = new int[] { 4, 6, 8, 9, 3, 1, 5 };
		MoreInheritC mc1 = new MoreInheritC();
		mc1.show();

	}

}

//����һ���ӿ�
interface MoreInheriToC {
	// ����һ������,��ӡ����
	public abstract int[] getUnique(int[] array);
}

//����һ��A��
class MoreInheritA {
	// ����һ��ϣ������ķ���
	protected int[] getArraySort(int[] array) {
		// ���ȱ������鳤��
		int len = array.length;
		// �ڶ�����������,temp�����һ���Ƚϵ�ֵ,gap ���浱ǰҪ�Ƚϵ�ֵ
		int temp, gap = len / 2;

		// ȷ��������Լ������
		while (gap > 0) {

			for (int i = gap; i < len; i++) {
				// �����Ƚ�,temp �����һ��ֵ
				temp = array[i];
				// perIndex �����ʼҪ�Ƚϵ�ֵ
				int perIndex = i - gap; // �� 0 λ�ÿ�ʼ

				// �ж�ǰ������ֵ��С
				while (perIndex >= 0 && array[perIndex] > temp) {
					// �Ե�λ��
					array[perIndex + gap] = array[perIndex];
					// ����ѭ��
					perIndex -= gap;
				}
				// �ٶԵ�һ��,���λ��ת��
				array[perIndex + gap] = temp;
			}
			// �ٲ��
			gap /= 2;
		}
		return array;
	}
}

//����һ��B��
class MoreInheritB {
	// ����һ�����ַ����ҵ�ָ��Ԫ���±�ķ���
	protected int getArrayIndex(int[] array, int key) {
		// ���ҵ���ʼλ��
		int left = 0;
		// ����λ��
		int right = array.length - 1;

		// ȷ�����������ҷ�Χ
		while (left <= right) {
			// �м�λ��
			int mid = (right - left) / 2;
			// ����Ҫ���ҵ�Ԫ�ظպ�Ϊ �м��Ԫ��
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				right = mid - 1; // Ҫ���ҵ�Ԫ��С�� �м��Ԫ��,����λ������Ų
			} else if (array[mid] < key) {
				left = mid + 1; // Ҫ���ҵ�Ԫ�ش����м��Ԫ��,��ʼλ������Ų
			} else {
				return -1;
			}
		}
		return -1;
	}
}

//����һ��C��,������ʹ���ڲ���̳�A��,B��,�ӿ�
class MoreInheritC {

	// ʹ�þֲ��ڲ���̳�A��
	public int[] getArrayShow(int[] array) {

		class ForA extends MoreInheritA {
			private int[] array;

			public ForA(int[] array) {
				// ���ø���ķ���
				this.array = super.getArraySort(array);
			}

			// ���� array

			public int[] getArray() {
				return array;
			}

		}
		ForA result = new ForA(array);
		return result.getArray();
	}

	// ʹ��ʵ���ڲ���̳�B��
	class ForB extends MoreInheritB {
		private int num;

		public ForB(int[] array, int key) {
			this.num = super.getArrayIndex(array, key);
		}

		// ���� �±�
		public int getIndex() {
			return num;
		}
	}

	// ����
	public void show() {
		int[] arrays = new int[] { 4, 6, 8, 7, 3, 1, 5 };
		MoreInheritC.ForMoreInheriToC mfc1 = new MoreInheritC.ForMoreInheriToC();
		System.out.println(Arrays.toString(mfc1.getUnique(arrays)));
	}

	// ʹ�þ�̬�ڲ���̳�
	static class ForMoreInheriToC implements MoreInheriToC {
		// ��д�ӿڵķ���
		public int[] getUnique(int[] array) {
			// ��̬�ڲ���Ҫ�����ⲿ��ķ���,��Ҫ�ⲿ���ʵ������
			int[] tsetArray = new MoreInheritC().getArrayShow(array);
			return tsetArray;
		}
	}

}
