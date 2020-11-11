/**  
 * @Title: LambdaVisitVarible.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 10:29:58 
 */
package two;

/**  
 * @ClassName: LambdaVisitVarible
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 10:29:58 
*/
public class LambdaVisitVarible {
	// 定义一个静态变量
	private static int valueStatic = 20;
	// 定义一个实例变量
	private int value = 10;

	// 定义一个静态方法,实现接口的继承
	public static VaribleDemo getAdd() {
		final int s = 1;
		VaribleDemo result = (a, b) -> {
			// 静态方法中只能直接调用外部的静态变量
			valueStatic++;
			return a + b + s;
		};

		return result;
	}

	// 定义一个实例方法,实现接口的继承
	public VaribleDemo getSub() {
		final int s = 2;
		VaribleDemo result = (a, b) -> {
			int c = a - b - value - s;
			valueStatic--;
			return c;
		};
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getAdd().getFollow(10, 20));
		System.out.println(valueStatic);// 21

		System.out.println(new LambdaVisitVarible().getSub().getFollow(10, 20));
		System.out.println(valueStatic);// 20
	}
}

//定义一个接口
interface VaribleDemo {
	public abstract int getFollow(int a, int b);
}