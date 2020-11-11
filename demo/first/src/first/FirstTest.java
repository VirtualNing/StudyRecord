/**  
 * @Title: FirstTest.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-07 12:36:19 
 */
package first;

/**  
 * @ClassName: FirstTest
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-07 12:36:19 
*/
public class FirstTest {
	public static void main(String[] args) {
		// 抽象类方法的实现
		AbsTestDemo atd = new AbsTestDemo();
		atd.getAbs();
		// 接口方法的实现
		InterTestDemo itd = new InterTestDemo();
		System.out.println(itd.getNum());
	}
}

//定义一个抽象类
abstract class TestDemo {
	// 定义一个抽象方法
	abstract void getAbs();

	// 定义一个具体方法
	public static void printF() {
		System.out.println("呵呵");
	}
}

//定义一个继承自 TestDemo 的类
class AbsTestDemo extends TestDemo {
	public AbsTestDemo() {
	}

	// 实现/重写 父类的抽象方法
	public void getAbs() {
		printF();// 直接调用继承自父类的公有方法
	}
}

//定义一个继承自 FirstInterface 接口的类
class InterTestDemo implements FirstInterface {
	// 重写接口的方法
	public int getNum() {
		return num;
	}
}