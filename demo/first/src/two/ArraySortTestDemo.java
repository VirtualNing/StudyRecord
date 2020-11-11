/**  
 * @Title: ArraySortTestDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-23 04:47:37 
 */
package two;

import java.util.Arrays;

/**  
 * @ClassName: ArraySortTestDemo
 * @Description: 利用冒泡、希尔算法,给数组排序
 * @author author
 * @date 2020-10-23 04:47:37 
*/
public class ArraySortTestDemo {
	// 利用 Lambda 的方法引用
	static void getResult(ArraySortTestInterface cale, int[] array) {
		System.out.println(Arrays.toString(cale.getArraySort(array)));
	}

	public static void main(String[] args) {
		// 实现 Lambda 方法引用
		int[] array = new int[] { 3, 6, 1, 9, 5, 2, 4 };
		// 冒泡排序
		getResult(ArraySortShowDemo::bubbleSort, array);
		// 希尔排序
		getResult(new ArraySortShowDemo()::shellSort, array);

	}
}

//建立函数式接口
@FunctionalInterface
interface ArraySortTestInterface {
	public abstract int[] getArraySort(int[] array);
}

//创建一个类,分别实现冒泡排序和希尔排序
class ArraySortShowDemo {
	protected static int[] bubbleSort(int[] array) {
		// 获得数组长度
		int len = array.length;
		// 保存较大值
		int temp;
		// 优化排序
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
		// 保存数组长度
		int len = array.length;
		// 保存数组中后一个开始比较的数值
		int temp;
		// 保存数组剩余被分割部分
		int gap = len / 2;

		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				temp = array[i];
				// 设置此时要比较的前一个数值下标
				int perIndex = i - gap;

				// 两个数值进行比较
				while (perIndex >= 0 && array[perIndex] > temp) {
					// 将较大值往后挪
					array[perIndex + gap] = array[perIndex];
					// 重置 perIndex ，并跳出循环
					perIndex -= gap;
				}
				// 将较小值往前挪
				array[perIndex + gap] = temp;
			}
			// 将数组再次分割
			gap /= 2;
		}
		return array;
	}

}