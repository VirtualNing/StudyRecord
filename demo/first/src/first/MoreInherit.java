/**  
 * @Title: MoreInherit.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-14 11:46:39 
 */
package first;

import java.util.Arrays;

/**  
 * @ClassName: MoreInherit
 * @Description: TODO(描述)
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

//定义一个接口
interface MoreInheriToC {
	// 定义一个方法,打印数组
	public abstract int[] getUnique(int[] array);
}

//定义一个A类
class MoreInheritA {
	// 定义一个希尔排序的方法
	protected int[] getArraySort(int[] array) {
		// 首先保存数组长度
		int len = array.length;
		// 在定义两个变量,temp保存后一个比较的值,gap 保存当前要比较的值
		int temp, gap = len / 2;

		// 确保数组可以继续拆分
		while (gap > 0) {

			for (int i = gap; i < len; i++) {
				// 两两比较,temp 保存后一个值
				temp = array[i];
				// perIndex 保存最开始要比较的值
				int perIndex = i - gap; // 从 0 位置开始

				// 判断前后两个值大小
				while (perIndex >= 0 && array[perIndex] > temp) {
					// 对调位置
					array[perIndex + gap] = array[perIndex];
					// 跳出循环
					perIndex -= gap;
				}
				// 再对调一次,完成位置转换
				array[perIndex + gap] = temp;
			}
			// 再拆分
			gap /= 2;
		}
		return array;
	}
}

//定义一个B类
class MoreInheritB {
	// 定义一个二分法查找的指定元素下标的方法
	protected int getArrayIndex(int[] array, int key) {
		// 先找到开始位置
		int left = 0;
		// 结束位置
		int right = array.length - 1;

		// 确保不超出查找范围
		while (left <= right) {
			// 中间位置
			int mid = (right - left) / 2;
			// 假设要查找的元素刚好为 中间的元素
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				right = mid - 1; // 要查找的元素小于 中间的元素,结束位置往左挪
			} else if (array[mid] < key) {
				left = mid + 1; // 要查找的元素大于中间的元素,开始位置往右挪
			} else {
				return -1;
			}
		}
		return -1;
	}
}

//定义一个C类,该类下使用内部类继承A类,B类,接口
class MoreInheritC {

	// 使用局部内部类继承A类
	public int[] getArrayShow(int[] array) {

		class ForA extends MoreInheritA {
			private int[] array;

			public ForA(int[] array) {
				// 借用父类的方法
				this.array = super.getArraySort(array);
			}

			// 返回 array

			public int[] getArray() {
				return array;
			}

		}
		ForA result = new ForA(array);
		return result.getArray();
	}

	// 使用实例内部类继承B类
	class ForB extends MoreInheritB {
		private int num;

		public ForB(int[] array, int key) {
			this.num = super.getArrayIndex(array, key);
		}

		// 返回 下标
		public int getIndex() {
			return num;
		}
	}

	// 测试
	public void show() {
		int[] arrays = new int[] { 4, 6, 8, 7, 3, 1, 5 };
		MoreInheritC.ForMoreInheriToC mfc1 = new MoreInheritC.ForMoreInheriToC();
		System.out.println(Arrays.toString(mfc1.getUnique(arrays)));
	}

	// 使用静态内部类继承
	static class ForMoreInheriToC implements MoreInheriToC {
		// 重写接口的方法
		public int[] getUnique(int[] array) {
			// 静态内部类要调用外部类的方法,需要外部类的实例访问
			int[] tsetArray = new MoreInheritC().getArrayShow(array);
			return tsetArray;
		}
	}

}
