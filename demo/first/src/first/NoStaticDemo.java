/**  
 * @Title: NoStaticDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 12:37:50 
 */
package first;

/**  
 * @ClassName: NoStaticDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 12:37:50 
*/
public class NoStaticDemo {
	// 定义一个内部类
	private class NestClassTest {
		// The field num cannot be declared static in a non-static inner type, unless
		// initialized with a constant expression
		// 字段num不能在非静态内部类型中声明为静态，除非用常量表达式初始化
		// private static int num = 10; 错误写法
		private static final int num = 10;
		private int sum = 10;
	}

	public static void main(String[] args) {
		// 静态常量可以通过类名访问
		System.out.println(NestClassTest.num);
		// 非静态常量需要通过内部类的实例访问
		System.out.println(new NoStaticDemo().new NestClassTest().sum);
	}
}
