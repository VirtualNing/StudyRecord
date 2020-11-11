/**  
 * @Title: NestingClassExample.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-12 09:47:39 
 */
package first;

/**  
 * @ClassName: NestingClassExample
 * @Description: TODO(描述)
 * @author author
 * @date 2020-10-12 09:47:39 
*/
public class NestingClassExample {

	public static void main(String[] args) {
		// 在顶层类之外的类中调用内部类
		NestingClassExampleDemo.A1.B1.C1 abc = new NestingClassExampleDemo('*').new A1(" ").new B1(8).new C1();
		abc.getTriangle();
	}

}

//定义一个多层嵌套的类
class NestingClassExampleDemo {
	// 定义一个成员变量
	private char start;

	// 利用构造方法,接收外部参数,并进行初始化
	public NestingClassExampleDemo(char start) {
		this.start = start;
	}

	// 定义一个内部类A1
	public class A1 {
		// 定义一个成员变量
		private String space;

		// 利用构造方法,接收外部参数,并进行初始化
		public A1(String space) {
			this.space = space;
		}

		// 定义一个内部类B1
		public class B1 {
			// 定义一个成员变量
			private int num;

			// 利用构造方法,接收外部参数,并进行初始化
			public B1(int num) {
				this.num = num;
			}

			// 定义一个内部类 C1
			public class C1 {
				// 定义一个成员方法,调用外部类的成员属性
				public void getTriangle() {
					// 打印金字塔
					// 控制循环次数
					for (int i = 0; i < num; i++) {
						// 控制打印的空格
						for (int j = num - 1; j > i; j--) {
							System.out.print(space);
						}
						// 控制打印的字符
						for (int k = 0; k < (2 * i) - 1; k++) {
							System.out.print(start);
						}
						// 循环一次就换行
						System.out.println();
					}

				}
			}
		}
	}
}
