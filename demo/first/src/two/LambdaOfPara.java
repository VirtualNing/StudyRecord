/**  
 * @Title: LambdaOfPara.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 08:09:45 
 */
package two;

/**  
 * @ClassName: LambdaOfPara
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 08:09:45 
*/
public class LambdaOfPara {
	// 实现抽象类--LambdaAbstractDemo
	static LambdaAbstractDemo getInt(char symol) {
		LambdaAbstractDemo result;
		if (symol == '+') {
			result = (a, b) -> a + b;
		} else {
			result = (a, b) -> a - b;
		}
		// 此处返回的是表达式,而不是结果
		return result;
	}

	// 接收函数作为参数
	private static int getInt(LambdaAbstractDemo cale, int a, int b) {
		return cale.getResult(a, b);
	}

	public static void main(String[] args) {
		int a = 10, b = 30;
		// 既可以接收函数作为参数
		System.out.println(getInt(getInt('+'), a, b));
		// 亦可以接收 Lambda 表达式作为参数
		System.out.println(getInt((c, d) -> {
			return c - d;
		}, a, b));
	}
}

//定义一个抽象类
interface LambdaAbstractDemo {
	public abstract int getResult(int a, int b);
}