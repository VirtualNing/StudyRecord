/**  
 * @Title: AyClassOuter.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-14 08:04:43 
 */
package first;

/**  
 * @ClassName: AyClassOuter
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-14 08:04:43 
*/
public class AyClassOuter {

	public static void main(String[] args) {
		AyClassSonShow ac1 = new AyClassSonShow();
		ac1.arrayHeavy();

	}

}

//定义一个类,该类的方法由子类实现
class AyClassPerson {
	// 定义一个方法,该方法用于查找元素下标
	public int getArrayIndex(String[] str, String key) {
		return -1;
	}
}

//定义一个类,在该类下需要实现父类的匿名类继承,接口的匿名类继承
class AyClassSonShow {
	// 定义一个无序字符串数组
	private String[] strArray = new String[] { "1", "6", "1", "9", "6", "8", "9", "8" };

	// 用于测试

	// 先实现接口匿名类
	AyClassInterface aCi1 = new AyClassInterface() {
		// 重写接口的方法,实现数组排序
		public String[] getArraySort(String[] str) {
			// 需要进行字符串数组转整数数组操作,Integer.parseInt();
			// 排完序后再转回字符串数组 toString();
			int[] myArray = new int[str.length];
			int len = str.length;
			for (int i = 0; i < len; i++) {
				myArray[i] = Integer.parseInt(str[i]);
			}
			// 希尔排序
			int temp, gap = len / 2; // gap 是指当前数组长度的一半
			// gap > 0 是指数组还可以分组查找
			while (gap > 0) {

				for (int j = gap; j < len; j++) {
					temp = myArray[j]; // 将数组靠近中间位置的元素赋值给temp
					int perIndex = j - gap; // 记录初始位置

					while (perIndex >= 0 && myArray[perIndex] > temp) {
						// 当初始位置大于等于0且初始位置元素 大于 数组中间位置的元素
						myArray[perIndex + gap] = myArray[perIndex]; // 将初始位置的元素替换到中间位置
						perIndex -= gap; // 跳出当前 while 循环
					}
					// 将中间位置元素替换到初始位置
					myArray[perIndex + gap] = temp;
				}
				// 再次分组
				gap /= 2;
			}

			// 再次转换为字符串数组
			String[] myStr = new String[len];
			for (int k = 0; k < len; k++) {
				myStr[k] = myArray[k] + "";
			}

			return myStr;
		}
	};

	// 再实现父类的匿名类继承,写在方法中
	public int getPersonIndex(String[] str, String key) {
		// 实现类的匿名内部类继承
		AyClassPerson aCp1 = new AyClassPerson() {
			// 重写父类的方法
			/*
			 * public int getArrayIndex(String[] str, String key) { } 没写完的
			 */
		};
		int result = aCp1.getArrayIndex(str, key);
		return result;
	}

	// 实现数组去重
	public void arrayHeavy() {
		// 排序
		String[] myStrings = aCi1.getArraySort(strArray);
		// 再创建一个空数组
		StringBuilder sbString = new StringBuilder();
		for (int i = 0; i < myStrings.length; i++) {
			if (sbString.lastIndexOf(myStrings[i]) == -1) {
				sbString.append(myStrings[i] + ", ");
			}
		}

		System.out.println(sbString.substring(0));
	}

}
