/**  
 * @Title: LambdaMethodQueto.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 11:38:28 
 */
package two;

/**  
 * @ClassName: LambdaMethodQueto
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 11:38:28 
*/
public class LambdaMethodQueto {
	// 定义一个方法,实现Lambda 方法引用
	static void getResult(MethodQuote cale, int a, int b) {
		System.out.println(cale.getFollow(a, b));
	}

	public static void main(String[] args) {
		getResult(MethodQuetoClass::getAdd, 10, 30);
		getResult(new MethodQuetoClass()::getSub, 10, 30);

	}

}

//定义一个函数式接口
@FunctionalInterface
interface MethodQuote {
	public abstract int getFollow(int a, int b);
}

//定义一个类
class MethodQuetoClass {
	// 要引用的方法定义格式要与 接口方法一致
	public static int getAdd(int a, int b) {
		return a + b;
	}

	public int getSub(int a, int b) {
		return a - b;
	}
}