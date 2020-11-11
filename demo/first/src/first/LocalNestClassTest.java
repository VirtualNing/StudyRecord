/**  
 * @Title: LocalNestClassTest.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 07:28:23 
 */
package first;

/**  
 * @ClassName: LocalNestClassTest
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 07:28:23 
*/
public class LocalNestClassTest {

	public static void main(String[] args) {
		// 局部内部类的实现
		LocalNestClassTestDemo lc1 = new LocalNestClassTestDemo();
		lc1.getLocalNest();
	}

}

class LocalNestClassTestDemo {
	// 定义一个实例成员
	private int a = 100;

	// 定义一个局部内部类
	protected void getLocalNest() {
		class A1 {
			int a, b;

			public A1() {
				// 局部内部类成员名称与外部类成员名称一致的情况下
				// 使用 类名.this.成员名称,修改 this 指向
				this.a = LocalNestClassTestDemo.this.a;
				// 局部内部类的成员名称与局部内部类的内部类成员名称一致的情况下
				// 需使用局部内部类的内部类的实例访问
				this.b = new A1ToB1().b;
			}

			// 在局部内部类中再定义一个内部类
			class A1ToB1 {
				int b = 20;
			}
		}
		// 调用局部内部类成员
		A1 a1 = new A1();
		System.out.println(a1.a * a1.b);//

	}
}
