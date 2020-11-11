/**  
 * @Title: ExampleNestClass.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-12 05:12:28 
 */
package first;

/**  
 * @ClassName: ExampleNestClass
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-12 05:12:28 
*/
public class ExampleNestClass {
	public static void main(String[] args) {
		// 外部类之外的类调用内部类,方案一
		// 通过类名直接访问该类的静态成员方法
		// 该静态成员方法下已处理好了
		ExampleNestClassShow.getMethod();

		// 外部类之外的类调用内部类,方案二
		ExampleNestClassShow.EnCs1 eNcSeCs1 = new ExampleNestClassShow().new EnCs1();
		eNcSeCs1.getNum();
		eNcSeCs1.getStr();
		eNcSeCs1.getRandom();
	}
}

//定义一个嵌套类
class ExampleNestClassShow {
	// 定义一个内部类
	public class EnCs1 {
		// 定义一个公有的 最终的 静态成员常量
		public static final int num = 10;

		// str1 变量初始化
		public EnCs1() {
			// this.str1 = str1;
		}

		// 定义一个成员方法
		public void getNum() {
			// 直接使用外部类的静态成员
			System.out.println(num + sum);
		}

		public void getStr() {
			// 直接使用外部类的非静态成员
			System.out.println(string);
		}

		public void getRandom() {
			// 调用外部类的成员方法
			System.out.println(getRandoms());
		}
	}

	// 定义一个静态成员属性
	private static int sum = 20;

	// 定义一个成员变量
	private String string;

	public ExampleNestClassShow() {
		this.string = "哈哈";
	}

	// 定义一个成员方法
	private double getRandoms() {
		return Math.random() * sum;
	}

	// 定义一个静态成员方法,调用内部类中的成员
	public static void getMethod() {
		// 内部类之外,外部类之静态方法中调用内部类
		ExampleNestClassShow.EnCs1 ec1 = new ExampleNestClassShow().new EnCs1();
		ec1.getNum();
		ec1.getStr();
		ec1.getRandom();
	}
}
