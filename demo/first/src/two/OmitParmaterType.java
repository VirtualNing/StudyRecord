/**  
 * @Title: OmitParmaterType.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 07:01:13 
 */
package two;

/**  
 * @ClassName: OmitParmaterType
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-20 07:01:13 
*/
public class OmitParmaterType {
	// 利用局部内部匿名类继承 Interface1 接口
	private static Interface1 getResult(char symol) {
		Interface1 result; // 定义一个接口类型的变量
		// 根据参数不同,执行不同的方法体
		if (symol == '+') {
			// 根据上下文获得参数的类型,故参数类型可直接省略
			// 如果只有一个参数,可省略小括号
			// 如果方法执行体内只有一条语句,可以省略 return 与大括号
			result = a -> a + Math.random();
		} else {
			result = a -> a - Math.random();
		}
		return result;
	}

	public static void main(String[] args) {
		Interface1 rAdd = getResult('+');
		System.out.println(rAdd.getDouble(3.5));

	}

}

//定义一个接口
interface Interface1 {
	// 接口内定义方法
	public abstract double getDouble(double a);
}
