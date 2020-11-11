/**  
 * @Title: ArrayUniqueTest.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-16 08:25:55 
 */
package first;

/**  
 * @ClassName: ArrayUniqueTest
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-16 08:25:55 
*/
public class ArrayUniqueTest {

	// 数组去重简单操作,此处仅处理int[] 类型跟 String[] 类型
	private StringBuilder getArrayStringUnique(String[] array) {
		// 保存数组的长度
		int len = array.length;
		// 创建一个空数组,长度等于 len
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < len; i++) {
			// 两个数组进行比较,利用字符串API lastIndexOf
			if (result.lastIndexOf(array[i]) == -1) {
				result.append(array[i] + ", ");
			}

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr1 = new int[] { 8, 3, 9, 8, 3 };
		String[] arr1 = { "ab", "ba", "ab", "bb", "aa", "bb" };
		StringBuilder result = new ArrayUniqueTest().getArrayStringUnique((arr1));
		System.out.println(result.substring(0));//
		if (arr1 instanceof String[]) {
			System.out.println(true);//
		}
	}

}
