/**  
 * @Title: StaticClassTestDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 12:57:13 
 */
package first;

/**  
 * @ClassName: StaticClassTestDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 12:57:13 
*/
public class StaticClassTestDemo {
	// 定义一个静态的内部类
	static class A1 {
		// 定义一个成员属性
		private String str1;

		public A1(String str1) {
			this.str1 = str1;
		}

		// 重写一个 toString 方法
		public String toString() {
			return str1;
		}
	}

	// 定义一个内部类,访问另一个内部类
	private class B1 {
		// 从内部类 B1 中访问 内部类 A1,不需要创建外部类的实例
		StaticClassTestDemo.A1 a1 = new StaticClassTestDemo.A1("这是A1");

		// 定义一个属性,将A1 的成员赋值给 B1 的成员
		private String str2 = a1.str1;
	}

	// 定义一个方法,访问静态内部类的成员方法
	private void getMethod() {
		B1 b1 = new B1();
		System.out.println(b1.str2);
	}

	public static void main(String[] args) {
		// 实现内部类的方法一
		new StaticClassTestDemo().getMethod();
	}
}
