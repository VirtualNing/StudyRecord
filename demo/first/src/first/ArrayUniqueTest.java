/**  
 * @Title: ArrayUniqueTest.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-16 08:25:55 
 */
package first;

/**  
 * @ClassName: ArrayUniqueTest
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-16 08:25:55 
*/
public class ArrayUniqueTest {

	// ����ȥ�ؼ򵥲���,�˴�������int[] ���͸� String[] ����
	private StringBuilder getArrayStringUnique(String[] array) {
		// ��������ĳ���
		int len = array.length;
		// ����һ��������,���ȵ��� len
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < len; i++) {
			// ����������бȽ�,�����ַ���API lastIndexOf
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
