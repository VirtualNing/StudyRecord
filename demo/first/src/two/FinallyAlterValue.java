/**  
 * @Title: FinallyAlterValue.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-10 09:42:44 
 */
package two;

import java.util.StringJoiner;

/**  
 * @ClassName: FinallyAlterValue
 * @Description: TODO(描述)
 * @author author
 * @date 2020-11-10 09:42:44 
*/
public class FinallyAlterValue {

	public static void main(String[] args) {
		// 实现类
		System.out.println(FinallyAlterValueDemo1.getArrayJoiner());

	}
}

//创建一个类
class FinallyAlterValueDemo1 {
	protected static StringJoiner getArrayJoiner() {
		// 创建一个可变字符串数组
		StringJoiner sj1 = new StringJoiner(", ");
		// 手动捕获程序错误
		try {
			sj1.add("try");
			System.out.println("tryList: " + sj1);
			return sj1;
		} finally {
			sj1.add("finally"); // 对于引用类型的返回值来说,finally 是能将其改变的
			System.out.println("finallyList: " + sj1);
		}
	}
}
