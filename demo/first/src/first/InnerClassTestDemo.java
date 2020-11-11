/**  
 * @Title: InnerClassTestDemo.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-12 04:05:03 
 */
package first;

/**  
 * @ClassName: InnerClassTestDemo
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-12 04:05:03 
*/
public class InnerClassTestDemo {
	public static void main(String[] args) {
		// 在其它类中实现嵌套类 方案一
		InnerClassTestDemoNest iCtD = new InnerClassTestDemoNest(20);
		iCtD.getNest();

		// 在其他类中实现嵌套类 方案二
		InnerClassTestDemoNest.OneMyNest iCtDoMn = (new InnerClassTestDemoNest(30)).new OneMyNest(50);
		iCtDoMn.getNum();
	}
}

//定义一个嵌套类
class InnerClassTestDemoNest {
	// 定义一个成员属性
	private int num;

	// 定义一个构造方法
	public InnerClassTestDemoNest(int num) {
		this.num = num;
	}

	// 定一个内部类
	public class OneMyNest {
		// 定义成员属性
		private int num;

		// 定义构造方法
		public OneMyNest(int num) {
			this.num = num + 10;
		}

		// 定义成员方法
		public void getNum() {

			System.out.println(num);
		}
	}

	// 定义一个成员方法,用于调用私有的内部类
	public void getNest() {
		// 在类的内部访问内部类
		OneMyNest omn = new OneMyNest(num);
		omn.getNum();
	}
}
