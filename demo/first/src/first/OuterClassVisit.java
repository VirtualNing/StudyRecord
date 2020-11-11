/**  
 * @Title: OuterClassVisit.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 02:30:25 
 */
package first;

/**  
 * @ClassName: OuterClassVisit
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-13 02:30:25 
*/
public class OuterClassVisit {

	public static void main(String[] args) {
		// 外部类之外的类访问内部类

		// 访问静态内部类的静态成员
		// 通过类名直接调用静态成员,导致该类的构造方法未调用
		// 构造方法中的方法体未执行,就不存在赋值操作
		System.out.println(OuterClassVisitDemo.A1.num); // 0

		// 访问静态内部类的实例成员
		OuterClassVisitDemo.A1 a1 = new OuterClassVisitDemo.A1();
		System.out.println(a1.str1);

	}

}

//定义一个嵌套类
class OuterClassVisitDemo {
	// 定义一个静态属性
	private static int num = 10;
	// 定义一个实例属性
	private String str1;

	// 定义个构造方法接收参数
	public OuterClassVisitDemo(String str1) {
		this.str1 = str1;
	}

	// 定义一个静态内部类
	protected static class A1 {
		// 定义两个成员属性
		static int num;
		protected String str1;

		public String toString() {
			return "这是静态内部类";
		}

		// 定一个构造方法,给成员属性赋值
		public A1() {
			// 通过外部类名访问静态成员并赋值
			num = OuterClassVisitDemo.num;
			// 通过外部类实例访问实例成员并赋值
			this.str1 = new OuterClassVisitDemo("这是内部类").str1;
		}

	}
}
