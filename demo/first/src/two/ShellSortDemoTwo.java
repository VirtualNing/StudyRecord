/**  
 * @Title: ShellSortDemoTwo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-21 03:53:18 
 */
package two;

import java.util.Arrays;

/**  
 * @ClassName: ShellSortDemoTwo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-21 03:53:18 
*/
public class ShellSortDemoTwo {
	// 实现接口方法
	public static void getResult(ShellSortDemoTwoInterface cale, int[] array) {
		System.out.println(Arrays.toString(cale.getArraySort(array)));//
	}

	public static void main(String[] args) {
		// 利用 Lambda 方法引用,实现数组的排序
		int[] array = new int[] { 9, 3, 7, 5, 1, 8, 4 };
		getResult(ShellSortDemoTwoTest::shellArraySort, array);
	}
}

//定义一个函数式接口
@FunctionalInterface
interface ShellSortDemoTwoInterface {
	public abstract int[] getArraySort(int[] array);
}

//定义一个类,该类下实现函数式接口的方法引用
class ShellSortDemoTwoTest {
	public static int[] shellArraySort(int[] array) {
		// 获得数组长度
		int len = array.length;
		// 定义两个变量
		// 保存后一个要比较的数值--temp
		int temp;
		// 保存从何处开始比较的下标
		int gap = len / 2;
		// 保证数组中的元素个数大于 1
		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				// 将后一个要比较的数值保存起来
				temp = array[i];
				// 获得前一个要比较的数值下标
				int perIndex = i - gap;

				// 判断前一个数值与后一个数值大小
				while (perIndex >= 0 && array[perIndex] > temp) {
					// 将前一个元素值赋值给后一个元素
					array[perIndex + gap] = array[perIndex];
					// 跳出循环,此时 perIndex = perIndex - gap
					perIndex -= gap;
				}
				// 将后一个元素的值赋值给前一个元素
				array[perIndex + gap] = temp;
			}
			// 再将数组分割
			gap /= 2;
		}
		return array;
	}
}