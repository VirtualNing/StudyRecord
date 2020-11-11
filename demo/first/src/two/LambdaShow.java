/**  
 * @Title: LambdaShow.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-16 10:11:03 
 */
package two;

/**  
 * @ClassName: LambdaShow
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-16 10:11:03 
*/
public class LambdaShow {

	public static void main(String[] args) {
		// 常规实现不同接口方法
		AddAndSubtract add = AlgShow.getResult('+');
		AddAndSubtract subtract = AlgShow.getResult('-');
		System.out.println(add.addOrSub(5, 9));//
		System.out.println(subtract.addOrSub(8, 19));//

		// Lambda 改良版实现继承接口不同方法
		AddAndSubtract lAdd = LambdaImprove.getResult('+');
		System.out.println(lAdd.addOrSub(1, 4));//
	}

}

//定义一个接口
@FunctionalInterface // 表示这是个函数式接口
interface AddAndSubtract {
	// 定义一个方法,要实现加法或者减法
	public abstract int addOrSub(int a, int b);
}

//定义一个类,该类下实现接口的继承
class AlgShow {
	// 定义一个方法,该方法下实现局部匿名内部类继承接口
	// 该方法返回值为 要继承的接口类型
	public static AddAndSubtract getResult(char symbol) {
		// 定义一个接口类型的变量
		AddAndSubtract result;

		// 使用匿名类继承接口
		if (symbol == '+') {
			result = new AddAndSubtract() {
				public int addOrSub(int a, int b) {

					return a + b;
				}
			};
		} else {
			result = new AddAndSubtract() {
				public int addOrSub(int a, int b) {
					return a - b;
				}
			};
		}
		return result;
	}
}

//Lambda 改良上面的继承
class LambdaImprove {
	// 同样在一个方法中实现接口的方法
	public static AddAndSubtract getResult(char symbol) {
		// 定义一个接口类的变量
		AddAndSubtract result;
		if (symbol == '+') {
			result = (int a, int b) -> {
				return a + b;
			};
		} else {
			result = (int a, int b) -> {
				return a - b;
			};
		}
		return result;
	}
}
