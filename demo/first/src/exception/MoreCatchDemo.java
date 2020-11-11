/**  
 * @Title: MoreCatchDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-23 09:35:31 
 */
package exception;

/**  
 * @ClassName: MoreCatchDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-23 09:35:31 
*/
public class MoreCatchDemo {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 4, 6, 8, 9, 10 };
		System.out.println(DichotomyTest.getIndexs(array, 0));

	}
}

//定义一个类,实现二分法检测
class DichotomyTest {
	protected static int getIndexs(int[] array, int key) {
		int len = array.length;
		int left = 0;
		int right = len - 1;
		try {

			while (left <= right) {
				int mid = (right + left) / 2;
				if (array[mid] == key) {
					return mid;
				} else if (array[mid] < key) {
					left = mid + 1;
				} else if (array[mid] > key) {
					right = mid - 1;
				} else {
					return -1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
